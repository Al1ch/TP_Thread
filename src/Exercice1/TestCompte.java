package Exercice1;
import java.lang.Thread;
public class TestCompte{

    public static void main(String[] args) {

        Compte compte = new Compte(100); // compte sur lequel sont effectuées les dépôts et retraits

        /* Remplace la méthode run par expression lambda
        *  et synchronize de l'objet compte             */
        Thread depot = new Thread(() -> {
            synchronized(compte) {
                System.out.println(compte.getSolde()); // afficher le solde au commencement du thread
                // Faire 5 dépôts de 10 et afficher le solde à chaque fois
                for (int i = 0; i < 5; i++) {
                    compte.depot(10);
                    System.out.println("Solde apres depot" + compte.getSolde());
                }
            }
        });
        /* idem */
        Thread retrait = new Thread(() -> {
            synchronized (compte) {
                System.out.println(compte.getSolde());// afficher le solde au commencement du thread
                // Faire 5 retraits de 10 et afficher le solde à chaque fois
                for (int i = 0; i < 5; i++) {
                    compte.retrait(10);
                    System.out.println("Solde apres retrait" + compte.getSolde());
                }
            }
        });

        /* Démarrage des threads */
        depot.start();
        retrait.start();

        /* S'assurer de ne pas quitter le programme
           avant la fin d'exécution des threads    */
        try {
            depot.join();
            retrait.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /* On effectue bien tous les dépôts avant les retraits
        *  grace à la synchronisation des threads (synchronized) */
    }
}
