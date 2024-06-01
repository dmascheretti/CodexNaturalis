package progetto;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

import carte.Carta;
import carte.Carta_obiettivo;
import exception.NameAssignedException;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import carte.Carta_oro;
import carte.Carta_risorsa;
import controller.Contatori;
import controller.Controller;
import mazzi.Mazzo_oro;
import mazzi.Mazzo_risorse;



/**
 * 
 */
/**
 * 
 */
public class Giocatore {
private static Set<String> NOMI_ASSEGNATI=new HashSet<>();
private final String name;
private ArrayList<Carta> mano;
private ArrayList<Carta_obiettivo> cartaObiettivo;
private int somma=0;
private Tabellone tabellone;
private Contatori contatore;
private Controller controller;





/**
 * Costructor of player 
 * @param name
 * @throws NameAssignedException
 * 
 */
public Giocatore(String name) throws NameAssignedException {
		if(NOMI_ASSEGNATI.contains(name)) {
			throw new NameAssignedException();
		}
		this.name=name;
		this.mano= new ArrayList<Carta>();
		this.cartaObiettivo=new ArrayList <Carta_obiettivo>();
		this.tabellone=new Tabellone();
		NOMI_ASSEGNATI.add(name);
		this.contatore=new Contatori();
		this.controller=new Controller();
}

	public String getName() {
		return name;
	}
	
	/**
	 * Add card to player's hand
	 * @param carta
	 */
	public void aggiungiaMano(Carta carta) {
		mano.add(carta);
	}
	
	
	public void conta() {
		
		System.out.println("ANIMALI:   "+contatore.contaAnimali(tabellone));
		System.out.println("FUNGHI:    "+contatore.contaFunghi(tabellone));
		System.out.println("INSETTI:   "+contatore.contaInsetti(tabellone));
		System.out.println("VEGETALI:  "+contatore.contaVegetali(tabellone));
		System.out.println("PIUME:     "+contatore.contaPiume(tabellone));
		System.out.println("PERGAMENE: "+contatore.contaPergamene(tabellone));
		System.out.println("INCHIOSTRO:"+contatore.contaInchiostro(tabellone));
		
		
	}

	/**
	 * Add a goal card to player's goal hand
	 * @param carta
	 */
	public void aggiungiaObiettivo(Carta_obiettivo carta) {
		cartaObiettivo.add(carta);
	}


/**
 * Print player's hand cards
 * @throws InterruptedException
 */
public void guardaMano() throws InterruptedException {
	for(int i=0;i<mano.size();i++) {
	System.out.print(i+1+"a CARTA: "+mano.get(i).printCard()+"\n\n");
	TimeUnit.SECONDS.sleep(1);}
}


/**
 * Print a specify card in player hand
 * @param i
 */
public void guardaCartaMano(int i) {
	System.out.print(i+1+"a CARTA: "+mano.get(i).printCard());

	}
	
	

	public Carta scegliCarta(int i) {
		return mano.get(i);
	}
	
	/**
	 * Remove the first card of player hand
	 */
	public void removeCard() {
		mano.remove(0);
	}
	
	/**
	 * Remove the i-card of player hand
	 */
	public void removeCardIndex(int i) {
		mano.remove(i);
	}
	
	/**
	 * Add point to player total sum
	 * @param punti
	 */
	public void getPunteggio(int punti) {
		somma=somma+punti;
	}
	
	/**
	 * Retrun the hidden goal card
	 * @return
	 */
	public Carta_obiettivo getObiettivo(){
		return cartaObiettivo.get(0);
	}
	
	/**
	 * Return the total points
	 * @return
	 */
	public int getSomma() {
		return (somma);
	}
	

public Tabellone getTabellone() {
		
		return tabellone;
}



/**
 * Allow to choose a card from the table
 * @param carta_pescata
 * @param mazzo_oro
 * @param mazzo_risorse
 * @param campo_oro
 * @param campo_risorsa
 * @return
 */
public Carta scelta(int carta_pescata,  Mazzo_oro mazzo_oro, Mazzo_risorse mazzo_risorse,
		ArrayList<Carta_oro> campo_oro, ArrayList<Carta_risorsa> campo_risorsa){
		int carta_scelta=0;
		Carta carta=null;
		Scanner sc = new Scanner(System.in);
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

			default: return null;
			}
		}

	
	
}




