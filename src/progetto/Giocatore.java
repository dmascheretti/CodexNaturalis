package progetto;

import java.util.ArrayList;

public class Giocatore {
private final String name;
private ArrayList<Carta> mano;
private Segnalino segnalino;
private static int somma=0;
private Carta[][]tabellone;



public Giocatore(String name, Colore colore) {
	this.name=name;
	this.mano= new ArrayList<Carta>();
	this.segnalino=new Segnalino(colore);
	this.tabellone=new Carta[40][40];
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
//modificare Carta in Carta_iniziale
public void giocaCarta2(Carta carta,int i, int j) {
	tabellone[i][j]=carta;
}

public void getPunteggio(int punti) {
	somma=somma+punti;
}

public int getSomma() {
	return (somma);
}

//da finire (come metodo get carta in Carta)
public void getTabellone() {
	for(int i=0;i<40;i++) {
		System.out.println("\n");
		for(int j=0;j<40;j++) {
		if(tabellone[i][j]!=null)System.out.println(tabellone[i][j].toString());
		}
}

}

}