package com.company;

import java.util.Scanner;

public class Praticien{

    static Scanner sc = new Scanner(System.in);

    String nom;
    String prenom;
    String matricule;
    String specialite;
    String grade;
    String tauxHoraire;
    Hopital hopital;

    public Praticien(String nom, String prenom, String matricule, String specialite, String grade, String tauxHoraire, Hopital hopital){
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.specialite = specialite;
        this.grade = grade;
        this.tauxHoraire = tauxHoraire;
        this.hopital = hopital;
    }

    public static void afficherListe(){
        for (int i = 0; i < ListManager.praticienList.size(); i++){
            System.out.print((i + 1) + " : " +ListManager.praticienList.get(i).nom + ", ");
            System.out.print(ListManager.praticienList.get(i).prenom + ", ");
            System.out.print(ListManager.praticienList.get(i).matricule + ", ");
            System.out.print(ListManager.praticienList.get(i).specialite + ", ");
            System.out.print(ListManager.praticienList.get(i).grade + ", ");
            System.out.print(ListManager.praticienList.get(i).tauxHoraire + ", ");
            System.out.println(ListManager.praticienList.get(i).hopital.nom);
        }
        System.out.println(" ");
    }

    public static void add(){
        System.out.print("Nom du praticien : ");
        String nom = sc.next();
        System.out.print("Prénom : ");
        String prenom = sc.next();
        System.out.print("Matricule : ");
        String matricule = sc.next();
        System.out.print("Spécialité (Cardiologue, ORL, Rhumatologue) : ");
        String specialite = sc.next();
        while (!(specialite.equals("Cardiologue") || specialite.equals("ORL") || specialite.equals("Rhumatologue"))) {
            specialite = sc.next();
        }
        System.out.print("Grade (Professeur, Specialiste, Medecin) : ") ;
        String grade = sc.next();
        while (!(grade.equals("Professeur") || grade.equals("Specialiste") || grade.equals("Medecin"))) {
            grade = sc.next();
        }
        System.out.print("Taux Horaires : ");
        String tauxHoraire = sc.next();
        System.out.print("Lite des hopitaux disponibles : ");
        for (int i = 0; i < ListManager.hopitalList.size(); i++){
            System.out.print(ListManager.hopitalList.get(i).nom + " ");
        }
        System.out.println(" ");
        System.out.print("Hopital : ");
        String hopitalName = sc.next();
        int index = 0;
        boolean goodName = false;
        while (!goodName) {
            for (int i = 0; i < ListManager.hopitalList.size(); i++) {
                if (hopitalName.equals(ListManager.hopitalList.get(i).nom)) {
                    goodName = true;
                    index = i;;
                }
            }
            if (goodName) break;
            System.out.println("Cet hopital n'existe pas");
            hopitalName = sc.next();
        }
        Hopital hopitalP = ListManager.hopitalList.get(index);
        ListManager.add(new Praticien(nom, prenom, matricule, specialite, grade, tauxHoraire, hopitalP));
        System.out.println("Le praticien a bien été ajouté");
        System.out.println(" ");
    }

    public static void delete(){
        System.out.println("Quel praticien voulez vous supprimer ?");
        afficherListe();
        String user = sc.next();
        int userN = Integer.parseInt(user);
        while ((userN) > ListManager.praticienList.size()) {
            System.out.println("Ce praticien n'existe pas");
            user = sc.next();
            userN = Integer.parseInt(user);
        }
        ListManager.praticienList.remove(userN - 1);
    }
}
