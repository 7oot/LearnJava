package com.learning;

public class MyJavaLearn {
    public static void main(String[] args) {
        Voiture voitureDe7oot = new Voiture();
        voitureDe7oot.nbPortes = 5;
        voitureDe7oot.automatique = true;
        voitureDe7oot.couleur = "rouge";
        System.out.println("la voiture de Malek est de couleur " + voitureDe7oot.couleur + " et elle dispose de " + voitureDe7oot.nbPortes + " portes");

        voitureDe7oot.Klaxonner();
        System.out.println("la voiture de Malek accelere à " +voitureDe7oot.Accelerer()+ "KM/h");
        int Nvvitesse = voitureDe7oot.Accelerer();
        System.out.println(Nvvitesse);

        int nvrapport= voitureDe7oot.PasserRapport(true);
        voitureDe7oot.PasserRapport(true);
        voitureDe7oot.PasserRapport(true);
        nvrapport=voitureDe7oot.PasserRapport(false);

        System.out.println("le nouveau rapport est:" + nvrapport);

        voitureDe7oot.TournerGD(false,45);




        Planete PlaneteduSystemeSolaire = new Planete();

        PlaneteduSystemeSolaire.nom = "Jupiter";
        PlaneteduSystemeSolaire.matiere = "gazeuses";
        PlaneteduSystemeSolaire.diametre = 142984;



        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        Planete neuf = new Planete();


        System.out.println(PlaneteduSystemeSolaire.nom + " est une planète  " + PlaneteduSystemeSolaire.matiere + " avec un diamètre de " + PlaneteduSystemeSolaire.diametre + " kilomètres ");
        System.out.println(neptune.nom + " est une planète  " + neptune.matiere + " avec un diamètre de " + neptune.diametre + " kilomètres ");
        System.out.println(neuf.nom + " est une planète " + neuf.matiere + " avec un diamètre de " + neuf.diametre + " kilomètres.");

        System.out.println("Venus a effectué "+PlaneteduSystemeSolaire.rotation (1250) +" tours complets autour de son étoile.");

        System.out.println("neptune a effectué "+neptune.revolution (-684) +" tours complets autour de son étoile.");

        PlaneteduSystemeSolaire.accueillirVaisseau(8);
        PlaneteduSystemeSolaire.accueillirVaisseau("FREGATE");
        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de"+PlaneteduSystemeSolaire.totalVisiteurs);

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


