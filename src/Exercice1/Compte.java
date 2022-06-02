package Exercice1;
import java.lang.Thread;
import java.util.Comparator;

public class Compte{
    private int solde;

    public Compte() {
        this.solde = 100;
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