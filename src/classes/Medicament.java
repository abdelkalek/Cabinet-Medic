package classes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Scanner;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Medicament {
    private String code_unique;
    private String libele;
    private String description;
    private Integer quantite; // la quantite est un entier
    private Integer NumeroRDV ; // le numero de RDV
    public boolean Ajouter(ArrayList<Medicament> ALP){
        if (ALP.add(this)){
            return true;
        }else{
            return false;
        }
    }

    public int Rechercher(ArrayList<Medicament> ALP) {
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

    public boolean Supprimer(ArrayList<Medicament> ALP){
        if( (ALP.isEmpty()) || (ALP==null) ){
            System.out.print("La liste est Vide !!");
            return false;
        }else {
            if (!ALP.contains(this)){
                System.out.print("Medicament nest pas trouvé");
                return false;
            }else{
                ALP.remove(this);
                return true;
            }
        }
    }


    public boolean Modifier(ArrayList<Medicament> ALP){
        if( (ALP.isEmpty()) || (ALP==null) ){
            System.out.print("La liste est Vide !!");
            return false;
        }else {
            if (this == null){
                System.out.print("Medicament est  null ");
                return false;
            }else{
                int index= this.Rechercher(ALP);
                Scanner scf= new Scanner(System.in);

                System.out.println("/*** Bienvenu dans la modification du Medicament ***/");

                System.out.println("Nv code_unique: ");
                ALP.get(index).setCode_unique(scf.next());

                System.out.println("Nv libele: ");
                ALP.get(index).setLibele(scf.next());

                System.out.println("Nv description: ");
                ALP.get(index).setDescription(scf.next());

                System.out.println("Nv quantite: ");
                ALP.get(index).setQuantite( scf.nextInt());
                //scf.close();
                return true;
            }
        }
        }


    public void Saisir ( ){
        Scanner scf= new Scanner(System.in);

        System.out.println("/*** Bienvenu dans la saisie du Medicament ***/");

        System.out.println("Code_unique: ");
        this.setCode_unique(scf.next());

        System.out.println("Libele: ");
        this.setLibele( scf.next());

        System.out.println("Description: ");
        this.setDescription(scf.next());

        System.out.println("Quantite: ");
        this.setQuantite( scf.nextInt());

    }
public void  Approvisionner(ArrayList<Medicament> ALP , Integer Qte  ){

        if (this == null){
            System.out.print("Medicament est  null ");
        }else{
                int index = this.Rechercher(ALP);
                Scanner scf = new Scanner(System.in);
                System.out.println("/*** Bienvenu dans la Approvisionnement  du Medicament ***/");
                ALP.get(index).setQuantite(ALP.get(index).getQuantite() + Qte);
                System.out.println("Nv quantite: " + ALP.get(index).getQuantite());

        }
}


    public void Saisir ( Integer Rd ){
        Scanner scf= new Scanner(System.in);
        System.out.println("/*** Bienvenu dans la saisie du Medicament pour une consultation  ***/");
        this.setNumeroRDV(Rd);
        System.out.println("Code_unique: ");
        this.setCode_unique(scf.next());
        System.out.println("Quantite: ");
        this.setQuantite( scf.nextInt());
    }




}
