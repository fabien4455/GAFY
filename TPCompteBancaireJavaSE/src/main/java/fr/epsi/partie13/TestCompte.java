package fr.epsi.partie13;

public class TestCompte {

    public static void main( String[] args ) {
        Compte compte = new Compte( 5000);

        compte.depotDe( 200 );
        System.out.println( "Le compte a été crédité de " + compte.getSommeDepots() + " €, le solde est de : " + compte.getSolde() );
        compte.retraitDe( 150 );
        System.out.println( "Le compte a été débité de " + compte.getSommeRetrait() + " €, le solde est de : " + compte.getSolde() );

        compte.depotDe( 1000 );
        System.out.println( "Le compte a été crédité de " + compte.getSommeDepots() + " €, le solde est de : " + compte.getSolde() );
        compte.retraitDe( 250 );
        System.out.println( "Le compte a été débité de " + compte.getSommeRetrait() + " €, le solde est de : " + compte.getSolde() );

        compte.depotDe( 100 );
        System.out.println( "Le compte a été crédité de " + compte.getSommeDepots() + " €, le solde est de : " + compte.getSolde() );
        compte.retraitDe( 3000 );
        System.out.println( "Le compte a été débité de " + compte.getSommeRetrait() + " €, le solde est de : " + compte.getSolde() );

    }

}