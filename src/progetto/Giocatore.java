package progetto;

import java.awt.Color;
import java.util.ArrayList;
<<<<<<< Updated upstream
import java.util.HashSet;
import java.util.Set;

import carte.Carta;
import carte.Carta_obiettivo;
import exception.NameAssignedException;
import progetto.Tabellone;
=======
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import carte.Carta;
import carte.Carta_obiettivo;
import carte.Carta_oro;
import carte.Carta_risorsa;
import mazzi.Mazzo_oro;
import mazzi.Mazzo_risorse;

>>>>>>> Stashed changes

public class Giocatore {
private static Set<String> NOMI_ASSEGNATI=new HashSet<>();
private final String name;
private final Color colore;
private ArrayList<Carta> mano;
private ArrayList<Carta_obiettivo> cartaObiettivo;
private int somma=0;
private Tabellone tabellone;



<<<<<<< Updated upstream
public Giocatore(String name) throws NameAssignedException {
		if(NOMI_ASSEGNATI.contains(name)) {
			throw new NameAssignedException();
		}
		this.name=name;
		this.mano= new ArrayList<Carta>();
		this.cartaObiettivo=new ArrayList <Carta_obiettivo>();
		this.tabellone=new Tabellone();
		NOMI_ASSEGNATI.add(name);
=======
public Giocatore(String name, Color colore) {
	this.name=name;
	this.colore=colore;
	this.mano= new ArrayList<Carta>();
	this.cartaObiettivo=new ArrayList <Carta_obiettivo>();
	this.tabellone=new Tabellone();
>>>>>>> Stashed changes
}



<<<<<<< Updated upstream
	public String getName() {
		return name;
	}
	
	public void aggiungiaMano(Carta carta) {
		mano.add(carta);
	}
	
	public void aggiungiaObiettivo(Carta_obiettivo carta) {
		cartaObiettivo.add(carta);
	}
	
	public void guardaMano() {
		for(int i=0;i<mano.size();i++) {
		System.out.print(i+1+"a CARTA: "+mano.get(i).printCard()+"\n\n");}
	}
	
	public void guardaCartaMano(int i) {
		System.out.print(i+1+"a CARTA: "+mano.get(i).printCard());
=======
public String getName() {
	return name;
}

public Color getColore() {
	return colore;
}


public void aggiungiaMano(Carta carta) {
	mano.add(carta);
}

public void aggiungiaObiettivo(Carta_obiettivo carta) {
	cartaObiettivo.add(carta);
}

public void guardaMano() throws InterruptedException {
	for(int i=0;i<mano.size();i++) {
	System.out.print(i+1+"a CARTA: "+mano.get(i).printCard()+"\n\n");
	TimeUnit.SECONDS.sleep(1);}
}

public void guardaCartaMano(int i) {
	System.out.print(i+1+"a CARTA: "+mano.get(i).printCard());
>>>>>>> Stashed changes
	}
	
	
<<<<<<< Updated upstream
	public Carta scegliCarta(int i) {
		return mano.get(i);
	}
	
	public void removeCard() {
		mano.remove(0);
	}
	
	public void removeCardIndex(int i) {
		mano.remove(i);
	}
	
	public void getPunteggio(int punti) {
		somma=somma+punti;
	}
	
	public Carta_obiettivo getObiettivo(){
		return cartaObiettivo.get(0);
	}
	
	public int getSomma() {
		return (somma);
	}
		
	public Tabellone getTabellone1() {	
			return tabellone;
	}
=======
public Tabellone getTabellone() {
		
		return tabellone;
}


public Carta scelta(int carta_pescata,  Mazzo_oro mazzo_oro, Mazzo_risorse mazzo_risorse,
		ArrayList<Carta_oro> campo_oro, ArrayList<Carta_risorsa> campo_risorsa){
		int carta_scelta=0;
		Carta carta=null;
		Scanner sc=new Scanner(System.in);
	switch(carta_pescata) {
	
	case 1: carta=mazzo_oro.pescaCarta();
				mazzo_oro.rimuoviCarta();
		return carta;
		
	case 2: carta=mazzo_risorse.pescaCarta();
			mazzo_risorse.rimuoviCarta();
			return carta;
		
	case 3: System.out.println("1:\n"+campo_oro.get(0).printCard());
			System.out.println("2:\n"+campo_oro.get(1).printCard());
			System.out.println("Scegli la carta che vuoi aggiungere alla tua mano,1 o 2");
			carta_scelta=sc.nextInt();
			carta=campo_oro.get(carta_scelta-1);
			campo_oro.remove(carta_scelta-1);
			campo_oro.add((Carta_oro) mazzo_oro.pescaCarta());
			mazzo_oro.rimuoviCarta();
			return carta;
			
	case 4: System.out.println("1:\n"+campo_risorsa.get(0).printCard());
		    System.out.println("2:\n"+campo_risorsa.get(1).printCard());
		    System.out.println("Scegli la carta che vuoi aggiungere alla tua mano,1 o 2");
		    carta_scelta=sc.nextInt();
			carta=campo_risorsa.get(carta_scelta-1);
			campo_risorsa.remove(carta_scelta-1);
			campo_risorsa.add((Carta_risorsa) mazzo_risorse.pescaCarta());
			mazzo_risorse.rimuoviCarta();
			return carta;

	default:return carta;
	}
	
	
}
>>>>>>> Stashed changes
}


