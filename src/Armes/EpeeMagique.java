package Armes;

public class EpeeMagique implements Tranchant,Magique {

    protected String nom="EpeeMagique";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int trancher(int degats){
        degats+=6;
        return degats;

    }
    public int magie(int degats){
        degats+=3;
        return degats;
    }
}
