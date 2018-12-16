package fr.epsi.partie53;

import java.time.LocalDate;

public abstract class Mouvement {

	private int montant;
	private LocalDate dateMvt;
	
	/**
	 * Constructeur de la classe Mouvement
	 * @param pMontant : Le montant que l'on va ajouter ou retirer
	 * @param pDateMvt : La date de la transaction
	 */
	public Mouvement(int pMontant, LocalDate pDateMvt) {
		this.montant = pMontant;
		this.dateMvt = pDateMvt;		
	}
	
	/**
	 * @return : Le montant que l'on souhaite ajouter ou retirer
	 */
	public int getMontant() {
		return this.montant;
	}
	
	/**
	 * @return La date de la transaction
	 */
	public LocalDate getDateMvt() {
		return this.dateMvt;
	}
	
	/**
	 * Modifie le montant
	 * @param pMontant : le nouveau montant
	 */
	public void setMontant(int pMontant) {
		this.montant = pMontant;
	}
	
	/**
	 * Modifie la date
	 * @param pDateMvt: la nouvelle date
	 */
	public void setDateMvt(LocalDate pDateMvt) {
		this.dateMvt = pDateMvt;
	}
	
	/**
	 * Methode astraite utilsé par les classes filles
	 */
	public abstract int getPlus();
	
	/**
	 * Methode astraite utilsé par les classes filles
	 */
	public abstract int getMoins();
	
	/**
	 * Methode astraite utilsé par les classes filles
	 */
	public abstract String toString();
	
}
