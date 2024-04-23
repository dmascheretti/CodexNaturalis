package progetto;

//questa classe deve essere astratta
public class Carta {

	protected String risorsenec;
	private int punti;
	private Cella[][] celle_fronte;
	private Cella[][] celle_retro;
	private String risorse1,risorse2,risorse3,risorse4;
	private String risorse1r,risorse2r;
	private Colore_carta colore;

	
	/**Creates a gold card
	 * @param risorse1 
	 * @param risorse2
	 * @param risorse3
	 * @param risorse4
	 * @param punti
	 * @param risorsenec
	 * @param colore
	 * @param risorse1r
	 * @param risorse2r
	 */
	public Carta(String risorse1,String risorse2, String risorse3,String risorse4,int punti, 
			String risorsenec, Colore_carta colore, String risorse1r, String risorse2r)
	{
		this.celle_fronte=new Cella[2][3];
		this.celle_retro=new Cella[2][3];
		this.risorse1r=risorse1r;
		this.risorse2r=risorse2r;
		
		this.risorse1=risorse1;
		this.risorse2=risorse2;
		this.risorse3=risorse3;
		this.risorse4=risorse4;
		this.risorsenec=risorsenec;
		this.punti=punti;
		this.colore=colore;
		//this.risorse=risorse;
		//this.punti=punti;
		this.celle_fronte[0][0]=new Cella(0,0,risorse1);
		this.celle_fronte[0][1]=new Cella(0,1,"");
		this.celle_fronte[0][2]=new Cella(1,0,risorse2);
		this.celle_fronte[1][1]=new Cella(1,1,"");
		this.celle_fronte[1][0]=new Cella(1,2,risorse3);
		this.celle_fronte[1][2]=new Cella(0,2,risorse4);
		
		this.celle_retro[0][0]=new Cella(0,0,"");
		this.celle_retro[0][1]=new Cella(0,1,risorse1r);
		this.celle_retro[0][2]=new Cella(1,0,"");
		this.celle_retro[1][1]=new Cella(1,1,risorse2r);
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
	 * @param risorse2r
	 */
	
	public Carta(String risorse1,String risorse2, String risorse3,String risorse4,int punti, Colore_carta colore,
			String risorse1r, String risorse2r)
	{
		this.celle_fronte=new Cella[2][3];
		this.celle_retro=new Cella[2][3];
		this.risorse1r=risorse1r;
		this.risorse2r=risorse2r;
		this.risorse1=risorse1;
		this.risorse2=risorse2;
		this.risorse3=risorse3;
		this.risorse4=risorse4;
		this.punti=punti;
		this.colore=colore;
		//this.risorse=risorse;
		//this.punti=punti;
		this.celle_fronte[0][0]=new Cella(0,0,risorse1);
		this.celle_fronte[0][1]=new Cella(0,1,"");
		this.celle_fronte[0][2]=new Cella(1,0,risorse2);
		this.celle_fronte[1][1]=new Cella(1,1,"");
		this.celle_fronte[1][0]=new Cella(1,2,risorse3);
		this.celle_fronte[1][2]=new Cella(0,2,risorse4);
		this.celle_retro[0][0]=new Cella(0,0,"");
		this.celle_retro[0][1]=new Cella(0,1,risorse1r);
		this.celle_retro[0][2]=new Cella(1,0,"");
		this.celle_retro[1][1]=new Cella(1,1,risorse2r);
		this.celle_retro[1][0]=new Cella(1,2,"");
		this.celle_retro[1][2]=new Cella(0,2,"");
	}

	
	/**Creates a starting card
	 * @param risorse1 
	 * @param risorse2
	 * @param risorse3
	 * @param risorse4
	 * @param punti
	 * @param risorsenec
	 * @param colore
	 * @param risorse1r
	 * @param risorse2r
	 */

	public Carta(String risorse1,String risorse2, String risorse3,String risorse4,
			String risorse1r, String risorse2r)
	{
		this.celle_fronte=new Cella[2][3];
		this.celle_retro=new Cella[2][3];
		this.risorse1r=risorse1r;
		this.risorse2r=risorse2r;
		this.risorse1=risorse1;
		this.risorse2=risorse2;
		this.risorse3=risorse3;
		this.risorse4=risorse4;
		this.celle_fronte[0][0]=new Cella(0,0,risorse1);
		this.celle_fronte[0][1]=new Cella(0,1,"");
		this.celle_fronte[0][2]=new Cella(1,0,risorse2);
		this.celle_fronte[1][1]=new Cella(1,1,"");
		this.celle_fronte[1][0]=new Cella(1,2,risorse3);
		this.celle_fronte[1][2]=new Cella(0,2,risorse4);
		
		this.celle_retro[0][0]=new Cella(0,0,"");
		this.celle_retro[0][1]=new Cella(0,1,risorse1r);
		this.celle_retro[0][2]=new Cella(1,0,"");
		this.celle_retro[1][1]=new Cella(1,1,risorse2r);
		this.celle_retro[1][0]=new Cella(1,2,"");
		this.celle_retro[1][2]=new Cella(0,2,"");
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

	}
