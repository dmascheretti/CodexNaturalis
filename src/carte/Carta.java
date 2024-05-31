package carte;


import progetto.Colore_carta;

public abstract class Carta {

	protected String risorsenec;
	protected int punti;
	protected String ris1Fronte;
	protected String ris2Fronte;
	protected String ris3Fronte;
	protected String ris4Fronte;

	protected String ris1Retro;
	protected String ris2Retro;
	protected String ris3Retro;
	protected String ris4Retro;
	
	protected String ris1Centro;
	protected String ris2Centro;
	
	protected Colore_carta colore;
	protected String obiettivo;
	protected final int ID;

	
	/**Constructor method that creates a gold card
	 * @param ris1Fronte front resource 
	 * @param ris2Fronte front resource 
	 * @param ris3Fronte front resource 
	 * @param ris4Fronte front resource 
	 * @param punti card's points 
	 * @param risorsenec the necessary resources to play a card 
	 * @param colore card's color
	 * @param ris1Retro back resource 
	 * @param ID card identification code 
	 */
	public Carta(String ris1Fronte,String ris2Fronte, String ris3Fronte,String ris4Fronte,int punti, 
			String risorsenec, Colore_carta colore, String ris1Centro, int ID) {

		this.ris1Centro=ris1Centro;
		this.ris1Fronte=ris1Fronte;
		this.ris2Fronte=ris2Fronte;
		this.ris3Fronte=ris3Fronte;
		this.ris4Fronte=ris4Fronte;
		this.risorsenec=risorsenec;
		this.punti=punti;
		this.colore=colore;
		this.ID=ID;
		
		this.ris1Retro="    ";
		this.ris2Retro="    ";
		this.ris3Retro="    ";
		this.ris4Retro="    ";
		this.ris2Centro="    ";
	}
	
	/**Constructor method that creates a resource card 
	 * @param ris1Fronte front resource 
	 * @param ris2Fronte front resource 
	 * @param ris3Fronte front resource 
	 * @param ris4Fronte front resource 
	 * @param punti card's points 
	 * @param colore card's colors  
	 * @param ris1Retro back resource 
	 * @param ID card identification code
	 */
	public Carta(String ris1Fronte,String ris2Fronte, String ris3Fronte,String ris4Fronte,int punti, Colore_carta colore,
			String ris1Centro, int ID) {
		
		this.ris1Centro=ris1Centro;
		this.ris1Fronte=ris1Fronte;
		this.ris2Fronte=ris2Fronte;
		this.ris3Fronte=ris3Fronte;
		this.ris4Fronte=ris4Fronte;
		this.punti=punti;
		this.colore=colore;
		this.ID=ID;
		
		this.ris1Retro="    ";
		this.ris2Retro="    ";
		this.ris3Retro="    ";
		this.ris4Retro="    ";
		this.ris2Centro="    ";
		
	}

	/** Constructor method that creates a starting card
	 * @param ris1Fronte front resource 
	 * @param ris2Fronte front resource 
	 * @param ris3Fronte front resource 
	 * @param ris4Fronte front resource 
	 * @param ris1Retro back resource
	 * @param ris2Retro back resource
	 * @param ris3Retro back resource
	 * @param ris4Retro back resource
	 * @param ris1Centro center resource 
	 * @param ris2Centro center resource
	 * @param ID the card identification code 
	 */
	public Carta(String ris1Fronte,String ris2Fronte, String ris3Fronte,String ris4Fronte,
			String ris1Retro, String ris2Retro, String ris3Retro, String ris4Retro, String ris1Centro, String ris2Centro, int ID) {
		//this.celle_fronte=new Cella[2][3];
		//this.celle_retro=new Cella[2][3];
		this.ris1Retro=ris1Retro;
		this.ris2Retro=ris2Retro;
		this.ris3Retro=ris3Retro;
		this.ris4Retro=ris4Retro;
		
		this.ris1Fronte=ris1Fronte;
		this.ris2Fronte=ris2Fronte;
		this.ris3Fronte=ris3Fronte;
		this.ris4Fronte=ris4Fronte;
		
		this.ris1Centro=ris1Centro;
		this.ris2Centro=ris2Centro;
		this.ID=ID;
		this.colore=Colore_carta.NULL;
	}
	
	/**Constructor method that creates a goal card
	 * @param ID the card identification code 
	 * @param punti card's points
	 * @param obiettivo card's goal
	 */
	public Carta(int ID, int punti, String obiettivo) {
		this.ID=ID; 
		this.punti=punti;
		this.obiettivo=obiettivo;
	}


	
	public String getRis1Fronte() {
		return ris1Fronte;
	}



	public String getRis2Fronte() {
		return ris2Fronte;
	}



	public String getRis3Fronte() {
		return ris3Fronte;
	}



	public String getRis4Fronte() {
		return ris4Fronte;
	}
	
	
	/**
	 * prints card
	 */
	public void getCarta(){
		System.out.println("\n");
		System.out.println("punti carta: "+punti);
		if(punti>0)System.out.println("\nrisorse necessarie: "+risorsenec+"\n");
		else System.out.println();
		System.out.println(ris1Fronte+"\t"+ris2Fronte+"\n\n\n"+ris3Fronte+"\t"+ris4Fronte);
		System.out.println(ris1Retro+"\t"+ris1Centro+"\t"+ris2Retro+"\t"+ris3Retro+"\t"+ris2Centro
				+ris4Retro);
	}


	/**
	 * @return cards points
	 */
	public int getPunteggio() {
		return punti;
	}
	public String getColore() {
		return colore.toString();	
		}
	
	public void setColore() {
		colore=Colore_carta.NULL;
	}
	
	public String getRisorse() {
		return risorsenec;
	}

	public int getID() {
		return ID;
	}
	
	public String printCard() {
		
		return ("ID: "+ID+" \n"+"COLORE "+colore.toString()+"\nRISORSE NECESSARIE: "+risorsenec+"\nFRONTE\n"
		+"-----------------------------\n"+ris1Fronte+ "\t\t\t" +ris2Fronte+ "\n"+ris3Fronte+"\t\t\t"+ris4Fronte+
		"\n-----------------------------"+ "\n\nRETRO:\n-----------------------------\n" + "[]\t"+ris1Retro+"\t[]\n-----------------------------\n");
	}

	public String printCardF() {

		return ("\n---------------------╗\n\n"
				+ris1Fronte+ "\t\t" +ris2Fronte+ "\n\n"+ris3Fronte+"\t\t"+ris4Fronte+"\n\n---------------------╝");
	}
	
	public String printCardFinal() {

		return ("\n---------------------╗\n\n"
				+ris1Retro+ "\t"+ris1Centro+"\t" +ris2Retro+ "\n\n"+ris3Retro+"\t"+ris2Centro+"\t"+ris4Retro+"\n\n---------------------╝");
	}

public String printCardR() {
	
	return ("\n---------------------╗\n\n"
			+"\t" +ris1Centro+ "\n\n"+"    "+"\t\t"+"    "+"\n---------------------╝");
}

	public String printEmpty() {
		
		return ("\n"+"\n\n"+"    "+ "\t\t\t" +"    "+ "\n"+"    "+"\t\t\t"+"    "+"\n\n\n"+
		"  \t"+"    "+"\t  ");
	}

	public abstract boolean mossaValida(Carta tabellone, int x, int y);

	
	public void setRis1Retro(){
		ris1Retro="    ";
	}
	public void setRis2Retro(){
		ris2Retro="    ";
	}
	public void setRis3Retro(){
		ris3Retro="    ";
	}
	public void setRis4Retro(){
		ris4Retro="    ";
	}

	
	public void setPunti() {
		punti=0;
	}
	
	
	public void setRisRetro(){
		ris1Fronte=ris1Retro;
		ris2Fronte=ris2Retro;
		ris2Fronte=ris2Retro;
		ris2Fronte=ris2Retro;
		ris2Centro="    ";
	}
	
	public void setRisRetroIniziale(){
		ris4Retro="    ";
		ris4Retro="    ";
		ris4Retro="    ";
		ris4Retro="    ";
		ris1Centro="    ";
		ris2Centro="    ";
	}
	//per giocare fronte
	public void setRisFronte(){
		ris1Retro=ris1Fronte;
		ris2Retro=ris2Fronte;
		ris3Retro=ris3Fronte;
		ris4Retro=ris4Fronte;
		ris2Centro="    ";
		ris1Centro="    ";

	}



	public String getRis1Retro() {
		return ris1Retro;
	}
	public String getRis2Retro() {
		return ris2Retro;
	}
	public String getRis3Retro() {
		return ris3Retro;
	}
	public String getRis4Retro() {
		return ris4Retro;
	}
	public String getRis1Centro() {
		return ris1Centro;
	}
	public String getRis2Centro() {
		return ris2Centro;
	}

	
	
	
	}
