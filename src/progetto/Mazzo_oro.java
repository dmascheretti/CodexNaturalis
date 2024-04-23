package progetto;

import java.util.ArrayList;

import java.util.Collections;


public class Mazzo_oro {
//private Carta_oro[] mazzo_oro;
private ArrayList<Carta> mazzo_oro = new ArrayList<Carta>();
private Carta carta_oro1=new Carta(Regno.ANIMALE.toString(),Regno.FUNGHI.toString(),
		Regno.NULL.toString(),Regno.INSETTI.toString(),1,"VVV", Colore_carta.BLU, "h2h","jhshj");
private Carta carta_oro2=new Carta(Regno.ANIMALE.toString(),Regno.FUNGHI.toString(),
		Regno.NULL.toString(),Regno.INSETTI.toString(),1,"VVV", Colore_carta.BLU, "h2h","jhshj");
private Carta carta_oro3=new Carta(Regno.ANIMALE.toString(),Regno.FUNGHI.toString(),
		Regno.NULL.toString(),Regno.INSETTI.toString(),1,"VVV", Colore_carta.BLU, "h2h","jhshj");


public Mazzo_oro(){
	//this.mazzo_oro=new Carta_oro[40];
	mazzo_oro.add(carta_oro1);
	mazzo_oro.add(carta_oro2);
	mazzo_oro.add(carta_oro3);
	//mazzo_oro.add(Carta_oro4);
	//mazzo_oro.add(Carta_oro5);
	/*
	mazzo_oro.add(Carta_oro6);
	mazzo_oro.add(Carta_oro7);
	mazzo_oro.add(Carta_oro8);
	mazzo_oro.add(Carta_oro9);
	mazzo_oro.add(Carta_oro10);
	mazzo_oro.add(Carta_oro11);
	mazzo_oro.add(Carta_oro12);
	mazzo_oro.add(Carta_oro13);
	mazzo_oro.add(Carta_oro14);
	mazzo_oro.add(Carta_oro15);
	mazzo_oro.add(Carta_oro16);
	mazzo_oro.add(Carta_oro17);
	mazzo_oro.add(Carta_oro18);
	mazzo_oro.add(Carta_oro19);
	mazzo_oro.add(Carta_oro20);
	mazzo_oro.add(Carta_oro21);
	mazzo_oro.add(Carta_oro22);
	mazzo_oro.add(Carta_oro23);
	mazzo_oro.add(Carta_oro24);
	mazzo_oro.add(Carta_oro25);
	mazzo_oro.add(Carta_oro26);
	mazzo_oro.add(Carta_oro27);
	mazzo_oro.add(Carta_oro28);
	mazzo_oro.add(Carta_oro29);
	mazzo_oro.add(Carta_oro30);
	mazzo_oro.add(Carta_oro31);
	mazzo_oro.add(Carta_oro32);
	mazzo_oro.add(Carta_oro33);
	mazzo_oro.add(Carta_oro34);
	mazzo_oro.add(Carta_oro35);
	mazzo_oro.add(Carta_oro36);
	mazzo_oro.add(Carta_oro37);
	mazzo_oro.add(Carta_oro38);
	mazzo_oro.add(Carta_oro39);
	mazzo_oro.add(Carta_oro40);
	*/
	
}

public void getMazzo() {
for(int i=0;i<mazzo_oro.size();i++) mazzo_oro.get(i).getCarta();
}



public void mescolaMazzo() {
	Collections.shuffle(mazzo_oro);
}
public void rimuoviCarta(Carta carta)
{
	mazzo_oro.remove(carta);
}


public Carta pescaCarta()
{
	//System.out.println("Hai pescato:\t\t");
	//mazzo_oro.get(0).getCarta1();
	//mazzo_oro.remove(mazzo_oro.get(0));
	return mazzo_oro.get(0);
}

public void printCarta(Carta carta_oro) {
	System.out.println("Hai pescato:\t\t");
		carta_oro.getCarta();
}

public Carta cartaPescata()
{
	return mazzo_oro.get(0);
}


/*public void pescaCarta2()
{
	System.out.println("Hai pescato:\t\t "+mazzo_oro.get(0).getPunteggio(mazzo_oro.get(0)).toString());
	mazzo_oro.remove(mazzo_oro.get(0));
}
*/
}


