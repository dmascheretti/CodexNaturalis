package progetto;

public enum Regno {
	
VEGE ("Vegetale"),
ANIM ("Animale"),
FUNG ("Funghi"),
INSE ("Insetti"),
NULL(" "),
POZI ("Pozione"),
PERG("Pergamnea"),
PIUM("Piuma");

private String regno;

Regno(String regno) {
	this.regno=regno;
}

public String getRegno() {
	return regno;
}

}
