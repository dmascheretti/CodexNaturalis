package progetto;

import carte.Carta;
import carte.Carta_oro;
import carte.Carta_risorsa;
import carte.Carta_iniziale;

public class Tabellone {
	
	
    private final int x=21;
    private final int y=21;
    private Carta_iniziale carta_nulla=new Carta_iniziale("    ", "    ", "    ", "    ",
    		 "    ", "    ","    ","    ","    ","    ", 00);
    
   // private Carta_risorsa carta_n=new Carta_risorsa("    ","    ","    ","    ",0,Colore_carta.NULL,"    ",00);
    
    private Carta_iniziale carta_iniziale1=new Carta_iniziale(Regno.VEGE.toString(),Regno.INSE.toString(),Regno.ANIM.toString(),Regno.FUNG.toString(),
    		Regno.ANIM.toString(),Regno.ANIM.toString(),Regno.ANIM.toString(),Regno.ANIM.toString(),Regno.ANIM.toString(),Regno.INSE.toString(),0);
    
	private final Carta[][]tabellone;

	public Tabellone(){
		
	
		this.tabellone=new Carta[x][y];
		
		for(int i=0;i<x;i++)
			for(int j=0;j<y;j++)
				this.tabellone[i][j]=carta_nulla;
		
	}

	public void setCella(int i, int j, Carta carta) {
		tabellone[i][j]=carta;
	}
	
	public Carta getCella(int i, int j) {
		return tabellone[i][j];
	}
	

	public void removeCorner(int i, int j) {
		tabellone[i+1][j+1].setRis1Retro();
		tabellone[i+1][j-1].setRis2Retro();
		tabellone[i-1][j+1].setRis3Retro();
		tabellone[i-1][j-1].setRis4Retro();
		
		
	}

	public void printTabellone() {
		for(int i=0;i<tabellone.length;i++) {	
			System.out.println();
			for(int a=0;a<tabellone.length;a++) System.out.print("-------------------------------┬");
			
			System.out.print("\n");
			
			for(int a=0;a<tabellone[i].length;a++) System.out.print("("+i+","+a+")			      	");
			
			System.out.print("\n\n");
		
			for (int a=0;a<tabellone[i].length;a++) {
				if(tabellone[i][a].getColore()==Colore_carta.NULL.toString()) System.out.print("     ");
				else if(tabellone[i][a].getColore()==Colore_carta.BLU.toString()) System.out.print(tabellone[i][a].getColore()+"  ");
				else System.out.print(tabellone[i][a].getColore());
						System.out.print("                           ");
			}
			System.out.println("\n");
				
			System.out.print("\n     ");
			

			for (int a=0;a<tabellone[i].length;a++) System.out.print(tabellone[i][a].getRis1Retro()+"     "+tabellone[i][a].getRis1Centro()+"     "+tabellone[i][a].getRis2Retro()+"          ");

			
			System.out.println("\n\n");
			System.out.print("     ");

			for (int a=0;a<tabellone[i].length;a++)System.out.print(tabellone[i][a].getRis3Retro()+"     "+tabellone[i][a].getRis2Centro()+"     "+tabellone[i][a].getRis4Retro()+"          ");
			System.out.print("\n");
			
			for(int a=0;a<tabellone[i].length;a++) System.out.print("-------------------------------┴");
			
			
			
			
	}
		System.out.println();

		
	
			}

	
}
