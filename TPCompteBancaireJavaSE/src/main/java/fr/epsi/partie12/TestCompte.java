package fr.epsi.partie12;

public class TestCompte {

    public static void main( String[] args ) {
        Compte compte1 = new Compte( 4000 );

        compte1.depotDe( 500 );
        System.out.println( "Le solde est de : " + compte1.getSolde());
        compte1.retraitDe( 250 );
        System.out.println( "Le solde est de : " + compte1.getSolde());
        
        compte1.depotDe( 1000 );
        System.out.println( "Le solde est de : " + compte1.getSolde());
        compte1.retraitDe( 500 );
        System.out.println( "Le solde est de : " + compte1.getSolde());
        
        compte1.depotDe( 100 );
        System.out.println( "Le solde est de : " + compte1.getSolde());
        compte1.retraitDe( 3000 );
        System.out.println( "Le solde est de : " + compte1.getSolde());
        
    }

}