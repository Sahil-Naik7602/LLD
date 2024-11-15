package SnakeNLadder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private int numOfPlayers;
    private Dice dice;

    private Deque<Player> playerTurn;

    private Board gameBoard;

    private int numOfSnakes;

    private int numOfLadders;

    public Game(int numOfPlayers,int boardSize,int numOfSnakes, int numOfLadders){
        this.numOfPlayers = numOfPlayers;
        this.gameBoard = new Board(boardSize);
        this.dice = new Dice();
        playerTurn = new LinkedList<>();
        this.numOfSnakes = numOfSnakes;
        this.numOfLadders = numOfLadders;
        initialize(boardSize);
    }

    private void initialize(int boardSize){
        //Validation: numOfPlayers can't be greater than 2
        if (numOfPlayers>2){
            System.out.println("Current capacity of players for this game is: "+2);
        }
        for(int i = 0;i<numOfPlayers;i++){
            if (i==0){
                Player p1 = new RedPlayer("Player_1");
                playerTurn.add(p1);
            } else if (i==1) {
                Player p2 = new RedPlayer("Player_2");
                playerTurn.add(p2);
            }
        }

        //TODO: Creation of BoardLinkedList
        Cell head = new Cell(1);
        Cell tail = head;
        for (int i = 2;i<=boardSize;i++){
            tail.setNext(new Cell(i));
            tail = tail.getNext();
        }

        //TODO: InsertInside the cells of board;
        Cell temp = head;
        while (temp != null){
            gameBoard.getCells().add(temp);
            temp = temp.getNext();
        }
        Scanner sc = new Scanner(System.in);
        //TODO: add Snakes
        while (numOfSnakes>0){
            System.out.println("Insert snake: (from,to)");
            String spos = sc.next();
            String[] posList = spos.split(",");
            Cell from = gameBoard.getCells().get(Integer.parseInt(posList[0])-1);
            Cell to = gameBoard.getCells().get(Integer.parseInt(posList[1])-1);
            if (gameBoard.addSnake(from,to)){
                numOfSnakes--;
                from.setSnake(to);
            }
        }

        //TODO: add ladders
        while (numOfLadders>0){
            System.out.println("Insert ladders: (from,to)");
            String lpos = sc.next();
            String[] posList = lpos.split(",");
            Cell from = gameBoard.getCells().get(Integer.parseInt(posList[0])-1);
            Cell to = gameBoard.getCells().get(Integer.parseInt(posList[1])-1);
            if (gameBoard.addLadder(from,to)){
                numOfLadders--;
                from.setLadder(to);
            }
        }

    }

    public String startGame(){
        boolean noWinner = true;
        String winnerName = null;
        while (noWinner){
            Player player = playerTurn.removeFirst();
            int move = dice.rollDice();
            int curPos = player.getOnCell();
            //If player gets a move that crosses the boardLimit turn gets skip
            if(curPos+move> gameBoard.getSize()){
                playerTurn.addLast(player);
            }
            else if (curPos+move == gameBoard.getSize()) {
                winnerName = player.getName();
                noWinner = false;
            }else{
                List<Cell> cellList = gameBoard.getCells();
                if (cellList.get(curPos + move - 1).getSnake() != null){
                    player.moveTo(cellList.get(curPos + move - 1).getSnake().getVal());
                    System.out.println("The "+player.getName()+" moved from "+curPos+" to "+curPos+move+ " but snake ingested them to: "+player.getOnCell());
                }else if (cellList.get(curPos + move - 1).getLadder() != null){
                    player.moveTo(cellList.get(curPos + move - 1).getLadder().getVal());
                    System.out.println("The "+player.getName()+" moved from "+curPos+" to "+curPos+move+ " but using the ladder reached to: "+ player.getOnCell());
                }else{
                    player.moveTo(curPos+move);
                    System.out.println("The "+player.getName()+" moved from "+curPos+" to "+player.getOnCell());
                }

                playerTurn.addLast(player);
            }
        }
        return winnerName;
    }
}
