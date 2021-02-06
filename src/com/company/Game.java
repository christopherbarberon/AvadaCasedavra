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
                up();
                break;

            case ("d"):
                right();
                break;

            case ("q"):
                left();
                break;

            case ("s"):
                down();
                break;
            default:

                --tries;
                System.out.println("Please try below options \nAttempt : " + tries);
                if (tries == 0) {
                    System.out.println("You lost");
                    break;
                }
                start();
        }
        grid.choiceCase();
        start();
    }
    private void up(){
        if (grid.indexTour == 0){
            grid.board[grid.getPlayer1Y()][grid.getPlayer1X()] = '+';
            grid.setPlayer1Y(grid.getPlayer1Y() + 1);
            // If the player is on top of the Grid
            if (grid.getPlayer1Y() > 9) {
                // Get the current position - 1, so the player stays in the same place
                grid.setPlayer1Y(grid.getPlayer1Y() - 1);

                // decrement number of tries
                --tries;
                if (tries == 0) {
                    System.out.println("You lost");
                }
                System.out.println("You can't go above the limit \nAttempt : " + tries);
            }
            grid.board[grid.getPlayer1Y()][grid.getPlayer1X()] = grid.players[0].playersNames[0].charAt(0);

        }else if (grid.indexTour == 1){
            grid.board[grid.getPlayer2Y()][grid.getPlayer2X()] = '+';
            grid.setPlayer2Y(grid.getPlayer2Y() + 1);
            // If the player is on top of the Grid
            if (grid.getPlayer2Y() > 9) {
                // Get the current position - 1, so the player stays in the same place
                grid.setPlayer2Y(grid.getPlayer2Y() - 1);

                // decrement number of tries
                --tries;
                if (tries == 0) {
                    System.out.println("You lost");
                }
                System.out.println("You can't go above the limit \nAttempt : " + tries);
            }
            grid.board[grid.getPlayer2Y()][grid.getPlayer2X()] = grid.players[0].playersNames[1].charAt(0);
        }
    }
    private void right(){
        if (grid.indexTour==0){
            grid.board[grid.getPlayer1Y()][grid.getPlayer1X()] = '+';
            grid.setPlayer1X(grid.getPlayer1X() + 1);
            if (grid.getPlayer1X() == 10) {
                grid.setPlayer1X(grid.getPlayer1X() - 1);
                --tries;
                if (tries == 0) {
                    System.out.println("You lost");
                }
                System.out.println("You can't go above the limit");
            }
            grid.board[grid.getPlayer1Y()][grid.getPlayer1X()] = grid.players[0].playersNames[0].charAt(0);
        }else if (grid.indexTour==1){
            grid.board[grid.getPlayer2Y()][grid.getPlayer2X()] = '+';
            grid.setPlayer2X(grid.getPlayer2X() + 1);
            if (grid.getPlayer2X() == 10) {
                grid.setPlayer2X(grid.getPlayer2X() - 1);
                --tries;
                if (tries == 0) {
                    System.out.println("You lost");
                }
                System.out.println("You can't go above the limit");
            }
            grid.board[grid.getPlayer2Y()][grid.getPlayer2X()] = grid.players[0].playersNames[1].charAt(0);
        }
    }
    private void left(){
        if (grid.indexTour==0){
            grid.board[grid.getPlayer1Y()][grid.getPlayer1X()] = '+';
            grid.setPlayer1X(grid.getPlayer1X() - 1);
            if (grid.getPlayer1X() < 0) {
                grid.setPlayer1X(grid.getPlayer1X() + 1);
                --tries;
                if (tries == 0) {
                    System.out.println("You lost");
                }
                System.out.println("You can't go above the limit");
            }
            grid.board[grid.getPlayer1Y()][grid.getPlayer1X()] = grid.players[0].playersNames[0].charAt(0);
        }else if (grid.indexTour==1){
            grid.board[grid.getPlayer2Y()][grid.getPlayer2X()] = '+';
            grid.setPlayer2X(grid.getPlayer2X() - 1);
            if (grid.getPlayer2X() < 0) {
                grid.setPlayer2X(grid.getPlayer2X() + 1);
                --tries;
                if (tries == 0) {
                    System.out.println("You lost");
                }
                System.out.println("You can't go above the limit");
            }
            grid.board[grid.getPlayer2Y()][grid.getPlayer2X()] = grid.players[0].playersNames[1].charAt(0);
        }
    }
    private void down(){
        if (grid.indexTour==0){
            grid.board[grid.getPlayer1Y()][grid.getPlayer1X()] = '+';
            grid.setPlayer1Y(grid.getPlayer1Y() - 1);
            if (grid.getPlayer1Y() < 0) {
                grid.setPlayer1Y(grid.getPlayer1Y() + 1);
                --tries;
                if (tries == 0) {
                    System.out.println("You lost");
                }
                System.out.println("You can't go above the limit");
            }
            grid.board[grid.getPlayer1Y()][grid.getPlayer1X()] = grid.players[0].playersNames[0].charAt(0);
        }else if (grid.indexTour==1){
            grid.board[grid.getPlayer2Y()][grid.getPlayer2X()] = '+';
            grid.setPlayer2Y(grid.getPlayer2Y() - 1);
            if (grid.getPlayer2Y() < 0) {
                grid.setPlayer2Y(grid.getPlayer2Y() + 1);
                --tries;
                if (tries == 0) {
                    System.out.println("You lost");
                }
                System.out.println("You can't go above the limit");
            }
            grid.board[grid.getPlayer2Y()][grid.getPlayer2X()] = grid.players[0].playersNames[1].charAt(0);
        }
    }

}
