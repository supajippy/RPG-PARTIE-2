package Persos;

public abstract class Personnage {

    int ptVie;
    int ptDef;
    String nom;

    public int getPtVie() {
        return ptVie;
    }

    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
    }

    public int getPtDef() {
        return ptDef;
    }

    public void setPtDef(int ptDef) {
        this.ptDef = ptDef;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void attack(Personnage perso);

}
