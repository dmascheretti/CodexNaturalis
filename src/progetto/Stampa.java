package progetto;

import java.util.concurrent.TimeUnit;

public class Stampa {

	
	public void stampaObiettivo(Campo_gioco campo_gioco) {
		
		System.out.println("\n\n\nCARTE OBIETTIVO COMUNI: ");

		for(int i=0;i<campo_gioco.returnObiettivo().size();i++) campo_gioco.returnObiettivo().get(i).getCarta();
		System.out.println();

	}
	
	public void stampaTurno(int turno) {
		if(turno<10) {
			System.out.print("\n\n----------------┐\n");
			System.out.print("                |\n");
			System.out.print("                |\n");
			System.out.print("TURNO NUMERO "+turno+"  |\n");
			System.out.print("                |\n");
			System.out.print("                |\n");
			System.out.print("----------------┘\n\n\n"); 
		}
		else {
			System.out.print("\n\n----------------┐\n");
			System.out.print("                |\n");
			System.out.print("                |\n");
			System.out.print("TURNO NUMERO "+turno+" |\n");
			System.out.print("                |\n");
			System.out.print("                |\n");
			System.out.print("----------------┘\n\n\n");
		}
	}
	
	public void stampaGiocatore(Giocatore giocatore) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(2);
		System.out.println("PUNTI: "+giocatore.getSomma());
		System.out.println("\nCARTA OBIETTIVO DEL GIOCATORE "+giocatore.getName().toUpperCase());
		giocatore.getObiettivo().getCarta();
		System.out.println();
		TimeUnit.SECONDS.sleep(3);
		System.out.println("TABELLONE DI "+giocatore.getName());
		TimeUnit.SECONDS.sleep(2);
		giocatore.getTabellone().printTabellone();
		System.out.println();
		giocatore.conta();
		TimeUnit.SECONDS.sleep(2);
		System.out.println("TURNO: "+giocatore.getName().toUpperCase());
	}
}
