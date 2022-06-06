package Exercice1;

public class Compte{
    private int solde;

    public Compte(int solde_initial) {
        this.solde = solde_initial;
    }

    public int getSolde() {
        return solde;
    }

    public void retrait(int montant){
        this.solde -= montant;
    }

    public void depot(int montant){
        this.solde += montant;
    }
}