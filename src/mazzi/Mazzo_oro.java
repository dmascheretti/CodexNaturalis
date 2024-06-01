package mazzi;
import java.util.ArrayList;

import java.util.Collections;

import carte.Carta;
import carte.Carta_oro;
import progetto.Colore_carta;
import progetto.Regno;


public class Mazzo_oro extends Mazzo{

	private ArrayList<Carta_oro> mazzo_oro = new ArrayList<Carta_oro>();
	
	private Carta_oro carta_oro60=new Carta_oro(Regno.NULL.toString(),Regno.PERG.toString(),Regno.NULL.toString(),"████",
			1,"AAA (1 PUNTO PER PIUMA)", Colore_carta.BLU,Regno.ANIM.toString(),60);
	
	private Carta_oro carta_oro61=new Carta_oro(Regno.NULL.toString(),Regno.INCH.toString(),"████",Regno.NULL.toString(),
			1,"VAA (1 PUNTO PER INCHIOSTRO)", Colore_carta.BLU,Regno.ANIM.toString(),61);
	
	private Carta_oro carta_oro62=new Carta_oro("████",Regno.PERG.toString(),Regno.NULL.toString(),"████",
			1,"IAA (1 PUNTO PER INCHIOSTRO)", Colore_carta.BLU,Regno.ANIM.toString(),62);
	
	private Carta_oro carta_oro63=new Carta_oro(Regno.NULL.toString(),Regno.PIUM.toString(),Regno.ANIM.toString(),"████",
			2,"VII (PUNTI PER ANGOLO COPERTO)", Colore_carta.VERDE,Regno.VEGE.toString(),63);
	
	private Carta_oro carta_oro64=new Carta_oro(Regno.NULL.toString(),Regno.PIUM.toString(),"████",Regno.VEGE.toString(),
			1,"VVI (1 PUNTO PER PERGAMENA)", Colore_carta.VERDE,Regno.VEGE.toString(),64);
	
	private Carta_oro carta_oro65=new Carta_oro(Regno.NULL.toString(),Regno.INCH.toString(),Regno.ANIM.toString(),Regno.FUNG.toString(),
			2,"AIV (PUNTI PER ANGOLO COPERTO, i=inchiostro)", Colore_carta.ROSSO,Regno.FUNG.toString(),65);
	
	private Carta_oro carta_oro66=new Carta_oro("████",Regno.INCH.toString(),Regno.INSE.toString(),"████",
			2,"III (PUNTI PER ANGOLO COPERTO)", Colore_carta.ROSSO,Regno.FUNG.toString(),66);
	
	private Carta_oro carta_oro67=new Carta_oro(Regno.NULL.toString(),Regno.PERG.toString(),"████",Regno.VEGE.toString(),
			1,"VVV (1 PUNTO PER PERGAMENA)", Colore_carta.ROSSO,Regno.FUNG.toString(),67);
	
	private Carta_oro carta_oro68=new Carta_oro(Regno.NULL.toString(),Regno.PERG.toString(),Regno.FUNG.toString(),Regno.INSE.toString(),
			1,"FFF (1 PUNTO PER POZIONE)", Colore_carta.BLU,Regno.ANIM.toString(),68);
	
	private Carta_oro carta_oro69=new Carta_oro(Regno.NULL.toString(),"████",Regno.PIUM.toString(),"████",
			2,"FAA (PUNTI PER ANGOLO COPERTO)", Colore_carta.BLU,Regno.ANIM.toString(),69);
	
	private Carta_oro carta_oro70=new Carta_oro(Regno.NULL.toString(),Regno.PIUM.toString(),Regno.INCH.toString(),"████",
			1,"IIF (I=insetto, 1 PUNTO PER INCHIOSTRO)", Colore_carta.VERDE,Regno.VEGE.toString(),70);
	
	private Carta_oro carta_oro71=new Carta_oro(Regno.NULL.toString(),Regno.INCH.toString(),Regno.NULL.toString(),Regno.NULL.toString(),
			2,"VFF (PUNTI PER ANGOLO COPERTO)", Colore_carta.VERDE,Regno.VEGE.toString(),71);
	
	private Carta_oro carta_oro72=new Carta_oro(Regno.ANIM.toString(),Regno.INCH.toString(),Regno.VEGE.toString(),"████",
			1,"VVA", Colore_carta.ROSSO,Regno.FUNG.toString(),72);
	
	private Carta_oro carta_oro73=new Carta_oro(Regno.INCH.toString(),Regno.PERG.toString(),Regno.VEGE.toString(),"████",
			3,"AAAI", Colore_carta.ROSSO,Regno.FUNG.toString(),73);
	
	private Carta_oro carta_oro74=new Carta_oro(Regno.NULL.toString(),Regno.PERG.toString(),"████",Regno.ANIM.toString(),
			2,"FFVI", Colore_carta.BLU,Regno.ANIM.toString(),74);
	
	private Carta_oro carta_oro75=new Carta_oro(Regno.NULL.toString(),"████","████","████",
			1,"AAV", Colore_carta.BLU,Regno.ANIM.toString(),75);
	
	private Carta_oro carta_oro76=new Carta_oro(Regno.NULL.toString(),"████",Regno.PERG.toString(),Regno.INSE.toString(),
			5,"IIIII", Colore_carta.VIOLA,Regno.INSE.toString(),76);
	
	
	private Carta_oro carta_oro77=new Carta_oro(Regno.FUNG.toString(),Regno.INCH.toString(),"████",Regno.INSE.toString(),
			2,"IAF", Colore_carta.VIOLA,Regno.INSE.toString(),77);

	private Carta_oro carta_oro78=new Carta_oro(Regno.INSE.toString(),Regno.INCH.toString(),Regno.INSE.toString(),"████",
			2,"IAFV", Colore_carta.VIOLA,Regno.INSE.toString(),78);

	private Carta_oro carta_oro79=new Carta_oro(Regno.NULL.toString(),Regno.INCH.toString(),"████","████",
			3,"AAA", Colore_carta.BLU,Regno.ANIM.toString(),79);

	private Carta_oro carta_oro80=new Carta_oro(Regno.NULL.toString(),"████",Regno.NULL.toString(),Regno.NULL.toString(),
			2,"VVVF (PUNTI PER ANGOLO COPERTO)", Colore_carta.VERDE,Regno.VEGE.toString(),80);

	private Carta_oro carta_oro81=new Carta_oro("████",Regno.NULL.toString(),Regno.NULL.toString(),Regno.PERG.toString(),
			1,"AAV (PUNTI PER PERGAMENA SUL CAMPO)", Colore_carta.BLU,Regno.ANIM.toString(),81);

	private Carta_oro carta_oro82=new Carta_oro(Regno.NULL.toString(),"████",Regno.PIUM.toString(),Regno.NULL.toString(),
			1,"AAF (PUNTI PER PIUMA SUL CAMPO)", Colore_carta.BLU, Regno.ANIM.toString(),82);

	private Carta_oro carta_oro83=new Carta_oro("████",Regno.NULL.toString(),Regno.NULL.toString(),Regno.NULL.toString(),
			2,"AAAV (PUNTI PER ANGOLO COPERTO)", Colore_carta.BLU, Regno.ANIM.toString(),83);

	private Carta_oro carta_oro84=new Carta_oro("████",Regno.NULL.toString(),Regno.NULL.toString(),"████",
			5,"AAAAA", Colore_carta.BLU, Regno.ANIM.toString(),84);

	private Carta_oro carta_oro85=new Carta_oro(Regno.NULL.toString(),Regno.NULL.toString(),"████",Regno.NULL.toString(),
			2,"AAAI (PUNTI PER ANGOLO COPERTO)", Colore_carta.BLU, Regno.ANIM.toString(),85);

	private Carta_oro carta_oro86=new Carta_oro(Regno.NULL.toString(),"████",Regno.NULL.toString(),Regno.NULL.toString(),
			2,"AAAF (PUNTI PER ANGOLO COPERTO)", Colore_carta.BLU, Regno.ANIM.toString(),86);

	private Carta_oro carta_oro87=new Carta_oro("████",Regno.NULL.toString(),"████",Regno.PIUM.toString(),
			3,"AAA", Colore_carta.BLU, Regno.ANIM.toString(),87);

	private Carta_oro carta_oro88=new Carta_oro(Regno.NULL.toString(),"████",Regno.PERG.toString(),Regno.NULL.toString(),
			3,"AAA", Colore_carta.BLU, Regno.ANIM.toString(),88);

	private Carta_oro carta_oro89=new Carta_oro(Regno.NULL.toString(),"████",Regno.PERG.toString(),"████",
			3,"AAA", Colore_carta.BLU, Regno.ANIM.toString(),89);

	private Carta_oro carta_oro90=new Carta_oro(Regno.NULL.toString(),Regno.NULL.toString(),"████", "████",
			5,"VVVVV", Colore_carta.VERDE, Regno.VEGE.toString(),90);

	private Carta_oro carta_oro91=new Carta_oro(Regno.PIUM.toString(),Regno.NULL.toString(),Regno.NULL.toString(),"████",
			1,"VVI (PUNTI PER PIUMA SUL CAMPO)", Colore_carta.VERDE, Regno.VEGE.toString(),91);

	private Carta_oro carta_oro92=new Carta_oro(Regno.PIUM.toString(),Regno.NULL.toString(),"████","████",
			3,"FFF", Colore_carta.ROSSO, Regno.FUNG.toString(),92);

	private Carta_oro carta_oro93=new Carta_oro("████",Regno.PERG.toString(),"████",Regno.NULL.toString(),
			3,"FFF", Colore_carta.ROSSO, Regno.FUNG.toString(),93);


	private Carta_oro carta_oro94=new Carta_oro(Regno.NULL.toString(),"████",Regno.INCH.toString(),"████",
			3,"FFF", Colore_carta.ROSSO, Regno.FUNG.toString(),94);

	private Carta_oro carta_oro95=new Carta_oro(Regno.NULL.toString(),"████",Regno.NULL.toString(),"████",
			5,"FFFFF", Colore_carta.ROSSO, Regno.FUNG.toString(),95);

	private Carta_oro carta_oro96=new Carta_oro(Regno.NULL.toString(),Regno.NULL.toString(),Regno.NULL.toString(),"████",
			2,"FFFV (PUNTI PER ANGOLO COPERTO)", Colore_carta.ROSSO, Regno.FUNG.toString(),96);

	private Carta_oro carta_oro97=new Carta_oro(Regno.PERG.toString(),Regno.NULL.toString(),Regno.NULL.toString(),"████",
			1,"FFI (PUNTI PER PERGAMENA SUL CAMPO)", Colore_carta.ROSSO, Regno.FUNG.toString(),97);

	private Carta_oro carta_oro98=new Carta_oro(Regno.NULL.toString(),"████",Regno.NULL.toString(),Regno.NULL.toString(),
			2,"FFFI (PUNTI PER ANGOLO COPERTO)", Colore_carta.ROSSO, Regno.FUNG.toString(),98);

	private Carta_oro carta_oro99=new Carta_oro(Regno.NULL.toString(),Regno.NULL.toString(),"████",Regno.NULL.toString(),
			2,"FFFA (PUNTI PER ANGOLO COPERTO)", Colore_carta.ROSSO, Regno.FUNG.toString(),99);

	private Carta_oro carta_oro100=new Carta_oro("████",Regno.NULL.toString(),Regno.NULL.toString(),Regno.PIUM.toString(),
			1,"FFA (PUNTI PER PIUMA SUL CAMPO)", Colore_carta.ROSSO, Regno.FUNG.toString(),100);





	public Mazzo_oro(){
		mazzo_oro.add(carta_oro60);
		mazzo_oro.add(carta_oro61);
		mazzo_oro.add(carta_oro62);
		mazzo_oro.add(carta_oro63);
		mazzo_oro.add(carta_oro64);
		mazzo_oro.add(carta_oro65);
		mazzo_oro.add(carta_oro66);
		mazzo_oro.add(carta_oro67);
		mazzo_oro.add(carta_oro68);
		mazzo_oro.add(carta_oro69);
		mazzo_oro.add(carta_oro70);
		mazzo_oro.add(carta_oro71);
		mazzo_oro.add(carta_oro72);
		mazzo_oro.add(carta_oro73);
		mazzo_oro.add(carta_oro74);
		mazzo_oro.add(carta_oro75);
		mazzo_oro.add(carta_oro76);
		mazzo_oro.add(carta_oro77);
		mazzo_oro.add(carta_oro78);
		mazzo_oro.add(carta_oro79);
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

	public void printMazzo() {
		for(int i=0;i<mazzo_oro.size();i++) System.out.println(mazzo_oro.get(i).printCard());
	}

	public void getMazzo() {
		for(int i=0;i<mazzo_oro.size();i++) mazzo_oro.get(i);
	}


	public void mescolaMazzo() {
		Collections.shuffle(mazzo_oro);
	}
	public void rimuoviCarta(){
		mazzo_oro.remove(0);
	}
	
	public Carta_oro getRetro() {
		return mazzo_oro.get(0);
	}


	public Carta_oro pescaCarta(){

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




