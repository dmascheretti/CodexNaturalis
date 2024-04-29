package progetto;

import java.util.ArrayList;
import java.util.Collections;
 

public class Mazzo_iniziale {
	
    private ArrayList<Carta_iniziale> mazzo_iniziale = new ArrayList<Carta_iniziale>();

    private Carta_iniziale carta_iniziale1=new Carta_iniziale(Regno.VEGETALE.toString(),Regno.INSETTI.toString(),Regno.ANIMALE.toString(),Regno.FUNGHI.toString(),
    		"","","","",Regno.ANIMALE.toString(),Regno.INSETTI.toString(),1);
    private Carta_iniziale carta_iniziale2=new Carta_iniziale(Regno.INSETTI.toString(),Regno.ANIMALE.toString(),Regno.FUNGHI.toString(),Regno.VEGETALE.toString(),
    		"","","","",Regno.VEGETALE.toString(),Regno.FUNGHI.toString(),2);
    
    private Carta_iniziale carta_iniziale3=new Carta_iniziale(Regno.VEGETALE.toString(),Regno.ANIMALE.toString(),Regno.FUNGHI.toString(),Regno.INSETTI.toString(),
    		Regno.ANIMALE.toString(),"","",Regno.FUNGHI.toString(),Regno.FUNGHI.toString(),"",3);
    
    private Carta_iniziale carta_iniziale4=new Carta_iniziale(Regno.FUNGHI.toString(),Regno.VEGETALE.toString(),Regno.INSETTI.toString(),Regno.ANIMALE.toString(),
    		"",Regno.VEGETALE.toString(),Regno.INSETTI.toString(),"",Regno.INSETTI.toString(),"",4);
    
  

    public Mazzo_iniziale() {
        mazzo_iniziale.add(carta_iniziale1);
        mazzo_iniziale.add(carta_iniziale2);
        mazzo_iniziale.add(carta_iniziale3);
        mazzo_iniziale.add(carta_iniziale4);
        
    }

    public void getMazzo() {
        for (int i = 0; i < mazzo_iniziale.size(); i++)
            mazzo_iniziale.get(i).getCarta();
    }

    public void mescolaMazzo() {
        Collections.shuffle(mazzo_iniziale);
    }

    public Carta_iniziale pescaCarta() {
        System.out.println("Hai pescato:\t\t");
        mazzo_iniziale.get(0).getCarta();
        return mazzo_iniziale.get(0);
    }

    public Carta_iniziale cartaPescata() {
        return mazzo_iniziale.get(0);
    }
    
    public void rimuoviCarta() {
    	mazzo_iniziale.remove(0);
    }

}
 