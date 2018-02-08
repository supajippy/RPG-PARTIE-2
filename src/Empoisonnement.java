public class Empoisonnement extends Sorts {

    static int dommage=2;


    public Empoisonnement() {
        cout=2;
        nom="Empoisonnement";
    }
    public int LancerSort(Personnage perso, Magicien persoQuiAtk){

            persoQuiAtk.setPtMagie(persoQuiAtk.getPtMagie()-2);
            perso.setPtVie(perso.getPtVie()-dommage);
            return dommage+=2;



    }

}
