package fr.epsi.partie13;

public class Compte {

	private int sommeDepots;
	private int sommeRetraits;
	
	public Compte(int pDepot) {
		this.sommeDepots = pDepot;
		this.sommeRetraits = 0;
	}
	
	public void depotDe(int pDepot) {
		this.sommeDepots += pDepot;		
	}
	
	public void retraitDe(int pRetrait) {
		this.sommeRetraits += pRetrait;
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
	
}
