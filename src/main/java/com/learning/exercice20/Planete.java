package com.learning.exercice20;

public class Planete {
    String nom;
    int diametre;
    String matiere;
    int totalVisiteurs;
    Atmosphere atmosphere;

    Vaisseau vaisseauAccoste;

    int revolution(int degres) {
        System.out.println("Je suis la planète " + nom + " et je tourne autour de mon étoile de " + degres + " degrés.");
        return degres / 360;
    }

    int rotation(int degres) {
        System.out.println("Je suis la planète " + nom + " et je tourne sur moi-même de " + degres + " degrés.");
        return degres / 360;
    }

    void accueillirVaisseau(int nbHumains) {
        totalVisiteurs += nbHumains;
    }

    void accueillirVaisseau(String typeVaisseau) {
        if (typeVaisseau.equals("CHASSEUR")) {
            totalVisiteurs += 3;
        } else if (typeVaisseau.equals("FREGATE")) {
            totalVisiteurs += 12;
        } else if (typeVaisseau.equals("CROISEUR")) {
            totalVisiteurs += 50;
        }
    }

    void accueillirVaisseau(Vaisseau vaisseau) {
        totalVisiteurs += vaisseau.nbPassagers;
        if (vaisseauAccoste == null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        } else {
            System.out.println(" Un vaisseau de type " + vaisseauAccoste.type + "  doit s'en aller.");
        }
        vaisseauAccoste = vaisseau;
    }
}