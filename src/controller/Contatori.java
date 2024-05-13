package controller;

import progetto.Regno;
import progetto.Tabellone;

public class Contatori {
	
	///private Tabellone tabellone;

	public Contatori() {
		
	}

	public int contaInsetti(Tabellone tabellone) {
		int insetti=0;
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.INSE.toString()) insetti++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis2Retro()==Regno.INSE.toString()) insetti++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.INSE.toString()) insetti++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.INSE.toString()) insetti++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.INSE.toString()) insetti++;
				
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.INSE.toString()) insetti++;
		
		return insetti;
}
	
	public int contaFunghi(Tabellone tabellone) {
		int funghi=0;
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.FUNG.toString()) funghi++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.FUNG.toString()) funghi++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.FUNG.toString()) funghi++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.FUNG.toString()) funghi++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.FUNG.toString()) funghi++;
				
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.FUNG.toString()) funghi++;
		
		return funghi;
}
	public int contaVegetali(Tabellone tabellone) {
		int vegetali=0;
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.VEGE.toString()) vegetali++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.VEGE.toString()) vegetali++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.VEGE.toString()) vegetali++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.VEGE.toString()) vegetali++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.VEGE.toString()) vegetali++;
				
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.VEGE.toString()) vegetali++;
		
		return vegetali;
}
	
	public int contaAnimali(Tabellone tabellone) {
		int animali=0;
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.ANIM.toString()) animali++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.ANIM.toString()) animali++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.ANIM.toString()) animali++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.ANIM.toString()) animali++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.ANIM.toString()) animali++;
				
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.ANIM.toString()) animali++;
		
		return animali;
  }
	
	public int contaPiume(Tabellone tabellone) {
		int piuma=0;
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.PIUM.toString()) piuma++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.PIUM.toString()) piuma++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.PIUM.toString()) piuma++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.PIUM.toString()) piuma++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.PIUM.toString()) piuma++;
				
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.PIUM.toString()) piuma++;
		
		return piuma;
	}
	
	public int contaPozioni(Tabellone tabellone) {
		int pozione=0;
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.POZI.toString()) pozione++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.POZI.toString()) pozione++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.POZI.toString()) pozione++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.POZI.toString()) pozione++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.POZI.toString()) pozione++;
				
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.POZI.toString()) pozione++;
		
		return pozione;
	}
	
	public int contaPergamene(Tabellone tabellone) {
		int pergamena=0;
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.PERG.toString()) pergamena++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Retro()==Regno.PERG.toString()) pergamena++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis3Retro()==Regno.PERG.toString()) pergamena++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis4Retro()==Regno.PERG.toString()) pergamena++;
		
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis1Centro()==Regno.PERG.toString()) pergamena++;
				
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				if(tabellone.getCella(i,j).getRis2Centro()==Regno.PERG.toString()) pergamena++;
		
		return pergamena;
	}
}

