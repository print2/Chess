public class WhitePawn extends Picture implements Piece
{
    public WhitePawn()
    {
        super("Chess_plt60.png",0);
    }
    public void move()
    {
        //can move up 1 space
        //can move up 2 spaces if at start position
        //can move diagonally one square up if an opponent's piece is there
    }
}