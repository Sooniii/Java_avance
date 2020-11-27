package com.company;

import java.util.Scanner;

public class MenuPatient {

    private static Scanner scan = new Scanner(System.in);

    public static void showMenuPatient()
    {
        int selection;

        System.out.println("Que souhaitez-vous faire ?"
                + "\n1 - Ajouter une musique"
                + "\n2 - Supprimer une musique"
                + "\n3 - visualiser les musiques"
                + "\n4 - Jouer le prochain son"
                + "\n5 - Jouer le son précédent"
                + "\n§ - Ajouter une playlist"
                + "\n7 - Visualiser la playlist"
                + "\n8 - Jouer le son aléatoirement"
                + "\n9 - Quitter le menu");

        selection = scan.nextInt();

        switch (selection)
        {

            case 1: // supprimer un son
                Song.addSong();
                Playlist.savePlaylist();
                Song.saveSong();

                break;

            case 2:
                Song.deleteSong();
                Playlist.savePlaylist();
                Song.saveSong();
                break;

            case 3:
                Song.viewSong();
                Playlist.savePlaylist();
                Song.saveSong();
                break;

            case 4 :
                Song.nextSong();
                break;

            case 5:
                Song.prevSong();
                break;

            case 6:
                Playlist.addPlaylist();
                Playlist.savePlaylist();
                Song.saveSong();
                break;

            case 7:
                Playlist.showPlaylist();
                Playlist.savePlaylist();
                Song.saveSong();
                break;

            case 8:
                Playlist.shuffleSong();
                throw new IllegalStateException("Unexpected value: ");

            case 9: // quitter le menu
                System.exit(0);
                break;



            default: // si autre cas
                System.out.println("\n Erreur de saisie");
                showMenuPatient();
        }
    }
}
