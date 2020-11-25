package com.company;

public class AdventureGame{

    public static void AdventureGame(String[]args){

        System.out.println("Bienvenu dans Colossal Cave !");
        System.out.println("Veuillez entrez ... pour de commencer votre aventure");
        System.out.println("Pour quitter a tous moment entrez q");
    }

    //0 : Vous êtes chez vous devant votre ordinateur en plein cours Java
    //1 : Vous êtes au bout de la route devant un petit immeuble en brique.
    //	Un petit ruisseau coule a côté du building en bas d’une rigole.
    //2 : Vous êtes tout en haut d’une colline qui surplombe la ville,
    //	au loin vous voyez une ombrese déplacer a grande vitesse avec un grand couteau.
    //3 : Vous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes.
    // 	Un homme git là au milieu d’une marre de sang.
    //4 : Vous êtes dans une vallée a coté d’un ruisseau.
    // 	Un corps flotte là dans l’eau.
    //5 : Vous êtes dans la foret noire.
    // 	Vous entendez des hurlements stridents.


    private int convertDirection(String input) {
        char d = input.charAt(0);
        int theDirection = 9999;
        switch(d) {
            case 'n':case 'N': theDirection = 0;break;
            case 's':case 'S': theDirection = 1;break;
            case 'e':case 'E': theDirection = 2;break;
            case 'w':case 'W': theDirection = 3;break;
        }
        return theDirection;
    }
}

