package fr.epsi.partie51;

import java.time.LocalDate;

public abstract class Mouvement {

	private int montant;
	private LocalDate dateMvt;
	
	public Mouvement(int pMontant, LocalDate pDateMvt) {
		this.montant = pMontant;
		this.dateMvt = pDateMvt;		
	}
	
	public int getMontant() {
		return this.montant;
	}
	
	public LocalDate getDateMvt() {
		return this.dateMvt;
	}
	
	public void setMontant(int pMontant) {
		this.montant = pMontant;
	}
	
	public void setDateMvt(LocalDate pDateMvt) {
		this.dateMvt = pDateMvt;
	}
	
	public abstract int getPlus();
	
	public abstract int getMoins();
	
}
