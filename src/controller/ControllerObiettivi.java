package controller;

import progetto.Tabellone;
import progetto.Colore_carta;

public class ControllerObiettivi {
	private Contatori contatore;
	public ControllerObiettivi() {
		this.contatore=new Contatori();
	}
	/** This method checks the resources in each players' manuscript in order to assign the points of the 16 goal cards.
	 * 
	 * @param id of the card
	 * @param tabellone the (spatial) matrix in which the player can place resource and gold cards
	 * @return points
	 */
	
	
	
	public int checkCartaObiettivo(int id, Tabellone tabellone){
		int punti=0;
		int piume;
		int pergamena;
		int inchiostro;
		int l=tabellone.getSize();
		 
		switch(id) {
		
		case 5: 
	    punti=0;
		piume=contatore.contaPiume(tabellone);
		inchiostro=contatore.contaInchiostro(tabellone);
		pergamena=contatore.contaPergamene(tabellone);
		
		 while(piume!=0 && inchiostro!=0 && pergamena!=0) {
			piume--;
			inchiostro--;
			pergamena--;
			punti+=3;
		   }
		return punti;
		
		case 6:  
			punti=0;
		        for(int i=0;i<l;i++) {
			       for(int j=0;j<l;j++) {
					  if(tabellone.getCella(i, j).getColore()==Colore_carta.VIOLA.toString()) {
						if(tabellone.getCella(i+1, j+1).getColore()==Colore_carta.VIOLA.toString() && tabellone.getCella(i+2, j+2).getColore()==Colore_carta.VIOLA.toString() ) {
						 punti+= 2;
						    tabellone.getCella(i+2, j+2).setColore();
						 }
					  }
			       }
		        }
			return punti;
				       	
		case 7: 
			punti=0;
            for(int i=0;i<l;i++) {
	           for(int j=0;j<l;j++) {
			      if(tabellone.getCella(i, j).getColore()==Colore_carta.VERDE.toString() ) {
				    if(tabellone.getCella(i+1, j+1).getColore()==Colore_carta.VERDE.toString() && tabellone.getCella(i+2, j+2).getColore()==Colore_carta.VERDE.toString()) {
				     punti+= 2;
				        tabellone.getCella(i+2, j+2).setColore();
				     }
				  }
	           }
            }
		    return punti;
		
		case 8: 
			punti=0;
	        for(int i=0;i<l;i++) {
		       for(int j=0;j<l;j++) {
				      if(tabellone.getCella(i, j).getColore()=="ROSSO" ) {
					    if(tabellone.getCella(i-1, j+1).getColore()=="ROSSO") {
					    		if(tabellone.getCella(i-2, j+2).getColore()=="ROSSO" ) {
					     punti+= 2;
					        tabellone.getCella(i-1, j+1).setColore();
					     }
					  }
		       }
	        }
	        }
			       return punti;
		case 9:
			punti=0;
			 for(int i=0;i<l;i++) {
			       for(int j=0;j<l;j++) {
					      if(tabellone.getCella(i, j).getColore()=="ROSSO" ) {
						    if(tabellone.getCella(i+2, j).getColore()=="ROSSO" && tabellone.getCella(i+2, j+1).getColore()=="VERDE" ) {
						     punti+= 2;
						     }
						  }
			       }
			 }
				       return punti;
		
		case 10:
			punti=0;
	        for(int i=0;i<l;i++) {
		       for(int j=0;j<l;j++) {
				      if(tabellone.getCella(i, j).getColore()=="BLU" ) {
					    if(tabellone.getCella(i-1, j+1).getColore()=="BLU" && tabellone.getCella(i-2, j+2).getColore()=="BLU" ) {
					     punti+= 2;
					        tabellone.getCella(i-1, j+1).setColore();
					     }
					  }
		       }
	        }
			       return punti;
		case 11:
			punti=0;
			 for(int i=0;i<l;i++) {
			       for(int j=0;j<l;j++) {
					      if(tabellone.getCella(i, j).getColore()=="VIOLA" ) {
						    if(tabellone.getCella(i-2, j).getColore()=="VIOLA" && tabellone.getCella(i-2, j-1).getColore()=="BLU" ) {
						     punti+= 2;
						     }
						  }
			       }
			 }
				       return punti;
			
		case 12:
			punti=0;
			 for(int i=0;i<l;i++) {
			       for(int j=0;j<l;j++) {
					      if(tabellone.getCella(i, j).getColore()=="BLU" ) {
						    if(tabellone.getCella(i-2, j).getColore()=="BLU" && tabellone.getCella(i-2, j+1).getColore()=="ROSSO" ) {
						     punti+= 2;
						     }
						  }
		}
	}
				       return punti;
		case 13:
			punti=0;
			 for(int i=0;i<l;i++) {
			       for(int j=0;j<l;j++) {
					      if(tabellone.getCella(i, j).getColore()=="VERDE" ) {
						    if(tabellone.getCella(i+1, j).getColore()=="VERDE"){
						    		if(tabellone.getCella(i+2, j-1).getColore()=="VIOLA" ) {
						     punti+= 2;
						     }
						  }
			       }
			    }
			 }
				       return punti;
				       
		case 14: return (contatore.contaAnimali(tabellone)/3*2);
		
		case 15: return (contatore.contaFunghi(tabellone)/3*2);
		
		case 16: return (contatore.contaVegetali(tabellone)/3*2);
		
		case 17: 
			punti=0;
			inchiostro=contatore.contaInchiostro(tabellone);
				
				while(inchiostro>1) {
					inchiostro-=2;
					punti+=2;
				  }
				return punti;
		
		case 18: 
			return contatore.contaInsetti(tabellone)/3*2;
		
			
			
			
		case 19: 
			 punti=0;
			 pergamena=contatore.contaPergamene(tabellone);
				
				while(pergamena>1) {
					pergamena-=2;
					punti+=2;
				  }
				return punti;
		
		case 20: 
			 punti=0;
			 piume=contatore.contaPiume(tabellone);
				
				while(piume>1) {
					piume-=2;
					punti+=2;
				  }
				return punti;
		
		default: return 0;
		}
	}
	
	

}
