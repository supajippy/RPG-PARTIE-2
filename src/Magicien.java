public abstract class Magicien extends Personnage {

    int ptMagie;
    int ptDef;
    int ptVie;
    Sorts [] sorts=new Sorts[2];

    public Magicien(){
        ptVie=60;
        ptDef=1;
    }


    public void attack(Personnage perso){
        Sorts spell=sorts[(int)((Math.random()*3)-1)];
        int dommages = 0;
        if(getPtMagie()>=spell.cout)
        {
            setPtMagie(getPtMagie()-spell.cout);
            dommages = spell.LancerSort(perso,this);
            perso.setPtVie(perso.getPtVie()-dommages);

            System.out.println("Le "+this.getNom()+" attaque ");
            System.out.println("Le "+this.getNom()+" utilise "+spell.getNom()+" ce qui lui coute "+spell.cout+" points de magie");
            System.out.println("Il lui reste "+(this.getPtMagie()-spell.cout)+" points de magie");
            System.out.println("Le "+perso.getNom()+" a perdu "+dommages+" points de vie, il lui en reste "+perso.getPtVie());
        }

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
