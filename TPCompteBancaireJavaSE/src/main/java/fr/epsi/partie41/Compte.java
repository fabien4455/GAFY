package fr.epsi.partie41;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compte {

	private int depots;
	private int retraits;
	private int decouvert;
	private ArrayList<Mouvement> tabDepot;
	private ArrayList<Mouvement> tabRetrait;
	
	public Compte() {
		this.depots = 0;
		this.retraits = 0;
		this.decouvert = 0;
		this.tabDepot = new ArrayList<Mouvement>();
		this.tabRetrait = new ArrayList<Mouvement>();
	}
	
	public Compte(int pDecouvert) {
		this();
		this.decouvert = pDecouvert;
	}
	
	public void depotDe(int pMontantDepot, LocalDate pDateDepot, String pType) {
		Mouvement mouv = new Mouvement(pMontantDepot, pDateDepot, pType);
		this.tabDepot.add(mouv);
	}
	
	public void retraitDe(int pMontantRetrait, LocalDate pDateRetrait, String pType) {
		if(verifDecouvert(pMontantRetrait) == true) {
			Mouvement mouv = new Mouvement(pMontantRetrait, pDateRetrait, pType);
			System.out.println("Retrait Effectué");
			this.tabRetrait.add(mouv);				
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
			this.depots = this.depots + tabDepot.get(k).getMontant();
		}
		
		return this.depots;
	}
	
	public int getSommeRetrait() {
		this.retraits = 0;
		
		for(int k = 0; k < tabRetrait.size(); k++) {
			this.retraits = this.retraits + tabRetrait.get(k).getMontant();			
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