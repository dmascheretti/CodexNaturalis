package progetto;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import carte.Carta;

import mazzi.Mazzo_risorse;
import mazzi.Mazzo_iniziale;
import mazzi.Mazzo_oro;
import mazzi.Mazzo_obiettivo;
import controller.Controller;
import controller.ControllerObiettivi;
import exception.NameAssignedException;

public class Gioco {

	private Mazzo_oro mazzo_oro;
	private Controller controller;
	private Mazzo_risorse mazzo_risorse;
	private Giocatore[] giocatori;
	private Mazzo_iniziale mazzo_iniziale;
	private Mazzo_obiettivo mazzo_obiettivo;
	private Campo_gioco campo_gioco;
	private ControllerObiettivi controller_obiettivi;
	private Stampa stampa;






	/**
	 * Costructor for Gioco
	 * @throws NameAssignedException
	 */
	public Gioco() throws NameAssignedException {
		this.mazzo_risorse=new Mazzo_risorse();
		this.mazzo_oro=new Mazzo_oro();
		this.mazzo_iniziale=new Mazzo_iniziale();
		this.mazzo_obiettivo=new Mazzo_obiettivo();
		this.controller=new Controller();
		this.campo_gioco=new Campo_gioco();
		this.controller_obiettivi=new ControllerObiettivi();
		this.stampa=new Stampa();


		System.out.println("CODEX NATURALIS\n");
		
		System.out.println("\n\nSPIEGAZIONE RISORSE:\n\n-FUNG=FUNGO\n-INSE=INSETTO\n-ANIM=ANIMALE\n-VEGE=VEGETALE\n-NULL=SPAZIO VUOTO COPRIBILE"
				+ "\n-████=SPAZIO NON COPRIBILE\n-INCH=INCHIOSTRO\n-PERG=PERGAMENA\n-PIUM=PIUMA\n\nImportante!!! Nelle risorse necessarie "
				+ "delle carte oro la lettera I corrsisponde alla risorsa 'Insetto'");

		Scanner sc=new Scanner(System.in);
		int inizio=1;
		while(inizio!=0) {
		System.out.println("\n\nPREMI 0 PER INIZIARE UNA NUOVA PARTITA, 1 PER TERMINARE");
		inizio=sc.nextInt();
		if(inizio==1) Runtime.getRuntime().exit(inizio);
		}
		
		int n=0;
		Boolean blocca=false;

		while (!blocca || n<2 || n>4 ) {
			try {
				System.out.print("\n\nInserisci un numero di giocatori tra 2 e 4: \n");
				n = sc.nextInt();
				blocca = true; 
			} catch (InputMismatchException e) {
				System.out.println("Errore inserisci un numero di giocatori valido");
				sc.nextLine(); //consuma quello che ho nel buffer e svuota

			}
		}

		Scanner sc2=new Scanner(System.in);

		this.giocatori=new Giocatore[n];
		System.out.println("\nIL PRIMO GIOCATORE INSERITO SARA COLUI CHE INIZIA IL TURNO");

		Boolean errore=false;
		while(!errore ) {
			try	{
				for (int i=0;i<n;i++) {
					String name;;
					do {
						
					System.out.println("\nSelezione nome giocatore "+(i+1)+", il nome non può essere vuoto ");
					name=sc2.nextLine();
					
					}while(name.isBlank());
					
					this.giocatori[i]=new Giocatore(name);

				}
				errore=true;
			}catch(NameAssignedException e) {
				System.out.println("Errore: inserisci due nomi diversi (cambia il primo nome)");
			}


		}
	}
	
	
	




	/**
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void Gioca() throws InterruptedException, IOException {
		int size=5; //initial size of tabellone
		mazzo_iniziale.mescolaMazzo();
		mazzo_risorse.mescolaMazzo();
		mazzo_oro.mescolaMazzo();
		mazzo_obiettivo.mescolaMazzo();
		System.out.println("\n");

		int scelta,scelta_obiettivo=0;
		int scelta_iniziale=0, fronte=0, retro=1;

		Scanner sc=new Scanner(System.in);

		
		
		for(int i=0;i<giocatori.length;i++) {

			System.out.println("\nTURNO DEL GIOCATORE "+giocatori[i].getName().toUpperCase()+", PREMI INVIO PER CONTUINUARE");
			sc.nextLine();
			//sc.nextLine();
			TimeUnit.SECONDS.sleep(1);

			//GIVING CARD TO EACH PLAYER
			
			giocatori[i].aggiungiaMano(mazzo_iniziale.pescaCarta());
			mazzo_iniziale.rimuoviCarta();
			giocatori[i].aggiungiaMano(mazzo_oro.pescaCarta());
			mazzo_oro.rimuoviCarta();

			for(int j=0;j<2;j++) {
				giocatori[i].aggiungiaMano(mazzo_risorse.pescaCarta());
				mazzo_risorse.rimuoviCarta();
			}
			
			//END GIVING CARD TO EACH PLAYER
			
		
			
			//CHOOSING A GOAL CARD EACH PLAYER

			System.out.println("\nSCEGLI UNA CARTA OBIETTIVO TRA: \n");

			for(int obiettivo=0;obiettivo<2;obiettivo++) {
				System.out.println("•) CARTA "+(obiettivo+1));
				System.out.println();
				mazzo_obiettivo.pescaCartaIndex(obiettivo).getCarta();
			}

			Boolean blocca=false;
			scelta_obiettivo=0;
			while (!blocca || scelta_obiettivo<1|| scelta_obiettivo>2 ) {
				try {
					System.out.print("\nSCEGLI TRA 1 OPPURE 2\n");
					scelta_obiettivo = sc.nextInt();
					blocca = true; 
				} catch (InputMismatchException e) {
					System.out.println("Errore");
					sc.nextLine();

				}

			}


			giocatori[i].aggiungiaObiettivo(mazzo_obiettivo.pescaCartaIndex(scelta_obiettivo-1));
			for(int rimuovi_obiettivo=0;rimuovi_obiettivo<2;rimuovi_obiettivo++) mazzo_obiettivo.rimuoviCarta();

			//CHOOSING A STARTING CARD EACH PLAYER
			TimeUnit.SECONDS.sleep(1);
			System.out.println("SCELTA CARTA INZIALE DEL GIOCATORE "+giocatori[i].getName().toUpperCase());
			TimeUnit.SECONDS.sleep(1);


			System.out.println(giocatori[i].scegliCarta(0).printCard());

			blocca=false;

			while (!blocca || scelta_iniziale!=fronte && scelta_iniziale!=retro ) {
				try {
					System.out.print("\nvuoi giocare la carta iniziale fronte o retro, 0 per fronte, 1 per retro (la carta verra automaticamente piazzata al centro del tabellone)".toUpperCase()+"\n");
					scelta_iniziale = sc.nextInt();
					blocca = true; 
				} catch (InputMismatchException e) {
					System.out.println("Errore");
					sc.nextLine();

				}
			}

			if(scelta_iniziale==fronte) giocatori[i].scegliCarta(0).setRisFronte();

			//PLACING STARTING CARD IN TABELLONE
			
			giocatori[i].getTabellone().setCella((size/2), (size/2), giocatori[i].scegliCarta(0));
			giocatori[i].removeCard(); //REMOVING STARTING CARD FROM HAND
			sc.nextLine();
			TimeUnit.SECONDS.sleep(2);
		}//FINE FOR

		//ADD CARDS TO CAMPO GIOCO
		
		campo_gioco.riempi(mazzo_oro, mazzo_risorse, mazzo_obiettivo);


		Boolean win=false;
		Boolean block=true;	
		int turno=1;
		int h= 0,x = 0,y = 0;
		do {
			
			stampa.stampaTurno(turno);
			
			for(int p=0; p< giocatori.length; p++) System.out.println("PUNTEGGIO GIOCATORE "+giocatori[p].getName()
					+": "+giocatori[p].getSomma());
			
			
			stampa.stampaObiettivo(campo_gioco);



			//SWITCHING TURN

			for(int giocatore=0;giocatore<giocatori.length;giocatore++) {
				
				boolean blocca=false;
				int start=0;
				while (!blocca || start!=0) {
					try {
						System.out.println("\n\n\nE' IL TURNO DI: "+giocatori[giocatore].getName().toUpperCase()+" PREMI 0 PER INIZARE");
						start=sc.nextInt();
						blocca = true; 
					} catch (InputMismatchException e) {
						System.out.println("Errore");
						sc.nextLine(); //consuma quello che ho nel buffer e svuota

					}
				}
				
				//PRINT ALL THE INFORMATIONS ABOUT THE PLAYER 
				
				stampa.stampaGiocatore(giocatori[giocatore]);


				//CHOOSE CARD FROM PLAYER HAND


				block=true;
				System.out.println(giocatori[giocatore].getName()+" scegli una carta da giocare tra quelle della tua mano: ".toUpperCase());
				TimeUnit.SECONDS.sleep(2);
				giocatori[giocatore].guardaMano();




				do {
					//Boolean blocca=false;
					block=true;
					blocca=false;

					while (!blocca || h!=1 && h!=2 && h!=3) {
						try {
							System.out.print("\nscegli tra 1, 2 oppure 3".toUpperCase()+"\n");
							h = sc.nextInt();
							blocca = true; 
						} catch (InputMismatchException e) {
							System.out.println("Errore");
							sc.nextLine();

						}
					}

					scelta=-1;
					blocca=false;
					while (!blocca || scelta!=fronte && scelta!=retro) {
						try {
							System.out.print("\nscegli tra 0(fronte), 1(retro)".toUpperCase()+"\n");
							scelta = sc.nextInt();
							blocca = true; 
						} catch (InputMismatchException e) {
							System.out.println("Errore");
							sc.nextLine();

						}
					}

					if(scelta==fronte) {
					
						//CHECK THE NECESSARY RESOURCES
						
						block=giocatori[giocatore].controlla(giocatori[giocatore].scegliCarta(h-1).getID());

						if(block==false) System.out.println("\nnon puoi piazzare questa carta, non hai le risorse necessarie\n".toUpperCase());
						else {giocatori[giocatore].scegliCarta(h-1).setRisFronte();
						System.out.println(giocatori[giocatore].scegliCarta(h-1).printCardFinal());
						}



					}
					if(scelta==retro) {
						giocatori[giocatore].scegliCarta(h-1).setPunti(); //IF PLAY RETRO CARD, POINTS=0
						System.out.println(giocatori[giocatore].scegliCarta(h-1).printCardFinal());
					}
				}while(block==false);




				//blocca=false;

				do {
					x=0;
					y=0;
					System.out.println("in che posizione del tabellone vuoi piazzarla? prima x, poi y (tra 1 e "+ (giocatori[giocatore].getTabellone().getSize()-2)+")");
					//boolean blocca=false;
					blocca=false;
					while (!blocca || x<1 || x>(giocatori[giocatore].getTabellone().getSize()-2) ) {
						try {
							System.out.print("X: ");
							x=sc.nextInt();
							blocca = true; 
						} catch (InputMismatchException e) {
							System.out.println("Errore");
							sc.nextLine(); //consuma quello che ho nel buffer e svuota

						}
					}


					while (!blocca || y<1 || y>(giocatori[giocatore].getTabellone().getSize()-2) ) {
						try {
							System.out.print("Y: ");
							y=sc.nextInt();
							blocca = true; 
						} catch (InputMismatchException e) {
							System.out.println("Errore");
							sc.nextLine(); //consuma quello che ho nel buffer e svuota

						}
					}


					if(giocatori[giocatore].getTabellone().checkEmpty(x, y)!=0 ||
							giocatori[giocatore].getTabellone().checkNext(x, y)==false ||
							giocatori[giocatore].getTabellone().checkCorner(x,y)==false) System.out.println("NON PUOI PIAZZARE LA CARTA IN QUESTA POSIZIONE");

					//CHECKING THE POSSIBILITY TO PLAY THE CARD 
					
				}while(giocatori[giocatore].getTabellone().checkCorner(x,y)==false || giocatori[giocatore].getTabellone().checkNext(x, y)==false
						||giocatori[giocatore].getTabellone().checkEmpty(x, y)!=0);
				
				
				giocatori[giocatore].getTabellone().removeCorner(x, y);
				
				if(scelta==fronte) {

					giocatori[giocatore].getPunteggio(controller.getPunti(giocatori[giocatore].scegliCarta(h-1),giocatori[giocatore].getTabellone(),
							x, y));
				}

				giocatori[giocatore].getTabellone().setCella(x, y,giocatori[giocatore].scegliCarta(h-1)); //PLACING CARD




				
				
				giocatori[giocatore].removeCardIndex(h-1); //REMOVING CARD FROM HAND

				System.out.println("PIAZZAMENTO CARTA IN CORSO...");
				TimeUnit.SECONDS.sleep(3);

				//TimeUnit.SECONDS.sleep(3);
				giocatori[giocatore].getTabellone().printTabellone();

				System.out.println("PUNTEGGIO DOPO PIAZZAMENTO: "+giocatori[giocatore].getSomma());
				
				//PRINT THE TABLE 
				
				TimeUnit.SECONDS.sleep(3);
				System.out.println("\n-----MAZZI-----");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("\nMAZZO ORO\n");
				System.out.println(mazzo_oro.getRetro().printCardR());

				System.out.println("\n\nMAZZO RISORSE \n");
				System.out.println(mazzo_risorse.getRetro().printCardR());
				System.out.println();

				TimeUnit.SECONDS.sleep(2);
				
				campo_gioco.stampaCartaCampo();


				int carta_pescata = 0;

				//PICK A CARD FROM THE TABLE

				//boolean blocca=false;
				blocca=false;
				while (!blocca) {
					try {
						System.out.println("\n\n"+giocatori[giocatore].getName()+": da che mazzo vuoi pescare:\n1-PESCA DAL MAZZO ORO\n"
								+ "2-PESCA DAL MAZZO RISORSE\n3-PRENDI UNA CARTA ORO SCOPERTA\n4-PRENDI UNA CARTA RISORSA SCOPERTA");
						carta_pescata=sc.nextInt();
						blocca = true; 
					} catch (InputMismatchException e) {
						System.out.println("Errore");
						sc.nextLine(); //consuma quello che ho nel buffer e svuota

					}
				}

				Carta carta_nuova = giocatori[giocatore].scelta(carta_pescata, mazzo_oro, mazzo_risorse, campo_gioco.returnOro(),campo_gioco.returnRisorse());
				giocatori[giocatore].aggiungiaMano(carta_nuova); //ADD CARD TO PLAYER HAND
				System.out.println("\nHAI PESCATO: \n");
				System.out.println(carta_nuova.printCard());

				if(giocatori[giocatore].getSomma()>19 && (giocatore!=giocatori.length-1)) System.out.println("HAI RAGGIUNTO 20 PUNTI, ASPETTA CHE FINISCA IL TURNO");
				else System.out.println("\n\nCAMBIO TURNO...\n");


			}
			turno++; //NEXT TURN


			win=controller.checkWin(giocatori); //CHECK IF SOMEONE REACHED 20 POINTS
			if(mazzo_oro.getLenght()<giocatori.length || mazzo_risorse.getLenght()<giocatori.length) System.out.println("FINE PARTITE, CARTE TERMINATE"); //CHECK IF THERE ARE ENOUGH CARDS

		}while(win==false || mazzo_oro.getLenght()<giocatori.length || mazzo_risorse.getLenght()<giocatori.length);

		sc.close();

		System.out.println("FINE GIOCO, CONTEGGIO PUNTI OBIETTIVO, ATTENDI LA CLASSIFICA");//END GAME

		TimeUnit.SECONDS.sleep(4);

		//ADDING FINAL POINTS (GOALS)

		for(int i=0;i<giocatori.length;i++) {
			for(int j=0;j<2;j++) giocatori[i].getPunteggio(controller_obiettivi.checkCartaObiettivo(campo_gioco.returnObiettivo().get(j).getID(), giocatori[i].getTabellone()));

			giocatori[i].getPunteggio(controller_obiettivi.checkCartaObiettivo(giocatori[i].getObiettivo().getID(),giocatori[i].getTabellone()));

		}
		//RETURN RANKING, PLAYERS-POINTS AND WINNER

		controller.classifica(giocatori);


		controller.vittoria(giocatori);
	}
}