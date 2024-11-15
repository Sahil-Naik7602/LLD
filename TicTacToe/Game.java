package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    public Deque<Player> players;
    public Board board;

    public Game(){

        initializeGame();
    }

    public void initializeGame(){
        players = new LinkedList<>();
        PlayingPiece xPiece = new Piece_X();
        Player player1 = new Player("Player1",xPiece);

        PlayingPiece oPiece = new Piece_O();
        Player player2 = new Player("Player2",oPiece);

        players.add(player1);
        players.add(player2);
        board = new Board(3);

    }

    public String startGame(){
        boolean noWinner = true;
        String winner = null;

        while (noWinner){
            Player playerTurn = players.removeFirst();

            if (board.empty()){
                //TODO: take the input from the player for placing their mark
                Scanner sc = new Scanner(System.in);
                System.out.print("Where do you want mark: ");
                String[] mark = sc.next().split(",");
                int x = Integer.parseInt(mark[0]);
                int y = Integer.parseInt(mark[1]);

                //TODO: Check whether this space is valid and free or not
                if (x>= board.size || x<0 || y>= board.size || y<0){
                    System.out.println("This field is invalid enter a valid field");
                    players.addFirst(playerTurn);
                    continue;
                }
                else if (board.isFreeField(x,y)){
                    //TODO: if free then add the mark
                    board.addPlayingPiece(x,y,playerTurn);
                    players.addLast(playerTurn);
                }else{
                    //TODO: else pass the message that invalid field please enter again
                    System.out.println("This field is already occupied choose something else");
                    players.addFirst(playerTurn);
                    continue;
                }

                board.printBoard();
                if (board.isWinner()){
                    noWinner = false;
                    winner = playerTurn.name;
                }
            }else{
                noWinner = false;
                winner = "tie";
            }

        }
        return winner;
    }

}
