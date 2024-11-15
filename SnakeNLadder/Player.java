package SnakeNLadder;

public class Player {
    private String name;

    private Piece piece;

    private int onCell;

    public Player(String name, Piece piece){
        this.name = name;
        this.onCell = 0;
    }

    public int getOnCell() {
        return onCell;
    }

    public void moveTo(int cell) {
        this.onCell = cell;
    }

    public String getName(){
        return this.name;
    }
}
