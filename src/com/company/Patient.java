package com.company;

public class Patient extends Humain{

    String numeroSecurite;
    String adresse;
    String numeroTelephone;
    String mail;

    public Patient(String numeroSecurite, String nom, String prenom, String adrese, String numeroTelephone, String mail) {
        this.numeroSecurite = numeroSecurite;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adrese;
        this.numeroTelephone = numeroTelephone;
        this.mail = mail;
    }
}
