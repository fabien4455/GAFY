package fr.epsi.partie41;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compte {

	private int depots;
	private int retraits;
	private int decouvert;
	private ArrayList<Mouvement> tabDepot;
	private ArrayList<Mouvement> tabRetrait;
	
	/**
     * Constructeur de la classe Compte
     */
	public Compte() {
		this.depots = 0;
		this.retraits = 0;
		this.decouvert = 0;
		this.tabDepot = new ArrayList<Mouvement>();
		this.tabRetrait = new ArrayList<Mouvement>();
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
	public void depotDe(int pMontantDepot, LocalDate pDateDepot, String pType) {
		Mouvement mouv = new Mouvement(pMontantDepot, pDateDepot, pType);
		this.tabDepot.add(mouv);
	}
	
	/**
     * A retrancher du solde
     * @param pRetrait : Montant à retirer
     */
	public void retraitDe(int pMontantRetrait, LocalDate pDateRetrait, String pType) {
		if(verifDecouvert(pMontantRetrait) == true) {
			Mouvement mouv = new Mouvement(pMontantRetrait, pDateRetrait, pType);
			System.out.println("Retrait Effectué");
			this.tabRetrait.add(mouv);				
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
		this.depots = 0;
		
		for(int k = 0; k < tabDepot.size(); k++) {
			this.depots = this.depots + tabDepot.get(k).getMontant();
		}
		
		return this.depots;
	}
	
	/**
	 * @return La valeur sommeRetraits
	 */
	public int getSommeRetrait() {
		this.retraits = 0;
		
		for(int k = 0; k < tabRetrait.size(); k++) {
			this.retraits = this.retraits + tabRetrait.get(k).getMontant();			
		}
		
		return this.retraits;
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
