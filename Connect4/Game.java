package Connect4;

import java.util.*;

public class Game {
    public Deque<Player> players;
    public Board gameBoard;
    public int connect;

    public Game(int connect) {
        this.connect = connect;
        initialize();
    }

    public void initialize() {
        System.out.println("Initialising the game");
        players = new LinkedList<>();
        PlayingPiece red = new RedPiece();
        Player p1 = new Player("Player1", red);

        PlayingPiece green = new GreenPiece();
        Player p2 = new Player("Player2", green);

        players.add(p1);
        players.add(p2);

        gameBoard = new Board(4);
    }

    public String startGame() {
        boolean noWinner = true;
        String winner = null;
        while (noWinner) {
            Player playerTurn = players.removeFirst();

            if (gameBoard.isEmpty()) {
                //TODO: Input the column in which you want to place your piece
                Scanner sc = new Scanner(System.in);
                System.out.printf("Choose the column [%d - %d]where you want to drop your piece: ", 0, 3);
                int col = Integer.parseInt(sc.next());

                if (gameBoard.isColFree(col)) {
                    gameBoard.addPiece(col, playerTurn.piece);
                    players.addLast(playerTurn);
                } else {
                    System.out.println("This column is full choose some other column");
                    players.addFirst(playerTurn);
                    continue;
                }
                gameBoard.printBoard();
                if (checkWinner(playerTurn.piece)) {
                    winner = playerTurn.name;
                    noWinner = false;
                }

            } else {
                winner = "tie";
                noWinner = false;
            }
        }
        return winner;
    }

    public boolean checkWinner(PlayingPiece piece) {
        boolean res = false;
        int n = connect;
        for (int i = 0; i < gameBoard.size; i++) {
            for (int j = 0; j < gameBoard.size; j++) {
                if (gameBoard.gameBoard[i][j] == piece) {
                    res = (dfsH(i, j, n, piece) || dfsV(i, j, n, piece) || dfsD(i, j, n,piece) || dfsA(i, j, n,piece));
                }
                if (res){return true;}
            }
        }
        return res;
    }

    public boolean dfsH(int i, int j, int n, PlayingPiece piece) {
        if (n == 0) {
            return true;
        }
        if (i < 0 || i >= gameBoard.size || j < 0 || j >= gameBoard.size || gameBoard.gameBoard[i][j] != piece) {
            return false;
        }
        return dfsH(i, j + 1, n - 1, piece);

    }

    public boolean dfsV(int i, int j, int n, PlayingPiece piece) {
        if (n == 0) {
            return true;
        }
        if (i < 0 || i >= gameBoard.size || j < 0 || j >= gameBoard.size || gameBoard.gameBoard[i][j] != piece) {
            return false;
        }
        return dfsV(i+1, j, n - 1, piece);
    }

    public boolean dfsD(int i, int j, int n, PlayingPiece piece) {
        if (n == 0) {
            return true;
        }
        if (i < 0 || i >= gameBoard.size || j < 0 || j >= gameBoard.size || gameBoard.gameBoard[i][j] != piece) {
            return false;
        }
        return dfsD(i+1, j+1, n - 1, piece);
    }

    public boolean dfsA(int i, int j, int n, PlayingPiece piece) {
        if (n == 0) {
            return true;
        }
        if (i < 0 || i >= gameBoard.size || j < 0 || j >= gameBoard.size || gameBoard.gameBoard[i][j] != piece) {
            return false;
        }
        return dfsA(i+1, j-1, n - 1, piece);
    }


}

