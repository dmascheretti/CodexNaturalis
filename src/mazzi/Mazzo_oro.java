package mazzi;
import java.util.ArrayList;

import java.util.Collections;

import carte.Carta;
import carte.Carta_oro;
import progetto.Colore_carta;
import progetto.Regno;


public class Mazzo_oro extends Mazzo{
	
private ArrayList<Carta_oro> mazzo_oro = new ArrayList<Carta_oro>();
/*

private Carta_oro carta_oro80=new Carta_oro(Regno.NULL.toString(),"non giocabile",Regno.NULL.toString(),Regno.NULL.toString(),
		2,"VVVF", Colore_carta.VERDE,Regno.VEGE.toString(),80);

private Carta_oro carta_oro81=new Carta_oro("non giocabile",Regno.NULL.toString(),Regno.NULL.toString(),Regno.PERG.toString(),
		1,"AAV", Colore_carta.BLU,Regno.ANIM.toString(),81);

private Carta_oro carta_oro82=new Carta_oro(Regno.NULL.toString(),"non giocabile",Regno.PIUM.toString(),Regno.NULL.toString(),
		1,"AAF", Colore_carta.BLU, Regno.ANIM.toString(),82);

private Carta_oro carta_oro83=new Carta_oro("non giocabile",Regno.NULL.toString(),Regno.NULL.toString(),Regno.NULL.toString(),
		2,"AAAV", Colore_carta.BLU, Regno.ANIM.toString(),83);

private Carta_oro carta_oro84=new Carta_oro("non giocabile",Regno.NULL.toString(),Regno.NULL.toString(),"non giocabile",
		5,"AAAAA", Colore_carta.BLU, Regno.ANIM.toString(),84);

private Carta_oro carta_oro85=new Carta_oro(Regno.NULL.toString(),Regno.NULL.toString(),"non giocabile",Regno.NULL.toString(),
		2,"AAAI", Colore_carta.BLU, Regno.ANIM.toString(),85);

private Carta_oro carta_oro86=new Carta_oro(Regno.NULL.toString(),"non giocabile",Regno.NULL.toString(),Regno.NULL.toString(),
		2,"AAAF", Colore_carta.BLU, Regno.ANIM.toString(),86);

private Carta_oro carta_oro87=new Carta_oro("non giocabile",Regno.NULL.toString(),"non giocabile",Regno.PIUM.toString(),
		3,"AAA", Colore_carta.BLU, Regno.ANIM.toString(),87);

private Carta_oro carta_oro88=new Carta_oro(Regno.NULL.toString(),"non giocabile",Regno.PERG.toString(),Regno.NULL.toString(),
		3,"AAA", Colore_carta.BLU, Regno.ANIM.toString(),88);

private Carta_oro carta_oro89=new Carta_oro(Regno.NULL.toString(),"non giocabile",Regno.PERG.toString(),"non giocabile",
		3,"AAA", Colore_carta.BLU, Regno.ANIM.toString(),89);

private Carta_oro carta_oro90=new Carta_oro(Regno.NULL.toString(),Regno.NULL.toString(),"non giocabile", "non giocabile",
		5,"VVVVV", Colore_carta.VERDE, Regno.VEGE.toString(),90);

private Carta_oro carta_oro91=new Carta_oro(Regno.PIUM.toString(),Regno.NULL.toString(),Regno.NULL.toString(),"non giocabile",
		5,"VVI", Colore_carta.VERDE, Regno.VEGE.toString(),91);

private Carta_oro carta_oro92=new Carta_oro(Regno.PIUM.toString(),Regno.NULL.toString(),"non giocabile","non giocabile",
		3,"FFF", Colore_carta.ROSSO, Regno.INSE.toString(),92);

private Carta_oro carta_oro93=new Carta_oro("non giocabile",Regno.PERG.toString(),"non giocabile",Regno.NULL.toString(),
		3,"FFF", Colore_carta.ROSSO, Regno.INSE.toString(),93);

private Carta_oro carta_oro94=new Carta_oro(Regno.NULL.toString(),"non giocabile",Regno.POZI.toString(),"non giocabile",
		3,"FFF", Colore_carta.ROSSO, Regno.INSE.toString(),94);

private Carta_oro carta_oro95=new Carta_oro(Regno.NULL.toString(),"non giocabile",Regno.NULL.toString(),"non giocabile",
		5,"FFFFF", Colore_carta.ROSSO, Regno.INSE.toString(),95);

private Carta_oro carta_oro96=new Carta_oro(Regno.NULL.toString(),Regno.NULL.toString(),Regno.NULL.toString(),"non giocabile",
		2,"FFFV", Colore_carta.ROSSO, Regno.INSE.toString(),96);

private Carta_oro carta_oro97=new Carta_oro(Regno.PERG.toString(),"non giocabile",Regno.NULL.toString(),"non giocabile",
		1,"FFI", Colore_carta.ROSSO, Regno.INSE.toString(),97);

private Carta_oro carta_oro98=new Carta_oro(Regno.NULL.toString(),"non giocabile",Regno.NULL.toString(),Regno.NULL.toString(),
		2,"FFFI", Colore_carta.ROSSO, Regno.INSE.toString(),98);

private Carta_oro carta_oro99=new Carta_oro(Regno.NULL.toString(),Regno.NULL.toString(),"non giocabile",Regno.NULL.toString(),
		2,"FFFA", Colore_carta.ROSSO, Regno.INSE.toString(),99);

private Carta_oro carta_oro100=new Carta_oro("non giocabile",Regno.NULL.toString(),Regno.NULL.toString(),Regno.PIUM.toString(),
		1,"FFA", Colore_carta.ROSSO, Regno.INSE.toString(),100);

*/


private Carta_oro carta_oro80=new Carta_oro(Regno.NULL.toString(),"████",Regno.NULL.toString(),Regno.NULL.toString(),
		2,"VVVF", Colore_carta.VERDE,Regno.VEGE.toString(),80);

private Carta_oro carta_oro81=new Carta_oro("████",Regno.NULL.toString(),Regno.NULL.toString(),Regno.PERG.toString(),
		1,"AAV", Colore_carta.BLU,Regno.ANIM.toString(),81);

private Carta_oro carta_oro82=new Carta_oro(Regno.NULL.toString(),"████",Regno.PIUM.toString(),Regno.NULL.toString(),
		1,"AAF", Colore_carta.BLU, Regno.ANIM.toString(),82);

private Carta_oro carta_oro83=new Carta_oro("████",Regno.NULL.toString(),Regno.NULL.toString(),Regno.NULL.toString(),
		2,"AAAV", Colore_carta.BLU, Regno.ANIM.toString(),83);

private Carta_oro carta_oro84=new Carta_oro("████",Regno.NULL.toString(),Regno.NULL.toString(),"████",
		5,"AAAAA", Colore_carta.BLU, Regno.ANIM.toString(),84);

private Carta_oro carta_oro85=new Carta_oro(Regno.NULL.toString(),Regno.NULL.toString(),"████",Regno.NULL.toString(),
		2,"AAAI", Colore_carta.BLU, Regno.ANIM.toString(),85);

private Carta_oro carta_oro86=new Carta_oro(Regno.NULL.toString(),"████",Regno.NULL.toString(),Regno.NULL.toString(),
		2,"AAAF", Colore_carta.BLU, Regno.ANIM.toString(),86);

private Carta_oro carta_oro87=new Carta_oro("████",Regno.NULL.toString(),"████",Regno.PIUM.toString(),
		3,"AAA", Colore_carta.BLU, Regno.ANIM.toString(),87);

private Carta_oro carta_oro88=new Carta_oro(Regno.NULL.toString(),"████",Regno.PERG.toString(),Regno.NULL.toString(),
		3,"AAA", Colore_carta.BLU, Regno.ANIM.toString(),88);

private Carta_oro carta_oro89=new Carta_oro(Regno.NULL.toString(),"████",Regno.PERG.toString(),"████",
		3,"AAA", Colore_carta.BLU, Regno.ANIM.toString(),89);

private Carta_oro carta_oro90=new Carta_oro(Regno.NULL.toString(),Regno.NULL.toString(),"████", "████",
		5,"VVVVV", Colore_carta.VERDE, Regno.VEGE.toString(),90);

private Carta_oro carta_oro91=new Carta_oro(Regno.PIUM.toString(),Regno.NULL.toString(),Regno.NULL.toString(),"████",
		5,"VVI", Colore_carta.VERDE, Regno.VEGE.toString(),91);

private Carta_oro carta_oro92=new Carta_oro(Regno.PIUM.toString(),Regno.NULL.toString(),"████","████",
		3,"FFF", Colore_carta.ROSSO, Regno.INSE.toString(),92);

private Carta_oro carta_oro93=new Carta_oro("████",Regno.PERG.toString(),"████",Regno.NULL.toString(),
		3,"FFF", Colore_carta.ROSSO, Regno.INSE.toString(),93);

private Carta_oro carta_oro94=new Carta_oro(Regno.NULL.toString(),"████",Regno.POZI.toString(),"████",
		3,"FFF", Colore_carta.ROSSO, Regno.INSE.toString(),94);

private Carta_oro carta_oro95=new Carta_oro(Regno.NULL.toString(),"████",Regno.NULL.toString(),"████",
		5,"FFFFF", Colore_carta.ROSSO, Regno.INSE.toString(),95);

private Carta_oro carta_oro96=new Carta_oro(Regno.NULL.toString(),Regno.NULL.toString(),Regno.NULL.toString(),"████",
		2,"FFFV", Colore_carta.ROSSO, Regno.INSE.toString(),96);

private Carta_oro carta_oro97=new Carta_oro(Regno.PERG.toString(),Regno.NULL.toString(),Regno.NULL.toString(),"████",
		1,"FFI", Colore_carta.ROSSO, Regno.INSE.toString(),97);

private Carta_oro carta_oro98=new Carta_oro(Regno.NULL.toString(),"████",Regno.NULL.toString(),Regno.NULL.toString(),
		2,"FFFI", Colore_carta.ROSSO, Regno.INSE.toString(),98);

private Carta_oro carta_oro99=new Carta_oro(Regno.NULL.toString(),Regno.NULL.toString(),"████",Regno.NULL.toString(),
		2,"FFFA", Colore_carta.ROSSO, Regno.INSE.toString(),99);

private Carta_oro carta_oro100=new Carta_oro("████",Regno.NULL.toString(),Regno.NULL.toString(),Regno.PIUM.toString(),
		1,"FFA", Colore_carta.ROSSO, Regno.INSE.toString(),100);




public Mazzo_oro(){
	mazzo_oro.add(carta_oro80);
	mazzo_oro.add(carta_oro81);
	mazzo_oro.add(carta_oro82);
	mazzo_oro.add(carta_oro83);
	mazzo_oro.add(carta_oro84);
	mazzo_oro.add(carta_oro85);
	mazzo_oro.add(carta_oro86);
	mazzo_oro.add(carta_oro87);
	mazzo_oro.add(carta_oro88);
	mazzo_oro.add(carta_oro89);
	mazzo_oro.add(carta_oro90);
	mazzo_oro.add(carta_oro91);
	mazzo_oro.add(carta_oro92);
	mazzo_oro.add(carta_oro93);
	mazzo_oro.add(carta_oro94);
	mazzo_oro.add(carta_oro95);
	mazzo_oro.add(carta_oro96);
	mazzo_oro.add(carta_oro97);
	mazzo_oro.add(carta_oro98);
	mazzo_oro.add(carta_oro99);
	mazzo_oro.add(carta_oro100);


	
}

public void getMazzo() {
for(int i=0;i<mazzo_oro.size();i++) mazzo_oro.get(i).getCarta();
}



public void mescolaMazzo() {
	Collections.shuffle(mazzo_oro);
}
public void rimuoviCarta()
{
	mazzo_oro.remove(0);
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

public int getLenght() {
	return mazzo_oro.size();
	
}

}



/*public void pescaCarta2()
{
	System.out.println("Hai pescato:\t\t "+mazzo_oro.get(0).getPunteggio(mazzo_oro.get(0)).toString());
	mazzo_oro.remove(mazzo_oro.get(0));
}
*/


