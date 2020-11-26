package com.company;

public class Medicament {

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
}
