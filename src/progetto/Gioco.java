package progetto;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
<<<<<<< Updated upstream
import java.util.List;
=======
>>>>>>> Stashed changes
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

<<<<<<< Updated upstream
import javax.naming.NameAlreadyBoundException;

=======
import carte.Carta;
>>>>>>> Stashed changes
import carte.Carta_obiettivo;
import carte.Carta_oro;
import carte.Carta_risorsa;
import mazzi.Mazzo_risorse;
import mazzi.Mazzo_iniziale;
import mazzi.Mazzo_oro;
import mazzi.Mazzo_obiettivo;
import controller.Controller;
<<<<<<< Updated upstream
import exception.NameAssignedException;

=======
>>>>>>> Stashed changes
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





public Gioco() {
	this.mazzo_risorse=new Mazzo_risorse();
	this.mazzo_oro=new Mazzo_oro();
	this.mazzo_iniziale=new Mazzo_iniziale();
	this.mazzo_obiettivo=new Mazzo_obiettivo();
	this.controller=new Controller();
<<<<<<< Updated upstream
=======
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
            System.out.println("Errore");
            sc.nextLine(); //consuma quello che ho nel buffer e svuota
  
        }
    }
	
	Scanner sc2=new Scanner(System.in);
	
	this.giocatori=new Giocatore[n];
	System.out.println("\nIL PRIMO GIOCATORE INSERITO SARA COLUI CHE PARTE (PEDINA NERA)");
	for (int i=0;i<n;i++) {
		System.out.println("\nSelezione nome giocatore "+(i+1)+" ");
		String name=sc2.nextLine();
		if(i==0) this.giocatori[i]=new Giocatore(name,Color.BLACK);
		else this.giocatori[i]=new Giocatore(name,Color.white);
	}
	
	
	}
>>>>>>> Stashed changes
	

<<<<<<< Updated upstream
public void Gioca() throws IOException, NameAssignedException{
	
=======
public void Gioca() throws InterruptedException, IOException {
	final int size=19;
>>>>>>> Stashed changes
	mazzo_iniziale.mescolaMazzo();
	mazzo_risorse.mescolaMazzo();
	mazzo_oro.mescolaMazzo();
	mazzo_obiettivo.mescolaMazzo();
<<<<<<< Updated upstream
	int scelta;
	
		do {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Seleziona il numero di giocatori: ");
			int n;
			do {
			n=sc.nextInt();	
			if(n<2 || n>4) System.out.println("Inserisci un numero "
					+ "di giocatori tra 2 e 4 ");
			 }while(n<2 || n>4);
			this.giocatori=new Giocatore[n];
			
		    Boolean errore=false;
			while(!errore) {
			try {
			    for (int i=0;i<n;i++) {
				System.out.println("Inserisci il nome del giocatore "+(i+1)+": ");
				String name=sc.next();
			    this.giocatori[i]=new Giocatore(name);
			    }
			    errore=true;
			}catch(NameAssignedException e) {
		    	System.out.println("Errore: inserisci due nomi diversi!");
		    	}
			 }
		    }
			catch(InputMismatchException e) {
				System.out.println("Errore: inserisci un numero di giocatori valido!");
			}
		 }while(giocatori==null);
		
	
	Scanner sc=new Scanner(System.in);
		try {
		for(int i=0;i<giocatori.length;i++) {
			
			giocatori[i].aggiungiaMano(mazzo_iniziale.pescaCarta());
			mazzo_iniziale.rimuoviCarta();
			giocatori[i].aggiungiaMano(mazzo_oro.pescaCarta());
			mazzo_oro.rimuoviCarta();
			giocatori[i].aggiungiaObiettivo(mazzo_obiettivo.pescaCarta());
			mazzo_obiettivo.rimuoviCarta();
		
			for(int j=0;j<2;j++) {
				giocatori[i].aggiungiaMano(mazzo_risorse.pescaCarta());
				mazzo_risorse.rimuoviCarta();
			  }
				System.out.println(giocatori[i].getName().toUpperCase()); 
				int f;
				System.out.println(giocatori[i].scegliCarta(0).printCard());
				System.out.println("Vuoi giocare la carta iniziale fronte o retro? \nDigita 0 per fronte, 1 per retro");
				f=sc.nextInt();
				
				if(f==0) giocatori[i].scegliCarta(0).setRisFronte();
				
				giocatori[i].getTabellone1().setCella(10, 10, giocatori[i].scegliCarta(0));
				giocatori[i].removeCard();
			}
		
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
		int h,x,y;
		do {
			System.out.print("----------------\n\n");
			System.out.print("TURNO NUMERO "+turno+"\n\n");
			System.out.print("----------------");		
			System.out.println("\n\n\n");		
			for(int i=0;i<carte_obiettivo.size();i++) carte_obiettivo.get(i).getCarta();	
			for(int i1=0;i1<giocatori.length;i1++) {
			giocatori[i1].getTabellone1().getTabelloneX();
		   System.out.println("TURNO: "+giocatori[i1].getName().toUpperCase());
		
		   do {	
			   System.out.println(giocatori[i1].getName()+"Scegli una carta da giocare tra quelle della tua mano: ");	
			   giocatori[i1].guardaMano();	
			   System.out.println("Scegli tra 1,2,3 " );	
			  
			   do {	
				   h=sc.nextInt();	
				   if(h!=1 && h!=2 && h!=3) System.out.println("Hai inserito un numero errato, scgeli tra 1,2,3");
			   }while(h!=1 && h!=2 && h!=3);
		
			   System.out.println("Vuoi giocare fronte o retro? \nDigita 0 per fronte, 1 per retro");
		//se retro non serve controllare nulla, se fronte serve controllare risorse della carta oro
			   scelta = sc.nextInt();
		
			   if(scelta==0) {		
				   block=controller.mossaValida(giocatori[i1].scegliCarta(h-1).getID(), giocatori[i1].getTabellone1());		
				   if(block==false) System.out.println("Non puoi piazzare questa carta, non hai le risorse necessarie!");		
				   else {giocatori[i1].scegliCarta(h-1).setRisFronte();			
				   System.out.println(giocatori[i1].scegliCarta(h-1).printCardFinal());		
				   }	
			   }
		
			   if(scelta==1) {		
				   block=true;	
				   giocatori[i1].scegliCarta(h-1).setPunti();		
				   System.out.println(giocatori[i1].scegliCarta(h-1).printCardFinal());	
			   }	
		   }while(block==false);		
		   System.out.println("INSETTI SUL CAMPO "+controller.conta(giocatori[i1].getTabellone1()));
		
	


	do {		
		 do {				
			 do{		
				do {
					System.out.println("In che posizione del tabellone vuoi piazzare la carta? \nInserisci prima x, poi y (tra 0 e 40)");
					System.out.print("X: ");
					x=sc.nextInt();
					System.out.print("Y: ");
					y=sc.nextInt();
					System.out.println("\n\n");
				}while((x<0 || x>20)||(y<0 || y>20)) ;	
					//if(giocatori[i1].getTabellone1().checkNext(x, y)) System.out.println("Questa cella è gia occupata");					
				if(controller.checkEmpty(x, y, giocatori[i1].getTabellone1())!=0) System.out.println("NON PUOI PIAZZARE LA CARTA IN QUESTA POSIZIONE, LA CELLA E' OCCUPATA!");		
			
			}while(controller.checkEmpty(x, y, giocatori[i1].getTabellone1())!=0);
			//while((giocatori[i1].getTabellone1().checkEmpty(x, y)!=00));						
			if(controller.checkNext(x, y, giocatori[i1].getTabellone1())==false) System.out.println("NON PUOI PIAZZARE LA CARTA IN QUESTA POSIZIONE, ASSICURATI CHE SIA LEGATA AD UN' ALTRA CARTA!");
				//if(giocatori[i1].getTabellone1().checkNext(x, y)==false) System.out.println("Non puoi giocare la carta in quella posizione");	
		
		}while(controller.checkNext(x, y, giocatori[i1].getTabellone1())==false);
		//while(giocatori[i1].getTabellone1().checkNext(x, y)==false);
		
		if(controller.checkCorner(x,y,giocatori[i1].getTabellone1())==false) System.out.println("NON PUOI PIAZZARE LA CARTA IN QUESTA POSIZIONE,NON PUOI COPRIRE UN ANGOLO NON GIOCABILE!");
	//}while(giocatori[i1].getTabellone1().checkCorner(x, y)==false);
	
		}while(controller.checkCorner(x,y,giocatori[i1].getTabellone1())==false);


			giocatori[i1].getTabellone1().setCella(x, y,giocatori[i1].scegliCarta(h-1));
			giocatori[i1].getTabellone1().removeCorner(x, y);
			//devo fare che fai punti solo se metti il fronte
			if(scelta==0) {	
				if(giocatori[i1].scegliCarta(h-1).getID()>21 || giocatori[i1].scegliCarta(h-1).getID()<54) 
					giocatori[i1].getPunteggio(giocatori[i1].scegliCarta(h-1).getPunteggio());	
				else giocatori[i1].getPunteggio(controller.getPunti(giocatori[i1].scegliCarta(h-1).getID(),giocatori[i1].getTabellone1(),
					x, y));	
			}
			giocatori[i1].removeCardIndex(h-1);
			giocatori[i1].getTabellone1().getTabelloneX();
		
			System.out.println("PUNTEGGIO GIOCATORE "+giocatori[i1].getName()+" : "+giocatori[i1].getSomma());
			System.out.println("NUMERO INSETTI: "+controller.conta(giocatori[i1].getTabellone1()));	
			System.out.println("\nCARTE ORO SUL CAMPO");
			
			for(int d=0;d<campo_oro.size();d++) System.out.print("-----------------------┬");	
			System.out.print("\n\n");	
			for(int d=0;d<campo_oro.size();d++)System.out.print(" "+campo_oro.get(d).getID()+"                     ");	
			System.out.println("\n\n");	
			for(int d=0;d<campo_oro.size();d++)System.out.print(campo_oro.get(d).getRis1Fronte()+"\t    \t"+campo_oro.get(d).getRis2Fronte()+"\t  ");	
			System.out.println("\n\n");
			for(int d=0;d<campo_oro.size();d++)System.out.print(campo_oro.get(d).getRis3Fronte()+"\t    \t"+campo_oro.get(d).getRis4Fronte()+"\t  ");	
			System.out.println("\n");	
			for(int d=0;d<campo_oro.size();d++) System.out.print("------------------------");	
			System.out.print("\n\n");	
			for(int d=0;d<campo_oro.size();d++)System.out.print("    \t"+campo_oro.get(d).getRis1Centro()+"\t      ");	
			System.out.println("\n\n");	
			for(int d=0;d<campo_oro.size();d++)System.out.print("    \t    \t    \t  ");	
			System.out.println("\n");	
			for(int d=0;d<campo_oro.size();d++) System.out.print("-----------------------┴");
			
			System.out.println("\nCARTE RISORSA SUL CAMPO\n");
			
			for(int d=0;d<campo_risorsa.size();d++) System.out.print("-----------------------┬");
			System.out.print("\n\n");
			for(int d=0;d<campo_risorsa.size();d++)System.out.print(" "+campo_risorsa.get(d).getID()+"                     ");
			System.out.println("\n\n");
			for(int d=0;d<campo_risorsa.size();d++)System.out.print(campo_risorsa.get(d).getRis1Fronte()+"\t    \t"+campo_oro.get(d).getRis2Fronte()+"\t  ");
			System.out.println("\n\n");
			for(int d=0;d<campo_risorsa.size();d++)System.out.print(campo_risorsa.get(d).getRis3Fronte()+"\t    \t"+campo_risorsa.get(d).getRis4Fronte()+"\t  ");
			System.out.println("\n");
			for(int d=0;d<campo_oro.size();d++) System.out.print("------------------------");
			System.out.print("\n\n");
			for(int d=0;d<campo_risorsa.size();d++)System.out.print("    \t"+campo_risorsa.get(d).getRis1Centro()+"\t      ");
			System.out.println("\n\n");
			for(int d=0;d<campo_risorsa.size();d++)System.out.print("    \t    \t    \t  ");
			System.out.println("\n");
			for(int d=0;d<campo_oro.size();d++) System.out.print("-----------------------┴");
			
		
		
		
			int carta,pesca;
		
			System.out.println("\n"+giocatori[i1].getName()+" \n\nDa che mazzo vuoi pescare? \nDigita 1 se vuoi pescare tra dal mazzo oro,"
				+ "2 se vuoi pescare dal mazzo risorsa, 3 se vuoi prendere una carta oro scoperta, 4 se vuoi prendere una carta risorsa scoperta");
		carta=sc.nextInt();
		
		
		switch(carta) {
		case 1:giocatori[i1].aggiungiaMano(mazzo_oro.pescaCarta());
			   mazzo_oro.rimuoviCarta();
			System.out.println("Hai pescato: \n");
			giocatori[i1].guardaCartaMano(2);
			break;
		case 2: giocatori[i1].aggiungiaMano(mazzo_risorse.pescaCarta());
			System.out.println("Hai pescato: \n");
			giocatori[i1].guardaCartaMano(2);
			mazzo_risorse.rimuoviCarta();
			break;
		case 3: System.out.println("1:\n"+campo_oro.get(0).printCard());
				System.out.println("2:\n"+campo_oro.get(1).printCard());
				System.out.println("Scegli la carta che vuoi aggiungere alla tua mano, 1 o 2?");
				pesca=sc.nextInt();
				giocatori[i1].aggiungiaMano(campo_oro.get(pesca-1));
				campo_oro.remove(pesca-1);
				campo_oro.add((Carta_oro) mazzo_oro.pescaCarta());
				mazzo_oro.rimuoviCarta();
				break;
				
		case 4: System.out.println("1:\n"+campo_risorsa.get(0).printCard());
			    System.out.println("2:\n"+campo_risorsa.get(1).printCard());
			    System.out.println("Scegli la carta che vuoi aggiungere alla tua mano, 1 o 2?");
				pesca=sc.nextInt();
				giocatori[i1].aggiungiaMano(campo_risorsa.get(pesca-1));
				campo_risorsa.remove(pesca-1);
				campo_risorsa.add((Carta_risorsa) mazzo_risorse.pescaCarta());
				mazzo_risorse.rimuoviCarta();	
				break;
		
		default: break;
		 }
		}
		turno++;
		for(int p=0;p<giocatori.length;p++) if (giocatori[p].getSomma()>20) win=true;
		
		
		
		}while(win==false || mazzo_oro.getLenght()<1 || mazzo_risorse.getLenght()<1);
		
		
		for(int i=0;i<giocatori.length;i++) {
			for(int j=0;j<2;j++) giocatori[i].getPunteggio(controller.checkCartaObiettivo(carte_obiettivo.get(j).getID(), giocatori[i].getTabellone1()));
			giocatori[i].getPunteggio(controller.checkCartaObiettivo(giocatori[i].getObiettivo().getID(),giocatori[i].getTabellone1()));
		
	       }
	
	    sc.close();
		  }catch(NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		 }
		System.out.println("\n");
		}
	 }
=======
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
		
		Boolean blocca=true;
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

			do {
			
				System.out.println("vuoi giocare la carta iniziale fronte o retro, 0 per fronte, 1 per retro (la carta verra automaticamente piazzate al centro del tabellone)".toUpperCase());
				scelta_iniziale=sc.nextInt();
			
			}while(scelta_iniziale!=fronte && scelta_iniziale!=retro);
			
			if(scelta_iniziale==fronte) giocatori[i].scegliCarta(0).setRisFronte();
			
			giocatori[i].getTabellone().setCella(10, 10, giocatori[i].scegliCarta(0));
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
		System.out.println("CARTA OBIETTIVO DEL GIOCATORE "+giocatori[giocatore].getName().toUpperCase());
		giocatori[giocatore].getObiettivo().getCarta();
		TimeUnit.SECONDS.sleep(6);
		
		giocatori[giocatore].getTabellone().printTabellone();
	
		TimeUnit.SECONDS.sleep(3);
	System.out.println("TURNO: "+giocatori[giocatore].getName().toUpperCase());
	//do { 
	do {
		block=true;
		System.out.println(giocatori[giocatore].getName()+" scegli una carta da giocare tra quelle della tua mano: ".toUpperCase());
		TimeUnit.SECONDS.sleep(5);
		giocatori[giocatore].guardaMano();
		
		
		System.out.println("scegli tra 1,2,3 " );
		do {
			h=sc.nextInt();
			if(h!=1 && h!=2 && h!=3) System.out.println("hai inserito un numero errato, scegli tra 1,2,3");
		}while(h!=1 && h!=2 && h!=3);
		
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
>>>>>>> Stashed changes


