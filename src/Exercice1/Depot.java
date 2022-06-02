package Exercice1;

public class Depot extends Thread{
    private final Compte c;
    private int montant;

    public Depot(Compte c, int montant) {
        this.c = c;
        this.montant = montant;
    }

    @Override
    public void run(){
        synchronized (c){
            c.depot(montant);
            System.out.println("Solde apres depot: "+ c.getSolde());

        }
    }
}
