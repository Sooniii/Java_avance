package com.company;

import java.util.Scanner;

public class MenuPrincipal {

    private static Scanner sc = new Scanner(System.in);
    private static boolean isActivate = true;

    public static void start() {

        while (isActivate) {
            System.out.println("        Bienvenue dans le programme de gestion des hopitaux         ");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1 - Accéder aux données des hopitaux");
            System.out.println("2 - Accéder aux divertissements pour les patients");
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
                    System.out.println("5 - Retourner au menu principal");
                    user = sc.next();
                    while (!(user.equals("1") || user.equals("2") || user.equals("3") || user.equals("4") || user.equals("5"))) {
                        user = sc.next();
                    }
                    if (user.equals("1")) {
                        Hopital.afficherListe();
                    } else if (user.equals("2")) {
                        Praticien.afficherListe();
                    } else if (user.equals("3")) {
                        Patient.afficherListe();
                    } else if (user.equals("4")) {
                        Medicament.afficherListe();
                    }
                } else if (user.equals("2")) {
                    System.out.println("Que voulez vous faire ?");
                    System.out.println("1 - Ajouter une information");
                    System.out.println("2 - Modifier une information");
                    System.out.println("3 - Supprimer une information");
                    System.out.println("4 - Retourner au menu principal");
                    user = sc.next();
                    while (!(user.equals("1") || user.equals("2") || user.equals("3") || user.equals("4"))) {
                        user = sc.next();
                    }
                    if (user.equals("1")) {
                        System.out.println("Que voulez vous ajouter ?");
                        System.out.println("1 - Un hopital");
                        System.out.println("2 - Un praticien");
                        System.out.println("3 - Un patient");
                        System.out.println("4 - Un médicament");
                        System.out.println("5 - Retourner au menu principal");
                        user = sc.next();
                        while (!(user.equals("1") || user.equals("2") || user.equals("3") || user.equals("4") || user.equals("5"))) {
                            user = sc.next();
                        }
                        if (user.equals("1")) {
                            Hopital.add();
                        } else if (user.equals("2")) {
                            Praticien.add();
                        } else if (user.equals("3")) {
                            Patient.add();
                        } else if (user.equals("4")) {
                            Medicament.add();
                        }
                    } else if (user.equals("2")) {
                        System.out.println("Que voulez vous modifier ?");
                        System.out.println("1 - Un hopital");
                        System.out.println("2 - Un praticien");
                        System.out.println("3 - Un patient");
                        System.out.println("4 - Un médicament");
                        System.out.println("5 - Retourner au menu principal");
                        user = sc.next();
                        while (!(user.equals("1") || user.equals("2") || user.equals("3") || user.equals("4") || user.equals("5"))) {
                            user = sc.next();
                        } if (user.equals("1")) {

                        } else if (user.equals("2")) {

                        } else if (user.equals("3")) {

                        } else if (user.equals("4")) {

                        }
                    } else if (user.equals("3")) {
                        System.out.println("Que voulez vous supprimer ?");
                        System.out.println("1 - Un hopital");
                        System.out.println("2 - Un praticien");
                        System.out.println("3 - Un patient");
                        System.out.println("4 - Un médicament");
                        System.out.println("5 - Retourner au menu principal");
                        user = sc.next();
                        while (!(user.equals("1") || user.equals("2") || user.equals("3") || user.equals("4") || user.equals("5"))) {
                            user = sc.next();
                        } if (user.equals("1")) {
                            Hopital.delete();
                        } else if (user.equals("2")) {
                            Praticien.delete();
                        } else if (user.equals("3")) {
                            Patient.delete();
                        } else if (user.equals("4")) {
                            Medicament.delete();
                        }
                    }
                }
            } else {
                System.out.println("Divertissement patient");
            }
        }
        System.out.println("Au revoir et à bientot");
    }
}