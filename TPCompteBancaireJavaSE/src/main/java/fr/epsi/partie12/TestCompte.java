package fr.epsi.partie12;

public class TestCompte {

    public static void main( String[] args ) {
        Compte compte = new Compte( 4000 );

        compte.depotDe( 500 );
        System.out.println( "Le compte a été crédité de 500 €, le solde est de : " + compte.getSolde() );
        compte.retraitDe( 250 );
        System.out.println( "Le compte a été débité de 250 €, le solde est de : " + compte.getSolde() );

        compte.depotDe( 1000 );
        System.out.println( "Le compte a été crédité de 1000 €, le solde est de : " + compte.getSolde() );
        compte.retraitDe( 500 );
        System.out.println( "Le compte a été débité de 500 €, le solde est de : " + compte.getSolde() );

        compte.depotDe( 100 );
        System.out.println( "Le compte a été crédité de 100 €, le solde est de : " + compte.getSolde() );
        compte.retraitDe( 3000 );
        System.out.println( "Le compte a été débité de 3000 €, le solde est de : " + compte.getSolde() );

    }

}