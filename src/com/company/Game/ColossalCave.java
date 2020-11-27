package com.company.Game;

import java.util.Scanner;

public class ColossalCave {

    public static void regle() {
        System.out.println("Bienvenu sur Colossal Cave\n" + "\n" +
                "Ce jeu d’aventure est (colossal cave) est purement textuel. Son fonctionnement est simple :\n" +
                "Son fonctionnement est simple : un petit paragraphe décrit le lieu où l'on se trouve, et l'on tape des,\n" +
                "instructions au clavier a fin de se déplacer ou résoudre des énigmes diverses.\n" +
                "Vous aurez le choix du lieu en fonction de son nombre. \n" +
                "Pour se déplacer il faut choisir N, S, E, W ou encore NW, NE.\n");

        String ChoixMenu;
        System.out.println("Pour Jouer tapez '1'");
        Scanner menu = new Scanner(System.in);
        ChoixMenu = menu.next();

        while (!(ChoixMenu.equals("1") || ChoixMenu.equals("2") || ChoixMenu.equals("3"))) {
            System.out.println("Pour Jouer tapez '1'");
            ChoixMenu = menu.next();
        }
        if (ChoixMenu.equals("1")) {
            ColossalCave.jeu();
        }
    }

    public static void jeu() {
        int Route = 1;
        int Hill = 2;
        int Building = 3;
        int Valley = 4;
        int Forest = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenu sur Colossal Cave" + "\n" +
                "Pour commencer veuillez choisir votre point de départ :" + "\n" +
                "1/ Route" + "\n" + "2/ Colline" + "\n" + "3/ Building en brique" + "\n" + "4/ Vallée " + "\n" + "5/ Forêt");
        int depart = scanner.nextInt();
        if (depart == Route || depart == Hill || depart == Building || depart == Valley || depart == Forest) {
            mouvement(depart);
        }
    }

    public static int mouvement(int depart) {
        if (depart == 1) {  //Départ de la route
            System.out.println(" Vous êtes au bout de la route devant un petit immeuble en brique.\n" +
                    "Un petit ruisseau coule a côté du building en bas d’une rigole. \n");
            System.out.println("Choisit le prochain lieu :" + "\n" +
                    "A l'Ouest se trouve la Colline 'W' \n" +
                    "A l'Est se trouve le Building en brique 'E' \n" +
                    "Au Sud se trouve la Vallée 'S' \n" +
                    "Au Nord se trouve la Forêt 'N' ");
            String event = FunctionGame.scan();
            switch (event) {
                case "W":
                    System.out.println("-------- Vous avancez en direction de l'Ouest -------- \n");
                    System.out.println(" Vous êtes tout en haut d’une colline qui surplombe la ville,\n" +
                            "au loin vous voyez une ombre se déplacer a grande vitesse avec un grand couteau. \n");
                    break;
                case "E":
                    System.out.println("-------- Vous avancez en direction de l'Est -------- \n");
                    System.out.println(" Vous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes.\n" +
                            "Un homme git là au milieu d’une marre de sang. \n");
                    break;
                case "S":
                    System.out.println("-------- Vous avancez en direction du Sud -------- \n");
                    System.out.println("Vous êtes dans une vallée a coté d’un ruisseau.\n" +
                            "Un corps flotte là dans l’eau. \n");
                    break;
                case "N":
                    System.out.println("-------- Vous avancez en direction du Nord -------- \n");
                    System.out.println("Vous êtes dans la foret noire.\n" +
                            "Vous entendez des hurlements stridents. \n");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + event);
            }
            return 1;
        }

        if (depart == 2) {    //Départ de la colline
            System.out.println(" Vous êtes tout en haut d’une colline qui surplombe la ville,\n" +
                    "au loin vous voyez une ombre se déplacer a grande vitesse avec un grand couteau. \n");
            System.out.println("Choisit le prochain lieu :" + "\n" +
                    "Au Nord-Est se trouve la Forêt 'NW' ");
            String event = FunctionGame.scan();
            switch (event) {
                case "NW":
                    System.out.println("-------- Vous avancez en direction du Nord-Est -------- \n");
                    System.out.println("Vous êtes dans la foret noire.\n" +
                            "Vous entendez des hurlements stridents. \n");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + event);
            }
            return 2;
        }

        if (depart == 3) {  //Départ du building
            System.out.println(" Vous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes.\n" +
                    "Un homme git là au milieu d’une marre de sang. \n");
            System.out.println("Choisit le prochain lieu :" + "\n" +
                    "A l'Ouest se trouve la Route 'w' ");
            String event = FunctionGame.scan();
            switch (event) {
                case "W":
                    System.out.println("---------- Vous avancez en direction de l'Ouest ---------- \n");
                    System.out.println(" Vous êtes au bout de la route devant un petit immeuble en brique.\n" +
                            "Un petit ruisseau coule a côté du building en bas d’une rigole. \n");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + event);
            }
            return 3;
        }

        if (depart == 4) {  //Départ de la Vallée
            System.out.println("Vous êtes dans une vallée a coté d’un ruisseau.\n" +
                    "Un corps flotte là dans l’eau. \n");
            System.out.println("Choisit le prochain lieu :" + "\n" +
                    "Au Nord se trouve la Route 'N' \n" +
                    "Au Nord-Ouest se trouve la Colline 'NW' ");
            String event = FunctionGame.scan();
            switch (event) {
                case "N":
                    System.out.println("---------- Vous avancez en direction du Nord ---------- \n");
                    System.out.println(" Vous êtes au bout de la route devant un petit immeuble en brique.\n" +
                            "Un petit ruisseau coule a côté du building en bas d’une rigole. \n");
                    break;
                case "NW":
                    System.out.println("---------- Vous avancez en direction du Nord-Ouest ---------- \n");
                    System.out.println(" Vous êtes tout en haut d’une colline qui surplombe la ville,\n" +
                            "au loin vous voyez une ombre se déplacer a grande vitesse avec un grand couteau. \n");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + event);
            }
            return 4;
        }

        if (depart == 5) {  //Départ de la Forêt
            System.out.println("Vous êtes dans la foret noire.\n" +
                    "Vous entendez des hurlements stridents. \n");
            System.out.println("Choisit le prochain lieu :" + "\n" +
                    "Au Sud se trouve la Route 'S' ");
            String event = FunctionGame.scan();
            switch (event) {
                case "S":
                    System.out.println("-------- Vous avancez en direction du Sud -------- \n");
                    System.out.println(" Vous êtes au bout de la route devant un petit immeuble en brique.\n" +
                            "Un petit ruisseau coule a côté du building en bas d’une rigole. \n");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + event);
            }
            return 5;
        }
        return 0;
    }
}