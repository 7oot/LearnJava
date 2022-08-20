package com.learning;

public class UsineDAssemblage {
    VehiculeAMoteur assembler() {
        Moteur moteur = new Moteur();
        VehiculeAMoteur vam = new VehiculeAMoteur(moteur);
        return  vam;
    }
}
