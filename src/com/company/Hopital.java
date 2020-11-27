package com.company;

import java.util.Scanner;

public class Hopital {

    static Scanner sc = new Scanner(System.in);

    String nom;
    String adresse;
    String specialite;

    public Hopital(String nom, String adresse, String specialite) {
        this.nom = nom;
        this.adresse = adresse;
        this.specialite = specialite;
    }

    public static void afficherListe(){
        for (int i = 0; i < ListManager.hopitalList.size(); i++){
            System.out.print((i + 1) + " : " +ListManager.hopitalList.get(i).nom + ", ");
            System.out.print(ListManager.hopitalList.get(i).adresse + ", ");
            System.out.println(ListManager.hopitalList.get(i).specialite);
        }
        System.out.println(" ");
    }

    public static void add(){
        System.out.print("Nom de l'hopital : ");
        String nom = sc.next();
        System.out.print("Adresse : ");
        String adresse = sc.next();
        System.out.print("Spécialité (Cardiologie, ORL, Rhumatologie) : ");
        String specialite = sc.next();
        while (!(specialite.equals("Cardiologie") || specialite.equals("ORL") || specialite.equals("Rhumatologie"))) {
            specialite = sc.next();
        }
        ListManager.add(new Hopital(nom, adresse, specialite));
        System.out.println("L'hopital a bien été ajouté");
        System.out.println(" ");
    }

    public static void delete(){
        System.out.println("Quelle hopital voulez vous supprimer ?");
        afficherListe();
        String user = sc.next();
        int userN = Integer.parseInt(user);
        while ((userN) > ListManager.hopitalList.size()) {
            System.out.println("Cet hopital n'existe pas");
            user = sc.next();
            userN = Integer.parseInt(user);
        }
        ListManager.hopitalList.remove(userN - 1);
    }
}
