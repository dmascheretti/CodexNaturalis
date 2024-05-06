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
	
	this.tabellone=new Carta[10][10];
}



public String getName() {
	return name;
}
public void aggiungiaMano(Carta carta) {
	mano.add(carta);
}

public void guardaMano() {
	for(int i=0;i<mano.size();i++) {
	System.out.print(i+1+"a CARTA: "+mano.get(i).printCard());}
}

public void guardaCartaMano(int i) {
	System.out.print(i+1+"a CARTA: "+mano.get(i).printCard());
	}


public void removeCorner(int i, int j) {
	tabellone[i+1][j+1].setRis1Fronte();
	tabellone[i-1][j-1].setRis4Fronte();
	tabellone[i-1][j+1].setRis3Fronte();
	tabellone[i+1][j-1].setRis2Fronte();
	
	
}

public Carta scegliCarta(int i) {
	return mano.get(i);
}

public void giocaCarta(Carta carta) {
	System.out.println("hai piazzato");
	carta.getCarta();
	mano.remove(carta);
}

public void removeCard() {
	mano.remove(0);
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
	if((tabellone[x+1][j].getID()==00) && (tabellone[x-1][j].getID()==00) &&
			(tabellone[x][j+1].getID()==00) && (tabellone[x][j-1].getID()==00)) return true;
	
	else return false;
	
	
}

public Boolean checkCorner(int x, int j) {
	if(tabellone[x+1][j+1].getID()!=00 || tabellone[x-1][j-1].getID()!=00 || 
			tabellone[x+1][j+1].getID()!=00 || tabellone[x-1][j+1].getID()!=00){
			
			if(tabellone[x+1][j+1].getRis1Fronte()!="████"|| tabellone[x+1][j-1].getRis3Fronte()!="████" ||
			tabellone[x-1][j-1].getRis4Fronte()!="████" || tabellone[x-1][j+1].getRis1Fronte()!="████") 
			return true;
	}
	return false;
	
	
}
public int getSomma() {
	return (somma);
}

public void riempiTabellone(Carta carta) {
	for(int i=0;i<tabellone.length;i++)
		for(int j=0;j<tabellone.length;j++)
			tabellone[i][j]=carta;
}

public int contaInsetti() {
	int insetti=0;
	for(int i=0;i<tabellone.length;i++)
		for(int j=0;j<tabellone[i].length;j++)
			if(tabellone[i][j].getRis1Fronte()==Regno.INSE.toString()) insetti++;
	
	for(int i=0;i<tabellone.length;i++)
		for(int j=0;j<tabellone[i].length;j++)
			if(tabellone[i][j].getRis2Fronte()==Regno.INSE.toString()) insetti++;
	
	for(int i=0;i<tabellone.length;i++)
		for(int j=0;j<tabellone[i].length;j++)
			if(tabellone[i][j].getRis3Fronte()==Regno.INSE.toString()) insetti++;
	
	for(int i=0;i<tabellone.length;i++)
		for(int j=0;j<tabellone[i].length;j++)
			if(tabellone[i][j].getRis4Fronte()==Regno.INSE.toString()) insetti++;
	
	for(int i=0;i<tabellone.length;i++)
		for(int j=0;j<tabellone[i].length;j++)
			if(tabellone[i][j].getRis1Centro()==Regno.INSE.toString()) insetti++;
	
	return insetti;
}
//da finire (come metodo get carta in Carta)
public void getTabellone() {
	for(int i=0;i<tabellone.length;i++) {	
		System.out.println();
		for(int a=0;a<tabellone.length;a++) System.out.print("-----------------------┬");
	
		System.out.print("\n\n");
		
		for(int a=0;a<tabellone[i].length;a++) System.out.print("("+i+","+a+")\t\t\t");
		
		System.out.print("\n\n");
		
		for(int a=0;a<tabellone[i].length;a++) {
			if(tabellone[i][a].getID()==0) System.out.print("    \t\t\t");
			else System.out.print(" "+tabellone[i][a].getID()+"\t\t\t");
		}
			
		System.out.println("\n\n");
		for(int a=0;a<tabellone[i].length;a++)System.out.print(tabellone[i][a].getRis1Fronte()+"\t"+tabellone[i][a].getRis2Fronte()+"\t\t");
		System.out.println("\n\n");
		for(int a=0;a<tabellone[i].length;a++)System.out.print(tabellone[i][a].getRis3Fronte()+"\t"+tabellone[i][a].getRis4Fronte()+"\t\t");
		System.out.println("\n\n");
		for (int a=0;a<tabellone[i].length;a++)System.out.print(tabellone[i][a].getRis1Centro()+"\t\t\t");
		System.out.print("\n\n");
		
		for(int a=0;a<tabellone[i].length;a++) System.out.print("-----------------------┴");
		
		
		
	
		//}
		
		
		
}
	System.out.println();

		}

	


public void getTabellone2() {
	for(int i=0;i<10;i++) {
		if(i>0)System.out.println("\n");
		for(int j=0;j<10;j++) {
		if((tabellone[i][j].getID())!=00)System.out.print(tabellone[i][j].printCard());
		else {
			System.out.print(tabellone[i][j].printEmpty());
		}
}

}

	}
}
