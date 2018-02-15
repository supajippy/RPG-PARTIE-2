package Armes;

public class Baguette implements Magique {

    protected String nom="Baguette";


     public int magie(int degats){
         degats+=5;
         return degats;

     }


}
