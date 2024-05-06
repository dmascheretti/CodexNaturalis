package progetto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import carte.Carta_oro;
import mazzi.Mazzo_iniziale;
import mazzi.Mazzo_oro;

public class Gioco {
	
private Mazzo_oro mazzo_oro;
//private Mazzo_Risorse mazzo_risorse;
private Giocatore[] giocatori;
private Mazzo_iniziale mazzo_iniziale;
private Carta_oro carta_nulla=new Carta_oro("    ", "    ", "    ", "    ",
		0, "    ", Colore_carta.BLU, "    ", 00);

private static ArrayList<Carta_oro> campo_oro=new ArrayList<Carta_oro>();
private static ArrayList<Carta_risorsa> campo_risorsa=new ArrayList<Carta_risorsa>();



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
		if(i==randomInt) this.giocatori[i]=new Giocatore(name);
		else if(i==0) this.giocatori[i]=new Giocatore(name);
		else if (i==1) this.giocatori[i]=new Giocatore(name);
		else if (i==2) this.giocatori[i]=new Giocatore(name);
		
	}
	
}

public void Gioca() {
	
	mazzo_iniziale.mescolaMazzo();
	
	//giocatori[0].getTabellone();
	//mazzo_risorse.mescolaMazzo();
	mazzo_oro.mescolaMazzo();
	//mazzo_oro.getMazzo();
	System.out.println("\n");
	//giocatori[0].giocaCarta2(mazzo_oro.pescaCarta(),0,0);
	//giocatori[0].giocaCarta2(mazzo_oro.pescaCarta(),1,0);
	//giocatori[0].giocaCarta2(mazzo_oro.pescaCarta(),9,3);
	//System.out.println("NUOVO TABELLONE");
	
	//giocatori[0].getTabellone();
	
<<<<<<< Updated upstream
=======
	
>>>>>>> Stashed changes
	
	for(int i=0;i<giocatori.length;i++) {
		giocatori[i].riempiTabellone(carta_nulla);
		giocatori[i].aggiungiaMano(mazzo_iniziale.pescaCarta());
		mazzo_iniziale.rimuoviCarta();
		giocatori[i].aggiungiaMano(mazzo_oro.pescaCarta());
		mazzo_oro.rimuoviCarta();
		
<<<<<<< Updated upstream
=======
		//giocatori[i].giocaCartaTabellone(giocatori[i].scegliCarta(0), 5, 5);
		//giocatori[i].removeCard();
		
>>>>>>> Stashed changes
		//for(int j=0;j<2;j++)giocatori[i].pescaCarta(mazzo_risorse.pescaCarta());
		
		}
	
<<<<<<< Updated upstream

	for(int i=0;i<giocatori.length;i++) {
	System.out.println(giocatori[i].getName().toUpperCase()); 
	
=======
	
	
	

	for(int i=0;i<giocatori.length;i++) {
		
>>>>>>> Stashed changes
	Scanner sc=new Scanner(System.in);
	System.out.println(giocatori[i].getName().toUpperCase()+" : "+giocatori[i].getSegnalino()); 
	int f;
	
	System.out.println(giocatori[i].scegliCarta(0).printCard());

	do {
	
	System.out.println("vuoi giocare la carta iniziale fronte o retro, 0 per fronte, 1 per retro");
	f=sc.nextInt();
	
	}while(f!=0 && f!=1);
	
	if(f==0) giocatori[i].scegliCarta(0).setRisRetroIniziale();
	else {
		giocatori[i].scegliCarta(0).setRisFronte();
		
	}
	
	giocatori[i].giocaCartaTabellone(giocatori[i].scegliCarta(0), 5, 5);
	giocatori[i].removeCard();
	
	
	
	System.out.println(giocatori[i].getName()+" scegli una carta da giocare tra quelle della tua mano: ");
	giocatori[i].guardaMano();
	int h,x,y;
	System.out.println("scegli tra 1,2,3 " );
	do {
	h=sc.nextInt();
	}while(h<1||h>3);
	
<<<<<<< Updated upstream
=======
	//do {
	System.out.println("vuoi giocare fronte o retro? 0 per fronte, 1 per retro");
	scelta=sc.nextInt();
	if(scelta==0) giocatori[i].scegliCarta(h-1).setRis1Centro();
	if(scelta==1) {
		giocatori[i].scegliCarta(h-1).setRisFronte();
	}
	//}while(scelta!=0 || scelta!=1);
>>>>>>> Stashed changes
	
	
	do{
<<<<<<< Updated upstream
	System.out.println("in che posizione del tabellone vuoi piazzarla? prima x, poi y (tra 0 e 40)" );
=======
	System.out.println("in che posizione del tabellone vuoi piazzarla? prima x, poi y (tra 0 e 40)");
	do {
>>>>>>> Stashed changes
	System.out.print("X: ");
	x=sc.nextInt();
	System.out.print("Y: ");
	y=sc.nextInt();
	System.out.println("\n\n");
<<<<<<< Updated upstream
	}while(giocatori[i].checkEmpty(x, y)!=00 && ((x<0 || x>40)||(y<0 || y>40)) && giocatori[i].checkNext(x, y)==false &&
			giocatori[i].checkCorner(x, y)==false);
=======
	if(giocatori[i].checkEmpty(x, y)!=00) System.out.println("Questa cella è gia occupata");
	}while(giocatori[i].checkEmpty(x, y)!=00 && giocatori[i].checkNext(x, y)==false);
		//non funziona
			//giocatori[i].checkCorner(x, y)==false);
	//(giocatori[i].checkEmpty(x, y)!=00) &&
>>>>>>> Stashed changes
	
	
	if(giocatori[i].scegliCarta(h-1).getID()>60 || giocatori[i].scegliCarta(h-1).getID()<21 ) {
		giocatori[i].giocaCartaTabellone(giocatori[i].scegliCarta(h-1), x,y);
<<<<<<< Updated upstream
		//giocatori[i].getPunteggio(giocatori[i].scegliCarta(h-1).getPunteggio());
=======
		giocatori[i].removeCorner(x,y);
		giocatori[i].getPunteggio(giocatori[i].scegliCarta(h-1).getPunteggio());
>>>>>>> Stashed changes
		
	}
	
	giocatori[i].getTabellone();
	for(int l=0;l<2;l++) {
	campo_oro.add(mazzo_oro.pescaCarta());
	mazzo_oro.rimuoviCarta();
	//campo_risorsa.add(mazzo_risorsa.pescaCarta());
	//mazzo_risorsa.rimuoviCarta();
	

	
	}
	
	System.out.println("INSETTI PRESENTI SUL CAMPO: "+giocatori[i].contaInsetti());
	
	System.out.println("CARTE SUL CAMPO ORO");
	
		for(int d=0;d<campo_oro.size();d++) System.out.print("-----------------------┬");
		System.out.print("\n\n");
		for(int d=0;d<campo_oro.size();d++)System.out.print(" "+campo_oro.get(d).getID()+"\t\t\t\t");
		System.out.println("\n\n");
		for(int d=0;d<campo_oro.size();d++)System.out.print(campo_oro.get(d).getRis1Fronte()+"\t"+campo_oro.get(d).getRis2Fronte()+"\t\t");
		System.out.println("\n\n");
		for(int d=0;d<campo_oro.size();d++)System.out.print(campo_oro.get(d).getRis3Fronte()+"\t"+campo_oro.get(d).getRis4Fronte()+"\t\t");
		System.out.println("\n\n");
		for(int d=0;d<campo_oro.size();d++)System.out.print(campo_oro.get(d).getRis1Centro()+"\t\t\t");
		System.out.print("\n\n");
		
		for(int d=0;d<campo_oro.size();d++) System.out.print("-----------------------┴");
	
	int carta,pesca;
	System.out.println(giocatori[i].getName()+" \nda che mazzo vuoi pescare: 1 se vuoi pescare tra dal mazzo oro,"
			+ "2 se vuoi pescare dal mazzo risorsa, 3 se vuoi prendere una carta oro scoperta, 4 se vuoi prendere una carta risorsa scoperta");
	carta=sc.nextInt();
	System.out.println("CARTE SCOPERTE: \n");
	for(int index=0;index<2;index++) System.out.print(campo_oro.get(index).printCard());
	//for(int index=0;index<2;index++) System.out.print(campo_risorsa.get(index).printCard());
	
	switch(carta) {
	case 1:giocatori[i].aggiungiaMano(mazzo_oro.pescaCarta());
	System.out.println("hai pescato: \n");
	giocatori[i].guardaCartaMano(2);
	mazzo_oro.rimuoviCarta();
	break;
	case 2: System.out.println();
	break;
	case 3:System.out.println("Scegli la carta che vuoi aggiungere alla tua mano,1 o 2");
			System.out.println("1:\n"+campo_oro.get(0).printCard());
			System.out.println("2:\n"+campo_oro.get(1).printCard());
			pesca=sc.nextInt();
			giocatori[i].aggiungiaMano(campo_oro.get(pesca-1));
			campo_oro.remove(pesca-1);
			campo_oro.add(mazzo_oro.pescaCarta());
			mazzo_oro.rimuoviCarta();
		/*
	case 4: System.out.println("Scegli la carta che vuoi aggiungere alla tua mano,1 o 2");
	System.out.println("1:\n"+campo_oro.get(0));
	System.out.println("2:\n"+campo_oro.get(1));
	pesca=sc.nextInt();
	giocatori[i].aggiungiaMano(campo_oro.get(pesca-1));
	break;
	*/
	default:
	}
	
	giocatori[i].guardaMano();
	
}
	
	
}

}



