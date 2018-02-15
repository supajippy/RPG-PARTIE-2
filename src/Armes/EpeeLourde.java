package Armes;

public class EpeeLourde implements Tranchant,Contondant {

    public  String getNom() {
        return nom;
    }

    public  void setNom(String nom) {
        this.nom = nom;
    }

    String nom="EpeeLourde";


        public int trancher(int degats){
            degats+=6;
            return degats;

        }
        public int frapper(int degats){
            degats+=3;
            return degats;
        }
}
