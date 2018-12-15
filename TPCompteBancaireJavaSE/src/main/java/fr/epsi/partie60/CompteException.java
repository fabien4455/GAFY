package fr.epsi.partie60;

@SuppressWarnings("serial")
public class CompteException extends Exception {

	public CompteException() {
		System.out.println("Vous ne pouvez pas retirer cette somme, elle dépasse votre découvert autorisé");	
	}
	
}
