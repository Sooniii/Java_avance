package com.company;

public class Praticien{

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
}
