package Exercice1;

public class Retrait extends Thread{
    private final Compte c;
    private int montant;
    public Retrait(Compte c, int montant){
        this.c = c;
        this.montant = montant;
    }

    @Override
    public void run(){
        synchronized (c){
            c.retrait(montant);
            System.out.println("Solde apres retrait: "+ c.getSolde());
        }
    }
}
