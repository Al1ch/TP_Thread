package Exercice1;
import java.lang.Thread;
import java.util.Comparator;

public class Compte extends Thread{
    private int solde;

    public Compte(int solde_initial) {
        this.solde = solde_initial;
    }

    public int getSolde() {
        return solde;
    }

    synchronized public void retrait(int montant){
        this.solde -= montant;
    }

    synchronized public void depot(int montant){
        this.solde += montant;
    }
}