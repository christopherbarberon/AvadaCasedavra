package com.company;

public class Grid {
    private static char[][] board;
    private final int gridX;
    private final int gridY;

    public Grid() {
        this.gridX = 11;
        this.gridY = 10;
    }

    /**
     * Method to display the game GRID
     */
    public void displayGrid() {
        board= new char[gridY][gridX];
        for (int i=0; i< gridY;i++){
            for (int j=0;j<gridX;j++){
                board[i][j]='+';
            }
        }

        for (int x = gridY; x>=0;x--){
            System.out.print(x+" ");
            for (int y =0; y<gridX;y++){
                if (x==0){
                    System.out.print(y+1 +" ");
                }else {
                    System.out.print(board[x-1][y]+ " ");
                }
            }
            System.out.println();
        }
        System.out.println();

       // int[][] box = new int[this.gridX][this.gridY];
       // for (int x = 0; x < this.gridX; x++) {
       //     for (int y = 0; y < this.gridY; y++) {
       //         System.out.printf("%2d ", box[x][y]);
       //     }
       //     System.out.println();
       // }
    }


    public void displayGridWithPlayers() {
        int[][] box = new int[this.gridX][this.gridY];

        for (int x = 0; x < this.gridX; x++) {
            for (int y = 0; y < this.gridY; y++) {
                    System.out.printf("%2d ", box[x][y]);
            }
            System.out.println();
        }
    }
}