package com.company;

public class Game {

    /**
     * Initialize Grid Object
     */
    Grid grid = new Grid();

    String movement;

    // Max tries number
    int tries = 3;

    /**
     * Method to start the game
     * display the grid with players
     */
    public void start(){
        movement = grid.displayGrid();
        setMovement();
    }

    /**
     * Method that handles the players movements
     */
    public void setMovement(){

        switch (this.movement){

            case ("z"):

                grid.setPlayerY(grid.getPlayerY() + 1);
                // If the player is on top of the Grid
                if (grid.getPlayerY() > 9) {
                    // Get the current position - 1, so the player stays in the same place
                    grid.setPlayerY(grid.getPlayerY() - 1);

                    // decrement number of tries
                    --tries;
                    if (tries == 0) {
                        System.out.println("You lost");
                        break;
                    }
                    System.out.println("You can't go above the limit \nAttempt : " + tries);
                }
                start();
                System.out.println("allez en haut");
                break;

            case ("d"):

                grid.setPlayerX(grid.getPlayerX() + 1);
                System.out.println("La position X est de " + grid.getPlayerX());
                if (grid.getPlayerX() == 10) {
                    grid.setPlayerX(grid.getPlayerX() - 1);
                    --tries;
                    if (tries == 0) {
                        System.out.println("You lost");
                        break;
                    }
                    System.out.println("You can't go above the limit");
                }
                start();
                System.out.println("allez a droite");
                break;

            case ("q"):

                grid.setPlayerX(grid.getPlayerX() - 1);
                if (grid.getPlayerX() < 0) {
                    grid.setPlayerY(grid.getPlayerY() + 1);
                    --tries;
                    if (tries == 0) {
                        System.out.println("You lost");
                        break;
                    }
                    System.out.println("You can't go above the limit");
                }
                System.out.println("La position X est de " + grid.getPlayerX());
                start();
                System.out.println("allez a gauche");
                break;

            case ("s"):
                grid.setPlayerY(grid.getPlayerY() - 1);
                if (grid.getPlayerY() < 0) {
                    grid.setPlayerY(grid.getPlayerY() + 1);
                    --tries;
                    if (tries == 0) {
                        System.out.println("You lost");
                        break;
                    }
                    System.out.println("You can't go above the limit");
                }
                System.out.println("La position X est de " + grid.getPlayerY());
                start();
                System.out.println("allez en bas");

            default:

                --tries;
                System.out.println("Please try below options \nAttempt : " + tries);
                if (tries == 0) {
                    System.out.println("You lost");
                    break;
                }
                start();
        }
    }
}
