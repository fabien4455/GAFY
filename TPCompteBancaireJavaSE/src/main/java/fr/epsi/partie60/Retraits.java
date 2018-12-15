package fr.epsi.partie60;

import java.time.LocalDate;

public class Retraits extends Mouvement {

	public Retraits(int pMontant, LocalDate pDateMvt) {
		super(pMontant,pDateMvt);
	}
	
	public int getMoins() {
		return getMontant();
	}
	
	public int getPlus() {
		return 0;
	}

	public String toString() {
		return "Vous avez effectué un retrait de " + getMontant() + " euros, le " + getDateMvt();
	}
	
}
