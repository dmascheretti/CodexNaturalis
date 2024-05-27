package progetto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import carte.Carta;
import carte.Carta_obiettivo;
import carte.Carta_oro;
import carte.Carta_risorsa;
import mazzi.Mazzo_risorse;
import mazzi.Mazzo_iniziale;
import mazzi.Mazzo_oro;
import mazzi.Mazzo_obiettivo;
import controller.Controller;
import exception.NameAssignedException;

public class Gioco {
	
private Mazzo_oro mazzo_oro;
private Controller controller;
private Mazzo_risorse mazzo_risorse;
private Giocatore[] giocatori;
private Mazzo_iniziale mazzo_iniziale;
private Mazzo_obiettivo mazzo_obiettivo;
private Stampa stampa;



private static ArrayList<Carta_oro> campo_oro=new ArrayList<Carta_oro>();
private static ArrayList<Carta_risorsa> campo_risorsa=new ArrayList<Carta_risorsa>();
private static ArrayList <Carta_obiettivo> carte_obiettivo=new ArrayList<Carta_obiettivo>();





public Gioco() throws NameAssignedException {
	this.mazzo_risorse=new Mazzo_risorse();
	this.mazzo_oro=new Mazzo_oro();
	this.mazzo_iniziale=new Mazzo_iniziale();
	this.mazzo_obiettivo=new Mazzo_obiettivo();
	this.controller=new Controller();
	this.stampa=new Stampa();
	//this.campo_gioco=new Campo_gioco();
	campo_oro=new ArrayList<Carta_oro>();
	System.out.println("CODEX NATURALIS");
	
	Scanner sc=new Scanner(System.in);
	int n=0;
	Boolean blocca=false;

	while (!blocca || n<2 || n>4 ) {
        try {
            System.out.print("\n\nInserisci un numero di giocatori tra 2 e 4: \n");
            n = sc.nextInt();
            blocca = true; 
        } catch (InputMismatchException e) {
            System.out.println("Errore inserisci un numero di giocatori valido");
            sc.nextLine(); //consuma quello che ho nel buffer e svuota
  
        }
    }
	
	Scanner sc2=new Scanner(System.in);
	
	this.giocatori=new Giocatore[n];
	System.out.println("\nIL PRIMO GIOCATORE INSERITO SARA COLUI CHE PARTE");
	
	Boolean errore=false;
	while(!errore) {
	try	{
	for (int i=0;i<n;i++) {
		System.out.println("\nSelezione nome giocatore "+(i+1)+" ");
		String name=sc2.nextLine();
		this.giocatori[i]=new Giocatore(name);
		
	 }
	errore=true;
	}catch(NameAssignedException e) {
    	System.out.println("Errore: inserisci due nomi diversi!");
    	}

	
	}
	}
	

public void Gioca() throws InterruptedException, IOException {
    final int size=19;
	mazzo_iniziale.mescolaMazzo();
	mazzo_risorse.mescolaMazzo();
	mazzo_oro.mescolaMazzo();
	mazzo_obiettivo.mescolaMazzo();
	System.out.println("\n");
	
	int scelta,scelta_obiettivo=0;
	int scelta_iniziale=0, fronte=0, retro=1;

	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<giocatori.length;i++) {
		
		System.out.println("\nTURNO DEL GIOCATORE "+giocatori[i].getName().toUpperCase()+", ATTENDI..."); 
		TimeUnit.SECONDS.sleep(3);
	
		giocatori[i].aggiungiaMano(mazzo_iniziale.pescaCarta());
		mazzo_iniziale.rimuoviCarta();
		giocatori[i].aggiungiaMano(mazzo_oro.pescaCarta());
		mazzo_oro.rimuoviCarta();
		
		for(int j=0;j<2;j++) {
			giocatori[i].aggiungiaMano(mazzo_risorse.pescaCarta());
			mazzo_risorse.rimuoviCarta();
		}
		
		System.out.println("\nSCEGLI UNA CARTA OBIETTIVO TRA: \n");
		
		for(int obiettivo=0;obiettivo<2;obiettivo++) {
			mazzo_obiettivo.pescaCartaIndex(obiettivo).getCarta();
		}
		
		Boolean blocca=false;
		scelta_obiettivo=0;
		while (!blocca || scelta_obiettivo<1|| scelta_obiettivo>2 ) {
	        try {
	            System.out.print("\nSCEGLI TRA 1 OPPURE 2\n");
	            scelta_obiettivo = sc.nextInt();
	            blocca = true; 
	        } catch (InputMismatchException e) {
	            System.out.println("Errore");
	            sc.nextLine();
	  
	        }
	        
	    }
	

		giocatori[i].aggiungiaObiettivo(mazzo_obiettivo.pescaCartaIndex(scelta_obiettivo-1));
		for(int rimuovi_obiettivo=0;rimuovi_obiettivo<2;rimuovi_obiettivo++) mazzo_obiettivo.rimuoviCarta();
		
		
		System.out.println("SCELTA CARTA INZIALE DEL GIOCATORE "+giocatori[i].getName().toUpperCase());
			
			
			System.out.println(giocatori[i].scegliCarta(0).printCard());

			blocca=false;
			
			while (!blocca || scelta_iniziale!=fronte && scelta_iniziale!=retro ) {
		        try {
		            System.out.print("\nvuoi giocare la carta iniziale fronte o retro, 0 per fronte, 1 per retro (la carta verra automaticamente piazzate al centro del tabellone)".toUpperCase()+"\n");
		            scelta_iniziale = sc.nextInt();
		            blocca = true; 
		        } catch (InputMismatchException e) {
		            System.out.println("Errore");
		            sc.nextLine();
		  
		        }
			}
			
			if(scelta_iniziale==fronte) giocatori[i].scegliCarta(0).setRisFronte();
			
			giocatori[i].getTabellone().setCella((size/2)+1, (size/2)+1, giocatori[i].scegliCarta(0));
			giocatori[i].removeCard();
			TimeUnit.SECONDS.sleep(2);
		}//fine for
	

	
	for(int l=0;l<2;l++) {
	    campo_oro.add((Carta_oro) mazzo_oro.pescaCarta());
		mazzo_oro.rimuoviCarta();

	    campo_risorsa.add((Carta_risorsa) mazzo_risorse.pescaCarta());
		mazzo_risorse.rimuoviCarta();
		
	    carte_obiettivo.add((Carta_obiettivo)mazzo_obiettivo.pescaCarta());
		mazzo_obiettivo.rimuoviCarta();
		
		
		}
	
	Boolean win=false;
	Boolean block=true;	
	int turno=1;
	int h=0,x = 0,y = 0;
	do {
		System.out.print("\n\n-----------------\n");
		System.out.print("                |\n");
		System.out.print("                |\n");
		System.out.print("TURNO NUMERO "+turno+"  |\n");
		System.out.print("                |\n");
		System.out.print("                |\n");
		System.out.print("-----------------\n");
		
		
		
		for(int p=0; p< giocatori.length; p++) System.out.println("PUNTEGGIO GIOCATORE "+giocatori[p].getName()
				+": "+giocatori[p].getSomma());
		
		System.out.println("\n\n\nCARTE OBIETTIVO COMUNI: ");
		
		for(int i=0;i<carte_obiettivo.size();i++) carte_obiettivo.get(i).getCarta();
		
		
	
		
	for(int giocatore=0;giocatore<giocatori.length;giocatore++) {
		System.out.println("\n\n\nE' IL TURNO DI : "+giocatori[giocatore].getName().toUpperCase());
		TimeUnit.SECONDS.sleep(3);
		System.out.println("PUNTI: "+giocatori[giocatore].getSomma());
		System.out.println("\nCARTA OBIETTIVO DEL GIOCATORE "+giocatori[giocatore].getName().toUpperCase());
		giocatori[giocatore].getObiettivo().getCarta();
		TimeUnit.SECONDS.sleep(4);
		System.out.println("STAMPA TABELLONE DI "+giocatori[giocatore].getName());
		giocatori[giocatore].getTabellone().printTabellone();
	
		TimeUnit.SECONDS.sleep(3);
	System.out.println("TURNO: "+giocatori[giocatore].getName().toUpperCase());
	//do { 
	do {
		block=true;
		System.out.println(giocatori[giocatore].getName()+" scegli una carta da giocare tra quelle della tua mano: ".toUpperCase());
		TimeUnit.SECONDS.sleep(4);
		giocatori[giocatore].guardaMano();
		
		
Boolean blocca=false;
		
		while (!blocca || h!=1 && h!=2 && h!=3) {
	        try {
	            System.out.print("\nscegli tra 1, 2 oppure 3".toUpperCase()+"\n");
	            h = sc.nextInt();
	            blocca = true; 
	        } catch (InputMismatchException e) {
	            System.out.println("Errore");
	            sc.nextLine();
	  
	        }
		}
		
		do {
		System.out.println("vuoi giocare fronte o retro? 0 per fronte, 1 per retro");
	
		scelta = sc.nextInt();
		
	
		}while(scelta!=fronte && scelta!=retro);
		
		if(scelta==fronte) {
			block=controller.mossaValida(giocatori[giocatore].scegliCarta(h-1).getID(), giocatori[giocatore].getTabellone());
		if(block==false) System.out.println("\nnon puoi piazzare questa carta, non hai le risorse necessarie\n".toUpperCase());
		else {giocatori[giocatore].scegliCarta(h-1).setRisFronte();
				System.out.println(giocatori[giocatore].scegliCarta(h-1).printCardFinal());
			}
			
			
			
		}
		if(scelta==retro) {
			giocatori[giocatore].scegliCarta(h-1).setPunti();
			System.out.println(giocatori[giocatore].scegliCarta(h-1).printCardFinal());
		}
	}while(block==false);
	
	

	
	do {
			x=0;
			y=0;
			System.out.println("in che posizione del tabellone vuoi piazzarla? prima x, poi y (tra 1 e 19)");
				boolean blocca=false;
					while (!blocca || x<size-(size-1) || x>size ) {
				        try {
				        	System.out.print("X: ");
							x=sc.nextInt();
				            blocca = true; 
				        } catch (InputMismatchException e) {
				            System.out.println("Errore");
				            sc.nextLine(); //consuma quello che ho nel buffer e svuota
				  
				        }
				    }
					
					
					while (!blocca || y<size-(size-1) || y>size ) {
				        try {
				        	System.out.print("Y: ");
							y=sc.nextInt();
				            blocca = true; 
				        } catch (InputMismatchException e) {
				            System.out.println("Errore");
				            sc.nextLine(); //consuma quello che ho nel buffer e svuota
				  
				        }
				    }
					
					
				if(controller.checkEmpty(x, y, giocatori[giocatore].getTabellone())!=0 ||
						controller.checkNext(x, y, giocatori[giocatore].getTabellone())==false ||
						controller.checkCorner(x,y,giocatori[giocatore].getTabellone())==false) System.out.println("NON PUOI PIAZZARE LA CARTA IN QUESTA POSIZIONE");

	}while(controller.checkCorner(x,y,giocatori[giocatore].getTabellone())==false || controller.checkNext(x, y, giocatori[giocatore].getTabellone())==false
			||controller.checkEmpty(x, y, giocatori[giocatore].getTabellone())!=0);

		giocatori[giocatore].getTabellone().setCella(x, y,giocatori[giocatore].scegliCarta(h-1));
		giocatori[giocatore].getTabellone().removeCorner(x, y);
		
		if(scelta==fronte) {
	
			giocatori[giocatore].getPunteggio(controller.getPunti(giocatori[giocatore].scegliCarta(h-1),giocatori[giocatore].getTabellone(),
				x, y));
		}
		giocatori[giocatore].removeCardIndex(h-1);

		
		TimeUnit.SECONDS.sleep(3);
	giocatori[giocatore].getTabellone().printTabellone();

	
	
	
	
	stampa.stampaCartaCampo(campo_oro, campo_risorsa);
	
	
	

int carta_pescata = 0;
	
	boolean blocca=false;
	while (!blocca) {
        try {
        	System.out.println("\n\n"+giocatori[giocatore].getName()+": da che mazzo vuoi pescare:\n1-PESCA DAL MAZZO ORO\n"
        			+ "2-PESCA DAL MAZZO RISORSE\n3-PRENDI UNA CARTA ORO SCOPERTA\n4-PRENDI UNA CARTA RISORSA SCOPERTA");
        	carta_pescata=sc.nextInt();
            blocca = true; 
        } catch (InputMismatchException e) {
            System.out.println("Errore");
            sc.nextLine(); //consuma quello che ho nel buffer e svuota
  
        }
	}
	
	Carta carta_nuova = giocatori[giocatore].scelta(carta_pescata, mazzo_oro, mazzo_risorse, campo_oro, campo_risorsa);
	giocatori[giocatore].aggiungiaMano(carta_nuova);
	System.out.println("\nHAI PESCATO: \n");
	System.out.println(carta_nuova.printCard());
	
	if(giocatori[giocatore].getSomma()>19 && (giocatore!=giocatori.length-1)) System.out.println("HAI RAGGIUNTO 20 PUNTI, ASPETTA CHE FINISCA IL TURNO");
	if(!win) System.out.println("\n\nCAMBIO TURNO...\n");
	
	
	}
	turno++;
	
	
	win=controller.checkWin(giocatori);
	
	
	}while(win==false || mazzo_oro.getLenght()<giocatori.length || mazzo_risorse.getLenght()<giocatori.length);
	
	sc.close();
	
	System.out.println("FINE GIOCO, CONTEGGIO PUNTI OBIETTIVO, ATTENDI LA CLASSIFICA");
	
	TimeUnit.SECONDS.sleep(4);
	
	
	for(int i=0;i<giocatori.length;i++) {
		for(int j=0;j<2;j++) giocatori[i].getPunteggio(controller.checkCartaObiettivo(carte_obiettivo.get(j).getID(), giocatori[i].getTabellone()));
			
		giocatori[i].getPunteggio(controller.checkCartaObiettivo(giocatori[i].getObiettivo().getID(),giocatori[i].getTabellone()));
	
}
	
	controller.classifica(giocatori);
}
}