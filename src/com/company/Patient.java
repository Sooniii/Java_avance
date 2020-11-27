package com.company;

import java.util.Scanner;

public class Patient{

    static Scanner sc = new Scanner(System.in);

    String nom;
    String prenom;
    String numeroSecurite;
    String adresse;
    String numeroTelephone;
    String mail;

    public Patient(String nom, String prenom, String numeroSecurite, String adresse, String numeroTelephone, String mail) {
        this.numeroSecurite = numeroSecurite;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.mail = mail;
    }

    public static void afficherListe(){
        for (int i = 0; i < ListManager.patientList.size(); i++){
            System.out.print((i + 1) + " : " +ListManager.patientList.get(i).nom + ", ");
            System.out.print(ListManager.patientList.get(i).prenom + ", ");
            System.out.print(ListManager.patientList.get(i).numeroSecurite + ", ");
            System.out.print(ListManager.patientList.get(i).adresse + ", ");
            System.out.print(ListManager.patientList.get(i).numeroTelephone + ", ");
            System.out.println(ListManager.patientList.get(i).mail);
        }
        System.out.println(" ");
    }

    public static void add(){
        System.out.print("Nom du patient : ");
        String nom = sc.next();
        System.out.print("Prénom :");
        String prenom = sc.next();
        System.out.print("Numéro de sécurité sociale : ");
        String numeroSecurite = sc.next();
        System.out.print("Adresse : ");
        String adresse = sc.next();
        System.out.print("Téléphone : ");
        String numeroTelephone = sc.next();
        System.out.print("Mail : ");
        String mail = sc.next();
        ListManager.add(new Patient(nom, prenom, numeroSecurite, adresse, numeroTelephone, mail));
        System.out.println("Le patient a bien été ajouté");
        System.out.println(" ");
    }

    public static void delete(){
        System.out.println("Quel patient voulez vous supprimer ?");
        afficherListe();
        String user = sc.next();
        int userN = Integer.parseInt(user);
        while ((userN) > ListManager.patientList.size()) {
            System.out.println("Ce patient n'existe pas");
            user = sc.next();
            userN = Integer.parseInt(user);
        }
        ListManager.patientList.remove(userN - 1);
    }
}
