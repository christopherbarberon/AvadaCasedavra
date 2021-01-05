package avada.party;

public class Party {

    //EN TANT QUE utilisateur
    //JE VEUX démarrer une partie à 2 joueurs
    //AFIN DE commencer à jouer avec un ami

    //Definition of Done
    //Le jeu attribue un pseudo aux deux joueurs et affiche le
    //plateau de jeux. De manière aléatoire un joueur est
    //désigné pour commencer à jouer.

    public void displayGrid(int gridHeight, int gridWidth)
    {
        int[][] boxes = new int[gridHeight][gridWidth];
        for (int i = 0; i < boxes.length; i++) {
            for (int j = 0; j < boxes.length; j++) {
                System.out.printf("%2d ", boxes[i][j]);
            }
            System.out.println();
        }
    }
}
