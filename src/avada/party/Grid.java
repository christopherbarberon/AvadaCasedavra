package avada.party;

public class Grid {

    private final int gridX;
    private final int gridY;

    private int[][] boxes;

    private Player players = new Player();

    public Grid(int gridX, int gridY) {
        this.gridX = gridX;
        this.gridY = gridY;
    }

    /**
     * Method to display the game GRID
     */
    public int[][] displayGrid()
    {
        int[][] box = new int[this.gridX][this.gridY];
        for (int x = 0; x < this.gridX; x++) {
            for (int y = 0; y < this.gridY; y++) {
                System.out.printf("%4d ", box[x][y]);
            }
            System.out.println();
        }
        this.boxes = box;
        return this.boxes;
    }

    public void displayGridWithPlayers()
    {
        Player player = this.players;

        for (int i = 0; i < this.players.getPlayerName().length; i++) {

        }
    }
}
