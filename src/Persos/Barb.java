package Persos;

import Armes.Contondant;


public class Barb extends Guerrier {

    protected Contondant arme ;

    public Contondant getArme() {
        return arme;
    }

    public void setArme(Contondant arme) {
        this.arme = arme;
    }

    public Barb() {
        ptForce=10;
        ptDef=3;
        ptVie=100;
        nom="Barbare";
    }
   public void attack(Personnage perso){

    int dommages = (ptForce*2)-perso.ptDef;
    int degats=arme.frapper(dommages);
    perso.setPtVie(perso.getPtVie()-dommages);
        System.out.println("Le "+this.getNom()+" attaque");
        System.out.println("Le "+perso.getNom()+" perd "+degats+" points de vie");}

}
