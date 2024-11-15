package SnakeNLadder;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Cell> cells;
    private int size;

    public Board(int size){
        this.size = size;
        cells = new ArrayList<Cell>();
    }

    public boolean addSnake(Cell from, Cell to){
        if (from.getVal()>to.getVal()){
            from.setSnake(to);
            return true;
        }else{
            System.out.println("Invalid SNAKE!!");
            return false;
        }
    }

    public boolean addLadder(Cell from, Cell to){
        if (from.getVal()<to.getVal()){
            from.setLadder(to);
            return true;
        }else{
            System.out.println("Invalid LADDER!!");
            return false;
        }
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
