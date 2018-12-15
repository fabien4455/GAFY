package fr.epsi.partie21;

public class Compte {

	private int[] iDepots;
	private int[] iRetraits;
	private int depots;
	private int retraits;
	private int decouvert;
	private int i = 0;
	private int j = 0;
	
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
		if(i < 10) {
			iDepots[i] = pDepot;
			i++;
		}
	}
	
	public void retraitDe(int pRetrait) {
		if(j < 10) {
			
			if(verifDecouvert(pRetrait) == true) {
				System.out.println("Retrait Effectué");
				iRetraits[j] = pRetrait;				
			}else {
				System.out.println("Retrait Impossible");			
			}
			
			j++;
		}
	}
	
	public int getSolde() {
		return this.getSommeDepots() - this.getSommeRetrait();
	} 
	
	public int getSommeDepots() {
		this.depots = 0;
		
		for(int k = 0; k < iDepots.length; k++) {
			this.depots = this.depots + iDepots[k];
		}
		
		return this.depots;
	}
	
	public int getSommeRetrait() {
		this.retraits = 0;
		
		for(int k = 0; k < iRetraits.length; k++) {
			this.retraits = this.retraits + iRetraits[k];
		}
		
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

