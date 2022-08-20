package com.learning;

public class Voiture extends VehiculeAMoteur implements Vidangeable{

    // Les attributs

        boolean automatique;
        int rapportCourant;
        int VitesseCourante;
        static int nbroues=4;
        Moteur moteur;
        static String couleur= "Jaune";
        static int nbPortes=5;

    public Voiture() {

    }

    // Les méthodes
        static void klaxonner() {
            System.out.println("toutouuuuut");
        }

        int accelerer(int VitesseSup) {
            System.out.println("j accelere ");
            return VitesseCourante+VitesseSup;
       }
       int passerRapport(boolean augmenter){
            if (augmenter){
                this.rapportCourant++;
            }
            else {
                this.rapportCourant--;
            }
           return this.rapportCourant;
       }
       void tournerGD(boolean droite, int angle) {
           String GD = null;
           if(droite) {
               GD= "droite";
           } else {
               GD= "gauche";
           }
           System.out.println("la voiture va tourner à " + GD + "d un angle de " + angle);

       }
        void tournerGD(String GD, int angle) {
            System.out.println("la voiture a tourne à "+ GD + "de " + angle);
        }
        Ville transporter (Passager passager, Ville villeDeDepart, Ville villeDeDestionation){
            System.out.println("je tranporte un passager dont le nom est " + passager.prenom + " " + passager.nom);

            System.out.println("le passager est parti de la ville de "+ villeDeDepart.nom + " et se dirige vers la ville de "+ villeDeDestionation.nom);
            Ville villeDeSesReves= new Ville();
            villeDeSesReves.nom= "Bali";

            return villeDeSesReves;
        }
        Voiture(String couleur, int nbPortes){
            super();
            this.couleur=couleur;
            System.out.println("la couleur de la voiture est " +Voiture.couleur);
            this.nbPortes=nbPortes;
            System.out.println("le nombre de porte est égale à " + Voiture.nbPortes);

        }

    @Override
    public void vidanger() {
        System.out.println("Devisser le bouchon");
    }
}



