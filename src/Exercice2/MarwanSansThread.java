package Exercice2;

public class MarwanSansThread extends Marwan{
    //Hérite de Marwan pour ne pas redéfinir les mêmes fonctions
    public static void main(String[] args) {
        MarwanSansThread m = new MarwanSansThread();
        m.petit_dej();
        m.fumer();
        m.transports();
        m.marcher();
        m.entrer_salle();
        m.suivre_cours();
        m.faire_TP();
    }
}
