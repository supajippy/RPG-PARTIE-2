package Persos;

public abstract class Guerrier extends Personnage {

    protected int ptForce;

    public void attack(Personnage perso){

        int dommages = (ptForce*2)-perso.ptDef;
    perso.setPtVie(perso.getPtVie()-dommages);
        System.out.println("Le "+this.getNom()+" attaque");
        System.out.println("Le "+perso.getNom()+" perd "+dommages+" points de vie");
    }

            }


