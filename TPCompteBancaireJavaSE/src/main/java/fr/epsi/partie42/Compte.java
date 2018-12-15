package fr.epsi.partie42;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compte {

	private int depots;
	private int retraits;
	private int decouvert;
	private ArrayList<Mouvement> tabMouvement;
	
	public Compte() {
		this.depots = 0;
		this.retraits = 0;
		this.decouvert = 0;
		this.tabMouvement = new ArrayList<Mouvement>();
	}
	
	public Compte(int pDecouvert) {
		this();
		this.decouvert = pDecouvert;
	}
	
	public void depotDe(int pMontantDepot, LocalDate pDateDepot, String pType) {
		Mouvement mouv = new Mouvement(pMontantDepot, pDateDepot, pType);
		this.tabMouvement.add(mouv);
	}
	
	public void retraitDe(int pMontantRetrait, LocalDate pDateRetrait, String pType) {
		if(verifDecouvert(pMontantRetrait) == true) {
			Mouvement mouv = new Mouvement(pMontantRetrait, pDateRetrait, pType);
			System.out.println("Retrait Effectué");
			this.tabMouvement.add(mouv);				
		}else {
			System.out.println("Retrait Impossible");			
		}
	}
	
	public int getSolde() {
		return this.getSommeDepots() - this.getSommeRetrait();
	} 
	
	public int getSommeDepots() {
		this.depots = 0;
		
		for(int k = 0; k < tabMouvement.size(); k++) {
			if(tabMouvement.get(k).getTypeMvt().equals("depot")) {
				this.depots = this.depots + tabMouvement.get(k).getMontant();
			}
		}
		
		return this.depots;
	}
	
	public int getSommeRetrait() {
		this.retraits = 0;
		
		for(int k = 0; k < tabMouvement.size(); k++) {
			if(tabMouvement.get(k).getTypeMvt().equals("retrait")) {
				this.retraits = this.retraits + tabMouvement.get(k).getMontant();
			}
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