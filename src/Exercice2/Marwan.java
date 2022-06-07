package Exercice2;

public class Marwan{

    public void petit_dej(){ System.out.println("Il prend son petit dejeuner"); }
    public void fumer(){ System.out.println("Il fume sa cigarette"); }
    public void transports(){ System.out.println("Il veut prend les transports en commun"); }
    public void marcher(){
        System.out.println("Il y a un mouvement social donc il part a pied");
    }
    public void entrer_salle(){
        System.out.println("Il entre dans la salle");
    }
    public void suivre_cours(){
        System.out.println("Il suit le cours sur les Threads");
    }
    public void faire_TP(){
        System.out.println("Il fait le TP");
    }

    public static void main(String[] args) {
        Marwan m = new Marwan();

        //créer les thread pour chaque actions
        Thread t_dejeuner = new Thread(() -> {
            synchronized (m){
                m.petit_dej();
            }
        });
        t_dejeuner.start();

        Thread t_fumer = new Thread(()-> {
           synchronized (m){
               m.fumer();
           }
        });
        t_fumer.start();

        Thread t_transports = new Thread(()-> {
            synchronized (m){
                m.transports();
            }
        });
        t_transports.start();


        Thread t_marcher = new Thread(()-> {
            synchronized (m){
                m.marcher();
            }
        });
        t_marcher.start();

        Thread t_entrer_salle = new Thread(()-> {
            synchronized (m){
                m.entrer_salle();
            }
        });
        t_entrer_salle.start();

        Thread t_suivre_cours = new Thread(()-> {
            synchronized (m){
                m.suivre_cours();
            }
        });
        t_suivre_cours.start();

        Thread t_faire_TP = new Thread(()-> {
            synchronized (m){
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
