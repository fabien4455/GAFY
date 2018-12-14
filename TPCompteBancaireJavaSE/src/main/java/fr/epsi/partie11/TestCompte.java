package fr.epsi.partie11;

public class TestCompte {

    public static void main( String[] args ) {
        Compte compte1 = new Compte( 1000 );

        compte1.depotDe( 50 );
        System.out.println( "Le solde est de : " + compte1.getSolde());
        compte1.retraitDe( 25 );
        System.out.println( "Le solde est de : " + compte1.getSolde());
        
        compte1.depotDe( 100 );
        System.out.println( "Le solde est de : " + compte1.getSolde());
        compte1.retraitDe( 50 );
        System.out.println( "Le solde est de : " + compte1.getSolde());
        
        compte1.depotDe( 1000 );
        System.out.println( "Le solde est de : " + compte1.getSolde());
        compte1.retraitDe( 2000 );
        System.out.println( "Le solde est de : " + compte1.getSolde());
        
    }

}
