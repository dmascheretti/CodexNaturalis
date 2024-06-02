package carte;

public class Carta_iniziale extends Carta{
	
	
	
	public Carta_iniziale(String risorse1, String risorse2, String risorse3, String risorse4, String risorse1r,
			String risorse2r, String risorse3r, String risorse4r, String ris1Centro, String ris2Centro, int ID) {
		super(risorse1, risorse2, risorse3, risorse4, risorse1r, risorse2r, risorse3r, risorse4r, ris1Centro, ris2Centro, ID);
	}
	
	public String printCard() {
		
		return ("\nID: "+ID
				+"\n---------------------╗\n\n"
		+ris1Fronte+ "\t\t" +ris2Fronte+ "\n\n"+ris3Fronte+"\t\t"+ris4Fronte+
		"\n\n----------------------\n\n" +ris1Retro+"\t"+ris1Centro+"\t"+ris2Retro+"\n\n"+ris3Retro+"\t"+ris2Centro+"\t"+ris4Retro+"\n"+
		"\n----------------------╝\n");
	}

	
	
	
	

	/*
	public void getCarta(){
		System.out.println("\n");
		System.out.println("ID CARTA: "+ID);
		System.out.println("--------------------------");
		for(int i=0;i<2;i++) {
			if(i==1)System.out.println("\n");
			for(int j=0;j<3;j++) {
				System.out.print(celle_fronte[i][j].getTipo()+"\t");
				
			}
			
		}
		
		System.out.println("\n\n--------------------------");
		
		System.out.println("\n");
		System.out.println("--------------------------");
		for(int i=0;i<2;i++) {
			if(i==1)System.out.println("\n");
			for(int j=0;j<3;j++) {
				 System.out.print(celle_retro[i][j].getTipo()+"\t");
				
			}
			
		}
		System.out.println("\n--------------------------");
	}
	*/
	}
	
