package com.learning;

public class Bateau implements Amarable{
    int masse;
    int vitesseDuVent;


    @Override
    public int conbienDeCorde(int vitesseDuVent) {

        int nbCordes= masse/10;
        nbCordes= nbCordes+vitesseDuVent/100;
        return nbCordes;


    }
}
