package progetto;


public class Cella {
private int riga;
private int colonna;
private String tipo;
private int punti;
private Regno regno;
	
	public Cella(int riga, int colonna, String tipo) {
		this.riga=riga;
		this.colonna=colonna;
		this.tipo=tipo;
		
		
	}
	public Cella(int riga, int colonna, int punti) {
		this.riga=riga;
		this.colonna=colonna;
		this.punti=punti;
		
		
	}
	
	public Cella(int riga, int colonna, Regno regno) {
		this.riga=riga;
		this.colonna=colonna;
		this.regno=regno;
		
		
	}

	

	public int getRiga() {
		return riga;
	}

	public int getColonna() {
		return colonna;
	}
	
	public int getPunti() {
		return punti;
	}

	public String getTipo() {
		return tipo;
	}
}
