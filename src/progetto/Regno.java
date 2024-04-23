package progetto;

public enum Regno {
	
VEGETALE ("Vegetale"),
ANIMALE ("Animale"),
FUNGHI ("Funghi"),
INSETTI ("Insetti"),
NULL ("");

private String regno;

Regno(String regno) {
	this.regno=regno;
}

public String getRegno() {
	return regno;
}

}
