package progetto;


public abstract class Carta {

	private String risorsenec;
	private int punti;
	private Cella[][] celle_fronte;
	private Cella[][] celle_retro;
	private String ris1Fronte,ris2Fronte,ris3Fronte,ris4Fronte;
	private String ris1Retro,ris2Retro, ris3Retro, ris4Retro;
	private String ris1Centro, ris2Centro;
	private Colore_carta colore;
	protected final int ID;

	
	/**Creates a gold card
	 * @param risorse1 
	 * @param risorse2
	 * @param risorse3
	 * @param risorse4
	 * @param punti
	 * @param risorsenec
	 * @param colore
	 * @param risorse1r
	 * @param ris2Retro
	 */
	public Carta(String risorse1,String risorse2, String risorse3,String risorse4,int punti, 
			String risorsenec, Colore_carta colore, String risorse1r, int ID)
	{
		this.celle_fronte=new Cella[2][3];
		this.celle_retro=new Cella[2][3];
		this.ris1Retro=risorse1r;
		this.ris1Fronte=risorse1;
		this.ris2Fronte=risorse2;
		this.ris3Fronte=risorse3;
		this.ris4Fronte=risorse4;
		this.risorsenec=risorsenec;
		this.punti=punti;
		this.colore=colore;
		this.ID=ID;
		
		this.celle_fronte[0][0]=new Cella(0,0,risorse1);
		this.celle_fronte[0][1]=new Cella(0,1,"");
		this.celle_fronte[0][2]=new Cella(1,0,risorse2);
		this.celle_fronte[1][1]=new Cella(1,1,"");
		this.celle_fronte[1][0]=new Cella(1,2,risorse3);
		this.celle_fronte[1][2]=new Cella(0,2,risorse4);
		
		this.celle_retro[0][0]=new Cella(0,0,"");
		this.celle_retro[0][1]=new Cella(0,1,risorse1r);
		this.celle_retro[0][2]=new Cella(1,0,"");
		this.celle_retro[1][1]=new Cella(1,1,"");
		this.celle_retro[1][0]=new Cella(1,2,"");
		this.celle_retro[1][2]=new Cella(0,2,"");
	}
	
	/**Creates a resource card
	 * @param risorse1 
	 * @param risorse2
	 * @param risorse3
	 * @param risorse4
	 * @param punti
	 * @param risorsenec
	 * @param colore
	 * @param risorse1r
	 * @param ris2Retro
	 */
	
	public Carta(String risorse1,String risorse2, String risorse3,String risorse4,int punti, Colore_carta colore,
			String risorse1r, int ID)
	{
		this.celle_fronte=new Cella[2][3];
		this.celle_retro=new Cella[2][3];
		this.ris1Retro=risorse1r;
		this.ris1Fronte=risorse1;
		this.ris2Fronte=risorse2;
		this.ris3Fronte=risorse3;
		this.ris4Fronte=risorse4;
		this.punti=punti;
		this.colore=colore;
		this.ID=ID;
		
		this.celle_fronte[0][0]=new Cella(0,0,risorse1);
		this.celle_fronte[0][1]=new Cella(0,1,"");
		this.celle_fronte[0][2]=new Cella(1,0,risorse2);
		this.celle_fronte[1][1]=new Cella(1,1,"");
		this.celle_fronte[1][0]=new Cella(1,2,risorse3);
		this.celle_fronte[1][2]=new Cella(0,2,risorse4);
		
		this.celle_retro[0][0]=new Cella(0,0,"");
		this.celle_retro[0][1]=new Cella(0,1,risorse1r);
		this.celle_retro[0][2]=new Cella(1,0,"");
		this.celle_retro[1][1]=new Cella(1,1,ris2Retro);
		this.celle_retro[1][0]=new Cella(1,2,"");
		this.celle_retro[1][2]=new Cella(0,2,"");
	}

	
	/**Creates a starting card
	 * @param risorse1 
	 * @param risorse2
	 * @param risorse3
	 * @param risorse4
	 * @param punti
	 * 
	 * @param colore
	 * @param risorse1r
	 * @param risorse2r
	 */

	public Carta(String risorse1,String risorse2, String risorse3,String risorse4,
			String risorse1r, String risorse2r, String risorse3r, String risorse4r, String ris1Centro, String ris2Centro, int ID)
	{
		this.celle_fronte=new Cella[2][3];
		this.celle_retro=new Cella[2][3];
		this.ris1Retro=risorse1r;
		this.ris2Retro=risorse2r;
		this.ris3Retro=risorse3r;
		this.ris4Retro=risorse4r;
		
		this.ris1Fronte=risorse1;
		this.ris2Fronte=risorse2;
		this.ris3Fronte=risorse3;
		this.ris4Fronte=risorse4;
		this.ris1Centro=ris1Centro;
		this.ris2Centro=ris2Centro;
		this.ID=ID;
		
		this.celle_fronte[0][0]=new Cella(0,0,risorse1);
		this.celle_fronte[0][1]=new Cella(0,1,"");
		this.celle_fronte[0][2]=new Cella(1,0,risorse2);
		this.celle_fronte[1][1]=new Cella(1,1,"");
		this.celle_fronte[1][0]=new Cella(1,2,risorse3);
		this.celle_fronte[1][2]=new Cella(0,2,risorse4);
		
		this.celle_retro[0][0]=new Cella(0,0, risorse1r);
		this.celle_retro[0][1]=new Cella(0,1,ris1Centro);
		this.celle_retro[0][2]=new Cella(1,0,risorse2r);
		this.celle_retro[1][1]=new Cella(1,1,ris2Centro);
		this.celle_retro[1][0]=new Cella(1,2,risorse3r);
		this.celle_retro[1][2]=new Cella(0,2,risorse4r);
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
