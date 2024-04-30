package progetto;

public class Carta_risorsa extends Carta{
	private int punti;
	private Cella[][] celle;
	private String risorse1,risorse2,risorse3,risorse4;
	private Colore_carta color;

public Carta_risorsa(String risorse1,String risorse2, String risorse3,String risorse4,int punti, Colore_carta color, String risorse1r,int ID)
{
	super(risorse1,risorse2, risorse3, risorse4, punti, color,  risorse1r, ID);
	/*this.celle=new Cella[2][3];
	this.risorse1=risorse1;
	this.risorse2=risorse2;
	System.out.println("cccc");
	this.risorse3=risorse3;
	this.risorse4=risorse4;
	this.punti=punti;
	this.color=color;
	//this.risorse=risorse;
	//this.punti=punti;
	this.celle[0][0]=new Cella(0,0,risorse1);
	this.celle[0][1]=new Cella(0,1,punti);
	this.celle[0][2]=new Cella(1,0,risorse2);
	this.celle[1][1]=new Cella(1,1,"");
	this.celle[1][0]=new Cella(1,2,risorse3);
	this.celle[1][2]=new Cella(0,2,risorse4);
	
	*/
}



public void getCarta(){
	System.out.println("\n");
	System.out.println("punti carta: "+punti);
	System.out.println("--------------------------");
	for(int i=0;i<2;i++) {
		if(i==1)System.out.println("\n");
		for(int j=0;j<3;j++) {
			if((i==0)&&(j==1)) {
				System.out.print(celle[i][j].getPunti()+"\t");
			}
			else {
				if(celle[i][j].getTipo()=="NULL")
					{System.out.print("");}
				else{				System.out.print(celle[i][j].getTipo()+"\t");
 }
				
			}
		}
		
	}
	System.out.println("\n--------------------------");
	System.out.println("\n");
	

}
}
