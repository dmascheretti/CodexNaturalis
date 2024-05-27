package progetto;

import java.util.ArrayList;

import carte.Carta_oro;
import carte.Carta_risorsa;

public class Stampa {

	
	
	
public void stampaCartaCampo(ArrayList <Carta_oro> campo_oro, ArrayList <Carta_risorsa> campo_risorsa) {
		
		System.out.println("\n\n| | | | | | | | | | | | | | | | | | | \n\n\n");
		System.out.println("\nCARTE SUL CAMPO ORO");
		
		for(int d=0;d<campo_oro.size();d++) System.out.print("-----------------------┬");
		System.out.print("\n\n");
		for(int d=0;d<campo_oro.size();d++)System.out.print("PUNTI:"+campo_oro.get(d).getPunteggio()+"                  ");
		System.out.println("\n\n");
		for(int d=0;d<campo_oro.size();d++)System.out.print(campo_oro.get(d).getID()+"                       ");
		System.out.println("\n\n");
		for(int d=0;d<campo_oro.size();d++)System.out.print(campo_oro.get(d).getRis1Fronte()+"\t    \t"+campo_oro.get(d).getRis2Fronte()+"\t  ");
		System.out.println("\n\n");
		for(int d=0;d<campo_oro.size();d++)System.out.print(campo_oro.get(d).getRis3Fronte()+"\t    \t"+campo_oro.get(d).getRis4Fronte()+"\t  ");
		System.out.println("\n");
		for(int d=0;d<campo_oro.size();d++) System.out.print("------------------------");
		System.out.print("\n\n");
		for(int d=0;d<campo_oro.size();d++)System.out.print("    \t"+campo_oro.get(d).getRis1Centro()+"\t      ");
		System.out.println("\n\n");
		for(int d=0;d<campo_oro.size();d++)System.out.print("    \t    \t    \t  ");
		System.out.println("\n");
		for(int d=0;d<campo_oro.size();d++) System.out.print("-----------------------┴");
			
			
			
		System.out.println("\nCARTE SUL CAMPO RISORSA\n");

			
			for(int d=0;d<campo_risorsa.size();d++) System.out.print("-----------------------┬");
			System.out.print("\n\n");
			for(int d=0;d<campo_risorsa.size();d++)System.out.print("PUNTI:"+campo_risorsa.get(d).getPunteggio()+"                  ");
			System.out.println("\n\n");
			for(int d=0;d<campo_risorsa.size();d++)System.out.print(campo_risorsa.get(d).getID()+"                       ");
			System.out.println("\n\n");
			for(int d=0;d<campo_risorsa.size();d++)System.out.print(campo_risorsa.get(d).getRis1Fronte()+"\t    \t"+campo_oro.get(d).getRis2Fronte()+"\t  ");
			System.out.println("\n\n");
			for(int d=0;d<campo_risorsa.size();d++)System.out.print(campo_risorsa.get(d).getRis3Fronte()+"\t    \t"+campo_risorsa.get(d).getRis4Fronte()+"\t  ");
			System.out.println("\n");
			for(int d=0;d<campo_risorsa.size();d++) System.out.print("------------------------");
			System.out.print("\n\n");
			for(int d=0;d<campo_risorsa.size();d++)System.out.print("    \t"+campo_risorsa.get(d).getRis1Centro()+"\t      ");
			System.out.println("\n\n");
			for(int d=0;d<campo_risorsa.size();d++)System.out.print("    \t    \t    \t  ");
			System.out.println("\n");
			for(int d=0;d<campo_oro.size();d++) System.out.print("-----------------------┴");
			
		
		
		
	}
}
