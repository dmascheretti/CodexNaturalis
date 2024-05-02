package carte;

import progetto.Colore_carta;

public class Carta_oro extends Carta{

public Carta_oro(String risorse1, String risorse2, String risorse3, String risorse4, int punti, String risorsenec,
			Colore_carta colore, String risorse1r, int ID) {
		super(risorse1, risorse2, risorse3, risorse4, punti, risorsenec, colore, risorse1r, ID);
	}

@Override
public boolean mossaValida(Carta tabellone, int x, int y) {
	// TODO Auto-generated method stub
	return false;
}

}






