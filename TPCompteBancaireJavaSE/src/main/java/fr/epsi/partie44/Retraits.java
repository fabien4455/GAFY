package fr.epsi.partie44;

import java.time.LocalDate;

public class Retraits extends Mouvement {

	public Retraits(int pMontant, LocalDate pDateMvt) {
		super(pMontant,pDateMvt);
	}
	
	public int getMoins() {
		return getMontant();
	}
	
}
