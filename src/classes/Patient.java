package classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*enum Civile {
    divorce,
    marie,
    celibataire,
    autres
 };*/

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Patient {
    private Integer numero;
    private String nom;
    private String prenom;
    private String addresse;
    private String etat_civile;
    private Date date_naissance;
    private String lieu_naissance;



    public boolean Ajouter(ArrayList<Patient> ALP){
        if (ALP.add(this)){
            return true;
        }else{
            return false;
        }
    }

    public int Rechercher(ArrayList<Patient> ALP) {
        if( (ALP.isEmpty()) || (ALP==null) ){
            System.out.print("La liste est Vide !!");
        }else {
            for (int i = 0; i < ALP.size(); i++) {
                if (ALP.get(i).equals(this)) {
                    return i;
                }
            }
            return -1 ;
        }
        return -1 ;
    }

/*    public boolean Supprimer(ArrayList<Patient> ALP,  Integer num){
        if( (ALP.isEmpty()) || (ALP==null) ){
            System.out.print("La liste est Vide !!");
            return false;
        }else {
            int index= Rechercher(ALP);
            if (index== -1){
                System.out.print("Patient de numero:" +num+ " nest pas trouvé");
                return false;
            }else{
                ALP.remove(index);
                return true;
            }

        }
    }*/

    public boolean Supprimer(ArrayList<Patient> ALP){
        if( (ALP.isEmpty()) || (ALP==null) ){
            System.out.print("La liste est Vide !!");
            return false;
        }else {
            if (!ALP.contains(this)){
                System.out.print("Patient nest pas trouvé");
                return false;
            }else{
                ALP.remove(this);
                return true;
            }
        }
    }


    public boolean Modifier(ArrayList<Patient> ALP){
        if( (ALP.isEmpty()) || (ALP==null) ){
            System.out.print("La liste est Vide !!");
            return false;
        }else {
            if (this == null){
                System.out.print("Patient est  null ");
                return false;
            }else{
                int index= this.Rechercher(ALP);
                Scanner scf= new Scanner(System.in);
                System.out.println("/*** Bienvenu dans la modification du patient ***/");
                System.out.println("Nv numero: ");
                ALP.get(index).setNumero(scf.nextInt());
                System.out.println("Nv nom: ");
                ALP.get(index).setNom( scf.next());
                System.out.println("Nv prenom: ");
                ALP.get(index).setPrenom(scf.next());
                System.out.println("Nv addresse: ");
                ALP.get(index).setAddresse( scf.next());
                System.out.println("Nv etat_civile: ");
                ALP.get(index).setEtat_civile( scf.next());
                System.out.println("Nv date_naissance: Sous FORMAT XX/XX/XXXX ");
                try
                {
                    DateFormat formatter;
                    Date date;
                    formatter = new SimpleDateFormat("MM/dd/yyyy");
                    date = (Date)formatter.parse(scf.next());
                    ALP.get(index).setDate_naissance( date);
                }
                catch (Exception e)
                {
                    System.out.println("Erreur :"+e);
                }

                System.out.println("Nv lieu_naissance: ");
                ALP.get(index).setLieu_naissance( scf.next());
                return true;
            }

        }

    }

     // ecrire () = System.out.println()
    //lire(x)= Scanner scf = new Scanner ( System.in);
     //           sc.next(x);
    public void Saisir ( )  {
        Scanner scf= new Scanner(System.in);

        System.out.println("/*** Bienvenu dans la saisie du patient ***/");

        System.out.println("numero: ");
        this.setNumero(scf.nextInt());

        System.out.println("nom: ");
        this.setNom( scf.next());

        System.out.println("prenom: ");
        this.setPrenom(scf.next());

        System.out.println("addresse: ");
        this.setAddresse( scf.next());

        System.out.println("etat_civile: ");
        this.setEtat_civile( scf.next());
        System.out.println("date_naissance: Sous FORMAT XX/XX/XXXX ");


        try
        {
            DateFormat formatter;
            Date date;
            formatter = new SimpleDateFormat("MM/dd/yyyy");
            date = (Date)formatter.parse(scf.next());
            this.setDate_naissance(date);
        }
        catch (Exception e)
        {
            System.out.println("Erreur :"+e);
        }

        System.out.println("lieu_naissance: ");
        this.setLieu_naissance( scf.next());
        //scf.close();

    }





}


 /*
        System.out.println("numero: "+ this.numero);
                System.out.println("nom: "+ this.nom);
                System.out.println("prenom: "+ this.prenom);
                System.out.println("addresse: "+ this.addresse);
                System.out.println("etat_civile: "+ this.etat_civile);
                System.out.println("lieu_naissance: "+ this.lieu_naissance);
    */