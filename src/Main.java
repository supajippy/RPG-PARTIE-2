import Armes.*;
import Persos.*;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenue dans RPG Simulator ! \n\n");

        Personnage j1 = choisirPersonnage();
        choisirarmes(j1);
        Personnage j2 = choisirPersonnage();
        choisirarmes(j2);
        j1.attack(j2);
        if(j2.getPtVie()>0)
        {j2.attack(j1);}
        combat(j1, j2);
    }


    private static Personnage choisirPersonnage() {
        int choix;
        System.out.println("Veuillez choisir un personnage" +
                "\n1.Barbare\n2.Paladin\n3.Magicien noir\n4.Magicien rouge");
        choix = sc.nextInt();
        System.out.println("Votre choix : " + choix);

        switch (choix) {

            case 1:
                return new Barb();
            case 2:
                return new Pal();
            case 3:
                return new MagicienNoir();
            default:
                return new MagicienRouge();
        }
    }
    private static void choisirarmes(Personnage perso){

        if(perso instanceof Barb){

        System.out.println("Veuillez choisir une arme pour le Barbare\n1.Masse\n2.Epee Lourde\n" +
                "3.Sceptre\n4.Masamune");
        int choixarme =sc.nextInt();
        switch (choixarme){
            case 1 :
            ((Barb) perso).setArme(new Masse());

            case 2 : Contondant epeeLourde=new EpeeLourde();
                    ((Barb) perso).setArme(epeeLourde);

            case 3 : Contondant sceptre= new Sceptre();
                    ((Barb) perso).setArme(sceptre);

            default:Contondant masamune=new Masamune();
                   ((Barb) perso).setArme(masamune);

        }
        System.out.println("Vous avez choisi :"+ choixarme);
        }
        else if(perso instanceof Pal)
        {

           System.out.println("Veuillez choisir une arme pour le Paladin\n1.Épée\n2.Épée Magique\n3.Épée Lourde" +
                   "\n4.Masamune");
           int choixarme= sc.nextInt();
           switch (choixarme){
               case 1 : Tranchant epee=new Epee();
               ((Pal) perso).setArme(epee);

               case 2: Tranchant epeeMagique =new EpeeMagique();
               ((Pal) perso).setArme(epeeMagique);

               case 3: Tranchant epeeLourde = new EpeeLourde();
               ((Pal) perso).setArme(epeeLourde);

               default : Tranchant masamune = new Masamune();
               ((Pal) perso).setArme(masamune);
           }
        }
        else if(perso instanceof Magicien)
        {
            System.out.println("Veuillez choisir une arme pour votre Magicien.\n1.Baguette\n2.Epee Magique\n3.Sceptre" +
                    "\n4.Sceptre ");
            int choixarme = sc.nextInt();
            switch (choixarme){
                case 1 :Magique baguette= new Baguette();
                        ((Magicien) perso).setArme(baguette);
                case 2: Magique  epeeMagique= new EpeeMagique();
                ((Magicien) perso).setArme(epeeMagique);
                case 3 : Magique  sceptre = new Sceptre();
                ((Magicien) perso).setArme(sceptre);
                default : Magique  masamune= new Masamune();
                ((Magicien) perso).setArme(masamune);

            }
        }

    }

    private static boolean combat(Personnage j1, Personnage j2) {


        boolean gagne = false;
        while (nul(j1, j2) == false&&gagne==false) {

                j1.attack(j2);
                if (j2.getPtVie() <= 0) {
                    gagne = true;
                    System.out.println("Le " + j1.getNom() + " a tué le " + j2.getNom());
                    return gagne;
                }
                j2.attack(j1);
                if (j1.getPtVie() <= 0) {
                    System.out.println("Le " + j2.getNom() + " a tué le " + j1.getNom());
                    return gagne;
                }


        }

        System.out.println("Les magiciens ont manqué de magie, match nul");

        return gagne;

    }

    private static boolean nul(Personnage j1, Personnage j2) {

        if (j1 instanceof Magicien && j2 instanceof Magicien) {
            if (((Magicien) j1).getPtMagie() <= 0 && ((Magicien) j2).getPtMagie() <= 0) {
                return true;
            }

        }
        return false;

    }
}







