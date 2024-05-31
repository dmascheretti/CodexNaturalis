package carte;

import progetto.Colore_carta;

public class Carta_risorsa extends Carta{
	private int punti;
	private Colore_carta color;

public Carta_risorsa(String risorse1,String risorse2, String risorse3,String risorse4,int punti, Colore_carta color, String risorse1Centro,int ID)
{
	super(risorse1,risorse2, risorse3, risorse4, punti, color,  risorse1Centro, ID);
	this.punti=punti;
	this.color=color;
}


public String printCard() {
	
	return ("\nID: "+ID+"\nPunti: "+punti+"\n"+"COLORE CARTA: "+color.toString()
			+"\n---------------------╗\n\n"
	+ris1Fronte+ "\t\t" +ris2Fronte+ "\n\n"+ris3Fronte+"\t\t"+ris4Fronte+
	"\n\n----------------------\n\n\t"+ris1Centro+"\t\n\n"+
	"\n----------------------╝\n");

}



public int getPunti() {
	// TODO Auto-generated method stub
	return punti;
}


@Override
public boolean mossaValida(Carta tabellone, int x, int y) {
	// TODO Auto-generated method stub
	return false;
}
}
