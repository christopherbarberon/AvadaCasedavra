package avada.party;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {


    private int playersNumber = 0;

    private String[] playersNames;

    // Initialise Scanner
    private Scanner scanner = new Scanner(System.in);

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
        //
        askPlayersNames(this.playersNumber);
        Random random = new Random();
        int number = random.nextInt(100);
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
        System.out.println(number);
    }

    /**
     * Ask players names
     */
    public void askPlayersNames(int playersNumber)
    {
        String[] names = new String[playersNumber];

        int i;
        int tour = 0;

        for (i = 0; i < this.playersNumber; i++) {
            System.out.println("Enter the name of player number : " + ++tour);
            names[i] = scanner.nextLine();
        }
        this.playersNames = names;
    }

    /**
     * Get the players names
     *
     * @return String[]
     */
    public String[] getPlayerName()
    {
        return this.playersNames;
    }
}
