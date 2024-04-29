package progetto;

import java.util.ArrayList;

public class Mazzo_obiettivo extends Mazzo{
	private ArrayList <Carta_obiettivo> mazzo_obiettivo= new ArrayList<Carta_obiettivo>();
	
	private Carta_obiettivo carta_obiettivo1= new Carta_obiettivo(05, 3, "pergamena, pozione, piuma");

	
	public Mazzo_obiettivo() {
		mazzo_obiettivo.add(carta_obiettivo1);
	}
}
