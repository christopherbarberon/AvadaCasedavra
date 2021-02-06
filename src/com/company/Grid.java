package com.company;

import java.lang.*;
import java.util.*;

public class Grid {

    public  char[][] board;
    public Player[] players = new Player[2];

    /**
     * Grid X position
     */
    private int gridX;

    /**
     * Grid Y position
     */
    private int gridY;

    /**
     * Player X position
     */
    private int player1X = 4;

    /**
     * Player Y position
     */
    private int player1Y = 5;

    /**
     * Player X position
     */
    private int player2X = 5;

    /**
     * Player Y position
     */
    private int player2Y = 5;
    /**
     * Tour index
     */
    public int indexTour;

    /**
     * Constructor
     */
    public Grid() {
        this.gridX = 11;
        this.gridY = 10;
        this.indexTour=0;
        board= new char[gridY][gridX];
        for (int i=0; i< gridY;i++){
            for (int j=0;j<gridX;j++){
                board[i][j]='+';
            }
        }

    }

    /**
     * Method to display the game GRID
     */
    public String displayGrid() {
        if (indexTour==0){
            indexTour++;
            System.out.println("tour 1");
        }else if (indexTour==1){
            indexTour--;
            System.out.println("tour 2");
        }




        board[player1Y][player1X] = players[0].playersNames[0].charAt(0);
        board[player2Y][player2X] = players[0].playersNames[1].charAt(0);

        displayBoard();

        System.out.println("\n\n               z: up");
        System.out.print(" q: left     ");
        System.out.println("            d: right");
        System.out.println("               s: down  ");

        System.out.println( players[0].getPlayerName()[indexTour]+": u play");
        Scanner movespot=new Scanner(System.in);
        String inputMovement = movespot.next();
        return inputMovement;
    }

    public void choiceCase(){
        Scanner ChoixCase = new Scanner(System.in);
        int X;
        int Y;
        System.out.println("choisissez une case a detruire .");
        System.out.println("saisissez le X : ");
        X = ChoixCase.nextInt();
        System.out.println("saisissez le Y :");
        Y = ChoixCase.nextInt();
        board[X-1][Y-1]='X';
    }




    /**
     * Get the X position of the Grid
     * @return
     */
    public int getPlayer1X()
    {
        return player1X;
    }
    /**
     * Get the X position of the Grid
     * @return
     */
    public int getPlayer2X()
    {
        return player2X;
    }

    /**
     * Get the Y position of the Grid
     * @return
     */
    public int getPlayer1Y()
    {
        return player1Y;
    }
    /**
     * Get the Y position of the Grid
     * @return
     */
    public int getPlayer2Y()
    {
        return player2Y;
    }

    /**
     * Set the X postion of the Grid
     * @param player1X
     */
    public void setPlayer1X(int player1X)
    {
        this.player1X = player1X;
    }
    /**
     * Set the X postion of the Grid
     * @param player2X
     */
    public void setPlayer2X(int player2X)
    {
        this.player2X = player2X;
    }

    /**
     * Set the Y postion of the Grid
     * @param player1Y
     */
    public void setPlayer1Y(int player1Y)
    {
        this.player1Y = player1Y;
    }
    /**
     * Set the Y postion of the Grid
     * @param player2Y
     */
    public void setPlayer2Y(int player2Y)
    {
        this.player2Y = player2Y;
    }
    public void displayBoard(){
        for (int x = 10; x>=0;x--){
            System.out.print(x+"  ");
            for (int y =0; y<11;y++){
                if (x==0){
                    System.out.print(y+1 +"  ");
                }else {
                    System.out.print(board[x-1][y]+ "  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
