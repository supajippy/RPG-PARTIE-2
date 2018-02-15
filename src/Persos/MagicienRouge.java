package Persos;
import Sorts.*;

public class MagicienRouge extends Magicien {
    public MagicienRouge() {
        ptMagie=40;
        sorts[0]=new Empoisonnement();
        sorts[1]=new MortSubite();
        nom="Magicien Rouge";
    }
}
