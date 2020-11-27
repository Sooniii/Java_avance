package com.company;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Playlist {
    private int witchPlaylist;
    private String namePlaylist;
    public static List<Playlist> playlistList = new ArrayList<Playlist>();


    public static List<Playlist> getPlaylistList() {
        return playlistList;
    }

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
        try
        {
            FileInputStream fileInputStream = new FileInputStream("Playlist1");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            playlistList = (List<Playlist>) objectInputStream.readObject();

            objectInputStream.close();
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.out.println("Pas de fichier");
        }
        catch (IOException ioException)
        {
            System.out.println("IO no good");
        }
        catch (ClassNotFoundException classNotFoundException)
        {
            System.out.println("Ceci n'est pas une playlist");
        }

    }


    public static void savePlaylist() {

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("Playlist1");
            ObjectOutputStream outObjectStream = new ObjectOutputStream(fileOutputStream);

            outObjectStream.writeObject(playlistList);
            outObjectStream.flush();
            outObjectStream.close();
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.out.println("PAs de fichier");
        }
        catch (IOException ioException)
        {
            System.out.println("Mauvais IO");
        }
    }

    public static void shuffleSong() {
    }

    public int getWitchPlaylist() {
        return witchPlaylist;
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }
}
