package progetto;
//FORSE DA ELIMINARE SEGNALINO NON SERVE 
//import java.util.Random;

public class Segnalino {
private Colore colore;

public Segnalino(Colore colore) {
	this.colore=colore;
}

public String getColore() {
	return (colore.toString());
}
}

