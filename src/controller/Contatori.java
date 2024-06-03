package controller;

import carte.Regno;
import gioco.Tabellone;

public class Contatori {

	private int l=51;



	public Contatori() {
		
	}
	
	/**
	* @param tabellone
	 * @return Total insects
	 */

	public int contaInsetti(Tabellone tabellone) {
		l=tabellone.getSize();
		int insetti=0;
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.INSE.toString()) insetti++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Retro()==Regno.INSE.toString()) insetti++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.INSE.toString()) insetti++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.INSE.toString()) insetti++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.INSE.toString()) insetti++;
				
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.INSE.toString()) insetti++;
		
		return insetti;
}
	
	
	/**
	 * @param tabellone
	 * @return total mushroom
	 */

	public int contaFunghi(Tabellone tabellone) {
		l=tabellone.getSize();
		int funghi=0;
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.FUNG.toString()) funghi++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Retro()==Regno.FUNG.toString()) funghi++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.FUNG.toString()) funghi++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.FUNG.toString()) funghi++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.FUNG.toString()) funghi++;
				
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.FUNG.toString()) funghi++;
		
		return funghi;
}
	
	/**
	 * @param tabellone
	 * @return The total number of plants
	 */

	public int contaVegetali(Tabellone tabellone) {
		l=tabellone.getSize();
		int vegetali=0;
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.VEGE.toString()) vegetali++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Retro()==Regno.VEGE.toString()) vegetali++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.VEGE.toString()) vegetali++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.VEGE.toString()) vegetali++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.VEGE.toString()) vegetali++;
				
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.VEGE.toString()) vegetali++;
		
		return vegetali;
}
	
	/**
	 * @param tabellone
	 * @return the total number of animal
	 */

	public int contaAnimali(Tabellone tabellone) {
		l=tabellone.getSize();
		int animali=0;
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.ANIM.toString()) animali++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Retro()==Regno.ANIM.toString()) animali++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.ANIM.toString()) animali++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.ANIM.toString()) animali++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.ANIM.toString()) animali++;
				
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.ANIM.toString()) animali++;
		
		return animali;
}
	
	/**
	 * @param tabellone
	 * @return Total feathers
	 */

	public int contaPiume(Tabellone tabellone) {
		l=tabellone.getSize();
		int piume=0;
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.PIUM.toString()) piume++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Retro()==Regno.PIUM.toString()) piume++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.PIUM.toString()) piume++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.PIUM.toString()) piume++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.PIUM.toString()) piume++;
				
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.PIUM.toString()) piume++;
		
		return piume;
}
	
	/**
	 * @param tabellone
	 * @return the total number of inks
	 */

	public int contaInchiostro(Tabellone tabellone) {
		l=tabellone.getSize();
		int inchiostro=0;
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.INCH.toString()) inchiostro++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Retro()==Regno.INCH.toString()) inchiostro++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.INCH.toString()) inchiostro++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.INCH.toString()) inchiostro++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.INCH.toString()) inchiostro++;
				
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.INCH.toString()) inchiostro++;
		
		return inchiostro;
}
	
	/**
	 * @param tabellone
	 * @return The total number of scrolls
	 */

	public int contaPergamene(Tabellone tabellone) {
		l=tabellone.getSize();
		int pergamene=0;
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.PERG.toString()) pergamene++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Retro()==Regno.PERG.toString()) pergamene++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.PERG.toString()) pergamene++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.PERG.toString()) pergamene++;
		
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.PERG.toString()) pergamene++;
				
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.PERG.toString()) pergamene++;
		
		return pergamene;
}
	
}

