package fr.epsi.partie41;

import java.time.LocalDate;

public class Mouvement {

	private int montant;
	private LocalDate dateMvt;
	private String typeMvt;
	
	/**
	 * Constructeur de la classe Mouvement
	 * @param pMontant : Le montant que l'on va ajouter ou retirer
	 * @param pDateMvt : La date de la transaction
	 * @param pTypeMvt : Si c'est un dépot ou un retrait
	 */
	public Mouvement(int pMontant, LocalDate pDateMvt, String pTypeMvt) {
		this.montant = pMontant;
		this.dateMvt = pDateMvt;
		this.typeMvt = pTypeMvt;		
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
	 * @return Le type de mouvement (depot ou retrait)
	 */
	public String getTypeMvt() {
		return this.typeMvt;
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
	 * Modifie le type de mouvement
	 * @param pTypeMvt : le nouveau type de mouvement
	 */
	public void setTypeMvt(String pTypeMvt) {
		this.typeMvt = pTypeMvt;
	}
	
}

