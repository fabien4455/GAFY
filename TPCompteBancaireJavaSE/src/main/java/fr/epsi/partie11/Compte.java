package fr.epsi.partie11;

public class Compte {

    public int solde;

    public Compte( int pSolde ) {
        this.solde = pSolde;
    }

    public void depotDe( int pDepot ) {
        this.solde += pDepot;
    }

    public void retraitDe( int pRetrait ) {
        this.solde -= pRetrait;
    }

    public int getSolde() {

        return this.solde;
    }

}
