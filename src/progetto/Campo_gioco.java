package progetto;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import carte.Carta_obiettivo;
import carte.Carta_oro;
import carte.Carta_risorsa;
import mazzi.Mazzo_obiettivo;
import mazzi.Mazzo_oro;
import mazzi.Mazzo_risorse;
public class Campo_gioco {


	private ArrayList<Carta_oro> campo_oro;
	private ArrayList<Carta_risorsa> campo_risorsa;
	private ArrayList <Carta_obiettivo> carte_obiettivo;
	public Campo_gioco() {
		this.campo_oro=new ArrayList<Carta_oro>();
		this.campo_risorsa=new ArrayList<Carta_risorsa>();
		this.carte_obiettivo=new ArrayList<Carta_obiettivo>();
	}
	public void riempi(Mazzo_oro mazzo_oro, Mazzo_risorse mazzo_risorse, Mazzo_obiettivo mazzo_obiettivo) {
		for(int l=0;l<2;l++) {
			campo_oro.add((Carta_oro) mazzo_oro.pescaCarta());
			mazzo_oro.rimuoviCarta();

			campo_risorsa.add((Carta_risorsa) mazzo_risorse.pescaCarta());
			mazzo_risorse.rimuoviCarta();

			carte_obiettivo.add((Carta_obiettivo)mazzo_obiettivo.pescaCarta());
			mazzo_obiettivo.rimuoviCarta();
		}	
	}

	public void stampaCartaCampo() throws InterruptedException {

		System.out.println("\n\n\n\n"); 
		System.out.println("\n\n-----CARTE SUL CAMPO ORO-----");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("\nCARTA 1                 CARTA 2");
		for(int d=0;d<campo_oro.size();d++) System.out.print("-----------------------┬");
		System.out.print("\n\n");
		for(int d=0;d<campo_oro.size();d++)System.out.print("PUNTI:"+campo_oro.get(d).getPunteggio()+"                  ");
		System.out.println("\n\n");
		for(int d=0;d<campo_oro.size();d++)System.out.print("COLORE:"+campo_oro.get(d).getColore()+"              ");
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
		System.out.println();
		for(int d=0;d<campo_oro.size();d++)System.out.print("RISORSE NECESSARIE CARTA "+(d+1)+" : "+campo_oro.get(d).getRisNec()+"\n");

		System.out.println("\n\n");

		TimeUnit.SECONDS.sleep(1);

		System.out.println("\n\n-----CARTE SUL CAMPO RISORSA-----\n");

		TimeUnit.SECONDS.sleep(1);

		System.out.println("\nCARTA 1                 CARTA 2");

		for(int d=0;d<campo_risorsa.size();d++) System.out.print("-----------------------┬");
		System.out.print("\n\n");
		for(int d=0;d<campo_risorsa.size();d++)System.out.print("PUNTI:"+campo_risorsa.get(d).getPunteggio()+"                  ");
		System.out.println("\n\n");
		for(int d=0;d<campo_risorsa.size();d++)System.out.print("COLORE:"+campo_oro.get(d).getColore()+"              ");
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


	public ArrayList<Carta_oro> returnOro(){
		return campo_oro;
	}

	public ArrayList<Carta_risorsa> returnRisorse(){
		return campo_risorsa;
	}

	public ArrayList<Carta_obiettivo> returnObiettivo(){
		return carte_obiettivo;
	}



}
