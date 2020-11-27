package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Playlist {
    private int witchPlaylist;
    private String namePlaylist;
    public static List<Playlist> playlistList = new ArrayList<Playlist>();


    public Playlist(String namePlaylist)
    {
        this.namePlaylist = namePlaylist;
    }


    public static void addPlaylist()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le titre de la Playlist");
        String namePlaylist = scanner.nextLine();

        Playlist playlist = new Playlist(namePlaylist);

        System.out.println("Souhaitez-vous ajouter une autre chansons ? "
                + "\n Répondez par oui ou non");

        String choise = scanner.next();
        switch (choise)
        {
            case "oui":
                addPlaylist();
                break;
            case "non":
                MenuPatient.showMenuPatient();
                break;
        }
    }

    public static void showPlaylist()
    {


    }

    public static void shuffleSong() {
    }
}
