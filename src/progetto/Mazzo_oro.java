package progetto;
import java.util.ArrayList;

import java.util.Collections;


public class Mazzo_oro extends Mazzo{
	
private ArrayList<Carta_oro> mazzo_oro = new ArrayList<Carta_oro>();
private Carta_oro carta_oro1=new Carta_oro("",Regno.NULL.toString(),"","",
		2,"VVVF", Colore_carta.VERDE,Regno.VEGETALE.toString(),80);

private Carta_oro carta_oro2=new Carta_oro(Regno.NULL.toString(),"","",Regno.PERGAMENA.toString(),
		1,"AAV", Colore_carta.BLU,Regno.ANIMALE.toString(),81);

private Carta_oro carta_oro3=new Carta_oro("",Regno.NULL.toString(),Regno.PIUMA.toString(),"",
		1,"AAF", Colore_carta.BLU, Regno.ANIMALE.toString(),82);

private Carta_oro carta_oro4=new Carta_oro(Regno.NULL.toString(),"","","",
		2,"AAAV", Colore_carta.BLU, Regno.ANIMALE.toString(),83);

private Carta_oro carta_oro5=new Carta_oro(Regno.NULL.toString(),"","",Regno.NULL.toString(),
		5,"AAAAA", Colore_carta.BLU, Regno.ANIMALE.toString(),84);

private Carta_oro carta_oro6=new Carta_oro("","",Regno.NULL.toString(),"",
		2,"AAAI", Colore_carta.BLU, Regno.ANIMALE.toString(),85);

private Carta_oro carta_oro7=new Carta_oro("",Regno.NULL.toString(),"","",
		2,"AAAF", Colore_carta.BLU, Regno.ANIMALE.toString(),86);

private Carta_oro carta_oro8=new Carta_oro(Regno.NULL.toString(),"",Regno.NULL.toString(),Regno.PIUMA.toString(),
		3,"AAA", Colore_carta.BLU, Regno.ANIMALE.toString(),87);

private Carta_oro carta_oro9=new Carta_oro("",Regno.NULL.toString(),Regno.PERGAMENA.toString(),"",
		3,"AAA", Colore_carta.BLU, Regno.ANIMALE.toString(),88);

private Carta_oro carta_oro10=new Carta_oro("",Regno.PERGAMENA.toString(),"","",
		3,"AAA", Colore_carta.BLU, Regno.ANIMALE.toString(),89);

private Carta_oro carta_oro11=new Carta_oro("","",Regno.NULL.toString(),Regno.NULL.toString(),
		5,"VVVVV", Colore_carta.VERDE, Regno.VEGETALE.toString(),90);

private Carta_oro carta_oro12=new Carta_oro(Regno.PIUMA.toString(),"","",Regno.NULL.toString(),
		5,"VVI", Colore_carta.VERDE, Regno.VEGETALE.toString(),91);

private Carta_oro carta_oro13=new Carta_oro(Regno.PIUMA.toString(),"",Regno.NULL.toString(),Regno.NULL.toString(),
		3,"FFF", Colore_carta.ROSSO, Regno.INSETTI.toString(),92);

private Carta_oro carta_oro14=new Carta_oro(Regno.NULL.toString(),Regno.PERGAMENA.toString(),Regno.NULL.toString(),"",
		3,"FFF", Colore_carta.ROSSO, Regno.INSETTI.toString(),93);

private Carta_oro carta_oro15=new Carta_oro("",Regno.NULL.toString(),Regno.POZIONE.toString(),Regno.NULL.toString(),
		3,"FFF", Colore_carta.ROSSO, Regno.INSETTI.toString(),94);

private Carta_oro carta_oro16=new Carta_oro("",Regno.NULL.toString(),"",Regno.NULL.toString(),
		5,"FFFFF", Colore_carta.ROSSO, Regno.INSETTI.toString(),95);

private Carta_oro carta_oro17=new Carta_oro("","","",Regno.NULL.toString(),
		2,"FFFV", Colore_carta.ROSSO, Regno.INSETTI.toString(),96);

private Carta_oro carta_oro18=new Carta_oro(Regno.PERGAMENA.toString(),"","",Regno.NULL.toString(),
		1,"FFI", Colore_carta.ROSSO, Regno.INSETTI.toString(),97);

private Carta_oro carta_oro19=new Carta_oro("",Regno.NULL.toString(),"","",
		2,"FFFI", Colore_carta.ROSSO, Regno.INSETTI.toString(),98);

private Carta_oro carta_oro20=new Carta_oro("","",Regno.NULL.toString(),"",
		2,"FFFA", Colore_carta.ROSSO, Regno.INSETTI.toString(),99);

private Carta_oro carta_oro21=new Carta_oro(Regno.NULL.toString(),"","",Regno.PIUMA.toString(),
		1,"FFA", Colore_carta.ROSSO, Regno.INSETTI.toString(),100);




public Mazzo_oro(){
	mazzo_oro.add(carta_oro1);
	mazzo_oro.add(carta_oro2);
	mazzo_oro.add(carta_oro3);
	mazzo_oro.add(carta_oro4);
	mazzo_oro.add(carta_oro5);
	mazzo_oro.add(carta_oro6);
	mazzo_oro.add(carta_oro7);
	mazzo_oro.add(carta_oro8);
	mazzo_oro.add(carta_oro9);
	mazzo_oro.add(carta_oro10);
	mazzo_oro.add(carta_oro11);
	mazzo_oro.add(carta_oro12);
	mazzo_oro.add(carta_oro13);
	mazzo_oro.add(carta_oro14);
	mazzo_oro.add(carta_oro15);
	mazzo_oro.add(carta_oro16);
	mazzo_oro.add(carta_oro17);
	mazzo_oro.add(carta_oro18);
	mazzo_oro.add(carta_oro19);
	mazzo_oro.add(carta_oro20);
	mazzo_oro.add(carta_oro21);


	
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


