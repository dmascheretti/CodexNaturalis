package progetto;


import carte.Carta;
import carte.Carta_iniziale;


/**
 * 
 */
public class Tabellone {
	
	
    private int x=5;
    private int y=5;
    private int size=5;
    
    public int getSize() {
		return this.size;
	}
    
    public void setSize() {
    this.size=size+2;
}

	
    private Carta_iniziale carta_nulla=new Carta_iniziale("    ", "    ", "    ", "    ",
    		 "    ", "    ","    ","    ","    ","    ", 00);
    
   // private Carta_risorsa carta_n=new Carta_risorsa("    ","    ","    ","    ",0,Colore_carta.NULL,"    ",00);
    
    
    
	private Carta[][]tabellone;
	private Carta[][]new_tabellone;

	/**
	 * Costructor for Tabellone (one game table for player)
	 */
	public Tabellone(){
		
		this.tabellone=new Carta[x][y];
		this.new_tabellone=null;
		for(int i=0;i<x;i++)
			for(int j=0;j<y;j++)
				this.tabellone[i][j]=carta_nulla;
		
	}

	/**
	 * Put a card in a place in Tabellone
	 * @param i
	 * @param j
	 * @param carta
	 
	 */
	public boolean setCella(int i, int j, Carta carta) {
		
		boolean aumenta=false;
		
		if(i==size-2 || i==1|| j==1 || j==size-2) {
			aumentaTabella(i,j);
			aumenta=true;
			this.x=x+2;
			this.y=y+2;
			setSize();
			tabellone[i+1][j+1]=carta;
			return aumenta;
		}
	else {
		tabellone[i][j]=carta;
		return aumenta;
			
		}
	}
	
	public void aumentaTabella(int i, int j) {
			this.new_tabellone=new Carta[x+2][y+2];
			for(int k=0;k<x+2;k++) {
				for(int r=0;r<y+2;r++) {
					new_tabellone[k][r]=carta_nulla;
				}
			}
			
			for(int k=0;k<x;k++) {
				for(int r=0;r<y;r++) {
					new_tabellone[k+1][r+1]=tabellone[k][r];
					
					
				}
			}
			tabellone=new Carta[x+2][y+2];
		for(int k=0;k<x+2;k++) {
			for(int r=0;r<y+2;r++) {
				tabellone[k][r]=carta_nulla;
			}
			
		}
		
		this.tabellone=new_tabellone;
		}
	
	
	public Boolean checkCorner(int i, int j) {
		if(tabellone[i-1][j-1].getID()!=00 || tabellone[i-1] [j+1].getID()!=00 || 
				tabellone[i+1][j+1].getID()!=00 || tabellone[i+1][j-1].getID()!=00){

			if(tabellone[i+1][j+1].getRis1Retro()!="████" && tabellone[i+1][j-1].getRis2Retro()!="████" &&
					tabellone[i-1][j-1].getRis4Retro()!="████" && tabellone[i-1][j+1].getRis3Retro()!="████")
				return true;
		}
		return false;

	}
	
	
	public Boolean checkNext(int x, int j) {
		if((tabellone[x+1][j].getID()==00) && (tabellone[x][j-1].getID()==00) &&
				(tabellone[x-1][j].getID()==00) && (tabellone[x][j+1].getID()==00)) return true;

		else return false;


	}
	
	public int checkEmpty(int x, int y) {
		return tabellone[x][y].getID();
	}

	/**
	 * Return the card in a i,j coordinates of the game table matrix
	 * @param i
	 * @param j
	 * @return
	 */
	public Carta getCella(int i, int j) {
		return this.tabellone[i][j];
	}
	

	/**
	 * Method for cover all the corner of the card next to each other (after playing a card)
	 * @param i
	 * @param j
	 */
	public void removeCorner(int i, int j) {
		tabellone[i+1][j+1].setRis1Retro();
		tabellone[i+1][j-1].setRis2Retro();
		tabellone[i-1][j+1].setRis3Retro();
		tabellone[i-1][j-1].setRis4Retro();
		
		
	}
	

	/**
	 * Print Tabellone
	 */
	public void printTabellone() {
		for(int i=1;i<tabellone.length-1;i++) {	
			System.out.println();
			for(int a=1;a<tabellone.length-1;a++) System.out.print("-------------------------------┬");
			
			System.out.print("\n");
			
			for(int a=1;a<tabellone[i].length-1;a++) System.out.print("("+i+","+a+")			      	");
			
			System.out.print("\n\n");
		
			for (int a=1;a<tabellone[i].length-1;a++) {
				if(tabellone[i][a].getColore()==Colore_carta.NULL.toString()) System.out.print("     ");
				else if(tabellone[i][a].getColore()==Colore_carta.BLU.toString()) System.out.print(tabellone[i][a].getColore()+"  ");
				else System.out.print(tabellone[i][a].getColore());
						System.out.print("                           ");
			}
			System.out.println("\n");
				
			System.out.print("\n     ");
			

			for (int a=1;a<tabellone[i].length-1;a++) System.out.print(tabellone[i][a].getRis1Retro()+"     "+tabellone[i][a].getRis1Centro()+"     "+tabellone[i][a].getRis2Retro()+"          ");

			
			System.out.println("\n\n");
			System.out.print("     ");

			for (int a=1;a<tabellone[i].length-1;a++)System.out.print(tabellone[i][a].getRis3Retro()+"     "+tabellone[i][a].getRis2Centro()+"     "+tabellone[i][a].getRis4Retro()+"          ");
			System.out.print("\n");
			
			for(int a=1;a<tabellone[i].length-1;a++) System.out.print("-------------------------------┴");
			
			
			
			
	}
		System.out.println();

		
	
	}


	
}
