import javax.swing.JButton;

public class BlackKing extends Black implements Piece
{
    public BlackKing()
    {
        super("Chess_kdt60.png",0);
    }
    public boolean move(int x, int y, JButton dest)
    {
        if (Math.abs(x)<2 && Math.abs(y)<2) return true;
        else return false;
    }
}
