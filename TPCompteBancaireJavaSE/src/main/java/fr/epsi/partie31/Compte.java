package fr.epsi.partie31;

import java.util.ArrayList;

public class Compte {

	private int depots;
	private int retraits;
	private int decouvert;
	private ArrayList<Integer> tabDepot;
	private ArrayList<Integer> tabRetrait;
	
	public Compte() {
		this.depots = 0;
		this.retraits = 0;
		this.decouvert = 0;
		tabDepot = new ArrayList<Integer>();
		tabRetrait = new ArrayList<Integer>();
	}
	
	public Compte(int pDecouvert) {
		this();
		this.decouvert = pDecouvert;
	}
	
	public void depotDe(int pDepot) {
		this.tabDepot.add(pDepot);
	}
	
	public void retraitDe(int pRetrait) {
		if(verifDecouvert(pRetrait) == true) {
			System.out.println("Retrait Effectué");
			this.tabRetrait.add(pRetrait);				
		}else {
			System.out.println("Retrait Impossible");			
		}
	}
	
	public int getSolde() {
		return this.getSommeDepots() - this.getSommeRetrait();
	} 
	
	public int getSommeDepots() {
		this.depots = 0;
		
		for(int k = 0; k < tabDepot.size(); k++) {
			this.depots = this.depots + tabDepot.get(k);
		}
		
		return this.depots;
	}
	
	public int getSommeRetrait() {
		this.retraits = 0;
		
		for(int k = 0; k < tabRetrait.size(); k++) {
			this.retraits = this.retraits + tabRetrait.get(k);
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