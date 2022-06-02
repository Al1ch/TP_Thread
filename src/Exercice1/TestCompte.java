package Exercice1;

public class TestCompte {
    public static void main(String[] args) {
        Compte compte1 = new Compte();
        Depot depot = new Depot(compte1,10);
        Retrait retrait = new Retrait(compte1,30);

        retrait.start();
        depot.start();

        try {
            depot.join();
            retrait.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
