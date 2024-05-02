package mazzi;

import java.util.ArrayList;
import java.util.Collections;

import carte.Carta_iniziale;
import progetto.Regno;
 

public class Mazzo_iniziale {
	
    private ArrayList<Carta_iniziale> mazzo_iniziale = new ArrayList<Carta_iniziale>();

    private Carta_iniziale carta_iniziale1=new Carta_iniziale(Regno.VEGE.toString(),Regno.INSE.toString(),Regno.ANIM.toString(),Regno.FUNG.toString(),
    		"","","","",Regno.ANIM.toString(),Regno.INSE.toString(),1);
    private Carta_iniziale carta_iniziale2=new Carta_iniziale(Regno.INSE.toString(),Regno.ANIM.toString(),Regno.FUNG.toString(),Regno.VEGE.toString(),
    		"","","","",Regno.VEGE.toString(),Regno.FUNG.toString(),2);
    
    private Carta_iniziale carta_iniziale3=new Carta_iniziale(Regno.VEGE.toString(),Regno.ANIM.toString(),Regno.FUNG.toString(),Regno.INSE.toString(),
    		Regno.ANIM.toString(),"","",Regno.FUNG.toString(),Regno.FUNG.toString(),"",3);
    
    private Carta_iniziale carta_iniziale4=new Carta_iniziale(Regno.FUNG.toString(),Regno.VEGE.toString(),Regno.INSE.toString(),Regno.ANIM.toString(),
    		"",Regno.VEGE.toString(),Regno.INSE.toString(),"",Regno.INSE.toString(),"",4);
    
  

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

    public Carta_iniziale stampaCartaPescata() {
        System.out.println("Hai pescato:\t\t");
        mazzo_iniziale.get(0).getCarta();
        return mazzo_iniziale.get(0);
    }

    public Carta_iniziale pescaCarta() {
        return mazzo_iniziale.get(0);
    }
    
    public void rimuoviCarta() {
    	mazzo_iniziale.remove(0);
    }

}
 