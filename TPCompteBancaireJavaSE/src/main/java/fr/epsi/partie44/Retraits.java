package fr.epsi.partie44;

import java.time.LocalDate;

public class Retraits extends Mouvement {

	/**
	 * Constructeur de la classe Retrait
	 * @param pMontant : Le montant du retrait
	 * @param pDateMvt : La date du retrait
	 */
	public Retraits(int pMontant, LocalDate pDateMvt) {
		super(pMontant,pDateMvt);
	}
	
	/**
	 * @return le montant du retrait
	 */
	public int getMoins() {
		return getMontant();
	}
	
}
