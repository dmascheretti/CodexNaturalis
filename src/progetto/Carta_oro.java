package progetto;

public class Carta_oro {
protected String risorsenec;
private int punti;
private Cella[][] celle;
private String risorse1,risorse2,risorse3,risorse4;
private Regno regno1,regno2,regno3,regno4;


//inserire super() come in carta risorsa

public Carta_oro(String risorse1,String risorse2, String risorse3,String risorse4,int punti, String risorsenec)
{
	this.celle=new Cella[2][3];
	this.risorse1=risorse1;
	this.risorse2=risorse2;
	this.risorse3=risorse3;
	this.risorse4=risorse4;
	this.risorsenec=risorsenec;
	this.punti=punti;
	//this.risorse=risorse;
	//this.punti=punti;
	this.celle[0][0]=new Cella(0,0,risorse1);
	this.celle[0][1]=new Cella(0,1,punti);
	this.celle[0][2]=new Cella(1,0,risorse2);
	this.celle[1][1]=new Cella(1,1,"");
	this.celle[1][0]=new Cella(1,2,risorse3);
	this.celle[1][2]=new Cella(0,2,risorse4);
}


//MEGLIO REGNO O STRING?
public Carta_oro(Regno regno1,Regno regno2, Regno regno3,Regno regno4,int punti)
{
	this.celle=new Cella[2][3];
	this.regno1=regno1;
	this.regno2=regno2;
	this.regno3=regno3;
	this.regno4=regno4;
	this.punti=punti;
	//this.risorse=risorse;
	//this.punti=punti;
	this.celle[0][0]=new Cella(0,0,regno1);
	//this.celle[0][1]=new Cella(0,1,punti);
	this.celle[0][2]=new Cella(1,0,regno2);
	this.celle[1][1]=new Cella(1,1,"");
	this.celle[1][0]=new Cella(1,2,regno3);
	this.celle[1][2]=new Cella(0,2,regno4);
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
	System.out.println("risorse necessarie: "+risorsenec);
	System.out.println("\n");
	

}


public int getPunteggio() {
	return (celle[0][1].getPunti());
}
*/




