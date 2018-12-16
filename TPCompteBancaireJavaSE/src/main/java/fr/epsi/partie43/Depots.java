package fr.epsi.partie43;

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
	
}
