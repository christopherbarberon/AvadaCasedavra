package avada.party;

public class Grid {

    private final int gridX;
    private final int gridY;

    public Grid(int gridX, int gridY) {
        this.gridX = gridX;
        this.gridY = gridY;
    }

    /**
     * Method to display the game GRID
     */
    public void displayGrid()
    {
        int[][] box = new int[this.gridX][this.gridY];
        for (int x = 0; x < box.length; x++) {
            for (int y = 0; y < box.length; y++) {
                System.out.printf("%2d ", box[x][y]);
            }
            System.out.println();
        }
    }

    public void displayGridWithPlayers()
    {
    }
}
