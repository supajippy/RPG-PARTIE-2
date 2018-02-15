package Armes;

public class Masse implements Contondant{

    protected  String nom="Masse";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int frapper(int degats){
        degats+=5;
        return degats;
    }
}
