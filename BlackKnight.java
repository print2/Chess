import javax.swing.JButton;

public class BlackKnight extends Black implements Piece
{
    public BlackKnight()
    {
        super("Chess_ndt60.png",0);
    }
    public boolean move(int x, int y, JButton dest)
    {
        if (Math.abs(y)==2 && Math.abs(x)==1) return true;
        else return false;
    }
}