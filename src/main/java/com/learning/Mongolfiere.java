package com.learning;

public class Mongolfiere implements Amarable{
    int surface;



    @Override
    public int conbienDeCorde(int vitesseDuVent) {
        int nbCordes=surface/50;
        nbCordes=nbCordes+vitesseDuVent/100;
        return nbCordes;
    }
}
