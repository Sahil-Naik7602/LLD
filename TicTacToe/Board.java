package TicTacToe;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    private int capacity;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
        capacity = size*size;
    }

    public boolean empty(){
        return capacity != 0;
    }

    public void addPlayingPiece(int x, int y, Player p){
            capacity--;
            board[x][y] = p.piece;
    }
    public boolean isFreeField(int x, int y){
        return board[x][y] == null;
    }

    public void printBoard(){
        for (int i=0;i< size;i++) {
            for (int j = 0; j < size; j++) {
                PlayingPiece piece = board[i][j];
                if (piece == null){
                    System.out.print("   |");
                }else{
                    String p = String.valueOf(piece.piece);
                    System.out.print(" "+p+" |");
                }
            }
            System.out.println();
        }
    }

    public boolean isWinner(){
        boolean h = true;
        boolean v = true;
        boolean d = true;
        boolean a = true;


        //TODO: Horizontal Checking

        for (int i=0;i< size-1;i++){
            for(int j=0 ;j< size-1;j++){
                if (board[i][j]==null ||board[i][j] != board[i][j+1]){
//                    System.out.println("Horizontal");
                    h = false;
                    break;
                }
            }
        }
        //TODO: Vertical Checking

        for (int j=0;j< size-1;j++){
            for(int i=0 ;i< size-1;i++){
                if (board[i][j] == null || board[i][j] != board[i+1][j]){
//                    System.out.println("Vertical");
                    v = false;
                    break;
                }
            }
        }
        //TODO: Diagonal Checking

        for (int i=0;i<size-1;i++){
            if (board[i][i]==null || board[i][i] != board[i+1][i+1]){
//                System.out.println("Diagonal");
                d = false;
                break;
            }
        }
        //TODO: Anti-Diaginal Checking

        for (int i=0;i<size-1;i++){
            if (board[i][size-i-1] == null || board[i][size-i-1] != board[i+1][size-i-2]){
//                System.out.println("Anti Diagonal");
                a = false;
                break;
            }
        }

        return h || v || d || a;
    }

}
