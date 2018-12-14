package fr.epsi.partie21;

public class Compte {

	private int[] iDepots;
	private int[] iRetraits;
	private int depots;
	private int retraits;
	private int decouvert;
	
	public Compte() {
		this.depots = 0;
		this.retraits = 0;
		this.decouvert = 0;
		this.iDepots = new int[10];
		this.iRetraits = new int[10];
	}
	
	public Compte(int pDecouvert) {
		this();
		this.decouvert = pDecouvert;
	}
	
	public void depotDe(int pDepot) {
		this.depots += pDepot;		
	}
	
	public void retraitDe(int pRetrait) {
		if(verifDecouvert(pRetrait) == true) {
			System.out.println("Retrait Effectué");
			this.retraits += pRetrait;				
		}else {
			System.out.println("Retrait Impossible");			
		}
	}
	
	public int getSolde() {
		return this.depots - this.retraits;
	} 
	
	public int getSommeDepots() {
		return this.depots;
	}
	
	public int getSommeRetrait() {
		return this.retraits;
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

