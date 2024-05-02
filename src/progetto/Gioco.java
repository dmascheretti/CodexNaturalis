package progetto;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Gioco {
	
private Mazzo_oro mazzo_oro;
//private Mazzo_Risorse mazzo_risorse;
private Giocatore[] giocatori;
private Mazzo_iniziale mazzo_iniziale;
private Carta_oro carta_nulla=new Carta_oro("    ", "    ", "    ", "    ",
		0, "    ", Colore_carta.BLU, "    ", 00);



public Gioco() {
	//this.mazzo_risorse=new Mazzo_Risorse();
	this.mazzo_oro=new Mazzo_oro();
	this.mazzo_iniziale=new Mazzo_iniziale();
	//this.mazzo_obiettivo=new Mazzo_obiettivo();
	Scanner sc=new Scanner(System.in);
	System.out.println("Selezione numero giocatori: ");
	int n;
	
	do {
	n=sc.nextInt();	
	if(n<2 || n>4) System.out.println("Inserisci un numero "
			+ "di giocatori tra 2 e 4 ");
	}while(n<2 || n>4);
	Random random = new Random();
    int randomInt = random.nextInt(n);
	this.giocatori=new Giocatore[n];
	for (int i=0;i<n;i++) {
		System.out.println("Selezione nome giocatore "+(i+1)+": ");
		String name=sc.next();
		if(i==randomInt) this.giocatori[i]=new Giocatore(name,Colore.NERO);
		else if(i==0) this.giocatori[i]=new Giocatore(name,Colore.ROSSO);
		else if (i==1) this.giocatori[i]=new Giocatore(name,Colore.GIALLO);
		else if (i==2) this.giocatori[i]=new Giocatore(name,Colore.ROSSO);
		
	}
	
}

public void Gioca() {
	
	mazzo_iniziale.mescolaMazzo();
	giocatori[0].riempiTabellone(carta_nulla);
	//giocatori[0].getTabellone();
	//mazzo_risorse.mescolaMazzo();
	mazzo_oro.mescolaMazzo();
	//mazzo_oro.getMazzo();
	System.out.println("\n");
	System.out.println("NUOVO TABELLONE");
	
	giocatori[0].getTabellone();
	
	for(int i=0;i<giocatori.length;i++) {
		giocatori[i].aggiungiaMano(mazzo_iniziale.pescaCarta());
		mazzo_iniziale.rimuoviCarta();
		giocatori[i].aggiungiaMano(mazzo_oro.pescaCarta());
		mazzo_oro.rimuoviCarta();
		
		giocatori[i].giocaCartaTabellone(giocatori[i].scegliCarta(0), 5, 5);
		giocatori[i].removeCard();
		
		//for(int j=0;j<2;j++)giocatori[i].pescaCarta(mazzo_risorse.pescaCarta());
		
		}
	
	giocatori[0].getTabellone();
	
	

	for(int i=0;i<giocatori.length;i++) {
	
	System.out.println(giocatori[i].getName().toUpperCase()+" : "+giocatori[i].getSegnalino()); 
	
	Scanner sc=new Scanner(System.in);
	System.out.println(giocatori[i].getName()+" scegli una carta da giocare tra quelle della tua mano: ");
	giocatori[i].guardaMano();
	int h,x,y,scelta;
	System.out.println("scegli tra 1,2,3 " );
	do {
	h=sc.nextInt();
	}while(h<1||h>3);
	
	//do {
	System.out.println("vuoi giocare fronte o retro? 0 per fronte, 1 per retro");
	scelta=sc.nextInt();
	//}while(scelta!=0 || scelta!=1);
	
	if (scelta==1) System.out.println("CARTA SCELTA: "+giocatori[i].scegliCarta(h-1).printCardR());
	else if(scelta==0)System.out.println("CARTA SCELTA: "+giocatori[i].scegliCarta(h-1).printCardF());	
	
	do{
	System.out.println("in che posizione del tabellone vuoi piazzarla? prima x, poi y (tra 0 e 40)" );
	do {
	System.out.print("X: ");
	x=sc.nextInt();
	System.out.print("Y: ");
	y=sc.nextInt();
	}while(x>40 || x<0 ||y >40 || y<0);
	System.out.println("\n\n");
	}while(giocatori[i].checkEmpty(x, y)!=00 && giocatori[i].checkNext(x, y)==false &&
			giocatori[i].checkCorner(x, y)==false);
	
	
	if(giocatori[i].scegliCarta(h-1).getID()>60 || giocatori[i].scegliCarta(h-1).getID()<21 ) {
		giocatori[i].giocaCartaTabellone(giocatori[i].scegliCarta(h-1), x,y);
		giocatori[i].getPunteggio(giocatori[i].scegliCarta(h-1).getPunteggio());
		
	}
	
	
	System.out.println(giocatori[i].getName()+" da che mazzo vuoi pescare");
}
}
}



