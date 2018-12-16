package fr.epsi.partie12;

public class Compte {

	private int solde;
	
	/**
     * Constructeur de la classe Compte
     */
	public Compte() {
		this.solde = 0;
	}
	
	/**
     * A ajouter au solde
     * @param pDepot : Le montant à déposer
     */
	public void depotDe(int pDepot) {
		this.solde += pDepot;		
	}
	
	/**
     * A retrancher du solde
     * @param pRetrait : Montant à retirer
     */
	public void retraitDe(int pRetrait) {
		this.solde -= pRetrait;
	}
	
	/**
     * @return La variable solde
     */
	public int getSolde() {
		return this.solde;
	}
	
}
