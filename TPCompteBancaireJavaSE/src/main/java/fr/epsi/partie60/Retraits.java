package fr.epsi.partie60;

import java.time.LocalDate;

public class Retraits extends Mouvement {

	/**
	 * Constructeur de la classe Retrait
	 * @param pMontant : Le montant du retrait
	 * @param pDateMvt : La date du retrait
	 */
	public Retraits(int pMontant, LocalDate pDateMvt) {
		super(pMontant,pDateMvt);
	}
	
	/**
	 * @return le montant du retrait
	 */	
	public int getMoins() {
		return getMontant();
	}
	
	/**
	 * @return 0 car un retrait n'ajoute pas de montant a un compte
	 */
	public int getPlus() {
		return 0;
	}

	/**
	 * @return une chaine de caractere affichant le montant et la date du retrait
	 */
	public String toString() {
		return "Vous avez effectué un retrait de " + getMontant() + " euros, le " + getDateMvt();
	}
	
}
