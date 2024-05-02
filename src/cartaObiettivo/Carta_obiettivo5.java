package cartaObiettivo;

import carte.Carta;

public class Carta_obiettivo5 extends Carta_obiettivo {
	
	public Carta_obiettivo5(int ID, int punti, String obiettivo){
		 super(ID, punti, obiettivo);
		}
	
	@Override
	public boolean mossaValida(Carta tabellone, int x, int y){
		
		return false;
	}
	
}
