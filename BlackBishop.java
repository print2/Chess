import javax.swing.JButton;
public class BlackBishop extends Black implements Piece
{
    public BlackBishop()
    {
        super("Chess_bdt60.png",0);
    }
    public boolean move(int x, int y, JButton dest)
    {
        if (Math.abs(x)==Math.abs(y)) return true;
        else return false;
        //can move diagonally any number of spaces and any direction
    }
}