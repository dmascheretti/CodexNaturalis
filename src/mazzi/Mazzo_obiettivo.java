package mazzi;

import java.util.ArrayList;

import cartaObiettivo.Carta_obiettivo;

public class Mazzo_obiettivo extends Mazzo{
	private ArrayList <Carta_obiettivo> mazzo_obiettivo= new ArrayList<Carta_obiettivo>();
	
	private Carta_obiettivo carta_obiettivo5= new Carta_obiettivo(5, 3, "pergamena, pozione, piuma");
	private Carta_obiettivo carta_obiettivo6= new Carta_obiettivo(6, 2, "Tre carte viola in diagonale decrescente");
	private Carta_obiettivo carta_obiettivo7= new Carta_obiettivo(7, 2, "Tre carte verdi in diagonale decrescente");
	private Carta_obiettivo carta_obiettivo8= new Carta_obiettivo(8, 2, "Tre carte rosse in diagonale crescente");
	private Carta_obiettivo carta_obiettivo9= new Carta_obiettivo(9, 3, "Due carte rosse in verticale e l'angolo in"
			                                                         + "basso a destra di quella rossa(in basso) deve toccare quello "
			                                                         + "in alto a sinistra di una carta verde ");
	private Carta_obiettivo carta_obiettivo10= new Carta_obiettivo(10, 2, "tre carte blu in diagonale crescente");
	private Carta_obiettivo carta_obiettivo11= new Carta_obiettivo(11, 3, "Due carte viola in verticale con l'angolo in alto a sinistra "
			                                                           + "di quella in alto tocca l'angolo in basso a destra di una carta blu");
	private Carta_obiettivo carta_obiettivo12= new Carta_obiettivo(12, 3, "Due carte blu in verticale con l'angolo in alto a sinistra della carta in alto che tocca "
			                                                           + "l'angolo in basso a destra di una carta rossa");
	private Carta_obiettivo carta_obiettivo13= new Carta_obiettivo(13, 3, "Due carte verdi in verticale con l'angolo in basso a sinistra di quella "
			                                                            + "in basso che tocca l'angolo in alto a destra di una carta viola");
	private Carta_obiettivo carta_obiettivo14= new Carta_obiettivo(14, 2, "Volpe, volpe ,volpe");
	private Carta_obiettivo carta_obiettivo15= new Carta_obiettivo(15, 2, "fungo, fungo, fungo");
	private Carta_obiettivo carta_obiettivo16= new Carta_obiettivo(16, 2, "foglia, foglia, foglia");
	private Carta_obiettivo carta_obiettivo17= new Carta_obiettivo(17, 2, "pozione, pozione, pozione");
	private Carta_obiettivo carta_obiettivo18= new Carta_obiettivo(18, 2, "farfalla, farfalla, farfalla");
	private Carta_obiettivo carta_obiettivo19= new Carta_obiettivo(19, 2, "pergamena, pergamena");
	private Carta_obiettivo carta_obiettivo20= new Carta_obiettivo(20, 2, "piuma, piuma");
	
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
}
