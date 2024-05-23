package progetto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import carte.Carta;
import carte.Carta_obiettivo;
import exception.NameAssignedException;
import progetto.Tabellone;

public class Giocatore {
private static Set<String> NOMI_ASSEGNATI=new HashSet<>();
private final String name;
private ArrayList<Carta> mano;
private ArrayList<Carta_obiettivo> cartaObiettivo;
private static int somma=0;
private Tabellone tabellone;



public Giocatore(String name) throws NameAssignedException {
		if(NOMI_ASSEGNATI.contains(name)) {
			throw new NameAssignedException();
		}
		this.name=name;
		this.mano= new ArrayList<Carta>();
		this.cartaObiettivo=new ArrayList <Carta_obiettivo>();
		this.tabellone=new Tabellone();
		NOMI_ASSEGNATI.add(name);
}



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
	}
	
	
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
}


