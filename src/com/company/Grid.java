package com.company;

import java.lang.*;
import java.util.*;

public class Grid {
    private static char[][] board;
    public Player[] players = new Player[2];
    private final int gridX;
    private final int gridY;

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

        board[5][4] = players[0].playersNames[0].charAt(0);  // positionnement des joueurs
        board[5][5] = players[0].playersNames[1].charAt(0);  // positionnement des joueurs

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



   // public void displayGridWithPlayers() {
   //     int[][] box = new int[this.gridX][this.gridY];    //test de grille avec les joueurs direct

   //     for (int x = 0; x < this.gridX; x++) {
   //         for (int y = 0; y < this.gridY; y++) {
   //             System.out.printf("%2d ", box[x][y]);
   //         }
   //         System.out.println();
   //     }
   // }
}