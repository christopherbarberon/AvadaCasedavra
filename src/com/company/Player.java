package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {


    private int playersNumber = 0;
    public String[] playersNames=new String[2];



    // Initialize Random constant
    private final int random = new Random().nextInt(100);

    // Initialize Scanner
    private Scanner scanner = new Scanner(System.in);

    /**
     * Constructor
     */
    public Player() {
    }

    /**
     * Ask the player informations
     */
    public void askPlayerInformations()
    {
        System.out.println("Enter the number of players : ");
        int playerNumber = scanner.nextInt();

        this.playersNumber = playerNumber;

        scanner.nextLine();

        if ((playerNumber <= 0) || (playerNumber <= 1)) {
            System.out.println("The number of players must be equal to or greater than 2 \nNumber given : " + playerNumber);
            askPlayerInformations();
        } else if (playerNumber > 4) {
            System.out.println("The number of players should not be more than 4 \nNumber given : " + playerNumber);
            askPlayerInformations();
        }

        askPlayersNames(this.playersNumber);
        chooseStartingPlayer();
    }

    /**
     * Ask players names
     */

    public void askPlayersNames(int playersNumber)
    {

        int i;
        int tour = 0;

        for (i = 0; i < this.playersNumber; i++) {
            System.out.println("Enter the name of player number : " + ++tour);
            this.playersNames[i] = scanner.nextLine();
        }

    }

    /**
     * Choose the starting player randomly
     */
    private void chooseStartingPlayer()
    {
        int number = this.random;

        if(this.playersNumber == 2) {
            if (number >= 50) {
                System.out.println("Player : " + this.getPlayerName()[0] + " start");
            } else {
                System.out.println("Player : " + this.getPlayerName()[1] + " start");
            }
        } else if (this.playersNumber == 3) {
            if (number >= 65) {
                System.out.println("Player : " + this.getPlayerName()[0] + " start");
            } else if ((number < 65) && (number > 30)) {
                System.out.println("Player : " + this.getPlayerName()[1] + " start");
            } else {
                System.out.println("Player : " + this.getPlayerName()[2] + " start");
            }
        } else {
            if (number >= 65) {
                System.out.println("Player : " + this.getPlayerName()[0] + " start");
            } else if ((number < 65) && (number > 30)) {
                System.out.println("Player : " + this.getPlayerName()[1] + " start");
            } else {
                System.out.println("Player : " + this.getPlayerName()[2] + " start");
            }
        }

    }

    /**
     * Get the players names
     *
     * @return String[]
     */
    public String[] getPlayerName()
    {
        return playersNames;
    }

    /**
     * Get the number of player playing
     * @return
     */
    public int getPlayerNumber(){
        return this.playersNumber;
    }
    public void setPlayerNumber(int nbPlayer){
        this.playersNumber=nbPlayer;
    }

    /**
     * Get the first player name letter
     *
     * @return
     */
    public String[] getFirstLetter()
    {

        String name1 =this.playersNames[0];
        String name2 =this.playersNames[1];
        String[] FirstLetterNames= new String[2];
        FirstLetterNames[0]=name1.substring(0,1);
        FirstLetterNames[1]=name2.substring(0,1);
        return FirstLetterNames;
    }

    /*public void showPlayerBoard()
    {
        String players = Arrays.toString(this.getPlayerName());
        if (players)
    }*/
}
