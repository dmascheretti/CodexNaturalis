package mazzi;

import java.util.ArrayList;
import java.util.Collections;

import carte.Carta;
import carte.Carta_obiettivo;

public class Mazzo_obiettivo extends Mazzo{
	private ArrayList <Carta_obiettivo> mazzo_obiettivo= new ArrayList<Carta_obiettivo>();

	private Carta_obiettivo carta_obiettivo5= new Carta_obiettivo(5, 3, "pergamena, inchiostro, piuma\n".toUpperCase());
	private Carta_obiettivo carta_obiettivo6= new Carta_obiettivo(6, 2, "\nVIOLA\n\tVIOLA\n\t\tVIOLA\n");
	private Carta_obiettivo carta_obiettivo7= new Carta_obiettivo(7, 2, "\nVERDE\n\tVERDE\n\t\tVERDE\n");
	private Carta_obiettivo carta_obiettivo8= new Carta_obiettivo(8, 2, "\nROSSO\n\tROSSO\n\t\tROSSO\n");
	private Carta_obiettivo carta_obiettivo9= new Carta_obiettivo(9, 3, "\nROSSO\nROSSO\n\tVERDE\n");
	private Carta_obiettivo carta_obiettivo10= new Carta_obiettivo(10, 2, "\n\t\tBLU\n\tBLU\nBLU\n");
	private Carta_obiettivo carta_obiettivo11= new Carta_obiettivo(11, 3, "\nBLU\n\n\tVIOLA\n\tVIOLA\n");
	private Carta_obiettivo carta_obiettivo12= new Carta_obiettivo(12, 3, "\n\tROSSO\nBLU\n\nBLU\n");
	private Carta_obiettivo carta_obiettivo13= new Carta_obiettivo(13, 3, "\n\tVERDE\n\n\tVERDE\nVIOLA\n");
	private Carta_obiettivo carta_obiettivo14= new Carta_obiettivo(14, 2, "animale, animale ,animale\n".toUpperCase());
	private Carta_obiettivo carta_obiettivo15= new Carta_obiettivo(15, 2, "fungo, fungo, fungo\n".toUpperCase());
	private Carta_obiettivo carta_obiettivo16= new Carta_obiettivo(16, 2, "vegetale, vegetale, vegetale\n".toUpperCase());
	private Carta_obiettivo carta_obiettivo17= new Carta_obiettivo(17, 2, "inchiostro, inchiostro\n".toUpperCase());
	private Carta_obiettivo carta_obiettivo18= new Carta_obiettivo(18, 2, "insetto, insetto, insetto\n".toUpperCase());
	private Carta_obiettivo carta_obiettivo19= new Carta_obiettivo(19, 2, "pergamena, pergamena\n".toUpperCase());
	private Carta_obiettivo carta_obiettivo20= new Carta_obiettivo(20, 2, "piuma, piuma\n".toUpperCase());

	public Mazzo_obiettivo() {
		mazzo_obiettivo.add(carta_obiettivo5);
		mazzo_obiettivo.add(carta_obiettivo6);
		mazzo_obiettivo.add(carta_obiettivo7);
		mazzo_obiettivo.add(carta_obiettivo8);
		mazzo_obiettivo.add(carta_obiettivo9);
		mazzo_obiettivo.add(carta_obiettivo10);
		mazzo_obiettivo.add(carta_obiettivo11);
		mazzo_obiettivo.add(carta_obiettivo12);
		mazzo_obiettivo.add(carta_obiettivo13);
		mazzo_obiettivo.add(carta_obiettivo14);
		mazzo_obiettivo.add(carta_obiettivo15);
		mazzo_obiettivo.add(carta_obiettivo16);
		mazzo_obiettivo.add(carta_obiettivo17);
		mazzo_obiettivo.add(carta_obiettivo18);
		mazzo_obiettivo.add(carta_obiettivo19);
		mazzo_obiettivo.add(carta_obiettivo20);
	}

	/**
	 * print deck
	 */
	public void printMazzo() {
		for (int i = 0; i < mazzo_obiettivo.size(); i++)
			mazzo_obiettivo.get(i).getCarta();
	}

	/**
	 * shuffle deck
	 */
	public void mescolaMazzo() {
		Collections.shuffle(mazzo_obiettivo);
	}
	/**
	 *get deck
	 */
	public void getMazzo() {
		for(int i=0;i<mazzo_obiettivo.size();i++) mazzo_obiettivo.get(i);
	}


	/**
	 *@return the first card of the deck
	 */
	public Carta_obiettivo pescaCarta() {
		return mazzo_obiettivo.get(0);
	}

	public Carta_obiettivo pescaCartaIndex(int i) {
		return mazzo_obiettivo.get(i);
	}

	/**
	 *remove the drawn card
	 */
	public void rimuoviCarta() {
		mazzo_obiettivo.remove(0);
	}

	@Override
	public Carta getRetro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLenght() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printCarta(Carta carta) {
		// TODO Auto-generated method stub

	}



}