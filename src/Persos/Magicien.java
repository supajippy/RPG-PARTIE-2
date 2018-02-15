package Persos;
import Armes.Magique;
import Sorts.*;

public abstract class Magicien extends Personnage {

    protected Magique arme;

    public Sorts[] getSorts() {
        return sorts;
    }

    public void setSorts(Sorts[] sorts) {
        this.sorts = sorts;
    }

    protected int ptMagie;
    protected int ptDef;
    protected int ptVie;
    protected Sorts[] sorts=new Sorts[2];

    public Magicien(){
        ptVie=60;
        ptDef=1;
    }


    public void attack(Personnage perso){
        Sorts spell=sorts[(int)((Math.random()*3)-1)];
        int dommages = 0;
        if(getPtMagie()>=spell.getCout())
        {
            setPtMagie(getPtMagie()-spell.getCout());
            dommages = spell.LancerSort(perso,this);
            perso.setPtVie(perso.getPtVie()-dommages);
            int degats= arme.magie(dommages);
            System.out.println("Le "+this.getNom()+" attaque ");
            System.out.println("Le "+this.getNom()+" utilise "+spell.getNom()+" ce qui lui coute "+spell.getCout()+" points de magie");
            System.out.println("Il lui reste "+(this.getPtMagie()-spell.getCout())+" points de magie");
            System.out.println("Le "+perso.getNom()+" a perdu "+degats+" points de vie, il lui en reste "+perso.getPtVie());
        }

    }


    public Magique getArme() {
        return arme;
    }

    public void setArme(Magique arme) {
        this.arme = arme;
    }



    public int getPtMagie() {
        return ptMagie;
    }

    public void setPtMagie(int ptMagie) {
        this.ptMagie = ptMagie;
    }

    @Override
    public int getPtDef() {
        return ptDef;
    }

    @Override
    public void setPtDef(int ptDef) {
        this.ptDef = ptDef;
    }

    @Override
    public int getPtVie() {
        return ptVie;
    }

    @Override
    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
    }
}
