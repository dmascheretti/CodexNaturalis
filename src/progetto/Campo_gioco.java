package progetto;

import java.util.ArrayList;

import carte.Carta_obiettivo;
import carte.Carta_oro;
import carte.Carta_risorsa;

public class Campo_gioco {
	private static ArrayList<Carta_oro> campo_oro;
	private static ArrayList<Carta_risorsa> campo_risorsa;
	private static ArrayList <Carta_obiettivo> carte_obiettivo;
	
	public Campo_gioco() {
		this.campo_oro=new ArrayList<Carta_oro>();
		this.campo_risorsa=new ArrayList<Carta_risorsa>();
		this.carte_obiettivo=new ArrayList<Carta_obiettivo>();
		
		
	}
	
}
