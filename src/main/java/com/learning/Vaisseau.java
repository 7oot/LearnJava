package com.learning;

public class Vaisseau {
    int NbsPassenger;
    String type;
    int blindage;
    int resistanceDuBouclier ;

    void activerBouclier (){
        System.out.println("Activation du bouclier d'un vaisseau de type "+ type);
    }
    void desactiverBouclier (){
        System.out.println("Desactivation du bouclier d'un vaisseau de type "+ type);
    }
}
