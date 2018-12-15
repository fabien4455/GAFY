package fr.epsi.partie60;

import java.time.LocalDate;

public class Depots extends Mouvement {

	public Depots(int pMontant, LocalDate pDateMvt) {
		super(pMontant, pDateMvt);
	}
	
	public int getPlus() {
		return getMontant();
	}

	public int getMoins() {
		return 0;
	}

	public String toString() {
		return "Vous avez effectué un dépot de " + getMontant() + " euros, le " + getDateMvt();
	}
	
}
