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
	private Colore_carta colore;
	protected String obiettivo;
	protected final int ID;

	
	/**Creates a gold card
	 * @param ris1Fronte: front resource 
	 * @param ris2Fronte: front resource 
	 * @param ris3Fronte: front resource 
	 * @param ris4Fronte: front resource 
	 * @param punti: cars points 
	 * @param risorsenec: the necessary resources to play a card 
	 * @param colore: cards color
	 * @param ris1Retro: back resource 
	 * @param ID: cards identification code 
	 */
	public Carta(String ris1Fronte,String ris2Fronte, String ris3Fronte,String ris4Fronte,int punti, 
			String risorsenec, Colore_carta colore, String ris1Centro, int ID)
	{

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
	
	
	
	/**Creates a resource card 
	 * @param ris1Fronte: front resource 
	 * @param ris2Fronte: front resource 
	 * @param ris3Fronte: front resource 
	 * @param ris4Fronte: front resource 
	 * @param punti: cards points 
	 * @param colore: cards colors  
	 * @param ris1Retro: back resource 
	 * @param ID: cards identification code
	 */
	public Carta(String ris1Fronte,String ris2Fronte, String ris3Fronte,String ris4Fronte,int punti, Colore_carta colore,
			String ris1Centro, int ID)
	{
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

	
	

	/** Creates a starting card 
	 * @param ris1Fronte: front resource 
	 * @param ris2Fronte: front resource 
	 * @param ris3Fronte: front resource 
	 * @param ris4Fronte: front resource 
	 * @param ris1Retro: back resource
	 * @param ris2Retro: back resource
	 * @param ris3Retro: back resource
	 * @param ris4Retro: back resource
	 * @param ris1Centro: center resource 
	 * @param ris2Centro: center resource
	 * @param ID:  the cards identification code 
	 */
	public Carta(String ris1Fronte,String ris2Fronte, String ris3Fronte,String ris4Fronte,
			String ris1Retro, String ris2Retro, String ris3Retro, String ris4Retro, String ris1Centro, String ris2Centro, int ID)
	{
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
	}
	
	// obiettivo
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
		
		/*
		System.out.println("|--------------------------|");
		for(int i=0;i<2;i++) {
			if(i==1)System.out.println("\n");
			for(int j=0;j<3;j++) {
					if(celle_fronte[i][j].getTipo()=="NULL")
						System.out.print(" / " );
					else{System.out.print(celle_fronte[i][j].getTipo()+"\t");
	 }
					
				}
			}
			
		System.out.println("\n|--------------------------|");
		
		System.out.println("\n");
		
		System.out.println("|--------------------------|");
		for(int i=0;i<2;i++) {
			if(i==1)System.out.println("\n");
			for(int j=0;j<3;j++) {
				System.out.print(celle_retro[i][j].getTipo()+"\t");
	 }
					
				}
	
		System.out.println("\n|--------------------------|");*/
	}


	/**
	 * @return cards points
	 */
	public int getPunteggio() {
		return punti;
	}

	public int getID() {
		return ID;
	}
	
	public String printCard() {
		
		return ("ID: "+ID+" \n"+"RISORSE NECESSARIE: "+risorsenec+"\nFRONTE\n"
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
