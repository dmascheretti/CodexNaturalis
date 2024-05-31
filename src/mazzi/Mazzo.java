package mazzi;

import carte.Carta;
public abstract class Mazzo {


	
	public abstract void getMazzo();

    public abstract void mescolaMazzo();
    

    public abstract void rimuoviCarta();
    
    public abstract Carta pescaCarta();
    
    public abstract Carta getRetro();
    
    public abstract int getLenght();
    
    public abstract void printCarta(Carta carta);


}
