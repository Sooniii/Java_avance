package com.company;

import javax.swing.text.Style;
import java.util.Scanner;

public class Medicament {

    static Scanner sc = new Scanner(System.in);

    String codeISN;
    String nomenclature;
    String description;
    String quantite;
    String prescriptionDate;
    String prix;

    public Medicament(String codeISN, String nomenclature, String description, String quantite, String prescriptionDate, String prix){
        this.codeISN = codeISN;
        this.nomenclature = nomenclature;
        this.description = description;
        this.quantite = quantite;
        this.prescriptionDate = prescriptionDate;
        this.prix = prix;
    }

    public static void afficherListe(){
        for (int i = 0; i < ListManager.medicamentList.size(); i++){
            System.out.print((i + 1) + " : " +ListManager.medicamentList.get(i).codeISN + ", ");
            System.out.print(ListManager.medicamentList.get(i).nomenclature + ", ");
            System.out.print(ListManager.medicamentList.get(i).description + ", ");
            System.out.print(ListManager.medicamentList.get(i).quantite + ", ");
            System.out.print(ListManager.medicamentList.get(i).prescriptionDate + ", ");
            System.out.println(ListManager.medicamentList.get(i).prix);
        }
        System.out.println(" ");
    }

    public static void add(){
        System.out.print("Nom du médicament : ");
        String nom = sc.next();
        System.out.print("Code ISN : ");
        String isn = sc.next();
        System.out.print("Description : ");
        String description = sc.next();
        System.out.print("Quantité : ");
        String quantite = sc.next();
        System.out.print("Date de prescription : ");
        String prescriptionDate = sc.next();
        System.out.print("Prix : ");
        String prix = sc.next();
        ListManager.add(new Medicament(isn, nom, description, quantite, prescriptionDate, prix));
        System.out.println("Le médicament a bien été ajouté");
        System.out.println(" ");
    }

    public static void delete(){
        System.out.println("Quel médicament voulez vous supprimer ?");
        afficherListe();
        String user = sc.next();
        int userN = Integer.parseInt(user);
        while ((userN) > ListManager.medicamentList.size()) {
            System.out.println("Ce médicament n'existe pas");
            user = sc.next();
            userN = Integer.parseInt(user);
        }
        ListManager.medicamentList.remove(userN - 1);
    }
}
