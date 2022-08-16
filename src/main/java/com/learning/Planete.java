package com.learning;

public class Planete {

        String nom;
        long diametre;
        String matiere;
        int totalVisiteurs = 0;
        Vaisseau nouveauVaisseau;
        Vaisseau secondVaisseau = new Vaisseau();

        Atmosphere  atmosphere = new Atmosphere ();
    static String forme="Sphérique";
    void revolution(){
        System.out.println("Je suis la planète " + nom + "et je tourne autour de mon étoile.");
    }
    void rotation (){
        System.out.println("Je suis la planète " + nom + "et je tourne sur moi-même.");

    }



    int revolution (int angle){

        return angle/360;

    }
    int rotation(int angle){

        return angle/360;
    }

        int accueillirVaisseau (Vaisseau vaisseau, int nbrHumains){

            if (nouveauVaisseau==null){
                System.out.println("Aucun vaisseau ne s'en va.");
            }

            else  {
                System.out.println("Un vaisseau de type"+ nouveauVaisseau.type + "doit s'en aller.");

            }
            nouveauVaisseau=secondVaisseau;


            nbrHumains=nbrHumains+vaisseau.NbsPassenger;
            return nbrHumains;



    }
}


        /***int accueillirVaisseau ( String typeVaisseau, int nbVisiteurs) {

                     if (typeVaisseau.equals("CHASSEUR")) {
                        totalVisiteurs =totalVisiteurs +3;
        }
                     else if (typeVaisseau.equals ("FREGATE")){
                         totalVisiteurs =totalVisiteurs +12;
        }
                      else if (typeVaisseau.equals("CROISEUR")){
                          totalVisiteurs =totalVisiteurs +50;
        }
                      totalVisiteurs=totalVisiteurs+nbVisiteurs;
                      return totalVisiteurs;


                if (vaisseau.equals("CHASSEUR")) {
                    System.out.println("le vaisseau "+ vaisseau + "doit partir" );
                    nbPassagers= nbPassagers +
                }
                else if (vaisseau.equals ("FREGATE")){
                    System.out.println("le vaisseau "+ vaisseau + "doit partir" );
                }
                else if (vaisseau.equals("CROISEUR")){
                    System.out.println("le vaisseau "+ vaisseau + "doit partir" );
                }
                else
                    System.out.println("Aucun vaisseu n est stationne ");

                return totalVisiteurs;

            }



    }
}**/
