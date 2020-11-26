package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListManager {

    public static List<Praticien> praticienList = new ArrayList<>();
    public static List<Hopital> hopitalList = new ArrayList<>();
    public static List<Patient> patientList = new ArrayList<>();
    public static List<Medicament> medicamentList = new ArrayList<>();

    public static void add(Praticien praticien){
        praticienList.add(praticien);
    }

    public static void add(Hopital hopital){
        hopitalList.add(hopital);
    }

    public static void add(Patient patient){
        patientList.add(patient);
    }

    public static void add(Medicament medicament){
        medicamentList.add(medicament);
    }
}
