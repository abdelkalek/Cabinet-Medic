package classes;


import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

@Data
public class Consultation {

    private Integer numero;
    private String description;
    private Date date;
    private Integer NumRDV;

    public Consultation(Integer numero, String description, Date date) {
        this.numero = numero;
        this.description = description;
        this.date = date;
    }

    public Consultation() {
    }


    public boolean Ajouter(ArrayList<Consultation> ALP){
        if (ALP.add(this)){
            return true;
        }else{
            return false;
        }
    }

    public int Rechercher(ArrayList<Consultation> ALP) {
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

    public boolean Supprimer(ArrayList<Consultation> ALP){
        if( (ALP.isEmpty()) || (ALP==null) ){
            System.out.print("La liste est Vide !!");
            return false;
        }else {
            if (!ALP.contains(this)){
                System.out.print("Consultation nest pas trouvé");
                return false;
            }else{
                ALP.remove(this);
                return true;
            }
        }
    }


    public boolean Modifier(ArrayList<Consultation> ALP){
        if( (ALP.isEmpty()) || (ALP==null) ){
            System.out.print("La liste est Vide !!");
            return false;
        }else {
            if (this == null){
                System.out.print("Consultation est  null ");
                return false;
            }else{
                int index= this.Rechercher(ALP);
                Scanner scf= new Scanner(System.in);
                System.out.println("/*** Bienvenu dans la modification du Consultation ***/");
                System.out.println("Nv numero: ");
                ALP.get(index).setNumero(scf.nextInt());
                System.out.println("Nv description: ");
                ALP.get(index).setDescription(scf.next());
                System.out.println("Nv date: ");
                ALP.get(index).setDate(new Date());
               // scf.close();
                return true;
            }
        }
    }


    public void Saisir (Integer rd ){
        Scanner scf= new Scanner(System.in);

        System.out.println("/*** Bienvenu dans la saisie du Consultations ***/");
        this.setNumRDV(rd);
        System.out.println("Numero: ");
        this.setNumero(scf.nextInt());
        System.out.println("Description: ");
        this.setDescription( scf.next());
        System.out.println("Donner la date de consultation  Sous Format XX/XX/XXXX");

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


    public Integer getNumero() {
        return this.numero;
    }

    public String getDescription() {
        return this.description;
    }

    public Date getDate() {
        return this.date;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Consultation)) return false;
        final Consultation other = (Consultation) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$numero = this.getNumero();
        final Object other$numero = other.getNumero();
        if (this$numero == null ? other$numero != null : !this$numero.equals(other$numero)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$date = this.getDate();
        final Object other$date = other.getDate();
        if (this$date == null ? other$date != null : !this$date.equals(other$date)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Consultation;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $numero = this.getNumero();
        result = result * PRIME + ($numero == null ? 43 : $numero.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $date = this.getDate();
        result = result * PRIME + ($date == null ? 43 : $date.hashCode());
        return result;
    }

    public String toString() {
        return "Consultation(numero=" + this.getNumero() + ", description=" + this.getDescription() + ", date=" + this.getDate() + ")";
    }
}
