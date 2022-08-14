package com.learning;

public class Voiture {

        int nbPortes=5;
        String couleur;
        boolean automatique;
        int rapportCourant;
        int VitesseCourante;
        void Klaxonner () {
            System.out.println("toutouuuuut");
        }
       int Accelerer () {
            System.out.println("j accelere ");
            return 100;
        }
        int Accelerer (int VitesseSup) {
            System.out.println("j accelere ");
            return VitesseCourante+VitesseSup;
       }
       int PasserRapport(boolean augmenter){
            if (augmenter){
                rapportCourant++;
            }
            else {
                rapportCourant--;
            }
           return rapportCourant;
       }
       void TournerGD(boolean droite, int angle) {
           String GD = null;
           if(droite) {
               GD= "droite";
           } else {
               GD= "gauche";
           }
           System.out.println("la voiture va tourner à " + GD + "d un angle de " + angle);

       }
        void TournerGD (String GD, int angle) {
            System.out.println("la voiture a tourne à "+ GD + "de " + angle);
        }
}



