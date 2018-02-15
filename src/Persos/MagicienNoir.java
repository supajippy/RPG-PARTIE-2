package Persos;
import Sorts.*;

public  class MagicienNoir extends Magicien {
    public MagicienNoir() {
        ptMagie=50;
        sorts[0]=new PicdeGlace();
        sorts[1]=new BouledeFeu();
        nom="Magicien Noir";
    }
}
