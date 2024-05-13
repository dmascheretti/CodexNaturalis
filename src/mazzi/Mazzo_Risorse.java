package mazzi;

import java.util.ArrayList;
import java.util.Collections;

import carte.Carta_risorsa;
import progetto.Colore_carta;
import progetto.Regno;


public class Mazzo_Risorse extends Mazzo{
    private ArrayList<Carta_risorsa> mazzo_risorse = new ArrayList<Carta_risorsa>();
   
    private Carta_risorsa carta_risorsa21=new Carta_risorsa(Regno.NULL.toString(), "████", Regno.NULL.toString(), Regno.NULL.toString(),
    		1, Colore_carta.VIOLA, Regno.ANIM.toString(),21);
    
    private Carta_risorsa carta_risorsa22=new Carta_risorsa(Regno.NULL.toString(), Regno.NULL.toString(), "████", Regno.ANIM.toString(),
    		1, Colore_carta.VIOLA, Regno.ANIM.toString(), 22);
    
    private Carta_risorsa carta_risorsa23=new Carta_risorsa("████", Regno.ANIM.toString(), Regno.NULL.toString(), Regno.NULL.toString(),
    		1, Colore_carta.VIOLA, Regno.ANIM.toString(), 23);
    
    private Carta_risorsa carta_risorsa24=new Carta_risorsa(Regno.NULL.toString(), Regno.NULL.toString(), "████", Regno.ANIM.toString(),
    		1, Colore_carta.VERDE,Regno.VEGE.toString() ,22);
    
    private Carta_risorsa carta_risorsa25=new Carta_risorsa(Regno.NULL.toString(), "████", Regno.NULL.toString(), Regno.ANIM.toString(),
    		1, Colore_carta.BLU, Regno.ANIM.toString(), 25);
    
    private Carta_risorsa carta_risorsa26=new Carta_risorsa(Regno.FUNG.toString(), "████", Regno.NULL.toString(), Regno.NULL.toString(),
    		1, Colore_carta.ROSSO, Regno.FUNG.toString(), 26);
    
    private Carta_risorsa carta_risorsa27=new Carta_risorsa(Regno.NULL.toString(), Regno.NULL.toString(), Regno.VEGE.toString(), "████",
    		1, Colore_carta.VERDE, Regno.VEGE.toString(), 27);
    
    private Carta_risorsa carta_risorsa28=new Carta_risorsa("████", Regno.VEGE.toString(), Regno.NULL.toString(), Regno.NULL.toString(),
    		1, Colore_carta.VERDE, Regno.VEGE.toString(), 28);
    
    private Carta_risorsa carta_risorsa29=new Carta_risorsa("████", Regno.NULL.toString(), Regno.FUNG.toString(), Regno.NULL.toString(),
    		1, Colore_carta.ROSSO, Regno.FUNG.toString(), 29);
    
    private Carta_risorsa carta_risorsa30=new Carta_risorsa(Regno.ANIM.toString(),"████",Regno.ANIM.toString(),Regno.NULL.toString(),
    		0,Colore_carta.BLU,Regno.ANIM.toString(),30);

    private Carta_risorsa carta_risorsa31=new Carta_risorsa(Regno.FUNG.toString(),Regno.FUNG.toString(),"████",Regno.NULL.toString(),0,
    		Colore_carta.ROSSO,Regno.FUNG.toString(),31);

    private Carta_risorsa carta_risorsa32=new Carta_risorsa("████",Regno.FUNG.toString(),Regno.NULL.toString(),Regno.FUNG.toString(),0,
    		Colore_carta.ROSSO,Regno.FUNG.toString(),32);

    private Carta_risorsa carta_risorsa33=new Carta_risorsa(Regno.PERG.toString(),Regno.INSE.toString(),"████",
    		Regno.FUNG.toString(),0,Colore_carta.VIOLA,Regno.INSE.toString(),33);

    private Carta_risorsa carta_risorsa34=new Carta_risorsa(Regno.NULL.toString(),Regno.INSE.toString(),"████",Regno.INSE.toString(),
    		0,Colore_carta.VIOLA,Regno.INSE.toString(),34);

    private Carta_risorsa carta_risorsa35=new Carta_risorsa("████",Regno.NULL.toString(),Regno.INSE.toString(),Regno.INSE.toString(),
    		0,Colore_carta.VIOLA,Regno.INSE.toString(),35);

    private Carta_risorsa carta_risorsa36=new Carta_risorsa(Regno.INSE.toString(),Regno.VEGE.toString(),Regno.POZI.toString(),
    		"████",0,Colore_carta.VIOLA,Regno.INSE.toString(),36);

    private Carta_risorsa carta_risorsa37=new Carta_risorsa(Regno.PIUM.toString(),"████",Regno.ANIM.toString(),Regno.FUNG.toString(),
    		0,Colore_carta.BLU,Regno.ANIM.toString(),37);

    private Carta_risorsa carta_risorsa38=new Carta_risorsa(Regno.POZI.toString(),Regno.FUNG.toString(),"████",
    		Regno.ANIM.toString(),0,Colore_carta.ROSSO,Regno.FUNG.toString(),38);

    private Carta_risorsa carta_risorsa39=new Carta_risorsa(Regno.NULL.toString(),"████",Regno.VEGE.toString(),
    		Regno.VEGE.toString(),0,Colore_carta.VERDE,Regno.VEGE.toString(),39);

    private Carta_risorsa carta_risorsa40=new Carta_risorsa(Regno.ANIM.toString(),Regno.ANIM.toString(),Regno.NULL.toString(),"████",
    		0,Colore_carta.BLU,Regno.ANIM.toString(),40);

    private Carta_risorsa carta_risorsa41=new Carta_risorsa(Regno.INSE.toString(),Regno.INSE.toString(),Regno.NULL.toString(),"████",
    		0,Colore_carta.VIOLA,Regno.INSE.toString(),41);

    private Carta_risorsa carta_risorsa42=new Carta_risorsa(Regno.VEGE.toString(),Regno.NULL.toString(),Regno.VEGE.toString(),
    		"████",0,Colore_carta.VERDE,Regno.VEGE.toString(),42);

    private Carta_risorsa carta_risorsa43=new Carta_risorsa("████",Regno.PIUM.toString(),Regno.ANIM.toString(),
    		Regno.INSE.toString(),0,Colore_carta.VIOLA,Regno.INSE.toString(),43);

    private Carta_risorsa carta_risorsa44=new Carta_risorsa(Regno.FUNG.toString(),Regno.VEGE.toString(),"████",
    		Regno.POZI.toString(),0,Colore_carta.VERDE,Regno.VEGE.toString(),44);

    private Carta_risorsa carta_risorsa45=new Carta_risorsa(Regno.NULL.toString(),Regno.FUNG.toString(),Regno.NULL.toString(),"████",1,
    		Colore_carta.ROSSO,Regno.FUNG.toString(),45);

    private Carta_risorsa carta_risorsa46=new Carta_risorsa(Regno.VEGE.toString(),Regno.VEGE.toString(),"████",
    		Regno.NULL.toString(),0,Colore_carta.VERDE,Regno.VEGE.toString(),46);

    private Carta_risorsa carta_risorsa47=new Carta_risorsa(Regno.NULL.toString(),Regno.ANIM.toString(),"████",Regno.ANIM.toString(),
    		0,Colore_carta.BLU,Regno.ANIM.toString(),47);

    private Carta_risorsa carta_risorsa48=new Carta_risorsa("████",Regno.VEGE.toString(),Regno.NULL.toString(),
    		Regno.VEGE.toString(),0,Colore_carta.VERDE,Regno.VEGE.toString(),48);

    private Carta_risorsa carta_risorsa49=new Carta_risorsa("████",Regno.INSE.toString(),Regno.PIUM.toString(),
    		Regno.VEGE.toString(),0,Colore_carta.VERDE,Regno.VEGE.toString(),49);

    private Carta_risorsa carta_risorsa50=new Carta_risorsa("████",Regno.NULL.toString(),Regno.ANIM.toString(),Regno.ANIM.toString(),
    		0,Colore_carta.BLU,Regno.ANIM.toString(),50);

    private Carta_risorsa carta_risorsa51=new Carta_risorsa(Regno.NULL.toString(),"████",Regno.FUNG.toString(),Regno.FUNG.toString(),0,
    		Colore_carta.ROSSO,Regno.FUNG.toString(),51);

    private Carta_risorsa carta_risorsa52=new Carta_risorsa("████",Regno.NULL.toString(),Regno.ANIM.toString(),Regno.NULL.toString(),1,
    		Colore_carta.BLU,Regno.ANIM.toString(),52);

    private Carta_risorsa carta_risorsa53=new Carta_risorsa(Regno.INSE.toString(),"████",Regno.INSE.toString(),Regno.NULL.toString(),
    		0,Colore_carta.VIOLA,Regno.INSE.toString(),53);

    private Carta_risorsa carta_risorsa54=new Carta_risorsa("████",Regno.INSE.toString(),Regno.POZI.toString(),
    		Regno.ANIM.toString(),0,Colore_carta.BLU,Regno.ANIM.toString(),54);
    
    
    public Mazzo_Risorse() {
    
    	mazzo_risorse.add(carta_risorsa21);
    	mazzo_risorse.add(carta_risorsa22);
    	mazzo_risorse.add(carta_risorsa23);
    	mazzo_risorse.add(carta_risorsa24);
    	mazzo_risorse.add(carta_risorsa25);
    	mazzo_risorse.add(carta_risorsa26);
    	mazzo_risorse.add(carta_risorsa27);
    	mazzo_risorse.add(carta_risorsa28);
    	mazzo_risorse.add(carta_risorsa29);
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

    public void rimuoviCarta()
    {
    	mazzo_risorse.remove(0);
    }

    
    public Carta_risorsa pescaCarta() {
 
        return mazzo_risorse.get(0);
    }

  
}