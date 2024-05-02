package progetto;

import java.util.ArrayList;

import carte.Carta;

public class Giocatore {
private final String name;
private ArrayList<Carta> mano;

private static int somma=0;
private Carta[][]tabellone;



public Giocatore(String name) {
	this.name=name;
	this.mano= new ArrayList<Carta>();
	
	this.tabellone=new Carta[40][40];
}



public String getName() {
	return name;
}
public void aggiungiaMano(Carta carta) {
	mano.add(carta);
}

public void guardaMano() {
	for(int i=0;i<mano.size();i++) {
	System.out.print(mano.get(i).printCard())	;}
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
public void giocaCartaTabellone(Carta carta,int i, int j) {
	tabellone[i][j]=carta;
}

public void getPunteggio(int punti) {
	somma=somma+punti;
}

public int checkEmpty(int x, int y) {
	return tabellone[x][y].getID();
}

public Boolean checkNext(int x, int j) {
	if(tabellone[x+1][j].getID()==00 && tabellone[x-1][j].getID()==00 && 
			tabellone[x][j+1].getID()==00 && tabellone[x][j-1].getID()==00) return true;
	
	return false;
	
	
}

public Boolean checkCorner(int x, int j) {
	if((tabellone[x+1][j].getID()!=00 || tabellone[x-1][j].getID()!=00 || 
			tabellone[x][j+1].getID()!=00 || tabellone[x][j-1].getID()!=00)
			&&
			(tabellone[x+1][j+1].getRis1Fronte()!="XXXX" && tabellone[x+1][j-1].getRis3Fronte()!="XXXX" && 
			tabellone[x-1][j-1].getRis4Fronte()!="XXXX" && tabellone[x-1][j+1].getRis1Fronte()!="XXXX") 
			)
			return true;
	
	return false;
	
	
}
public int getSomma() {
	return (somma);
}

public void riempiTabellone(Carta carta) {
	for(int i=0;i<40;i++)
		for(int j=0;j<40;j++)
			tabellone[i][j]=carta;
}

//da finire (come metodo get carta in Carta)
public void getTabellone() {
	for(int i=0;i<40;i++) {
		System.out.println("\n");
		for(int j=0;j<40;j++) {
		if((tabellone[i][j].getID())!=00)System.out.print(tabellone[i][j].printCard());
		else {
			System.out.print(tabellone[i][j].printEmpty());
		}
}

}

	}
}
