import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenue dans RPG Simulator ! \n\n");

        Personnage j1 = choisirPersonnage();
        Personnage j2 = choisirPersonnage();
        j1.attack(j2);
        j2.attack(j1);
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







