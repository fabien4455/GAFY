package fr.epsi.partie11;

public class TestCompte {

	public static void main(String[] args) {
		Compte compte = new Compte(1000);
		
		compte.depotDe(50);
		System.out.println("Le compte a été crédité de 50 €, le solde est de : " + compte.getSolde() );		
		compte.retraitDe(25);
		System.out.println("Le compte a été débité de 25 €, le solde est de : " + compte.getSolde() );
		
		compte.depotDe(100);
		System.out.println("Le compte a été crédité de 100 €, le solde est de : " + compte.getSolde() );
		compte.retraitDe(50);
		System.out.println("Le compte a été débité de 50 €, le solde est de : " + compte.getSolde() );
		
		compte.depotDe(1000);
		System.out.println("Le compte a été crédité de 1000 €, le solde est de : " + compte.getSolde() );
		compte.retraitDe(2000);
		System.out.println("Le compte a été débité de 2000 €, le solde est de : " + compte.getSolde() );
		
	}

}
