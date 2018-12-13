package fr.epsi.partie14;

public class Compte {

	private int sommeDepots;
	private int sommeRetraits;
	private int decouvert;
	
	public Compte(int pDepot) {
		this.sommeDepots = pDepot;
		this.sommeRetraits = 0;
		this.decouvert = 0;
	}
	
	public void depotDe(int pDepot) {
		this.sommeDepots += pDepot;		
	}
	
	public void retraitDe(int pRetrait) {
		if(decouvert < 0) {
			
		}else {
			this.sommeRetraits += pRetrait;			
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
	
	public void verifDecouvert(int pMontant) {
		
	}
	
}

