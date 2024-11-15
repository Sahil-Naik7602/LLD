package SnakeNLadder;

public class main {
    public static void main(String args[]){
        Game game = new Game(2,100,3,3);
        System.out.println("The winner is : "+game.startGame());
    }
}
