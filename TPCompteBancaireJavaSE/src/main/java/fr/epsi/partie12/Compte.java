package fr.epsi.partie12;

public class Compte {

	private int solde;
	
	public Compte(int pSolde) {
		this.solde = pSolde;
	}
	
	public void depotDe(int pDepot) {
		this.solde += pDepot;		
	}
	
	public void retraitDe(int pRetrait) {
		this.solde -= pRetrait;
	}
	
	public int getSolde() {
		return this.solde;
	}
	
}
