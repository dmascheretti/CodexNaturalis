package progetto;

public enum Regno {
	
VEGE ("Vegetale"),
ANIM ("Animale"),
FUNG ("Funghi"),
INSE ("Insetti"),
NULL ("    "),
INCH ("Inchiostro"),
PERG ("Pergamena"),
PIUM ("Piuma");

private String regno;

Regno(String regno) {
	this.regno=regno;
}

public String getRegno() {
	return regno;
}

}
