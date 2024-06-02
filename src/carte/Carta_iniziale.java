package carte;

public class Carta_iniziale extends Carta{

	public Carta_iniziale(String risorse1, String risorse2, String risorse3, String risorse4, String risorse1r,
			String risorse2r, String risorse3r, String risorse4r, String ris1Centro, String ris2Centro, int ID) {
		
		super(risorse1, risorse2, risorse3, risorse4, risorse1r, risorse2r, risorse3r, risorse4r, ris1Centro, ris2Centro, ID);
		}

	@Override
	public String printCard() {
		return ("\nID: "+ID
				+"\n---------------------╗\n\n"
				+ris1Fronte+ "\t\t" +ris2Fronte+ "\n\n"+ris3Fronte+"\t\t"+ris4Fronte+
				"\n\n----------------------\n\n" +ris1Retro+"\t"+ris1Centro+"\t"+ris2Retro+"\n\n"+ris3Retro+"\t"+ris2Centro+"\t"+ris4Retro+"\n"+
				"\n----------------------╝\n");
		}

	@Override
	public boolean mossaValida(Carta tabellone, int x, int y) {
		return false;
		}

}
	
