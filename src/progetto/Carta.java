package progetto;


public abstract class Carta {

	private String risorsenec;
	private int punti;
	protected Cella[][] celle_fronte;
	protected Cella[][] celle_retro;
	private String ris1Fronte,ris2Fronte,ris3Fronte,ris4Fronte;
	private String ris1Retro,ris2Retro, ris3Retro, ris4Retro;
	private String ris1Centro, ris2Centro;
	private Colore_carta colore;
	protected final int ID;

	
	/**Creates a gold card
	 * @param ris1Fronte: front resource 
	 * @param ris2Fronte: front resource 
	 * @param ris3Fronte: front resource 
	 * @param ris4Fronte: front resource 
	 * @param punti: cars points 
	 * @param risorsenec: the necessary resources to play a card 
	 * @param colore: cards color
	 * @param ris1Retro: back ressource 
	 * @param ID: cards identification code 
	 */
	public Carta(String ris1Fronte,String ris2Fronte, String ris3Fronte,String ris4Fronte,int punti, 
			String risorsenec, Colore_carta colore, String ris1Retro, int ID)
	{
		this.celle_fronte=new Cella[2][3];
		this.celle_retro=new Cella[2][3];
		this.ris1Retro=ris1Retro;
		this.ris1Fronte=ris1Fronte;
		this.ris2Fronte=ris2Fronte;
		this.ris3Fronte=ris3Fronte;
		this.ris4Fronte=ris4Fronte;
		this.risorsenec=risorsenec;
		this.punti=punti;
		this.colore=colore;
		this.ID=ID;
		
		this.celle_fronte[0][0]=new Cella(0,0,ris1Fronte);
		this.celle_fronte[0][1]=new Cella(0,1,"");
		this.celle_fronte[0][2]=new Cella(1,0,ris2Fronte);
		this.celle_fronte[1][1]=new Cella(1,1,"");
		this.celle_fronte[1][0]=new Cella(1,2,ris3Fronte);
		this.celle_fronte[1][2]=new Cella(0,2,ris4Fronte);
		
		this.celle_retro[0][0]=new Cella(0,0,"");
		this.celle_retro[0][1]=new Cella(0,1,ris1Retro);
		this.celle_retro[0][2]=new Cella(1,0,"");
		this.celle_retro[1][1]=new Cella(1,1,"");
		this.celle_retro[1][0]=new Cella(1,2,"");
		this.celle_retro[1][2]=new Cella(0,2,"");
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
			String ris1Retro, int ID)
	{
		this.celle_fronte=new Cella[2][3];
		this.celle_retro=new Cella[2][3];
		this.ris1Retro=ris1Retro;
		this.ris1Fronte=ris1Fronte;
		this.ris2Fronte=ris2Fronte;
		this.ris3Fronte=ris3Fronte;
		this.ris4Fronte=ris4Fronte;
		this.punti=punti;
		this.colore=colore;
		this.ID=ID;
		
		this.celle_fronte[0][0]=new Cella(0,0,ris1Fronte);
		this.celle_fronte[0][1]=new Cella(0,1,"");
		this.celle_fronte[0][2]=new Cella(1,0,ris2Fronte);
		this.celle_fronte[1][1]=new Cella(1,1,"");
		this.celle_fronte[1][0]=new Cella(1,2,ris3Fronte);
		this.celle_fronte[1][2]=new Cella(0,2,ris4Fronte);
		
		this.celle_retro[0][0]=new Cella(0,0,"");
		this.celle_retro[0][1]=new Cella(0,1,ris1Retro);
		this.celle_retro[0][2]=new Cella(1,0,"");
		this.celle_retro[1][1]=new Cella(1,1,ris2Retro);
		this.celle_retro[1][0]=new Cella(1,2,"");
		this.celle_retro[1][2]=new Cella(0,2,"");
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
		this.celle_fronte=new Cella[2][3];
		this.celle_retro=new Cella[2][3];
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
		
		this.celle_fronte[0][0]=new Cella(0,0,ris1Fronte);
		this.celle_fronte[0][1]=new Cella(0,1,"");
		this.celle_fronte[0][2]=new Cella(1,0,ris2Fronte);
		this.celle_fronte[1][1]=new Cella(1,1,"");
		this.celle_fronte[1][0]=new Cella(1,2,ris3Fronte);
		this.celle_fronte[1][2]=new Cella(0,2,ris4Fronte);
		
		this.celle_retro[0][0]=new Cella(0,0, ris1Retro);
		this.celle_retro[0][1]=new Cella(0,1,ris1Centro);
		this.celle_retro[0][2]=new Cella(1,0,ris2Retro);
		this.celle_retro[1][1]=new Cella(1,1,ris2Centro);
		this.celle_retro[1][0]=new Cella(1,2,ris3Retro);
		this.celle_retro[1][2]=new Cella(0,2,ris4Retro);
	}
	
	


	/**
	 * prints card
	 */
	public void getCarta(){
		System.out.println("\n");
		System.out.println("punti carta: "+punti);
		System.out.println("--------------------------");
		for(int i=0;i<2;i++) {
			if(i==1)System.out.println("\n");
			for(int j=0;j<3;j++) {
				if((i==0)&&(j==1)) {
					System.out.print(celle_fronte[i][j].getPunti()+"\t");
				}
				else {
					if(celle_fronte[i][j].getTipo()=="NULL")
						{System.out.print("");}
					else{				System.out.print(celle_fronte[i][j].getTipo()+"\t");
	 }
					
				}
			}
			
		}
		System.out.println("\n--------------------------");
		System.out.println("risorse necessarie: "+risorsenec);
		System.out.println("\n\n\n");
		
		System.out.println("--------------------------");
		for(int i=0;i<2;i++) {
			if(i==1)System.out.println("\n");
			for(int j=0;j<3;j++) {
				System.out.print(celle_retro[i][j].getTipo()+"\t");
	 }
					
				}
	
		System.out.println("\n--------------------------");
	}


	/**
	 * @return cards points
	 */
	public int getPunteggio() {
		return (celle_fronte[0][1].getPunti());
	}

	public int getID() {
		return ID;
	}

	}
