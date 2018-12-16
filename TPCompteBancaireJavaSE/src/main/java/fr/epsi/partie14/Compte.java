package fr.epsi.partie14;

public class Compte {

	private int sommeDepots;
	private int sommeRetraits;
	private int decouvert;
	
	/**
     * Constructeur de la classe Compte
     */
	public Compte() {
		this.sommeDepots = 0;
		this.sommeRetraits = 0;
		this.decouvert = 0;
	}
	
	/**
     * Constructeur de la classe Compte
	 * @param pDecouvert : Montant du découvert autorisé
	 */
	public Compte(int pDecouvert) {
		this();
		this.decouvert = pDecouvert;
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
		if(verifDecouvert(pRetrait) == true) {
			System.out.println("Retrait Effectué");
			this.sommeRetraits += pRetrait;				
		}else {
			System.out.println("Retrait Impossible");			
		}
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
	
	/**
	 * @return La valeur decouvert
	 */
	public int getDecouvert() {
		return this.decouvert;
	}
	
	/**
	 * Modifie la valeur de decouvert
	 * @param pDecouvert : Le montant de la nouvelle valeur
	 */
	public void setDecouvert(int pDecouvert) {
		this.decouvert = pDecouvert;
	}
	
	/**
	 * Verifie si le montant n'est pas supérieur au montant du solde et du découvert autorisé
	 * @param pMontant : Montant à retirer
	 * @return Un boolean qui dit si la valeur est supérieur ou non
	 */
	public boolean verifDecouvert(int pMontant) {
		boolean verif = true;
		
		if(pMontant <= getSolde() + decouvert) {
			verif = true;
		}else {
			verif = false;
		}		
		return verif;
	}
	
}

