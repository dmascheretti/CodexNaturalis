package progetto;

import java.util.ArrayList;
import java.util.Collections;

//DEVO SOSTITUIRE TUTTO CON CARTA RISORSE OPPURE CREARE UNA SOLA CLASSE CARTA 

public class Mazzo_Risorse {
    private ArrayList<Carta> mazzo_risorse = new ArrayList<Carta>();
    private Carta carta_risorsa1=new Carta_risorsa(Regno.ANIMALE.toString(),Regno.FUNGHI.getRegno(),Regno.NULL.toString(),
    		Regno.INSETTI.toString(),1,Colore_carta.ROSSO,Regno.INSETTI.toString(),
    		Regno.VEGETALE.toString());
    
    private Carta carta_risorsa2=new Carta(Regno.ANIMALE.toString(),Regno.FUNGHI.getRegno(),Regno.NULL.toString(),
    		Regno.INSETTI.toString(),1,Colore_carta.ROSSO,Regno.INSETTI.toString(),
    		Regno.VEGETALE.toString());
    
    private Carta carta_risorsa3=new Carta(Regno.ANIMALE.toString(),Regno.FUNGHI.getRegno(),Regno.NULL.toString(),
    		Regno.INSETTI.toString(),1,Colore_carta.ROSSO,Regno.INSETTI.toString(),
    		Regno.VEGETALE.toString());
 // OPPURE private Carta_oro carta_oro1=new Carta_oro(Regno.ANIMALE,...= REGNO O STRSSSSSINGA??
 //private Carta_oro carta_oro2=new Carta_oro("Piuma","Lupo","","",3,"AAA");
 //private Carta_oro3 Carta_oro3=new Carta_oro3("Foglia",3);
 //private Carta_oro4 Carta_oro4=new Carta_oro4("Fiore",1);
 //private Carta_oro5 Carta_oro5=new Carta_oro5("Fiore",1);
// private Carta_oro carta_oro6=new Carta_oro("Lupo","","Fiore","Farfalla",2,"FFF");

    public Mazzo_Risorse() {
        mazzo_risorse.add(carta_risorsa1);
        mazzo_risorse.add(carta_risorsa2);
        mazzo_risorse.add(carta_risorsa3);
    }

    public void getMazzo() {
        for (int i = 0; i < mazzo_risorse.size(); i++)
            mazzo_risorse.get(i).getCarta();
    }

    public void mescolaMazzo() {
        Collections.shuffle(mazzo_risorse);
    }

    public void rimuoviCarta(Carta carta_risorse) {
        mazzo_risorse.remove(carta_risorse);
    }

    
    public Carta pescaCarta() {
        System.out.println("Hai pescato:\t\t");
        mazzo_risorse.get(0).getCarta();
        return mazzo_risorse.get(0);
    }

    public Carta cartaPescata() {
        return mazzo_risorse.get(0);
    }
  
}