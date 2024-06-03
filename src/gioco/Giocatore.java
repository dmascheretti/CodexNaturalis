package gioco;

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
private Stampa stampa;






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
		this.stampa=new Stampa();
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
	
	public Boolean controlla(int id) {
		return controller.mossaValida(id, tabellone);
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
		Boolean blocca=false;
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
			
					blocca=false;

					while (!blocca || carta_scelta!=1 && carta_scelta!=2) {
						try {
							System.out.println("Scegli la carta che vuoi aggiungere alla tua mano, 1 o 2");
							carta_scelta=sc.nextInt();
							blocca = true; 
						} catch (InputMismatchException e) {
							System.out.println("Errore");
							sc.nextLine();

						}
					}
					 
					carta=campo_oro.get(carta_scelta-1);
					campo_oro.remove(carta_scelta-1);
					campo_oro.add((Carta_oro) mazzo_oro.pescaCarta());
					mazzo_oro.rimuoviCarta();
					return carta;
					
			case 4: System.out.println("1:\n"+campo_risorsa.get(0).printCard());
				    System.out.println("2:\n"+campo_risorsa.get(1).printCard());
				    blocca=false;

					while (!blocca || carta_scelta!=1 && carta_scelta!=2) {
						try {
							System.out.println("Scegli la carta che vuoi aggiungere alla tua mano,1 o 2");
							carta_scelta=sc.nextInt();
							blocca = true; 
						} catch (InputMismatchException e) {
							System.out.println("Errore");
							sc.nextLine();

						}
					}
					carta=campo_risorsa.get(carta_scelta-1);
					campo_risorsa.remove(carta_scelta-1);
					campo_risorsa.add((Carta_risorsa) mazzo_risorse.pescaCarta());
					mazzo_risorse.rimuoviCarta();
					return carta;

			default: return null;
			}
		}
/*

public void turno(Mazzo_oro mazzo_oro, Mazzo_risorse mazzo_risorse, Campo_gioco campo_gioco) throws InterruptedException {
	boolean blocca=false;
	Boolean block=false;
	int fronte=0,retro=1, scelta, h=0;
	Scanner sc=new Scanner(System.in);
	int start=0;
	while (!blocca || start!=0) {
		try {
			System.out.println("\n\n\nE' IL TURNO DI: "+name.toUpperCase()+" PREMI 0 PER INIZARE");
			start=sc.nextInt();
			blocca = true; 
		} catch (InputMismatchException e) {
			System.out.println("Errore");
			sc.nextLine(); //consuma quello che ho nel buffer e svuota

		}
	}
	
	//PRINT ALL THE INFORMATIONS ABOUT THE PLAYER 
	
	stampa.stampaGiocatore(this);


	//CHOOSE CARD FROM PLAYER HAND


	block=true;
	System.out.println(name+" scegli una carta da giocare tra quelle della tua mano: ".toUpperCase());
	TimeUnit.SECONDS.sleep(2);
	guardaMano();

	do {
		//Boolean blocca=false;
		block=true;
		blocca=false;

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

		scelta=-1;
		blocca=false;
		while (!blocca || scelta!=fronte && scelta!=retro) {
			try {
				System.out.print("\nscegli tra 0(fronte), 1(retro)".toUpperCase()+"\n");
				scelta = sc.nextInt();
				blocca = true; 
			} catch (InputMismatchException e) {
				System.out.println("Errore");
				sc.nextLine();

			}
		}

		if(scelta==fronte) {
		
			//CHECK THE NECESSARY RESOURCES
			
			block=controlla(mano.get(h-1).getID());

			if(block==false) System.out.println("\nnon puoi piazzare questa carta, non hai le risorse necessarie\n".toUpperCase());
			else {mano.get(h-1).setRisFronte();
			System.out.println(mano.get(h-1).printCardFinal());
			}



		}
		if(scelta==retro) {
			scegliCarta(h-1).setPunti(); //IF PLAY RETRO CARD, POINTS=0
			System.out.println(mano.get(h-1).printCardFinal());
		}
	}while(block==false);

	int x=0;
	int y=0;

	do {
		
		System.out.println("in che posizione del tabellone vuoi piazzarla? prima x, poi y (tra 1 e "+ (tabellone.getSize()-2)+")");
		blocca=false;
		while (!blocca || x<1 || x>(tabellone.getSize()-2) ) {
			try {
				System.out.print("X: ");
				x=sc.nextInt();
				blocca = true; 
			} catch (InputMismatchException e) {
				System.out.println("Errore");
				sc.nextLine(); //consuma quello che ho nel buffer e svuota

			}
		}


		while (!blocca || y<1 || y>(tabellone.getSize()-2) ) {
			try {
				System.out.print("Y: ");
				y=sc.nextInt();
				blocca = true; 
			} catch (InputMismatchException e) {
				System.out.println("Errore");
				sc.nextLine(); //consuma quello che ho nel buffer e svuota

			}
		}


		if(tabellone.checkEmpty(x, y)!=0 ||
				tabellone.checkNext(x, y)==false ||
						tabellone.checkCorner(x,y)==false) System.out.println("NON PUOI PIAZZARE LA CARTA IN QUESTA POSIZIONE");

		//CHECKING THE POSSIBILITY TO PLAY THE CARD 
		
	}while(tabellone.checkCorner(x,y)==false || tabellone.checkNext(x, y)==false
			||tabellone.checkEmpty(x, y)!=0);
	
	
	tabellone.removeCorner(x, y);
	
	if(scelta==fronte) {

		somma=somma+controller.getPunti(mano.get(h-1),tabellone,
				x, y);
	}

	tabellone.setCella(x, y,mano.get(h-1)); //PLACING CARD




	
	
	mano.remove(h-1); //REMOVING CARD FROM HAND

	System.out.println("PIAZZAMENTO CARTA IN CORSO...");
	TimeUnit.SECONDS.sleep(3);

	//TimeUnit.SECONDS.sleep(3);
	tabellone.printTabellone();

	System.out.println("PUNTEGGIO DOPO PIAZZAMENTO: "+somma);
	
	//PRINT THE TABLE 
	
	TimeUnit.SECONDS.sleep(3);
	System.out.println("\n-----MAZZI-----");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("\nMAZZO ORO\n");
	System.out.println(mazzo_oro.getRetro().printCardR());

	System.out.println("\n\nMAZZO RISORSE \n");
	System.out.println(mazzo_risorse.getRetro().printCardR());
	System.out.println();

	TimeUnit.SECONDS.sleep(2);
	
	campo_gioco.stampaCartaCampo();


	int carta_pescata = 0;

	//PICK A CARD FROM THE TABLE

	//boolean blocca=false;
	blocca=false;
	while (!blocca) {
		try {
			System.out.println("\n\n"+name+": da che mazzo vuoi pescare:\n1-PESCA DAL MAZZO ORO\n"
					+ "2-PESCA DAL MAZZO RISORSE\n3-PRENDI UNA CARTA ORO SCOPERTA\n4-PRENDI UNA CARTA RISORSA SCOPERTA");
			carta_pescata=sc.nextInt();
			blocca = true; 
		} catch (InputMismatchException e) {
			System.out.println("Errore");
			sc.nextLine(); //consuma quello che ho nel buffer e svuota

		}
	}

	Carta carta_nuova = scelta(carta_pescata, mazzo_oro, mazzo_risorse, campo_gioco.returnOro(),campo_gioco.returnRisorse());
	mano.add(carta_nuova); //ADD CARD TO PLAYER HAND
	System.out.println("\nHAI PESCATO: \n");
	System.out.println(carta_nuova.printCard());



}

*/

}
	
	




