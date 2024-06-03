package mazzi;

import carte.Carta;
public abstract class Mazzo {



	public abstract void getMazzo();

	public abstract void mescolaMazzo();


	public abstract void rimuoviCarta();

	public abstract Carta pescaCarta();
	/**
	 *  get the back of the card
	 */

	public abstract Carta getRetro();

	/**
	 *@return length of the deck 
	 */

	public abstract int getLenght();

	/**
	 * @param carta
	 * print card
	 */

	public abstract void printCarta(Carta carta);


}
