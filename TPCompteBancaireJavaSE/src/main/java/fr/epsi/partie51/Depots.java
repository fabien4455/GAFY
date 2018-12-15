package fr.epsi.partie51;

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
	
}
