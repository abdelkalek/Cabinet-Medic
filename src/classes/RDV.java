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


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class RDV {
    private Integer numero;
    private String description;
    private Date date ;
    private Integer nump ;



    public boolean Ajouter(ArrayList<RDV> ALP){
        if (ALP.add(this)){
            return true;
        }else{
            return false;
        }
    }

    public int Rechercher(ArrayList<RDV> ALP) {
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

    public boolean Supprimer(ArrayList<RDV> ALP){
        if( (ALP.isEmpty()) || (ALP==null) ){
            System.out.print("La liste est Vide !!");
            return false;
        }else {
            if (!ALP.contains(this)){
                System.out.print("RDV nest pas trouvé");
                return false;
            }else{
                ALP.remove(this);
                return true;
            }
        }
    }


    public boolean Modifier(ArrayList<RDV> ALP){
        if( (ALP.isEmpty()) || (ALP==null) ){
            System.out.print("La liste est Vide !!");
            return false;
        }else {
            if (this == null){
                System.out.print("RDV est  null ");
                return false;
            }else{
                int index= this.Rechercher(ALP);
                Scanner scf= new Scanner(System.in);
                System.out.println("/*** Bienvenu dans la modification du RDV ***/");
                System.out.println("Nv numero: ");
                ALP.get(index).setNumero(scf.nextInt());
                System.out.println("Nv description: ");
                ALP.get(index).setDescription(scf.next());
                System.out.println("Nv date: ");
                ALP.get(index).setDate(new Date());
                //scf.close();
                return true;
            }
        }
    }


    public void Prendre(Integer nump){
        Scanner scf= new Scanner(System.in);
this.setNump(nump) ;
        System.out.println("/*** Bienvenu dans la saisie du RDV ***/");

        System.out.println("Numero: ");
        this.setNumero(scf.nextInt());

        System.out.println("description: ");
        this.setDescription( scf.next());

        System.out.println("Donner la date de RDV Sous Format XX/XX/XXXX");

        try
        {
            DateFormat formatter;
            Date date;
            formatter = new SimpleDateFormat("MM/dd/yyyy");
            date = (Date)formatter.parse(scf.next());
            this.setDate(date);

        }
        catch (Exception e)
        {
            System.out.println("Erreur :"+e);
        }



    }
    

}
