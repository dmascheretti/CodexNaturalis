package progetto;

import java.util.ArrayList;

public class Giocatore {
private final String name;
private ArrayList<Carta> mano;
private Segnalino segnalino;
private static int somma=0;
private Cella[][] tavolo;




public Giocatore(String name, Colore colore) {
	this.name=name;
	this.mano= new ArrayList<Carta>();
	this.segnalino=new Segnalino(colore);
}

public String getSegnalino() {
	return segnalino.getColore().toString();
}

public String getName() {
	return name;
}
public void pescaCarta(Carta carta) {
	mano.add(carta);
}

public void guardaMano() {
	for(int i=0;i<mano.size();i++) {
		mano.get(i).getCarta();	}
}

public Carta scegliCarta(int i) {
	return mano.get(i);
}
public void giocaCarta(Carta carta) {
	System.out.println("hai piazzato");
	carta.getCarta();
	mano.remove(carta);
}

public void getPunteggio(int punti) {
	somma=somma+punti;
}

public int getSomma() {
	return (somma);
}


}