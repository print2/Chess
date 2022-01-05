import javax.swing.JButton;

public class WhiteKing extends White implements Piece
{
    public WhiteKing()
    {
        super("Chess_klt60.png",0);
    }
    public boolean move(int x, int y, JButton dest)
    {
        if (x<2 && y<2) return true;
        else return false;
    }
}