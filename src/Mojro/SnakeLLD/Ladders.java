package Mojro.SnakeLLD;

public class Ladders {
    int row1,col1;
    int row2,col2;
    Board board;
    Ladders(Board board,int row1,int col1,int row2,int col2)
    {
        this.board=board;
        this.row1=row1;
        this.col1=col1;
        this.row2=row2;
        this.col2 = col2;
    }
}
