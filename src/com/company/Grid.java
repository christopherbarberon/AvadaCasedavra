package com.company;

import java.lang.*;
import java.util.*;

public class Grid {

    private static char[][] board;
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
    private int playerX = 4;

    /**
     * Player Y position
     */
    private int playerY = 5;

    /**
     * Constructor
     */
    public Grid() {
        this.gridX = 11;
        this.gridY = 10;
    }

    /**
     * Method to display the game GRID
     */
    public String displayGrid() {
        board= new char[gridY][gridX];       //initialisation du tableau
        for (int i=0; i< gridY;i++){         //initialisation du tableau
            for (int j=0;j<gridX;j++){       //initialisation du tableau
                board[i][j]='+';             //initialisation du tableau
            }
        }

        board[playerY][playerX] = players[0].playersNames[0].charAt(0);  // positionnement des joueurs
        board[playerY][playerX + 1] = players[0].playersNames[1].charAt(0);  // positionnement des joueurs

        for (int x = gridY; x>=0;x--){
            System.out.print(x+"  ");                       //création du tableau
            for (int y =0; y<gridX;y++){                    //création du tableau
                if (x==0){                                  //création du tableau
                    System.out.print(y+1 +"  ");            //création du tableau
                }else {                                     //création du tableau
                    System.out.print(board[x-1][y]+ "  ");  //création du tableau
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("\n\n               z: Haut");
        System.out.print(" q: Gauche     ");
        System.out.println("            d: Droite");
        System.out.println("               s: Bas  ");

        System.out.println( players[0].getPlayerName()[0]+": à toi de jouer");
        Scanner movespot=new Scanner(System.in);
        String inputMovement = movespot.next();
        return inputMovement;
    }

    /**
     * Get the X position of the Grid
     * @return
     */
    public int getPlayerX()
    {
        return playerX;
    }

    /**
     * Get the Y position of the Grid
     * @return
     */
    public int getPlayerY()
    {
        return playerY;
    }

    /**
     * Set the X postion of the Grid
     * @param playerX
     */
    public void setPlayerX(int playerX)
    {
        this.playerX = playerX;
    }

    /**
     * Set the Y postion of the Grid
     * @param playerY
     */
    public void setPlayerY(int playerY)
    {
        this.playerY = playerY;
    }

}
