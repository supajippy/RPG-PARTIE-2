public class MortSubite extends Sorts {

    public MortSubite() {
        cout=10;
        nom="Mort Subite";
    }
    public int LancerSort(Personnage perso, Magicien persoQuiAtk) {
            int dommages=0;

        if (Math.random() * (10) + 1 == 1) {
            dommages=perso.getPtVie();
            perso.setPtVie(0);

        }

        return dommages;
    }}
