package Armes;

public class Epee implements Tranchant {

    protected String nom="Epee";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int trancher(int degats){
        degats+=5;
        return degats;
    }
}
