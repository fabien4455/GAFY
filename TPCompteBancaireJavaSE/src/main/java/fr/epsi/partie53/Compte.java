package fr.epsi.partie53;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compte {

	private int depots;
	private int retraits;
	private int decouvert;
	private ArrayList<Mouvement> historique;
	
	public Compte() {
		this.depots = 0;
		this.retraits = 0;
		this.decouvert = 0;
		this.historique = new ArrayList<Mouvement>();
	}
	
	public Compte(int pDecouvert) {
		this();
		this.decouvert = pDecouvert;
	}
	
	public void depotDe(int pMontantDepot, LocalDate pDateDepot) {
		Depots mouv = new Depots(pMontantDepot, pDateDepot);
		this.historique.add(mouv);
		System.out.println(mouv.toString());
	}
	
	public void retraitDe(int pMontantRetrait, LocalDate pDateRetrait) {
		if(verifDecouvert(pMontantRetrait) == true) {
			Retraits mouv = new Retraits(pMontantRetrait, pDateRetrait);
			System.out.println("Retrait Effectué");
			this.historique.add(mouv);
			System.out.println(mouv.toString());
		}else {
			System.out.println("Retrait Impossible");			
		}
	}
	
	public int getSolde() {
		return this.getSommeDepots() - this.getSommeRetrait();
	} 
	
	public int getSommeDepots() {
		this.depots = 0;
		
		for(int k = 0; k < historique.size(); k++) {
			this.depots = this.depots + historique.get(k).getPlus();
		}
		
		return this.depots;
	}
	
	public int getSommeRetrait() {
		this.retraits = 0;
		
		for(int k = 0; k < historique.size(); k++) {
			this.retraits = this.retraits + historique.get(k).getMoins();
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
	
	public String toString() {
		return "Le solde est de : " + getSolde() + " euros";
	}
	
	public void historiqueTransection() {
		for(int i = 0; i < historique.size(); i++) {
			System.out.println(historique.get(i).toString());
		}
	}
	
}