package Persos;

import Armes.Tranchant;

public class Pal extends Guerrier {
    protected Tranchant arme;

    public Tranchant getArme() {
        return arme;
    }

    public void setArme(Tranchant arme) {
        this.arme = arme;
    }

    public Pal() {
        ptDef=1;
        ptForce=5;
        ptVie=80;
        nom="Paladin";
    }
    public void attack(Personnage perso){

        int dommages = (ptForce*2)-perso.ptDef;
        int degats =arme.trancher(dommages);
        perso.setPtVie(perso.getPtVie()-dommages);
        System.out.println("Le "+this.getNom()+" attaque");
        System.out.println("Le "+perso.getNom()+" perd "+degats+" points de vie");}
}
