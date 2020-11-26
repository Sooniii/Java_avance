package com.company;

import java.util.Scanner;

public class MenuPrincipal {

    private static Scanner sc = new Scanner(System.in);
    private static boolean isActivate = true;

    public static void start() {
        while (isActivate) {
            System.out.println("        Bienvenue dans le programme de gestion des hopitaux         ");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1 - Accédez aux données de l'hopital");
            System.out.println("2 - Accédez aux divertissements pour les patients");
            System.out.println("3 - Quitter");
            String user = sc.next();
            while (!(user.equals("1") || user.equals("2") || user.equals("3"))) {
                user = sc.next();
            }
            if (user.equals("3")) {
                isActivate = false;
            } else if (user.equals("1")) {
                System.out.println("Que voulez vous faire ?");
                System.out.println("1 - Consulter les données");
                System.out.println("2 - Modifier les données");
                System.out.println("3 - Retournez au menu principal");
                user = sc.next();
                while (!(user.equals("1") || user.equals("2") || user.equals("3"))) {
                    user = sc.next();
                }
                if (user.equals("1")) {
                    System.out.println("Que voulez vous voir ?");
                    System.out.println("1 - Liste des hopitaux");
                    System.out.println("2 - Liste des praticiens");
                    System.out.println("3 - Liste des patients");
                    System.out.println("4 - Liste des médicaments");
                } else if (user.equals("2")) {
                    System.out.println("Modification des données");
                }
            } else {
                System.out.println("Divertissement patient");
            }
        }
        System.out.println("Au revoir et à bientot");
    }
}