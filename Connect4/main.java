package Connect4;

public class main {
    public static void main(String args[]){
        Game connect3 = new Game(3);
        System.out.print("The winner is "+connect3.startGame());
    }
}
