package progetto;

import java.util.ArrayList;
import java.util.Collections;


public class Mazzo_Risorse extends Mazzo{
    private ArrayList<Carta_risorsa> mazzo_risorse = new ArrayList<Carta_risorsa>();
   /* private Carta_risorsa carta_risorsa1=new Carta_risorsa(Regno.ANIMALE.toString(),Regno.FUNGHI.toString(),Regno.NULL.toString(),
    		Regno.INSETTI.toString(),1,Colore_carta.ROSSO,Regno.INSETTI.toString(),Regno.INSETTI.toString(),01);
    
    private Carta_risorsa carta_risorsa2=new Carta_risorsa(Regno.ANIMALE.toString(),Regno.FUNGHI.getRegno(),Regno.NULL.toString(),
    		Regno.INSETTI.toString(),1,Colore_carta.ROSSO,Regno.INSETTI.toString(),
    		Regno.VEGETALE.toString());
    
    private Carta_risorsa carta_risorsa3=new Carta_risorsa(Regno.ANIMALE.toString(),Regno.FUNGHI.getRegno(),Regno.NULL.toString(),
    		Regno.INSETTI.toString(),1,Colore_carta.ROSSO,Regno.INSETTI.toString(),
    		Regno.VEGETALE.toString());

*/

    //DA RIVEDERE IL COSTRUTTORE (RETRO)
    
    private Carta_risorsa carta_risorsa30=new Carta_risorsa(Regno.ANIMALE.toString(),"non giocabile",Regno.ANIMALE.toString(),Regno.NULL.toString(),
    		0,Colore_carta.BLU,Regno.ANIMALE.toString(),30);

    private Carta_risorsa carta_risorsa31=new Carta_risorsa(Regno.FUNGHI.toString(),Regno.FUNGHI.toString(),"non giocabile",Regno.NULL.toString(),0,
    		Colore_carta.ROSSO,Regno.FUNGHI.toString(),31);

    private Carta_risorsa carta_risorsa32=new Carta_risorsa("non giocabile",Regno.FUNGHI.toString(),Regno.NULL.toString(),Regno.FUNGHI.toString(),0,
    		Colore_carta.ROSSO,Regno.FUNGHI.toString(),Regno.FUNGHI.toString(),32);

    private Carta_risorsa carta_risorsa33=new Carta_risorsa(Regno.PERGAMENA.toString(),Regno.INSETTI.toString(),"non giocabile",
    		Regno.FUNGHI.toString(),0,Colore_carta.VIOLA,Regno.INSETTI.toString(),Regno.INSETTI.toString(),33);

    private Carta_risorsa carta_risorsa34=new Carta_risorsa(Regno.NULL.toString(),Regno.INSETTI.toString(),"non giocabile",Regno.INSETTI.toString(),
    		0,Colore_carta.VIOLA,Regno.INSETTI.toString(),Regno.INSETTI.toString(),34);

    private Carta_risorsa carta_risorsa35=new Carta_risorsa("non giocabile",Regno.NULL.toString(),Regno.INSETTI.toString(),Regno.INSETTI.toString(),
    		0,Colore_carta.VIOLA,Regno.INSETTI.toString(),Regno.INSETTI.toString(),35);

    private Carta_risorsa carta_risorsa36=new Carta_risorsa(Regno.INSETTI.toString(),Regno.VEGETALE.toString(),Regno.POZIONE.toString(),
    		"non giocabile",0,Colore_carta.VIOLA,Regno.INSETTI.toString(),Regno.INSETTI.toString(),36);

    private Carta_risorsa carta_risorsa37=new Carta_risorsa(Regno.PIUMA.toString(),"non giocabile",Regno.ANIMALE.toString(),Regno.FUNGHI.toString(),
    		0,Colore_carta.BLU,Regno.ANIMALE.toString(),Regno.ANIMALE.toString(),37);

    private Carta_risorsa carta_risorsa38=new Carta_risorsa(Regno.POZIONE.toString(),Regno.FUNGHI.toString(),"non giocabile",
    		Regno.ANIMALE.toString(),0,Colore_carta.ROSSO,Regno.FUNGHI.toString(),Regno.FUNGHI.toString(),38);

    private Carta_risorsa carta_risorsa39=new Carta_risorsa(Regno.NULL.toString(),"non giocabile",Regno.VEGETALE.toString(),
    		Regno.VEGETALE.toString(),0,Colore_carta.VERDE,Regno.VEGETALE.toString(),Regno.VEGETALE.toString(),39);

    private Carta_risorsa carta_risorsa40=new Carta_risorsa(Regno.ANIMALE.toString(),Regno.ANIMALE.toString(),Regno.NULL.toString(),"non giocabile",
    		0,Colore_carta.BLU,Regno.ANIMALE.toString(),Regno.ANIMALE.toString(),40);

    private Carta_risorsa carta_risorsa41=new Carta_risorsa(Regno.INSETTI.toString(),Regno.INSETTI.toString(),Regno.NULL.toString(),"non giocabile",
    		0,Colore_carta.VIOLA,Regno.INSETTI.toString(),Regno.INSETTI.toString(),41);

    private Carta_risorsa carta_risorsa42=new Carta_risorsa(Regno.VEGETALE.toString(),Regno.NULL.toString(),Regno.VEGETALE.toString(),
    		"non giocabile",0,Colore_carta.VERDE,Regno.VEGETALE.toString(),Regno.VEGETALE.toString(),42);

    private Carta_risorsa carta_risorsa43=new Carta_risorsa("non giocabile",Regno.PIUMA.toString(),Regno.ANIMALE.toString(),
    		Regno.INSETTI.toString(),0,Colore_carta.VIOLA,Regno.INSETTI.toString(),Regno.INSETTI.toString(),43);

    private Carta_risorsa carta_risorsa44=new Carta_risorsa(Regno.FUNGHI.toString(),Regno.VEGETALE.toString(),"non giocabile",
    		Regno.POZIONE.toString(),0,Colore_carta.VERDE,Regno.VEGETALE.toString(),Regno.VEGETALE.toString(),44);

    private Carta_risorsa carta_risorsa45=new Carta_risorsa(Regno.NULL.toString(),Regno.FUNGHI.toString(),Regno.NULL.toString(),"non giocabile",1,
    		Colore_carta.ROSSO,Regno.FUNGHI.toString(),Regno.FUNGHI.toString(),45);

    private Carta_risorsa carta_risorsa46=new Carta_risorsa(Regno.VEGETALE.toString(),Regno.VEGETALE.toString(),"non giocabile",
    		Regno.NULL.toString(),0,Colore_carta.VERDE,Regno.VEGETALE.toString(),Regno.VEGETALE.toString(),46);

    private Carta_risorsa carta_risorsa47=new Carta_risorsa(Regno.NULL.toString(),Regno.ANIMALE.toString(),"non giocabile",Regno.ANIMALE.toString(),
    		0,Colore_carta.BLU,Regno.ANIMALE.toString(),Regno.ANIMALE.toString(),47);

    private Carta_risorsa carta_risorsa48=new Carta_risorsa("non giocabile",Regno.VEGETALE.toString(),Regno.NULL.toString(),
    		Regno.VEGETALE.toString(),0,Colore_carta.VERDE,Regno.VEGETALE.toString(),Regno.VEGETALE.toString(),48);

    private Carta_risorsa carta_risorsa49=new Carta_risorsa("non giocabile",Regno.INSETTI.toString(),Regno.PIUMA.toString(),
    		Regno.VEGETALE.toString(),0,Colore_carta.VERDE,Regno.VEGETALE.toString(),Regno.VEGETALE.toString(),49);

    private Carta_risorsa carta_risorsa50=new Carta_risorsa("non giocabile",Regno.NULL.toString(),Regno.ANIMALE.toString(),Regno.ANIMALE.toString(),
    		0,Colore_carta.BLU,Regno.ANIMALE.toString(),Regno.ANIMALE.toString(),50);

    private Carta_risorsa carta_risorsa51=new Carta_risorsa(Regno.NULL.toString(),"non giocabile",Regno.FUNGHI.toString(),Regno.FUNGHI.toString(),0,
    		Colore_carta.ROSSO,Regno.FUNGHI.toString(),Regno.FUNGHI.toString(),51);

    private Carta_risorsa carta_risorsa52=new Carta_risorsa("non giocabile",Regno.NULL.toString(),Regno.ANIMALE.toString(),Regno.NULL.toString(),1,
    		Colore_carta.BLU,Regno.ANIMALE.toString(),Regno.ANIMALE.toString(),52);

    private Carta_risorsa carta_risorsa53=new Carta_risorsa(Regno.INSETTI.toString(),"non giocabile",Regno.INSETTI.toString(),Regno.NULL.toString(),
    		0,Colore_carta.VIOLA,Regno.INSETTI.toString(),Regno.INSETTI.toString(),53);

    private Carta_risorsa carta_risorsa54=new Carta_risorsa("non giocabile",Regno.INSETTI.toString(),Regno.POZIONE.toString(),
    		Regno.ANIMALE.toString(),0,Colore_carta.BLU,Regno.ANIMALE.toString(),Regno.ANIMALE.toString(),54);
    
    
    public Mazzo_Risorse() {
        //Mazzo_Risorse.add(carta_risorsa1);
        //mazzo_risorse.add(carta_risorsa2);
        //mazzo_risorse.add(carta_risorsa3);
    	
    	
    	mazzo_risorse.add(carta_risorsa30);
    	mazzo_risorse.add(carta_risorsa31);
    	mazzo_risorse.add(carta_risorsa32);
    	mazzo_risorse.add(carta_risorsa33);
    	mazzo_risorse.add(carta_risorsa34);
    	mazzo_risorse.add(carta_risorsa35);
    	mazzo_risorse.add(carta_risorsa36);
    	mazzo_risorse.add(carta_risorsa37);
    	mazzo_risorse.add(carta_risorsa38);
    	mazzo_risorse.add(carta_risorsa39);
    	mazzo_risorse.add(carta_risorsa40);
    	mazzo_risorse.add(carta_risorsa41);
    	mazzo_risorse.add(carta_risorsa42);
    	mazzo_risorse.add(carta_risorsa43);
    	mazzo_risorse.add(carta_risorsa44);
    	mazzo_risorse.add(carta_risorsa45);
    	mazzo_risorse.add(carta_risorsa46);
    	mazzo_risorse.add(carta_risorsa47);
    	mazzo_risorse.add(carta_risorsa48);
    	mazzo_risorse.add(carta_risorsa49);
    	mazzo_risorse.add(carta_risorsa50);
    	mazzo_risorse.add(carta_risorsa51);
    	mazzo_risorse.add(carta_risorsa52);
    	mazzo_risorse.add(carta_risorsa53);
    	mazzo_risorse.add(carta_risorsa54);
    }

  

	public void getMazzo() {
        for (int i = 0; i < mazzo_risorse.size(); i++)
            mazzo_risorse.get(i).getCarta();
    }

    public void mescolaMazzo() {
        Collections.shuffle(mazzo_risorse);
    }

    public void rimuoviCarta(Carta_risorsa carta_risorse) {
        mazzo_risorse.remove(carta_risorse);
    }

    
    public Carta_risorsa pescaCarta() {
        System.out.println("Hai pescato:\t\t");
        mazzo_risorse.get(0).getCarta();
        return mazzo_risorse.get(0);
    }

    public Carta_risorsa cartaPescata() {
        return mazzo_risorse.get(0);
    }
  
}