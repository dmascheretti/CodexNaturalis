package progetto;

public class Carta_oro extends Carta{

public Carta_oro(String risorse1, String risorse2, String risorse3, String risorse4, int punti, String risorsenec,
			Colore_carta colore, String risorse1r, int ID) {
		super(risorse1, risorse2, risorse3, risorse4, punti, risorsenec, colore, risorse1r, ID);
	}


public String printCard() {
	
	return ("\nID: "+ID+"\nRISORSE NECESSARIE: "+risorsenec+"\nFRONTE"
	+"\n------\n"+ris1Fronte+ "\t" +ris2Fronte+ "\n"+ris3Fronte+"\t"+ris4Fronte+
	"\n------\n"+ "RETRO:\n------\n" +ris1Retro+"\n------");
}

}




