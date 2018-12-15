package fr.epsi.partie41;

import java.time.LocalDate;

public class TestCompte {

    public static void main( String[] args ) {
    	Compte compte1 = new Compte(100);
        
        compte1.depotDe( 200,LocalDate.of(2018, 12, 06), "depot");
        System.out.println( "Le solde est de : " + compte1.getSolde());
        compte1.retraitDe( 150,LocalDate.of(2018, 12, 10), "retrait");
        System.out.println( "Le solde est de : " + compte1.getSolde());

        compte1.depotDe( 1000,LocalDate.of(2018, 12, 11), "depot");
        System.out.println( "Le solde est de : " + compte1.getSolde());
        compte1.retraitDe( 250 ,LocalDate.of(2018, 12, 15), "retrait");
        System.out.println( "Le solde est de : " + compte1.getSolde());

        compte1.depotDe( 100,LocalDate.of(2018, 12, 18), "depot");
        System.out.println( "Le solde est de : " + compte1.getSolde());
        compte1.retraitDe( 1000 ,LocalDate.of(2018, 12, 19), "retrait");
        System.out.println( "Le solde est de : " + compte1.getSolde());

        compte1.depotDe( 1000,LocalDate.of(2018, 12, 20), "depot");
        System.out.println( "Le solde est de : " + compte1.getSolde());      
        compte1.retraitDe( 3000,LocalDate.of(2018, 12, 21), "retrait");
        System.out.println( "Le solde est de : " + compte1.getSolde());

    }

}