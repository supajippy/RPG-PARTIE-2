package Armes;

public class Masamune implements Tranchant,Contondant,Magique {

    protected String nom ="Masamune";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int magie(int degats){
        degats+=6;
        return degats;
    }
    public int frapper(int degats){
        degats+=5;
        return degats;
    }
    public int trancher(int degats){
        degats+=6;
        return degats;
    }
}
