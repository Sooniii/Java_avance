package com.company;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Song {

    private String title;
    private String artist;
    public static int actualSong = 0;
    public static List<Song> songList = new ArrayList<Song>();

    public Song(String title, String artist)
    {
        this.title = title;
        this.artist = artist;
    }

    public static void addSong()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le titre de la musique");
        String title = scanner.nextLine();

        System.out.println("Entrer l'auteur de la musique");
        String artist = scanner.nextLine();

        Song song = new Song(title, artist);
        songList.add(song);

        System.out.println("Souhaitez-vous ajouter une autre chansons ? "
                            + "\n Répondez par oui ou non");

        String choise = scanner.next();
        switch (choise)
        {
            case "oui":
                addSong();
                break;
            case "non":
                MenuPatient.showMenuPatient();
                break;
        }
    }


    public static void deleteSong()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel titre souhaitez voous retirer");

        String delateChoiseTitle = scanner.nextLine();

        try
        {
            for (int i = 0; i < songList.size(); i ++)
            {
                if (songList.get(i).title.equals(delateChoiseTitle))
                {
                    songList.remove(i);
                    System.out.println("Vous venez de supprimer " + delateChoiseTitle);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void viewSong()
    {
        Iterator var0 = songList.iterator();

        while(var0.hasNext())
        {
            String mySong = (String)var0.next();
            System.out.println(mySong);
        }
    }

    public static void nextSong()
    {
        actualSong += 1;
        showActualSong();
    }

    public static void prevSong()
    {
        actualSong -= 1;
        showActualSong();

    }

    private static void showActualSong()
    {
        System.out.println(songList.get(actualSong).getTitle());
    }


    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }



}
