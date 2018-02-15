package Armes;

public class Sceptre implements Contondant,Magique {

    protected String nom="Sceptre";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int frapper(int degats){
            degats+=3;
            return degats;

        }
        public int magie(int degats){
            degats+=6;
            return degats;
        }
}
