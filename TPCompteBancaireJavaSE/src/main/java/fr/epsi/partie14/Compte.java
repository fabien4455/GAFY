package fr.epsi.partie14;

public class Compte {

	private int sommeDepots;
	private int sommeRetraits;
	private int decouvert;
	
	public Compte() {
		this.sommeDepots = 0;
		this.sommeRetraits = 0;
		this.decouvert = 0;
	}
	
	public Compte(int pDecouvert) {
		this();
		this.decouvert = pDecouvert;
	}
	
	public void depotDe(int pDepot) {
		this.sommeDepots += pDepot;		
	}
	
	public void retraitDe(int pRetrait) {
		if(verifDecouvert(pRetrait) == true) {
			System.out.println("Retrait Effectué");
			this.sommeRetraits += pRetrait;				
		}else {
			System.out.println("Retrait Impossible");			
		}
	}
	
	public int getSolde() {
		return this.sommeDepots - this.sommeRetraits;
	} 
	
	public int getSommeDepots() {
		return this.sommeDepots;
	}
	
	public int getSommeRetrait() {
		return this.sommeRetraits;
	}
	
	public int getDecouvert() {
		return this.decouvert;
	}
	
	public void setDecouvert(int pDecouvert) {
		this.decouvert = pDecouvert;
	}
	
	public boolean verifDecouvert(int pMontant) {
		boolean verif = true;
		
		if(pMontant < getSolde() + decouvert) {
			verif = true;
		}else {
			verif = false;
		}		
		return verif;
	}
	
}
