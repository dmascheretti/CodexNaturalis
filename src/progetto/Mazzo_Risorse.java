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
    private Carta_risorsa carta_risorsa1= new Carta_risorsa("non giocabile", Regno.ANIMALE.toString(), Regno.NULL.toString(), Regno.NULL.toString(),
    		1, Colore_carta.VIOLA, Regno.ANIMALE.toString(), Regno.NULL.toString(), 1);
    private Carta_risorsa carta_risorsa2= new Carta_risorsa(Regno.NULL.toString(), Regno.NULL.toString(), "non giocabile", Regno.ANIMALE.toString(),
    		1, Colore_carta.VIOLA, Regno.ANIMALE.toString(), Regno.NULL.toString(), 1);
    
    public Mazzo_Risorse() {
        //Mazzo_Risorse.add(carta_risorsa1);
        //mazzo_risorse.add(carta_risorsa2);
        //mazzo_risorse.add(carta_risorsa3);
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