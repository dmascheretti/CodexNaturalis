package progetto;

import java.util.Random;
import java.util.Scanner;

public class Gioco {
	
private Mazzo_oro mazzo_oro;
private Mazzo_Risorse mazzo_risorse;
private Giocatore[] giocatori;
//private Mazzo_obiettivo mazzo_obiettivo;
//private Segnalino segnalino;
//private static Integer[] tabella=new Integer[30];


public Gioco() {
	this.mazzo_risorse=new Mazzo_Risorse();
	this.mazzo_oro=new Mazzo_oro();
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
		int k=i+1;
		System.out.println("Selezione nome giocatore "+k+": ");
		String name=sc.next();
		if(i==randomInt) this.giocatori[i]=new Giocatore(name,Colore.NERO);
		else if(i==0) this.giocatori[i]=new Giocatore(name,Colore.ROSSO);
		else if (i==1) this.giocatori[i]=new Giocatore(name,Colore.GIALLO);
		else if (i==2) this.giocatori[i]=new Giocatore(name,Colore.ROSSO);
		else this.giocatori[i]=new Giocatore(name,Colore.ROSSO);
		
	}
}

public void Gioca() {
	
	//mazzo_oro.getMazzo();
	//mazzo_oro.mescolaMazzo();
	mazzo_risorse.getMazzo();
	//mazzo_risorse.mescolaMazzo();
	System.out.println("\n\n\n");
	
	//PESCA CARTE INIZIALI
	
	for(int i=0;i<giocatori.length;i++) {
		giocatori[i].pescaCarta(mazzo_oro.pescaCarta());
		mazzo_oro.rimuoviCarta(mazzo_oro.cartaPescata());
		
		for(int j=0;j<2;j++)giocatori[i].pescaCarta(mazzo_risorse.pescaCarta());
		
		//giocatori[i].pescaCarta(mazzo_iniziale.pescaCarta());
		//giocatori[i].pescaCarta(mazzo_obiettivo.pescaCarta());
		
	}
	
	
	for(int i=0;i<giocatori.length;i++) {
	System.out.println(giocatori[i].getName().toUpperCase()+" : "+giocatori[i].getSegnalino()); 
	
	Scanner sc=new Scanner(System.in);
	System.out.println(giocatori[i].getName()+" scegli una carta da giocare tra quelle della tua mano: ");
	giocatori[i].guardaMano();
	int h;
	System.out.println("scegli tra 1,2 o 3");
	do {
	h=sc.nextInt();
	}while(h<1||h>3);
	int punti = (giocatori[i].scegliCarta(h-1).getPunteggio());
	giocatori[i].giocaCarta(giocatori[i].scegliCarta(h-1));
	System.out.println("PUNTI TOTALI "+ giocatori[i].getName());
	giocatori[i].getPunteggio(punti);
	giocatori[i].guardaMano();
	
	
	//pesa carta 
	Scanner c=new Scanner(System.in);
	int s;
	System.out.println("da che mazzo vuoi pescare: 1-mazzo oro\n2-mazzo risorse");
	do {
	s=sc.nextInt();
	sc.nextLine();
	}while(s!=1 || s!=2);
	
		giocatori[i].pescaCarta(mazzo_oro.pescaCarta());
		mazzo_oro.rimuoviCarta(mazzo_oro.cartaPescata());

		giocatori[i].pescaCarta(mazzo_risorse.pescaCarta());
		mazzo_risorse.rimuoviCarta(mazzo_risorse.cartaPescata());
	
	
	System.out.println("Il giocatore "+ giocatori[i].getName()+" ha queste carte: ");
	giocatori[i].guardaMano();
	System.out.println("Il giocatore "+ giocatori[1].getName()+" ha queste carte: ");
	giocatori[1].guardaMano();
	
	Scanner scn=new Scanner(System.in);
	System.out.println(giocatori[i].getName()+" scegli una carta da giocare tra quelle della tua mano: ");
	giocatori[i].guardaMano();
	int f;
	System.out.println("scegli tra 1,2 o 3");
	do {
	f=scn.nextInt();
	}while(f<1||f>3);
	int punti1= (giocatori[i].scegliCarta(h-1).getPunteggio());
	giocatori[i].giocaCarta(giocatori[i].scegliCarta(h-1));
	System.out.println("PUNTI TOTALI "+ giocatori[i].getName());
	giocatori[i].getPunteggio(punti1);
	giocatori[i].guardaMano();
	
	System.out.println(giocatori[i].getSomma()+"\n\n");
	
	
	
	}
	
}
}



