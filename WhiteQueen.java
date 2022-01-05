import javax.swing.JButton;

public class WhiteQueen extends White implements Piece
{
    public WhiteQueen()
    {
        super("Chess_qlt60.png",0);
    }
    public boolean move(int x, int y, JButton dest)
    {
        if (Math.abs(x)==Math.abs(y) ||x==0 || y==0) return true;
        else return false;
    }
}