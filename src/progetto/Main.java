package progetto;

import java.io.IOException;

import javax.naming.NameAlreadyBoundException;

import exception.NameAssignedException;


public class Main {
	public static void main(String[] args) throws IOException, NameAssignedException  {
		Gioco codex=new Gioco();
		codex.Gioca();
		
	}

}
