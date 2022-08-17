package com.learning.exercice20;

public class HelloUniverse {

    public static void main(String... args) {
        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "Tellurique";
        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";


        // une Frégate de 9 passagers
        Vaisseau premierVaisseau = new Vaisseau();
        premierVaisseau.type = "Frégate";
        premierVaisseau.nbPassagers = 9;
        mars.accueillirVaisseau(premierVaisseau);


        Vaisseau deuxiemeVaisseau = new Vaisseau();
        deuxiemeVaisseau.type = "Croiseur";
        deuxiemeVaisseau.nbPassagers = 42;
        mars.accueillirVaisseau(deuxiemeVaisseau);
    }

}
