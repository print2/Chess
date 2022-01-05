import javax.swing.JButton;

public class BlackQueen extends Black implements Piece
{
    public BlackQueen()
    {
        super("Chess_qdt60.png",0);
    }
    public boolean move(int x, int y, JButton dest)
    {
        if (Math.abs(x)==Math.abs(y) ||x==0 || y==0) return true;
        else return false;
    }
}