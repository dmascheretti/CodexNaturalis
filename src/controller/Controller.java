package controller;

import carte.Carta;
import progetto.Regno;
import progetto.Tabellone;
import controller.Contatori;
public class Controller {
	
	private Contatori contatore;
	
	public Controller() {
		this.contatore=new Contatori();
		
	}

	public Boolean checkCorner(int i, int j, Tabellone tabellone) {
		if(tabellone.getCella(i-1, j-1).getID()!=00 || tabellone.getCella(i-1, j+1).getID()!=00 || 
				tabellone.getCella(i+1, j+1).getID()!=00 || tabellone.getCella(i+1,j-1).getID()!=00){
				
				if(tabellone.getCella(i+1, j+1).getRis1Retro()!="████" && tabellone.getCella(i+1, j-1).getRis2Retro()!="████" &&
						tabellone.getCella(i-1, j-1).getRis4Retro()!="████" && tabellone.getCella(i-1, j+1).getRis3Retro()!="████") return true;
		}
		return false;
		
		
	}
	
	
	public int checkEmpty(int x, int y, Tabellone tabellone) {
		return tabellone.getCella(x,y).getID();
	}

	public Boolean checkNext(int x, int j, Tabellone tabellone) {
		if((tabellone.getCella(x+1, j).getID()==00) && (tabellone.getCella(x, j-1).getID()==00) &&
				(tabellone.getCella(x-1, j).getID()==00) && (tabellone.getCella(x, j+1).getID()==00)) return true;
		
		else return false;
		
		
	}
	
	
	/*
	public Boolean checkCorner(int i, int j) {
		if(tabellone.getCella(i-1, j-1).getID()!=00 || tabellone.getCella(i-1, j+1).getID()!=00 || 
				tabellone.getCella(i+1, j+1).getID()!=00 || tabellone.getCella(i+1,j-1).getID()!=00){
				
				if(tabellone.getCella(i+1, j+1).getRis2Retro()!="████"|| tabellone.getCella(i+1, j-1).getRis3Retro()!="████" ||
						tabellone.getCella(i-1, j-1).getRis4Retro()!="████" || tabellone.getCella(i-1, j+1).getRis1Retro()!="████") 
				return true;
		}
		return false;
		
		
	}
	
	*/
	//da finire
	public Boolean mossaValida(int id, Tabellone tabellone) {
		switch(id) {
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
		case 97: if(contatore.contaFunghi(tabellone)>1 && contatore.contaInsetti(tabellone)>1)return true;
				else return false;
		case 98: if(contatore.contaFunghi(tabellone)>2 && contatore.contaAnimali(tabellone)>0)return true;
				else return false;
		case 99: if (contatore.contaFunghi(tabellone)>2 && contatore.contaAnimali(tabellone)>0) return true;
				else return false;
		case 100: if (contatore.contaFunghi(tabellone)>1 && contatore.contaAnimali(tabellone)>0) return true;
				else return false;
		default: return true;
			
		}
	}
		
		public int getPunti(int id, Tabellone tabellone, int x, int y) {
			
			switch(id) {
			//esempio 2 animali, 2 punti
			case 80: return (contatore.contaAnimali(tabellone)/2);
			//esempio ogni angolo coperto 2 punti
			case 81: int conta=0;
			
			for(int i=-1;i<2;i+=2)
				for(int j=-1;j<2;j+=2)
			if(tabellone.getCella(x+i, y+j).getID()!=0) conta+=2;
			return conta;
			
			default: return 0;
			
			}
			
			}
		
		
public int getObiettivo(int id, Tabellone tabellone) {
			
			switch(id) {
			//esempio 2 animali, 2 punti
			case 01: 
			//esempio ogni angolo coperto 2 punti
			case 02: 	int viola=0;
						for(int i=0;i<20;i++) {
							for(int j=0;j<20;j++) if(tabellone.getCella(i, j).getColore()=="VIOLA") {
								if(tabellone.getCella(i+1, j+1).getColore()=="VIOLA" && tabellone.getCella(i+2, j+2).getColore()=="VIOLA")
									{viola+=2;
									 	tabellone.getCella(i+2, j+2).setColore();
									}
								
							}
						}
								return viola;
							
			
	
			default: return 0;
			
			}
			
			}
			
			
		
		
	
	
	public int conta(Tabellone tabellone) {
		return contatore.contaInsetti(tabellone);
	}
	}
	

