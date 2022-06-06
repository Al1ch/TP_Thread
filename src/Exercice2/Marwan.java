package Exercice2;

import java.util.concurrent.ThreadLocalRandom;

public class Marwan extends Thread{

    public void petit_dej(){
        System.out.println("Il prend son petit déjeuner");
    }
    public void fumer(){
        System.out.println("Il fume sa cigarette");
    }
    public void transports(){
        System.out.println("Il veut prend les transports en commun");
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Il prend les transports en commun");
    }
    public void marcher(){
        System.out.println("Il y a un mouvement social donc il part à pied");
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
        Thread t_dejeuner = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (m){
                    m.petit_dej();
                }
            }
        });
    }
}
