package com.learning;

public class VaisseauDeGuerre extends Vaisseau {

    void attaque ( Vaisseau vaisseauAttaque , String arme, int dureeDAttaque ){

        System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " +vaisseauAttaque.type+"  en utilisant l'arme "+ arme + " pendant "+ dureeDAttaque+ " minutes");
        vaisseauAttaque.blindage=vaisseauAttaque.blindage/2;
        vaisseauAttaque.resistanceDuBouclier=0;
    }
}
