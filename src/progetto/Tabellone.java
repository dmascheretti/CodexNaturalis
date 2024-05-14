package progetto;

import carte.Carta;
import carte.Carta_oro;
import carte.Carta_iniziale;

public class Tabellone {
	
	
    private final int x=20;
    private final int y=20;
    private Carta_iniziale carta_nulla=new Carta_iniziale("    ", "    ", "    ", "    ",
    		 "    ", "    ","    ","    ","    ","    ", 00);
    
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
	
	/*
	public Boolean checkCorner(int x, int j) {
		if(tabellone[x+1][j+1].getID()!=00 || tabellone[x-1][j-1].getID()!=00 || 
				tabellone[x+1][j-1].getID()!=00 || tabellone[x-1][j+1].getID()!=00){
				
				if(tabellone[x+1][j+1].getRis1Fronte()!="████"|| tabellone[x+1][j-1].getRis3Fronte()!="████" ||
				tabellone[x-1][j-1].getRis4Fronte()!="████" || tabellone[x-1][j+1].getRis1Fronte()!="████") 
				return true;
		}
		return false;
		
		
	}
	
	*/
	public void removeCorner(int i, int j) {
		tabellone[i+1][j+1].setRis1Retro();
		tabellone[i+1][j-1].setRis2Retro();
		tabellone[i-1][j+1].setRis3Retro();
		tabellone[i-1][j-1].setRis4Retro();
		
		
	}
/*
	public void getTabellone() {
		for(int i=0;i<tabellone.length;i++) {	
			System.out.println();
			for(int a=0;a<tabellone.length;a++) System.out.print("-----------------------┬");
		
			System.out.print("\n\n");
			
			for(int a=0;a<tabellone[i].length;a++) System.out.print("("+i+","+a+")\t\t\t            ");
			
			System.out.print("\n\n");
			
			for(int a=0;a<tabellone[i].length;a++) {
				if(tabellone[i][a].getID()==00) System.out.print("  \t\t");
				else System.out.print(tabellone[i][a].getID()+"\t\t");
			}
				
			System.out.println("\n\n  ");
			for(int a=0;a<tabellone[i].length;a++)System.out.print(tabellone[i][a].getRis1Fronte()+" "+tabellone[i][a].getRis2Fronte()+"  \t\t");
			System.out.println("\n\n  ");
			for(int a=0;a<tabellone[i].length;a++)System.out.print(tabellone[i][a].getRis3Fronte()+" "+tabellone[i][a].getRis4Fronte()+" \t\t");
			System.out.println("\n\n  ");
			for (int a=0;a<tabellone[i].length;a++)System.out.print(tabellone[i][a].getRis1Centro()+"\t\t\t");
			System.out.print("\n\n");
			
			for(int a=0;a<tabellone[i].length;a++) System.out.print("-----------------------┴");
			
			
			
		
			//}
			
			
			
	}
		System.out.println();

		
	
			}
	
	*/
	/*
	public int contaInsetti() {
		int insetti=0;
		for(int i=0;i<20;i++)
			for(int j=0;j<tabellone.length;j++)
				if(tabellone[i][j].getRis1Retro()==Regno.INSE.toString()) insetti++;
		
		for(int i=0;i<tabellone.length;i++)
			for(int j=0;j<tabellone[i].length;j++)
				if(tabellone[i][j].getRis2Retro()==Regno.INSE.toString()) insetti++;
		
		for(int i=0;i<tabellone.length;i++)
			for(int j=0;j<tabellone[i].length;j++)
				if(tabellone[i][j].getRis3Retro()==Regno.INSE.toString()) insetti++;
		
		for(int i=0;i<tabellone.length;i++)
			for(int j=0;j<tabellone[i].length;j++)
				if(tabellone[i][j].getRis4Retro()==Regno.INSE.toString()) insetti++;
		
		for(int i=0;i<tabellone.length;i++)
			for(int j=0;j<tabellone[i].length;j++)
				if(tabellone[i][j].getRis1Centro()==Regno.INSE.toString()) insetti++;
				
			for(int i=0;i<tabellone.length;i++)
			for(int j=0;j<tabellone[i].length;j++)
				if(tabellone[i][j].getRis2Centro()==Regno.INSE.toString()) insetti++;
		
		return insetti;
}
*/
	
	public void getTabelloneX() {
		for(int i=0;i<tabellone.length;i++) {	
			System.out.println();
			for(int a=0;a<tabellone.length;a++) System.out.print("-------------------------------┬");
		
			System.out.print("\n");
			
			for(int a=0;a<tabellone[i].length;a++) System.out.print("("+i+","+a+")			      	");
			
			System.out.print("\n              ");
			/*
			for(int a=0;a<tabellone[i].length;a++) {
				if(tabellone[i][a].getID()==0) System.out.print("                                ");
				else System.out.print("ID: "+tabellone[i][a].getID()+"                          ");
			}
			*/
				
			//System.out.println("\n\n");
			System.out.print("\n     ");
			
			//for (int a=0;a<tabellone[i].length;a++)System.out.print(tabellone[i][a].getColore());
			//System.out.println("\n\n");

			for (int a=0;a<tabellone[i].length;a++)System.out.print(tabellone[i][a].getRis1Retro()+"     "+tabellone[i][a].getRis1Centro()+"     "+tabellone[i][a].getRis2Retro()+"          ");
			System.out.println("\n\n");
			System.out.print("     ");
			for (int a=0;a<tabellone[i].length;a++)System.out.print(tabellone[i][a].getRis3Retro()+"     "+tabellone[i][a].getRis2Centro()+"     "+tabellone[i][a].getRis4Retro()+"          ");
			System.out.print("\n");
			
			for(int a=0;a<tabellone[i].length;a++) System.out.print("-------------------------------┴");
			
			
			
		
			//}
			
			
			
	}
		System.out.println();

		
	
			}
	
	/*
	
	public int checkEmpty(int x, int y) {
		return tabellone[x][y].getID();
	}

	public Boolean checkNext(int x, int j) {
		if((tabellone[x+1][j].getID()==00) && (tabellone[x-1][j].getID()==00) &&
				(tabellone[x][j+1].getID()==00) && (tabellone[x][j-1].getID()==00)) return true;
		
		else return false;
		
		
	}
	*/
	
}
