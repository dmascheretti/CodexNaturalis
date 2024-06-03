package mazzi;

import java.util.ArrayList;
import java.util.Collections;

import carte.Carta;
import carte.Carta_iniziale;
import carte.Regno;
 

public class Mazzo_iniziale extends Mazzo {
	
    private ArrayList<Carta_iniziale> mazzo_iniziale = new ArrayList<Carta_iniziale>();

    private Carta_iniziale carta_iniziale1=new Carta_iniziale(Regno.VEGE.toString(),Regno.INSE.toString(),Regno.ANIM.toString(),Regno.FUNG.toString(),
    		"    ","    ","    ","    ",Regno.ANIM.toString(),Regno.INSE.toString(),1);
    
    private Carta_iniziale carta_iniziale2=new Carta_iniziale(Regno.INSE.toString(),Regno.ANIM.toString(),Regno.FUNG.toString(),Regno.VEGE.toString(),
    		"    ","    ","    ","    ",Regno.VEGE.toString(),Regno.FUNG.toString(),2);
    
    private Carta_iniziale carta_iniziale3=new Carta_iniziale(Regno.VEGE.toString(),Regno.ANIM.toString(),Regno.FUNG.toString(),Regno.INSE.toString(),
    		Regno.ANIM.toString(),"    ","    ",Regno.FUNG.toString(),Regno.FUNG.toString(),"    ",3);
    
    private Carta_iniziale carta_iniziale4=new Carta_iniziale(Regno.FUNG.toString(),Regno.VEGE.toString(),Regno.INSE.toString(),Regno.ANIM.toString(),
    		"    ",Regno.VEGE.toString(),Regno.INSE.toString(),"    ",Regno.INSE.toString(),"    ",4);
    
    private Carta_iniziale carta_iniziale5=new Carta_iniziale(Regno.FUNG.toString(),Regno.ANIM.toString(),Regno.INSE.toString(),Regno.VEGE.toString(),
    		"    ","    ","    ","    ",Regno.ANIM.toString(),Regno.VEGE.toString(),5);
    
    private Carta_iniziale carta_iniziale6=new Carta_iniziale(Regno.INSE.toString(),Regno.ANIM.toString(),Regno.FUNG.toString(),Regno.VEGE.toString(),
    		"    ","    ","    ","    ",Regno.VEGE.toString(),Regno.INSE.toString(),6);
    
    
  

    public Mazzo_iniziale() {
        mazzo_iniziale.add(carta_iniziale1);
        mazzo_iniziale.add(carta_iniziale2);
        mazzo_iniziale.add(carta_iniziale3);
        mazzo_iniziale.add(carta_iniziale4);
        mazzo_iniziale.add(carta_iniziale5);
        mazzo_iniziale.add(carta_iniziale6);
        
        
        
    }

    
   
   
    /**
     * get deck
     */
    public void getMazzo() {
        for (int i = 0; i < mazzo_iniziale.size(); i++)
            mazzo_iniziale.get(i).getCarta();
    }
    

    /**
     * shuffle deck 
     */
    public void mescolaMazzo() {
        Collections.shuffle(mazzo_iniziale);
    }


    /**
     * @return the first card of the deck
     */
    public Carta_iniziale pescaCarta() {
        return mazzo_iniziale.get(0);
    }
    
    /**
     * remove the drawn card
     */
    public void rimuoviCarta() {
    	mazzo_iniziale.remove(0);
    }




	@Override
	public Carta getRetro() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public int getLenght() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public void printCarta(Carta carta) {
		// TODO Auto-generated method stub
		
	}

    


}
 