package Exercice1;
import java.lang.Thread;
public class TestCompte{

    public static void main(String[] args) {

        Compte compte = new Compte(100);
        Thread depot = new Thread(new Runnable() {
            @Override
            synchronized public void run() {
                System.out.println(compte.getSolde());
                for(int i=0; i<5; i++){
                    compte.depot(10);
                    System.out.println("Solde apres depot" + compte.getSolde());
                }

            }
        });

        Thread retrait = new Thread(new Runnable() {
            @Override
            synchronized public void run() {
                System.out.println(compte.getSolde());
                for(int i=0; i<5; i++){
                    compte.retrait(10);
                    System.out.println("Solde apres retrait" + compte.getSolde());

                }
            }
        });

        depot.start();
        retrait.start();
        try {
            depot.join();
            retrait.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
