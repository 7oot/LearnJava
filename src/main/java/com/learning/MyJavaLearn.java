package com.learning;

public class MyJavaLearn {
    public static void main(String[] args) {
        Voiture voitureDe7oot = new Voiture();
        voitureDe7oot.nbPortes = 5;
        voitureDe7oot.automatique = true;
        voitureDe7oot.couleur = "rouge";
        System.out.println("la voiture de Malek est de couleur " + voitureDe7oot.couleur + " et elle dispose de " + voitureDe7oot.nbPortes + " portes");

        voitureDe7oot.klaxonner();
        System.out.println("la voiture de Malek accelere à " + voitureDe7oot.accelerer() + "KM/h");
        int Nvvitesse = voitureDe7oot.accelerer();
        System.out.println(Nvvitesse);

        int nvrapport = voitureDe7oot.passerRapport(true);
        voitureDe7oot.passerRapport(true);
        voitureDe7oot.passerRapport(true);
        nvrapport = voitureDe7oot.passerRapport(false);

        System.out.println("le nouveau rapport est:" + nvrapport);

        voitureDe7oot.tournerGD(false, 45);
        Voiture voitureDeJerome = new Voiture();
        voitureDeJerome.nbPortes = 3;
        voitureDeJerome.couleur = "bleu";
        voitureDeJerome.automatique = true;
        Moteur moteurDeLaVoitureDeJerome = new Moteur();
        moteurDeLaVoitureDeJerome.Carburation = "Diesel";
        moteurDeLaVoitureDeJerome.cylindre = 4;
        voitureDeJerome.moteur = moteurDeLaVoitureDeJerome;

        Moteur moteurDeLaVoitureDe7oot = new Moteur();
        moteurDeLaVoitureDe7oot.cylindre = 8;
        voitureDe7oot.moteur = moteurDeLaVoitureDe7oot;

        System.out.println("la voiture de 7oot a " + voitureDe7oot.moteur.cylindre + " cylindres");
        System.out.println("la voiture de Jerome a " + voitureDeJerome.moteur.cylindre + " cylindres");

        Passager passager = new Passager();
        passager.nom = "Leclerc";
        passager.prenom = "Maurice";
        Ville villeDeDepart = new Ville();
        villeDeDepart.nom = "Manouba";
        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Paris";
        Ville villeDeSesReves = voitureDe7oot.transporter(passager, villeDeDepart, villeDeDestination);
        System.out.println(villeDeSesReves.nom + " est la ville de ses reves ");
        System.out.println("la voiture de 7oot à " + voitureDe7oot.nbroues);
        System.out.println("la voiture de 7oot à " + Voiture.nbroues);






        /* projet planete */
        Planete solarSystemPlanet = new Planete();

        solarSystemPlanet.nom = "Jupiter";
        solarSystemPlanet.matiere = "gazeuses";
        solarSystemPlanet.diametre = 142984;



        /* Section x.y : nouveau exerice */
        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        Planete neuf = new Planete();


        System.out.println(solarSystemPlanet.nom + " est une planète  " + solarSystemPlanet.matiere + " avec un diamètre de " + solarSystemPlanet.diametre + " kilomètres ");
        System.out.println(neptune.nom + " est une planète  " + neptune.matiere + " avec un diamètre de " + neptune.diametre + " kilomètres ");
        System.out.println(neuf.nom + " est une planète " + neuf.matiere + " avec un diamètre de " + neuf.diametre + " kilomètres.");

        System.out.println("Venus a effectué " + solarSystemPlanet.rotation(1250) + " tours complets autour de son étoile.");

        System.out.println("neptune a effectué " + neptune.revolution(-684) + " tours complets autour de son étoile.");

/**
 System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de "+solarSystemPlanet.accueillirVaisseau("FREGATE",8));
 **/
        Vaisseau nouveauVaisseau = new Vaisseau();
        nouveauVaisseau.NbsPassenger = 9;
        nouveauVaisseau.type = "FREGATE";
        neptune.accueillirVaisseau(nouveauVaisseau, nouveauVaisseau.NbsPassenger);
        Vaisseau secondVaisseau = new Vaisseau();
        secondVaisseau.NbsPassenger = 42;
        secondVaisseau.type = "Croiseur";
        neptune.accueillirVaisseau(secondVaisseau, secondVaisseau.NbsPassenger);

        System.out.println("La forme d'une planète est " + Planete.forme);
        System.out.println("La forme de " + solarSystemPlanet.nom + " est " + solarSystemPlanet.forme);

    }
}



/**
        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";

        Atmosphere  atmosphereuranus = new Atmosphere ();



        atmosphereuranus.tauxDHydrogene= 83;

        atmosphereuranus.tauxDHelium= 15;
        atmosphereuranus.tauxDeMethane= 2.5f;



        System.out.println("uranus est composé :");

        System.out.println("A " +atmosphereuranus.tauxDHydrogene+" % d'hydorgene" );
        System.out.println( "A " +atmosphereuranus.tauxDAargon+"% d'argon" );
        System.out.println( "A " +atmosphereuranus.tauxDeDioxydeDeCarbone+"% de dioxyde de carbone" );
        System.out.println( "A " +atmosphereuranus.tauxDAzote+"% d'azote" );
        System.out.println( "A " +atmosphereuranus.tauxDHelium+"% d'hélium" );
        System.out.println( "A " +atmosphereuranus.tauxDeMethane+"% de méthane " );
        System.out.println( "A " +atmosphereuranus.tauxDeSodium+"% de Sodium" );





    }

}
        /**for (int nbPlanetes=7;nbPlanetes<10; nbPlanetes++){
            switch (nbPlanetes) {
                case 7:
                    System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                    break;
                case 8:
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                    break;
                case 9:
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                    break;
                default:
                    System.out.printf("Le programme ne peut pas fournir de résultat pour %d", nbPlanetes);

            }
        int nbPlanetes=6;
        while (nbPlanetes<10){
            nbPlanetes++;
            switch (nbPlanetes) {
                case 7:
                    System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                    break;
                case 8:
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                    break;
                case 9:
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                    break;
                default:
                    System.out.printf("Le programme ne peut pas fournir de résultat pour %d", nbPlanetes);
            }
        }

        int mois=10;
        switch (mois) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("cest la saison d hiver");
                break;
            case 3 :
            case 4 :
            case 5:
                System.out.println("cest la saison du printemps");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("cest la saison d'été");
                break;
            default:
                System.out.println("cest la saison d'automne");
        }

        int mois=12;
        switch (mois) {
            case 1 :
                System.out.println("cest le mois de Janvier");
                break;
            case 2 :
                System.out.println("cest le mois de fevrier");
                break;
            case 3 :
                System.out.println("cest le mois de MARS");
                break;
            default:
                System.out.println("ce mois n'est pas considerer");
        }


        int age=45;
        System.out.printf("l age de la personne est de %d ",age);

        if (age>30) {
            System.out.println("oui je fais plus jeune.");
        }
        int ageDuChef = 28;
        /**if (ageDuChef > 20 && age < 50){
            System.out.println("l age du Chef est "+ ageDuChef);
        }
         else if (ageDuChef = 15){
            System.out.println("bravo!);
         }
        else {
            System.out.println("on n'affiche rien");
        }
        System.out.println(ageDuChef > 20 && age < 50 ? "l age du Chef est "+ ageDuChef: "on n'affiche rien");

        /**String phrase="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de ";
         int pl= 8;
         System.out.println( phrase + pl);
         phrase = "il y a quelques années cependant, elles étaient au nombre de ";
         int pL= 9;
         System.out.println(  phrase +  pL);
         String planete= "nombre Total des planetes a augmente";
         System.out.println(planete);

         int resultat= 5/2;
         int reste = 5%2;
         System.out.println(resultat + reste);
         float chiffre=5f/2+3;
         float chiffre2=5f/(2+3);
         System.out.println(chiffre +chiffre2);

         int n1=20;
         int n2=30;
         char lettre1= 'Y';
         char lettre2= 'f';
         boolean estCeQUE= n1==n2;
         boolean estCeQUE2= n1!=n2;
         boolean estCeQUE3= n1>=n2;
         boolean estCeQUE4= lettre1<=lettre2;
         System.out.println(estCeQUE);
         System.out.println(estCeQUE2);
         System.out.println(estCeQUE3);
         System.out.println(estCeQUE4);
         boolean bool1= true;
         boolean bool2= false;
         boolean bool3= false;
         boolean estCeQUE= bool1||bool2;
         boolean estCeQUE2= bool1&&bool2;
         boolean estCeQUE3= bool3^bool2;
         boolean estCeQUE4= bool3^bool1;
         boolean estCeQUE5= !bool3^bool1;
         System.out.println(estCeQUE);
         System.out.println(estCeQUE2);
         System.out.println(estCeQUE3);
         System.out.println(estCeQUE4);
         System.out.println(estCeQUE5);

         int valeur1= 10;
         int valeur2;
         int valeur3=++valeur1;
         valeur1= valeur1 ++;
         valeur2= valeur1 ++;

         System.out.println(valeur1);
         System.out.println(valeur2);
         System.out.println(valeur3);
         /**int numeroannee=2003;
         int nbPlanetes=8;
         if (numeroannee==2003) {

         System.out.printf("En %d, les planètes du système solaire étaient au nombre de ", numeroannee +nbPlanetes) ;
         }
         numeroannee=2014;
         if (numeroannee==2014) {
         System.out.printf("En %d, les planètes du système solaire étaient au nombre de  ", numeroannee+ nbPlanetes++) ;

         }***/
