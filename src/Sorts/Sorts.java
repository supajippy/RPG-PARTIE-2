package Sorts;

import Persos.Magicien;
import Persos.Personnage;

public abstract class Sorts {

    protected  int cout;

    public int getCout() {
        return cout;
    }

    String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract int LancerSort(Personnage perso, Magicien persoQuiAtk);
}
