package com.company;

import java.util.Scanner;

import static com.company.Playlist.*;

public class MenuPatient {

    private static Scanner scan = new Scanner(System.in);

    public static int showMenuPatient()
    {
        int selection;

        System.out.println("Que souhaitez-vous faire ?"
                + "\n1 - Aller dans le menu musique"
                + "\n2 - Aller dans le menu Playlist"
                + "\n3 - Quitter le menu");

        selection = scan.nextInt();

        switch (selection)
        {
            case 1: // ajout d'un son
                System.out.println("\n1. Ajouter une musique" +
                        "\n2. Supprier une musique" +
                        "\n3. Changer de musique");
                break;


                switch (selection)
                {
                    case 1: // supprimer un son
                        Song.addSong();
                        break;

                    case 2: // afficher la playlist
                        Song.deleteSong();
                        break;

                    case 3:
                        Song.viewSong();
                        break;

                    case 4: // lire la playlist
                        Song.nextSong();
                        break;

                    case 5:
                        Song.prevSong();
                        break;


                }
            case 2:
                System.out.println("\n1.Ajouter une Playlist" +
                        "\n Affichier musique de la Playlist");
                break;

                switch (selection)
                {
                    case 1:
                        Playlist.addPlaylist();
                        break;

                    case 2:
                        Playlist.showPlaylist();
                        break;

                    case 3:
                        Playlist.shuffleSong();
                    default:
                        throw new IllegalStateException("Unexpected value: ");
                }

            case 3: // quitter le menu
                System.exit(0);
                break;



            default: // si autre cas
                System.out.println("\n Erreur de saisie");
                showMenuPatient();
        }
        return selection;

    }








}
