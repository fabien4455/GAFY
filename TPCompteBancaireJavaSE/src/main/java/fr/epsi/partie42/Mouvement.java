package fr.epsi.partie42;

import java.time.LocalDate;

public class Mouvement {

	private int montant;
	private LocalDate dateMvt;
	private String typeMvt;
	
	public Mouvement(int pMontant, LocalDate pDateMvt, String pTypeMvt) {
		this.montant = pMontant;
		this.dateMvt = pDateMvt;
		this.typeMvt = pTypeMvt;		
	}
	
	public int getMontant() {
		return this.montant;
	}
	
	public LocalDate getDateMvt() {
		return this.dateMvt;
	}
	
	public String getTypeMvt() {
		return this.typeMvt;
	}
	
	public void setMontant(int pMontant) {
		this.montant = pMontant;
	}
	
	public void setDateMvt(LocalDate pDateMvt) {
		this.dateMvt = pDateMvt;
	}
	
	public void setTypeMvt(String pTypeMvt) {
		this.typeMvt = pTypeMvt;
	}
	
}
