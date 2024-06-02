package carte;

import progetto.Colore_carta;

public class Carta_oro extends Carta{

public Carta_oro(String risorse1, String risorse2, String risorse3, String risorse4, int punti, String risorsenec,
			Colore_carta colore, String risorse1r, int ID) {
		super(risorse1, risorse2, risorse3, risorse4, punti, risorsenec, colore, risorse1r, ID);
	}


public String printCard() {
	
	return ("\nID: "+ID+"\nPunti: "+punti+" se possiedi queste risorse: "+risorsenec+"\nCOLORE CARTA "+colore
			+"\n---------------------╗\n\n"
	+ris1Fronte+ "\t\t" +ris2Fronte+ "\n\n"+ris3Fronte+"\t\t"+ris4Fronte+
	"\n\n----------------------\n\n\t"+ris1Centro+"\t\n"+
	"\n----------------------╝\n");

}

public String getRisNec() {
	return risorsenec;
}

}






