package com.company;

import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);
    private static boolean isActivate = true;

    public static void start() {
        while (isActivate) {
            System.out.println("        Bienvenue dans le programme de gestion des hopitaux         ");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Si vous voulez avoir acces aux données des hopitaux, tapez 1");
            System.out.println("Si vous êtes un patient et que vous souhaitez vous détendre, tapez 2");
            System.out.println("Pour quitter, tapez Quitter");
            String user = sc.next();
            while (!(user.equals("Quitter") || user.equals("1") || user.equals("2"))) {
                user = sc.next();
            }
            if (user.equals("Quitter")) {
                isActivate = false;
            } else if (user.equals("1")) {
                System.out.println("Donné hopitaux");
            } else {
                System.out.println("Divertissement patient");
            }
        }
        System.out.println("Au revoir et à bientot");
    }
}