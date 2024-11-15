package SnakeNLadder;

public class Cell {
    private int val;
    private Cell next;

    private Cell ladder;

    private Cell snake;

    public Cell(int val){
        this.val = val;
        this.next = null;
        this.ladder = null;
        this.snake = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getLadder() {
        return ladder;
    }

    public void setLadder(Cell ladder) {
        this.ladder = ladder;
    }

    public Cell getSnake() {
        return snake;
    }

    public void setSnake(Cell snake) {
        this.snake = snake;
    }
}
