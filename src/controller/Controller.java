package controller;



import carte.Carta;

import progetto.Giocatore;


import progetto.Tabellone;

public class Controller {

	private Contatori contatore;


	public Controller() {
		this.contatore=new Contatori();

	}


	public void classifica(Giocatore [] giocatori) {
		for(int cl=0;cl<giocatori.length;cl++) {
			System.out.println("\n"+giocatori[cl].getName()+" HA TOTALIZZATO "+giocatori[cl].getSomma()+"PUNTI");
		}
	}


	public Boolean mossaValida(int id, Tabellone tabellone) {


		switch(id) {
		case 60: if(contatore.contaAnimali(tabellone)>2) return true;
		else return false;
		case 61: if(contatore.contaAnimali(tabellone)>1 && contatore.contaVegetali(tabellone)>0) return true;
		else return false;
		case 62: if(contatore.contaAnimali(tabellone)>1 && contatore.contaInsetti(tabellone)>0) return true;
		else return false;
		case 63: if(contatore.contaInsetti(tabellone)>1 && contatore.contaVegetali(tabellone)>0) return true;
		else return false;
		case 64: if(contatore.contaVegetali(tabellone)>1 && contatore.contaInsetti(tabellone)>0) return true;
		else return false;
		case 65: if(contatore.contaAnimali(tabellone)>0 && contatore.contaInsetti(tabellone)>0 && contatore.contaVegetali(tabellone)>0) return true;
		else return false;
		case 66: if(contatore.contaInsetti(tabellone)>2) return true;
		else return false;
		case 67: if(contatore.contaVegetali(tabellone)>2) return true;
		else return false;
		case 68: if(contatore.contaFunghi(tabellone)>2) return true;
		else return false;
		case 69: if(contatore.contaAnimali(tabellone)>1 && contatore.contaFunghi(tabellone)>0) return true;
		else return false;
		case 70: if(contatore.contaInsetti(tabellone)>1 && contatore.contaFunghi(tabellone)>0) return true;
		else return false;
		case 71: if(contatore.contaVegetali(tabellone)>0 && contatore.contaFunghi(tabellone)>1) return true;
		else return false;
		case 72: if(contatore.contaVegetali(tabellone)>1 && contatore.contaAnimali(tabellone)>0) return true;
		else return false;
		case 73: if(contatore.contaAnimali(tabellone)>2 && contatore.contaInsetti(tabellone)>0) return true;
		else return false;
		case 74: if(contatore.contaFunghi(tabellone)>1 && contatore.contaVegetali(tabellone)>0 && contatore.contaInsetti(tabellone)>0) return true;
		else return false;
		case 75: if(contatore.contaAnimali(tabellone)>1 && contatore.contaVegetali(tabellone)>0) return true;
		else return false;
		case 76: if(contatore.contaInsetti(tabellone)>4) return true;
		else return false;
		case 77: if(contatore.contaInsetti(tabellone)>0 && contatore.contaAnimali(tabellone)>0 && contatore.contaFunghi(tabellone)>0) return true;
		else return false;
		case 78: if(contatore.contaInsetti(tabellone)>0 && contatore.contaAnimali(tabellone)>0 && contatore.contaFunghi(tabellone)>0 && contatore.contaVegetali(tabellone)>0) return true;
		else return false;
		case 79: if(contatore.contaAnimali(tabellone)>2) return true;
		else return false;
		case 80: if(contatore.contaVegetali(tabellone)>2 && contatore.contaFunghi(tabellone)>0) return true;
		else return false;		
		case 81: if(contatore.contaAnimali(tabellone )>1 && contatore.contaVegetali(tabellone)>0) return true;
		else return false;
		case 82: if(contatore.contaAnimali(tabellone )>1 && contatore.contaFunghi(tabellone)>0) return true;
		else return false;
		case 83: if(contatore.contaAnimali(tabellone )>2 && contatore.contaVegetali(tabellone)>0) return true;
		else return false;
		case 84: if(contatore.contaAnimali(tabellone )>4) return true;
		else return false;
		case 85: if(contatore.contaAnimali(tabellone  )>2 && contatore.contaInsetti(tabellone)>0) return true;
		else return false;
		case 86: if(contatore.contaAnimali(tabellone  )>2 && contatore.contaFunghi(tabellone)>0)return true;
		else return false;
		case 87:if(contatore.contaAnimali(tabellone )>2) return true;
		else return false;
		case 88: if(contatore.contaAnimali(tabellone )>2) return true;
		else return false;
		case 89: if (contatore.contaAnimali(tabellone )>2)return true;
		else return false;
		case 90:if (contatore.contaVegetali(tabellone )>4) return true;
		else return false;
		case 91: if(contatore.contaVegetali(tabellone )>1 && contatore.contaInsetti(tabellone )>0) return true;
		else return false;
		case 92: if(contatore.contaFunghi(tabellone )>2) return true;
		else return false;
		case 93: if(contatore.contaFunghi(tabellone)>2) return true;
		else return false;
		case 94: if(contatore.contaFunghi(tabellone )>2) return true;
		else return false;
		case 95: if(contatore.contaFunghi(tabellone )>4) return true;
		else return false;
		case 96: if(contatore.contaFunghi(tabellone )>1 && contatore.contaVegetali(tabellone)>0) return true;
		else return false;
		case 97: if(contatore.contaFunghi(tabellone )>1 && contatore.contaInsetti(tabellone )>0)return true;
		else return false;
		case 98: if(contatore.contaFunghi(tabellone )>2 && contatore.contaInsetti(tabellone)>0)return true;
		else return false;
		case 99: if (contatore.contaFunghi(tabellone )>2 && contatore.contaAnimali(tabellone)>0) return true;
		else return false;
		case 100: if (contatore.contaFunghi(tabellone)>1 && contatore.contaAnimali(tabellone)>0) return true;
		else return false;
		default: return true;
		}
	}


	public int getPunti(Carta carta, Tabellone tabellone, int x, int y) {
		switch(carta.getID()) {

		//1 punto per ogni piuma 
		case 60:return (contatore.contaPiume(tabellone)+1);
		//1 punto per pozione
		case 61:return (contatore.contaInchiostro(tabellone)+1);
		//1 punto per pozione
		case 62:return (contatore.contaInchiostro(tabellone)+1);
		//esempio ogni angolo coperto 2 punti
		case 63: return contaAngoli(tabellone,x,y);
		//1 punto per pergamena		
		case 64:return (contatore.contaPergamene(tabellone)+1);

		//esempio ogni angolo coperto 2 punti
		case 65: return contaAngoli(tabellone,x,y);

		//esempio ogni angolo coperto 2 punti
		case 66: return contaAngoli(tabellone,x,y);
		//1 punto per pergamena
		case 67:return (contatore.contaPergamene(tabellone)+1);
		//1 punto per pozione
		case 68:return (contatore.contaInchiostro(tabellone)+1);
		//esempio ogni angolo coperto 2 punti
		case 69: return contaAngoli(tabellone,x,y);
		//1 punto per pozione
		case 70:return (contatore.contaInchiostro(tabellone)+1);
		//esempio ogni angolo coperto 2 punti
		case 71: return contaAngoli(tabellone,x,y);

		case 80: return contaAngoli(tabellone, x, y);
		case 81: return (contatore.contaPergamene(tabellone)+1);
		case 82: return (contatore.contaPiume(tabellone)+1);
		case 83: return contaAngoli(tabellone, x, y);
		case 85:  return contaAngoli(tabellone, x, y);

		case 86:return contaAngoli(tabellone, x, y);
		case 91: return (contatore.contaPiume(tabellone)+1);
		case 96: return contaAngoli(tabellone, x, y);
		case 97: return (contatore.contaPergamene(tabellone)+1);

		case 98: return contaAngoli(tabellone, x, y);

		case 99: return contaAngoli(tabellone, x, y);
		case 100: return (contatore.contaPiume(tabellone)+1);

		default: return carta.getPunteggio();
		}

	}



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
	
	public void vittoria (Giocatore[] giocatori) {
		int max=0;
		int contatore=0;
		for (int l= 0; l<giocatori.length;l++) {
			int punteggio=0;
			punteggio=giocatori[l].getSomma();
			if (punteggio>=max){
				if (punteggio==max) {
					contatore++;
				}
				max=punteggio;
			}
			
		}
		if (contatore>0)
		{
			System.out.println("\nPAREGGIO");
		}else {
		for (int l1= 0; l1<giocatori.length;l1++) {
			if (contatore==0 && giocatori[l1].getSomma()==max)
			{
				System.out.println("\n"+giocatori[l1].getName()+" HA VINTO ");
			}
		}
		}
		
	}
}





