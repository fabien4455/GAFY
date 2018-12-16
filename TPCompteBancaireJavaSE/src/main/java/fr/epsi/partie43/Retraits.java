package fr.epsi.partie43;

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
}
