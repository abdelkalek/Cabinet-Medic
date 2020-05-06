import classes.Consultation;
import classes.Medicament;
import classes.Patient;
import classes.RDV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainClass {


    public static void main(String[] args){
        int choixNiv1 ;
        int choixNiv2;
        int choixNiv3;
        ArrayList<Patient> ALPatients = new ArrayList<Patient>();
        ArrayList<Medicament> ALMedicaments = new ArrayList<Medicament>();
        ArrayList<RDV> ALRDVs = new ArrayList<RDV>();
        ArrayList<Consultation> ALConsultations = new ArrayList<Consultation>();
        ArrayList<Medicament> ALMedicCons = new  ArrayList<Medicament>();
        do {
            System.out.println("/**   BIENVENUE DANS LE CABINET MEDICAL  **/");
            System.out.println("   1 : GESTION Des Patients  ");
            System.out.println("   2 : GESTION Des Médicaments  ");
            System.out.println("   3 : GESTION Des RDVs  ");
            System.out.println("   4 : GESTION Des Consultations ");
            System.out.println("   5 : QUITTER L'application  ");
            System.out.println("/*******************************/");
            System.out.println(" Taper votre choixNiv1 SVP  ");
            Scanner sc = new Scanner(System.in);
            choixNiv1 = sc.nextInt();
            switch (choixNiv1){
                case 1 :
                    do{
                        System.out.println("/**   BIENVENUE DANS La GESTION Des Patients  **/");
                        System.out.println("   1 : Ajouter un Patient  ");
                        System.out.println("   2 : Modifier un Patient ");
                        System.out.println("   3 : Supprimer un Patient  ");
                        System.out.println("   4 : Afficher la liste des Patients  "); //afficher liste des Patients
                        System.out.println("   5 : Quitter la gestion Des Patients  ");
                        System.out.println("/*******************************/");
                        System.out.println(" Taper votre choixNiv2 SVP  ");
                        choixNiv2 = sc.nextInt();
                        switch (choixNiv2) {
                            case 1:
                                Patient p = new Patient();
                                p.Saisir();
                                p.Ajouter(ALPatients);
                                break;
                            case 2:
                                System.out.println(" Taper le numero de patient à modifier  ");
                                int numpatient = sc.nextInt();
                                ALPatients.get(numpatient).Modifier(ALPatients);
                                break;
                            case 3:
                                System.out.println(" Taper le numero de patient à Supprimer  ");
                                int numpatientSupp = sc.nextInt();
                                ALPatients.get(numpatientSupp).Supprimer(ALPatients);
                                break;
                            case 4:
                                /***************mise a jours****************/
                                if (ALPatients.isEmpty())
                                {
                                     System.out.println(" Liste des patients est vide   ");

                                }else{
                                    for (Patient pa : ALPatients)
                                    {
                                        System.out.println(pa+"  ");

                                    }
                                    System.out.println("Fin de Liste des patients    ");
                                }

                          /*******************************/
                                break;
                            default:
                                if (choixNiv2 != 5)
                                    System.out.println(" Choix invalide  ");
                        }
                    }while( choixNiv2 != 5) ;

                break;
                case 2 :
                    do{
                        System.out.println("/**   BIENVENUE DANS La GESTION Des Médicaments  **/");
                        System.out.println("   1 : Ajouter un Medicament  ");
                        System.out.println("   2 : Modifier un Medicament ");
                        System.out.println("   3 : Supprimer un Medicament  ");
                        System.out.println("   4 : Afficher la liste des Medicaments disponible  "); //afficher liste des Medicaments
                        System.out.println("   5 : Approvisionner un nouveau  Qte  ");
                        System.out.println("   6 : Quitter la gestion Des Medicaments  ");
                        System.out.println("/*******************************/");
                        System.out.println(" Taper votre choixNiv2 SVP  ");
                        choixNiv2 = sc.nextInt();
                        switch (choixNiv2) {
                            case 1:
                                Medicament m = new Medicament();
                                m.Saisir();
                                m.Ajouter(ALMedicaments);
                                break;
                            case 2:
                                System.out.println(" Taper le numero de Medicament à modifier  ");
                                int num = sc.nextInt();
                                ALMedicaments.get(num).Modifier(ALMedicaments);
                                break;
                            case 3:
                                System.out.println(" Taper le numero de Medicament à Supprimer  ");
                                int numSupp = sc.nextInt();
                                ALMedicaments.get(numSupp).Supprimer(ALMedicaments);
                                break;
                            /***************mise a jours****************/
                            case 4:
                                if (ALMedicaments.isEmpty())
                                {
                                    System.out.println("Liste des Medicaments est vide   ");

                                }else{
                                    for (Medicament Med : ALMedicaments)
                                    {
                                        System.out.println(Med+"  ");
                                    }
                                    System.out.println("Fin de Liste des Medicaments    ");
                                }

                                break;
                            case 5:
                                System.out.println(" Taper le numero de Medicament à modifier  ");
                                int numADD = sc.nextInt();
                                System.out.println(" Taper le nouveau QTE  ");
                                int QTE = sc.nextInt();
                                try {
                                    if(!ALMedicaments.isEmpty())
                                    {
                                        ALMedicaments.get(numADD).Approvisionner(ALMedicaments, QTE);
                                    }else
                                        {
                                            System.out.println("Warning: pas de Medicament ");
                                        }

                                } catch(Exception e){
                                        System.out.println("Warning: pas de Medicament ou il y a un autre probleme  => "+e);
                                }

                                break;
                            /***************Fin mise a jours****************/
                            default:
                                if (choixNiv2 != 6)
                                    System.out.println(" Choix invalide  ");
                        }
                    }while( choixNiv2 != 6) ;

                break;
                case 3 :
                    do{
                        System.out.println("/**   BIENVENUE DANS La GESTION Des RDVs  **/");
                        System.out.println("   1 : Ajouter un RDV  ");
                        System.out.println("   2 : Modifier un RDV ");
                        System.out.println("   3 : Supprimer un RDV  ");
                        System.out.println("   4 : Afficher les RDV disponible  "); //Afficher les RDV disponible
                        System.out.println("   5 : Quitter la gestion Des RDVs  ");
                        System.out.println("/*******************************/");
                        System.out.println(" Taper votre choixNiv2 SVP  ");
                        choixNiv2 = sc.nextInt();
                        switch (choixNiv2) {
                            case 1:
                                RDV m = new RDV();
                                /*integration de notation de cle  de patient   */
                                System.out.println("donner Num de  patient qui prendre RDV : ");
                                Integer nump=sc.nextInt();
                                if(ALPatients.isEmpty()||ALPatients==null)
                                {
                                    System.out.println(" liste de patient est vide  ");
                                }else
                                    {
                                        for(Patient p : ALPatients)
                                        {
                                            if(p.getNumero().equals(nump))
                                            {
                                                m.Prendre(nump);
                                                m.Ajouter(ALRDVs);
                                                System.out.println(" RDV  Ajouter Avec succès: ");
                                            }
                                            else
                                            {
                                                System.out.println("il faut précédemment précisé le patient qui veut prendre un  RDV : ");
                                            }
                                        }
                                    }

                                break;
                            case 2:
                                System.out.println(" Taper le numero de RDV à modifier  ");
                                int num = sc.nextInt();
                                ALRDVs.get(num).Modifier(ALRDVs);
                                break;
                            case 3:
                                System.out.println(" Taper le numero de RDV à Supprimer  ");
                                int numSupp = sc.nextInt();
                                ALRDVs.get(numSupp).Supprimer(ALRDVs);
                                break;
                            case 4:
                                if (ALRDVs.isEmpty())
                                {
                                    System.out.println("pas des RDV pour pour le moment  ");

                                }else{
                                    for (RDV RD : ALRDVs)
                                    {
                                        System.out.println(RD+" ");
                                    }
                                    System.out.println("Fin LISTE  RDV  ");
                                }

                                break;
                            default:
                                if (choixNiv2 != 5)
                                    System.out.println(" Choix invalide  ");
                        }
                    }while( choixNiv2 != 5) ;


                break;
                case 4 :
                    do{
                        System.out.println("/**   BIENVENUE DANS La GESTION Des Consultations  **/");
                        System.out.println("   1 : Ajouter un Consultation  ");
                        System.out.println("   2 : Modifier un Consultation ");
                        System.out.println("   3 : Supprimer un Consultation  ");
                        System.out.println("   4 : Afficher les Consultation "); //Afficher les RDV disponible
                        System.out.println("   5 : Quitter la gestion Des Consultations  ");
                        System.out.println("/*******************************/");
                        System.out.println(" Taper votre choixNiv2 SVP  ");
                        choixNiv2 = sc.nextInt();
                        switch (choixNiv2) {
                            case 1:

                                /*integration de notation de cle  de patient   */
                                System.out.println("donner Numero de  RDV de  Consultation : ");
                                Integer numR=sc.nextInt();
                                if(ALRDVs.isEmpty()||ALRDVs==null)
                                {
                                    System.out.println(" liste de RDV est vide  ");
                                }else
                                {
                                    for(RDV R : ALRDVs)
                                    {
                                        if(R.getNumero().equals(numR))
                                        {

                                            Consultation m = new Consultation();
                                            m.Saisir(numR);
                                            m.Ajouter(ALConsultations);
                                            do{
                                                System.out.println("               1 : Ajouter un Medicament pour cette consultation  ");
                                                System.out.println("               2 : Supprimer un Medicament de cette consultation  ");
                                                System.out.println("               3 : Quitter l'ajout  de Medicament a cette consultation  ");
                                                choixNiv3 = sc.nextInt();
                                                switch (choixNiv3) {
                                                    case 1:
                                                        if(ALMedicaments.isEmpty())
                                                        {
                                                            System.out.println(" Liste de medic est vide");
                                                        }
                                                        else {

                                                            Medicament med1 = new Medicament();
                                                            med1.Saisir(numR);
                                                            for(Medicament m1 : ALMedicaments)
                                                            {
                                                             /* System.out.println(" m1.getCode_unique() "+m1.getCode_unique());
                                                                System.out.println(" med1.getCode_unique() "+med1.getCode_unique());
                                                                System.out.println(" m1.getQuantite()"+m1.getQuantite());
                                                                System.out.println(" med1.getQuantite() "+med1.getQuantite());*/

                                                                if((m1.getCode_unique().equals(med1.getCode_unique())) && (m1.getQuantite()>med1.getQuantite()))
                                                                {
                                                                    med1.Ajouter(ALMedicCons);
                                                                    m1.setQuantite(m1.getQuantite()-med1.getQuantite());
                                                                    System.out.println("medicaement Ajoutee");
                                                                } else
                                                                    { System.out.println("probleme de QTE ou medic n'exist pas  ");

                                                                    }
                                                            }
                                                         }

                                                        break;
                                                    case 2:

                                                        System.out.println(" Taper le numero de Medicament à Supprimer  ");
                                                        int numSup = sc.nextInt();
                                                        ALMedicCons.get(numSup).Supprimer(ALMedicCons);
                                                        break;
                                                    default:
                                                        if (choixNiv3 != 3)
                                                            System.out.println(" Choix invalide  ");}
                                            }while( choixNiv3 != 3) ;

                                            System.out.println(" Consultation  Ajouter Avec succès: ");
                                        }
                                        else
                                      {
                                         System.out.println("il faut précédemment  prendre un  RDV : ");
                                      }
                                }
                            }

                                break;
                            case 2:
                                System.out.println(" Taper le numero de Consultation à modifier  ");
                                int num = sc.nextInt();
                                ALConsultations.get(num).Modifier(ALConsultations);
                                break;
                            case 3:
                                System.out.println(" Taper le numero de Consultation à Supprimer  ");
                                int numSupp = sc.nextInt();
                                ALConsultations.get(numSupp).Supprimer(ALConsultations);
                                break;
                            case 4:
                                if (ALConsultations.isEmpty())
                                {
                                    System.out.println("liste des Consultations est vide !  ");

                                }else{
                                    for (Consultation Con : ALConsultations)
                                    {
                                        System.out.println(Con+"  ");

                                    }
                                    System.out.println("Fin LISTE  Consultations  ");
                                }

                                break;
                            default:
                                if (choixNiv2 != 5)
                                    System.out.println(" Choix invalide  ");
                        }
                    }while( choixNiv2 != 5) ;


                default:
                    if (choixNiv1 != 5)
                        System.out.println(" Choix invalide  ");

            }
        }while( choixNiv1 !=5);
        System.out.println(" MERCI POUR VOTRE VISITE - Au revoir  ");






//
//
//        System.out.println("//////////* GESTION DES PATIENTs  */////////////");
//
////////////////////////////* GESTION DES PATIENTs  *//////////////////////////////////
//        /* Creation de la liste des Patients - Initialement vide */
//        ArrayList ALP = new ArrayList<Patient>();
//        /* Creation des Patients */
//        Patient p1 = new Patient(); Patient p2 = new Patient(); Patient p3 = new Patient();
//        p1.Saisir(); p2.Saisir();   p3.Saisir();
//        /* Ajout des Patients dans liste ALP */
//        p1.Ajouter(ALP);        p2.Ajouter(ALP);        p3.Ajouter(ALP);
//        /* Affichage de la liste des Patients */
//        for( int i=0; i<ALP.size();i++){
//            System.out.println(ALP.get(i));
//        }
//        /* Modification du 2eme Patient */
//        if(p2.Modifier(ALP)){
//              System.out.println("succesful Update");
//        } else{
//              System.out.println("error Update");
//        }
//        /* Suppression du 1er Patient */
//      if(p1.Supprimer(ALP))  {
//            System.out.println("succesful Supprimer");
//      }else{
//          System.out.println("error Supprimer");
//      }
//      ////////////FIN//////////////
//
//
//        System.out.println("//////////* GESTION DES Medicaments  */////////////");
//        //////////////////////////* GESTION DES Medicaments  *//////////////////////////////////
//        /* Creation de la liste des Medicaments - Initialement vide */
//        ArrayList ALM = new ArrayList<Medicament>();
//        /* Creation des Medicaments */
//        Medicament m1 = new Medicament(); Medicament m2 = new Medicament(); Medicament m3 = new Medicament();
//        m1.Saisir(); m2.Saisir();   m3.Saisir();
//        /* Ajout des Medicaments dans liste ALM */
//        m1.Ajouter(ALM);        m2.Ajouter(ALM);        m3.Ajouter(ALM);
//        /* Affichage de la liste des Medicaments */
//        for( int i=0; i<ALM.size();i++){
//            System.out.println(ALM.get(i));
//        }
//        /* Modification du 2eme Medicament */
//        if(m2.Modifier(ALM)){
//            System.out.println("succesful Update");
//        } else{
//            System.out.println("error Update");
//        }
//        /* Suppression du 1er Medicament */
//        if(m1.Supprimer(ALM))  {
//            System.out.println("succesful Supprimer");
//        }else{
//            System.out.println("error Supprimer");
//        }
//        ////////////FIN//////////////
//
   }

}
