package mazzi;

import java.util.ArrayList;
import java.util.Collections;

import carte.Carta_obiettivo;

public class Mazzo_obiettivo extends Mazzo{
	private ArrayList <Carta_obiettivo> mazzo_obiettivo= new ArrayList<Carta_obiettivo>();
	
	private Carta_obiettivo carta_obiettivo5= new Carta_obiettivo(5, 3, "pergamena, inchiostro, piuma\n");
	private Carta_obiettivo carta_obiettivo6= new Carta_obiettivo(6, 2, "\nVIOLA\n\tVIOLA\n\t\tVIOLA\n");
	private Carta_obiettivo carta_obiettivo7= new Carta_obiettivo(7, 2, "\nVERDE\n\tVERDE\n\t\tVERDE\n");
	private Carta_obiettivo carta_obiettivo8= new Carta_obiettivo(8, 2, "\nROSSO\n\tROSSO\n\t\tROSSO\n");
	private Carta_obiettivo carta_obiettivo9= new Carta_obiettivo(9, 3, "\nROSSO\nROSSO\n\tVERDE");
	private Carta_obiettivo carta_obiettivo10= new Carta_obiettivo(10, 2, "\n\t\tBLU\n\tBLU\nBLU\n");
	private Carta_obiettivo carta_obiettivo11= new Carta_obiettivo(11, 3, "\nBLU\n\tVIOLA\n\tVIOLA\n");
	private Carta_obiettivo carta_obiettivo12= new Carta_obiettivo(12, 3, "\n\tROSSA\nBLU\nBLU\n");
	private Carta_obiettivo carta_obiettivo13= new Carta_obiettivo(13, 3, "Due carte verdi in verticale con l'angolo in basso a sinistra di quella "
			                                                            + "in basso che tocca l'angolo in alto a destra di una carta viola");
	private Carta_obiettivo carta_obiettivo14= new Carta_obiettivo(14, 2, "animale, animale ,animale\n");
	private Carta_obiettivo carta_obiettivo15= new Carta_obiettivo(15, 2, "fungo, fungo, fungo\n");
	private Carta_obiettivo carta_obiettivo16= new Carta_obiettivo(16, 2, "vegetale, vegetale, vegetale\n");
	private Carta_obiettivo carta_obiettivo17= new Carta_obiettivo(17, 2, "inchiostro, inchiostro\n");
	private Carta_obiettivo carta_obiettivo18= new Carta_obiettivo(18, 2, "insetto, insetto, insetto\n");
	private Carta_obiettivo carta_obiettivo19= new Carta_obiettivo(19, 2, "pergamena, pergamena\n");
	private Carta_obiettivo carta_obiettivo20= new Carta_obiettivo(20, 2, "piuma, piuma\n");
	
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

public void getMazzo() {
    for (int i = 0; i < mazzo_obiettivo.size(); i++)
    	mazzo_obiettivo.get(i).getCarta();
}

public void mescolaMazzo() {
    Collections.shuffle(mazzo_obiettivo);
}


public Carta_obiettivo pescaCarta() {
    return mazzo_obiettivo.get(0);
}

public Carta_obiettivo pescaCartaIndex(int i) {
	return mazzo_obiettivo.get(i);
}

public void rimuoviCarta() {
	mazzo_obiettivo.remove(0);
}



}