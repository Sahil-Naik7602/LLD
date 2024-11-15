package Connect4;

public class Board {
    public int size;
    public PlayingPiece[][] gameBoard;

    public int capacity;

    public Board(int size){
        this.capacity = size*size;
        this.size = size;
        this.gameBoard = new PlayingPiece[size][size];
    }

    public boolean isEmpty(){
        return capacity != 0;
    }

    public boolean isColFree(int col){
        return gameBoard[0][col] == null;
    }

    public void addPiece(int col, PlayingPiece piece){
        int i = 0;
        while (i<size && gameBoard[i][col] == null){
            i++;
        }
        gameBoard[i-1][col] = piece;
        capacity--;
    }

    public void printBoard(){
        for (int i = 0; i<size; i++){
            for (int j =0;j<size; j++){
                if (gameBoard[i][j] == null){
                    System.out.print("| ");
                }else{
                    String p = String.valueOf(gameBoard[i][j].pieceType);
                    System.out.print("|"+p);
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }

}
