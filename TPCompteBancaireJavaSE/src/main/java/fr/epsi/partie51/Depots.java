package fr.epsi.partie51;

import java.time.LocalDate;

public class Depots extends Mouvement {

	/**
	 * Constructeur de la classe Depot
	 * @param pMontant : Le Montant du dépot
	 * @param pDateMvt : La date du dépot
	 */
	public Depots(int pMontant, LocalDate pDateMvt) {
		super(pMontant, pDateMvt);
	}
	
	/**
	 * @return Le montant du dépot
	 */
	public int getPlus() {
		return getMontant();
	}

	/**
	 * @return 0 car un dépot ne fait que augmenter
	 */
	public int getMoins() {
		return 0;
	}
	
}
