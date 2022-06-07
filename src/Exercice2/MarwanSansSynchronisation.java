package Exercice2;

public class MarwanSansSynchronisation extends Marwan{
    //Hérite de Marwan pour ne pas redéfinir les mêmes fonctions
    public static void main(String[] args) {
        MarwanSansSynchronisation m = new MarwanSansSynchronisation();
        //créer les thread pour chaque actions
        Thread t_dejeuner = new Thread(new Runnable() {
            @Override
            public void run() {
                m.petit_dej();
            }
        });
        t_dejeuner.start();

        Thread t_fumer = new Thread(new Runnable() {
            @Override
            public void run() {
                m.fumer();
            }
        });
        t_fumer.start();

        Thread t_transports = new Thread(new Runnable() {
            @Override
            public void run() {
                m.transports();
            }
        });
        t_transports.start();


        Thread t_marcher = new Thread(new Runnable() {
            @Override
            public void run() {
                m.marcher();
            }
        });
        t_marcher.start();

        Thread t_entrer_salle = new Thread(new Runnable() {
            @Override
            public void run() {
                m.entrer_salle();

            }
        });
        t_entrer_salle.start();

        Thread t_suivre_cours = new Thread(new Runnable() {
            @Override
            public void run() {
                m.suivre_cours();

            }
        });
        t_suivre_cours.start();

        Thread t_faire_TP = new Thread(new Runnable() {
            @Override
            public void run() {
                m.faire_TP();

            }
        });
        t_faire_TP.start();

        try{
            t_dejeuner.join();
            t_fumer.join();
            t_transports.join();
            t_marcher.join();
            t_entrer_salle.join();
            t_suivre_cours.join();
            t_faire_TP.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
