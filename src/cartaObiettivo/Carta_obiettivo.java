package cartaObiettivo;

import carte.Carta;

public class Carta_obiettivo extends Carta {
	
	public Carta_obiettivo(int ID, int punti, String obiettivo){
	 super(ID, punti, obiettivo);
	}
	
	public void getCarta()
{
		System.out.println("ID "+ID+"obiettivo: "+obiettivo+" punti ");
		

}
	@Override
	public boolean mossaValida(Carta tabellone, int x, int y){
		
		return false;
	}
	
}
