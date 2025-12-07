package Mojro.SnakeLLD;

public class Client {
    public static void main(String[] args) {
        Board board = new Board(10);
        Snakes snakes = new Snakes(board,4,4,2,2);
        Ladders ladders = new Ladders(board,3,3,6,6);
        Player player =new Player(board,0,0);
        Player2 player2 =new Player2(board,0,0);



    }
}
