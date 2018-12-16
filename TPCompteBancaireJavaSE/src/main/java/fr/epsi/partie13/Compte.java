package fr.epsi.partie13;

public class Compte {

	private int sommeDepots;
	private int sommeRetraits;
	
	/**
     * Constructeur de la classe Compte
     */
	public Compte() {
		this.sommeDepots = 0;
		this.sommeRetraits = 0;
	}
	
	/**
     * A ajouter au solde
     * @param pDepot : Le montant à déposer
     */
	public void depotDe(int pDepot) {
		this.sommeDepots += pDepot;		
	}
	
	/**
     * A retrancher du solde
     * @param pRetrait : Montant à retirer
     */
	public void retraitDe(int pRetrait) {
		this.sommeRetraits += pRetrait;
	}
	
	/**
     * @return La variable solde
     */
	public int getSolde() {
		return this.getSommeDepots() - this.getSommeRetrait();
	} 
	
	/**
	 * @return La valeur sommeDepots
	 */
	public int getSommeDepots() {
		return this.sommeDepots;
	}
	
	/**
	 * @return La valeur sommeRetraits
	 */
	public int getSommeRetrait() {
		return this.sommeRetraits;
	}
	
}
