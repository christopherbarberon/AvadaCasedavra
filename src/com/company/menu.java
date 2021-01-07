package com.company;

import java.util.Scanner;

public class  menu {
    public void displayMenu() {
        Game game = new Game(); // creation jeu
        Scanner enter = new Scanner(System.in); //
        Player player = new Player();

        //player.playersNames[0]="chris";
        //player.playersNames[1]="moise";
        //player.setPlayerNumber(2);

        //char premiereLettre = player.playersNames[1].charAt(0);

        game.grid.players[0]=player;


        System.out.println("\n" +
                "   ▄████████  ▄█    █▄     ▄████████ ████████▄     ▄████████    ▄████████    ▄████████    ▄████████    ▄████████ ████████▄     ▄████████  ▄█    █▄     ▄████████    ▄████████ \n" +
                "  ███    ███ ███    ███   ███    ███ ███   ▀███   ███    ███   ███    ███   ███    ███   ███    ███   ███    ███ ███   ▀███   ███    ███ ███    ███   ███    ███   ███    ███ \n" +
                "  ███    ███ ███    ███   ███    ███ ███    ███   ███    ███   ███    █▀    ███    ███   ███    █▀    ███    █▀  ███    ███   ███    ███ ███    ███   ███    ███   ███    ███ \n" +
                "  ███    ███ ███    ███   ███    ███ ███    ███   ███    ███   ███          ███    ███   ███         ▄███▄▄▄     ███    ███   ███    ███ ███    ███  ▄███▄▄▄▄██▀   ███    ███ \n" +
                "▀███████████ ███    ███ ▀███████████ ███    ███ ▀███████████   ███        ▀███████████ ▀███████████ ▀▀███▀▀▀     ███    ███ ▀███████████ ███    ███ ▀▀███▀▀▀▀▀   ▀███████████ \n" + // titre du jeux
                "  ███    ███ ███    ███   ███    ███ ███    ███   ███    ███   ███    █▄    ███    ███          ███   ███    █▄  ███    ███   ███    ███ ███    ███ ▀███████████   ███    ███ \n" +
                "  ███    ███ ███    ███   ███    ███ ███   ▄███   ███    ███   ███    ███   ███    ███    ▄█    ███   ███    ███ ███   ▄███   ███    ███ ███    ███   ███    ███   ███    ███ \n" +
                "  ███    █▀   ▀██████▀    ███    █▀  ████████▀    ███    █▀    ████████▀    ███    █▀   ▄████████▀    ██████████ ████████▀    ███    █▀   ▀██████▀    ███    ███   ███    █▀  \n" +
                "                                                                                                                                                    ███    ███              \n");

        System.out.println("\n" +
                "  ____            ____  _             _     _   _                                       \n" +
                " / ___|   _____  / ___|| |_ __ _ _ __| |_  | |_| |__   ___    __ _  __ _ _ __ ___   ___ \n" +
                " \\___ \\  |_____| \\___ \\| __/ _` | '__| __| | __| '_ \\ / _ \\  / _` |/ _` | '_ ` _ \\ / _ \\\n" +  //s=start the game
                "  ___) | |_____|  ___) | || (_| | |  | |_  | |_| | | |  __/ | (_| | (_| | | | | | |  __/\n" +
                " |____/          |____/ \\__\\__,_|_|   \\__|  \\__|_| |_|\\___|  \\__, |\\__,_|_| |_| |_|\\___|\n" +
                "                                                             |___/                      \n");
        System.out.println(
                "  _   _          __     ___                 _   _            _     _       _                            \n" +
                " | | | |  _____  \\ \\   / (_) _____      __ | |_| |__   ___  | |__ (_) __ _| |__  ___  ___ ___  _ __ ___ \n" +
                " | |_| | |_____|  \\ \\ / /| |/ _ \\ \\ /\\ / / | __| '_ \\ / _ \\ | '_ \\| |/ _` | '_ \\/ __|/ __/ _ \\| '__/ _ \\\n" +  //h=view highscore
                " |  _  | |_____|   \\ V / | |  __/\\ V  V /  | |_| | | |  __/ | | | | | (_| | | | \\__ \\ (_| (_) | | |  __/\n" +
                " |_| |_|            \\_/  |_|\\___| \\_/\\_/    \\__|_| |_|\\___| |_| |_|_|\\__, |_| |_|___/\\___\\___/|_|  \\___|\n" +
                "                                                                     |___/                              \n");
        System.out.println(
                "  ____                  _                 _   _                       _           \n" +
                " |  _ \\   _____  __   _(_) _____      __ | |_| |__   ___   _ __ _   _| | ___  ___ \n" +
                " | |_) | |_____| \\ \\ / / |/ _ \\ \\ /\\ / / | __| '_ \\ / _ \\ | '__| | | | |/ _ \\/ __|\n" + //r=view the rules
                " |  _ <  |_____|  \\ V /| |  __/\\ V  V /  | |_| | | |  __/ | |  | |_| | |  __/\\__ \\\n" +
                " |_| \\_\\           \\_/ |_|\\___| \\_/\\_/    \\__|_| |_|\\___| |_|   \\__,_|_|\\___||___/\n" +
                "                                                                                  \n");
        System.out.println(
                "  _____        _____      _ _     _   _                                       \n" +
                " | ____|____  | ____|_  _(_) |_  | |_| |__   ___    __ _  __ _ _ __ ___   ___ \n" +
                " |  _||_____| |  _| \\ \\/ / | __| | __| '_ \\ / _ \\  / _` |/ _` | '_ ` _ \\ / _ \\\n" +  // e= exite the game
                " | |__|_____| | |___ >  <| | |_  | |_| | | |  __/ | (_| | (_| | | | | | |  __/\n" +
                " |_____|      |_____/_/\\_\\_|\\__|  \\__|_| |_|\\___|  \\__, |\\__,_|_| |_| |_|\\___|\n" +
                "                                                   |___/                      \n");
        String choice;
        choice = enter.nextLine();
        if (choice.equals("S") || choice.equals("s")) {
            player.askPlayerInformations();
            game.start();

        } else if (choice.equals("H") || choice.equals("h")) {
            System.out.println("voici le HS");
            System.out.println("press Q to return menu");
            String choices= enter.nextLine();
            if (choices.equals("Q") || choices.equals("q")){
                displayMenu();
            }
        } else if (choice.equals("R") || choice.equals("r")) {
            System.out.println("- A player cannot destroy a busy case. \n" +
                    "- A player cannot occupy a destroyed case or an already occupied case. \n " +
                    "- A player blocked during a round is declared loser. \n" +
                    "- A player always move before destroying a square.");
            System.out.println("press Q to return menu");
            String choices= enter.nextLine();
            if (choices.equals("Q") || choices.equals("q")){
                displayMenu();
            }
        } else if (choice.equals("E") || choice.equals("e")) {

        }else if (choice.equals("Wizard")){
            System.out.println("                  .\n"
                    +" \n"+"                   .\n"+"         /^\\     .\n"+"    /\\   \"V\"\n"+"   /__\\   I      O  o\n"+"  //..\\\\  I     .\n"
                    +"  \\].`[/  I\n"+"  /l\\/j\\  (]    .  O\n"+" /. ~~ ,\\/I          .\n"+" \\\\L__j^\\/I       o\n"+"  \\/--v}  I     o   .\n"
                    +"  |    |  I   _________\n"+"  |    |  I c(`       ')o\n"+"  |    l  I   \\.     ,/\n"+"_/j  L l\\_!  _//^---^\\\\_    \n");
            System.out.println("=================================================");
            displayMenu();
        }
    }


}