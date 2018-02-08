public abstract class Sorts {

    int cout;
    String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract int LancerSort(Personnage perso,Magicien persoQuiAtk);
}
