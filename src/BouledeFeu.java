public class BouledeFeu extends Sorts {
    public BouledeFeu() {
        cout = 5;
        nom="BouledeFeu";
    }

    public int LancerSort(Personnage perso, Magicien persoQuiAtk) {
        int dommmages= 5;
        perso.setPtVie(perso.getPtVie()-dommmages);
        persoQuiAtk.setPtMagie(persoQuiAtk.getPtMagie() - 5);
        return dommmages;
    }
}
