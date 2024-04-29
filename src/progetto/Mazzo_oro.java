package progetto;
import java.util.ArrayList;

import java.util.Collections;


public class Mazzo_oro {
	
//esempi non carte reali
private ArrayList<Carta_oro> mazzo_oro = new ArrayList<Carta_oro>();
private Carta_oro carta_oro1=new Carta_oro(Regno.ANIMALE.toString(),Regno.FUNGHI.toString(),
		Regno.NULL.toString(),Regno.INSETTI.toString(),1,"VVV", Colore_carta.BLU,"jhshj",05);
private Carta_oro carta_oro2=new Carta_oro(Regno.ANIMALE.toString(),Regno.FUNGHI.toString(),
		Regno.NULL.toString(),Regno.INSETTI.toString(),1,"VVV", Colore_carta.BLU,"jhshj",06);
private Carta_oro carta_oro3=new Carta_oro(Regno.ANIMALE.toString(),Regno.FUNGHI.toString(),
		Regno.NULL.toString(),Regno.INSETTI.toString(),1,"VVV", Colore_carta.BLU, "h2h",07);

public Mazzo_oro(){
	//this.mazzo_oro=new Carta_oro[40];
	mazzo_oro.add(carta_oro1);
	mazzo_oro.add(carta_oro2);
	mazzo_oro.add(carta_oro3);


	
}

public void getMazzo() {
for(int i=0;i<mazzo_oro.size();i++) mazzo_oro.get(i).getCarta();
}



public void mescolaMazzo() {
	Collections.shuffle(mazzo_oro);
}
public void rimuoviCarta(Carta_oro carta)
{
	mazzo_oro.remove(carta);
}


public Carta_oro pescaCarta()
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


}


/*public void pescaCarta2()
{
	System.out.println("Hai pescato:\t\t "+mazzo_oro.get(0).getPunteggio(mazzo_oro.get(0)).toString());
	mazzo_oro.remove(mazzo_oro.get(0));
}
*/


