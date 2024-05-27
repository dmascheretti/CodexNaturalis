package controller;



import carte.Carta;

import progetto.Colore_carta;
import progetto.Giocatore;


import progetto.Tabellone;

public class Controller {

	private Contatori contatore;
	public int l=21;

	public Controller() {
		this.contatore=new Contatori();

	}

	
	
	/**The method checks the position of the corners of each individual card so that they respect the conditions, returning true, otherwise false
	 * @param i
	 * @param j
	 * @param tabellone
	 * @return
	 */
	public Boolean checkCorner(int i, int j, Tabellone tabellone) {
		if(tabellone.getCella(i-1, j-1).getID()!=00 || tabellone.getCella(i-1, j+1).getID()!=00 || 
				tabellone.getCella(i+1, j+1).getID()!=00 || tabellone.getCella(i+1,j-1).getID()!=00){

			if(tabellone.getCella(i+1, j+1).getRis1Retro()!="████" && tabellone.getCella(i+1, j-1).getRis2Retro()!="████" &&
					tabellone.getCella(i-1, j-1).getRis4Retro()!="████" && tabellone.getCella(i-1, j+1).getRis3Retro()!="████")
				return true;
		}
		return false;


	}

	
	
	/**Print each player's name and total score in "Giocatore" 
	 * @param giocatori
	 */
	public void classifica(Giocatore [] giocatori) {
		for(int cl=0;cl<giocatori.length;cl++) {
			System.out.println("\n"+giocatori[cl].getName()+" HA TOTALIZZATO "+giocatori[cl].getSomma()+"PUNTI");
		}
	}

	

	/**Check whether a cell of the playing field ("Tabellone") is empty or not, based on the cell ID
	 * @param x
	 * @param y
	 * @param tabellone
	 * @return
	 */
	public int checkEmpty(int x, int y, Tabellone tabellone) {
		return tabellone.getCella(x,y).getID();
	}

	
	
	/**The method checks the cells adjacent to a given position (x,j) on the "Tabellone" object and returns true if the conditions are met, 
	 * otherwise false
	 * @param x
	 * @param j
	 * @param tabellone
	 * @return
	 */
	public Boolean checkNext(int x, int j, Tabellone tabellone) {
		if((tabellone.getCella(x+1, j).getID()==00) && (tabellone.getCella(x, j-1).getID()==00) &&
				(tabellone.getCella(x-1, j).getID()==00) && (tabellone.getCella(x, j+1).getID()==00)) return true;

		else return false;
	}


	
	/**The function checks whether the move associated with a certain id is valid by checking some specific conditions of the "Tabellone"
	 * @param id
	 * @param tabellone
	 * @return
	 */
	public Boolean mossaValida(int id, Tabellone tabellone) {
		switch(id) {
		case 79: if(contatore.contaAnimali(tabellone)>2) return true;
		else return false;
		case 80: if(contatore.contaVegetali(tabellone)>2 && contatore.contaFunghi(tabellone)>0) return true;
		else return false;		
		case 81: if(contatore.contaAnimali(tabellone)>1 && contatore.contaVegetali(tabellone)>0) return true;
		else return false;
		case 82: if(contatore.contaAnimali(tabellone)>1 && contatore.contaFunghi(tabellone)>0) return true;
		else return false;
		case 83: if(contatore.contaAnimali(tabellone)>2 && contatore.contaVegetali(tabellone)>0) return true;
		else return false;
		case 84: if(contatore.contaAnimali(tabellone)>4) return true;
		else return false;
		case 85: if(contatore.contaAnimali(tabellone)>2 && contatore.contaInsetti(tabellone)>0) return true;
		else return false;
		case 86: if(contatore.contaAnimali(tabellone)>2 && contatore.contaFunghi(tabellone)>0)return true;
		else return false;
		case 87:if(contatore.contaAnimali(tabellone)>2) return true;
		else return false;
		case 88: if(contatore.contaAnimali(tabellone)>2) return true;
		else return false;
		case 89: if (contatore.contaAnimali(tabellone)>2)return true;
		else return false;
		case 90:if (contatore.contaVegetali(tabellone)>4) return true;
		else return false;
		case 91: if(contatore.contaVegetali(tabellone)>1 && contatore.contaInsetti(tabellone)>0) return true;
		else return false;
		case 92: if(contatore.contaFunghi(tabellone)>2) return true;
		else return false;
		case 93: if(contatore.contaFunghi(tabellone)>2) return true;
		else return false;
		case 94: if(contatore.contaFunghi(tabellone)>2) return true;
		else return false;
		case 95: if(contatore.contaFunghi(tabellone)>4) return true;
		else return false;
		case 96: if(contatore.contaFunghi(tabellone)>1 && contatore.contaVegetali(tabellone)>0) return true;
		else return false;
		case 97: if(contatore.contaFunghi(tabellone)>1 && contatore.contaInsetti(tabellone)>0)return true;
		else return false;
		case 98: if(contatore.contaFunghi(tabellone)>2 && contatore.contaInsetti(tabellone)>0)return true;
		else return false;
		case 99: if (contatore.contaFunghi(tabellone)>2 && contatore.contaAnimali(tabellone)>0) return true;
		else return false;
		case 100: if (contatore.contaFunghi(tabellone)>1 && contatore.contaAnimali(tabellone)>0) return true;
		else return false;
		default: return true;
		}
	}

	
	
	/**Method for calculating and returning points based on the elements of each card
	 * @param carta
	 * @param tabellone
	 * @param x
	 * @param y
	 * @return
	 */
	public int getPunti(Carta carta, Tabellone tabellone, int x, int y) {
		switch(carta.getID()) {

		case 60:return (contatore.contaPiume(tabellone));
		case 61:return (contatore.contaInchiostro(tabellone));
		case 62:return (contatore.contaInchiostro(tabellone));
		case 63: return contaAngoli(tabellone,x,y);
		case 64:return (contatore.contaPergamene(tabellone));
		case 65: return contaAngoli(tabellone,x,y);
		case 66: return contaAngoli(tabellone,x,y);
		case 67:return (contatore.contaPergamene(tabellone));
		case 68:return (contatore.contaInchiostro(tabellone));
		case 69: return contaAngoli(tabellone,x,y);
		case 70:return (contatore.contaInchiostro(tabellone));
		case 71: return contaAngoli(tabellone,x,y);
		case 80: return contaAngoli(tabellone, x, y);
		case 81: return contatore.contaPergamene(tabellone);
		case 82: return contatore.contaPiume(tabellone);
		case 83: return contaAngoli(tabellone, x, y);
		case 84: return 5;
		case 85:  return contaAngoli(tabellone, x, y);
		case 86:return contaAngoli(tabellone, x, y);
		case 87: return carta.getPunteggio();
		case 88: return carta.getPunteggio();
		case 89: return carta.getPunteggio();
		case 90: return carta.getPunteggio();
		case 91: return contatore.contaInsetti(tabellone)+1;
		case 92: return carta.getPunteggio();
		case 93: return carta.getPunteggio();
		case 94: return carta.getPunteggio();
		case 95: return carta.getPunteggio();
		case 96: return contaAngoli(tabellone, x, y);
		case 97: return contatore.contaPergamene(tabellone);
		case 98: return contaAngoli(tabellone, x, y);
		case 99: return contaAngoli(tabellone, x, y);
		case 100: return contatore.contaAnimali(tabellone);
		default: return carta.getPunteggio();
		}
	}



	/**Counter method
	 * @param tabellone
	 * @return
	 */
	public int conta(Tabellone tabellone) {
		return contatore.contaInsetti(tabellone);
	}

	
	
	/**This method awards points based on the specific rules of an objective card using in-game information
	 * @param id of the card
	 * @param tabellone the (spatial) matrix in which the player can place resource and gold cards
	 * @return points
	 */
	public int checkCartaObiettivo(int id, Tabellone tabellone){
		int punti=0;
		int piume;
		int pergamena;
		int inchiostro;

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
						if(tabellone.getCella(i+1, j).getColore()=="ROSSO" && tabellone.getCella(i+2, j+1).getColore()=="VERDE" ) {
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
						if(tabellone.getCella(i-1, j).getColore()=="VIOLA" && tabellone.getCella(i-2, j-1).getColore()=="BLU" ) {
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
						if(tabellone.getCella(i-1, j).getColore()=="BLU" && tabellone.getCella(i-2, j+1).getColore()=="ROSSO" ) {
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

	

	/**This method checks the adjacent cells (in diagonal positions) with respect to the cell (x, y) and returns the total points
	 * @param tabellone
	 * @param x
	 * @param y
	 * @return
	 */
	public int contaAngoli(Tabellone tabellone, int x, int y)
	{
		int conta=0;
		for(int i=-1; i<2;i=i+2) {
			for(int j=-1; j<2; j=j+1) {
				if(tabellone.getCella(x+i, y+j).getID()!=00) conta=conta+2;
			}
		}

		System.out.println("QUESTO PIAZZAMENTO TI DA "+conta+ " PUNTI");

		return conta;
	}
	
	
	
	/**Check if one of the players has a sum of points greater than 19 to determine the win, whoever reaches 20 points wins
	 * @param giocatori
	 * @return
	 */
	public Boolean checkWin(Giocatore[] giocatori) {
		boolean win=false;
		for(int current=0;current<giocatori.length;current++){ 
			{if (giocatori[current].getSomma()>19) {
				win=true;

			}
			}
		}
		return win;
	}
}





