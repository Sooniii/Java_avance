package com.company;

public class Praticien extends Humain {

    String matricule;
    String specialite;
    String grade;
    String tauxHoraire;
    Hopital hopital;

    public Praticien(String matricule, String specialite, String grade, String tauxHoraire, Hopital hopital){
        this.matricule = matricule;
        this.specialite = specialite;
        this.grade = grade;
        this.tauxHoraire = tauxHoraire;
        this.hopital = hopital;
    }
}
