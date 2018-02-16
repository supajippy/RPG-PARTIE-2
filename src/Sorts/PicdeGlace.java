package Sorts;

import Persos.Magicien;
import Persos.Personnage;

public class PicdeGlace extends Sorts{

    public PicdeGlace() {
        cout=5;
        nom="PicdeGlace";
    }

    public int LancerSort(Personnage perso, Magicien persoQuiAtk) {
        int degats=(7 - perso.getPtDef());
        perso.setPtVie(perso.getPtVie() - degats);
        persoQuiAtk.setPtMagie(persoQuiAtk.getPtMagie() - 5);
        return degats;
    }
    }
