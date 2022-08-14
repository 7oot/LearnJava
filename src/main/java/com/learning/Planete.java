package com.learning;

public class Planete {

        String nom;
        long diametre;
        String matiere;
        int totalVisiteurs = 0;
    int revolution (int angle){

        return angle/360;

    }
    int rotation(int angle){

        return angle/360;
    }


        void accueillirVaisseau ( int nbVisiteurs) {
            totalVisiteurs=totalVisiteurs+nbVisiteurs;

        }

        void accueillirVaisseau ( String TypeVaisseau) {

                     if (TypeVaisseau.equals("CHASSEUR")) {
                        totalVisiteurs =totalVisiteurs +3;
        }
                     else if (TypeVaisseau.equals ("FREGATE")){
                         totalVisiteurs =totalVisiteurs +12;
        }
                      else if (TypeVaisseau.equals("CROISEUR")){
                          totalVisiteurs =totalVisiteurs +50;
        }





    }
}


