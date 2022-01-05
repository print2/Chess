import javax.swing.JButton;

public class WhiteKnight extends White implements Piece
{
    public WhiteKnight()
    {
        super("Chess_nlt60.png",0);
    }
    public boolean move(int x, int y, JButton dest)
    {
        if (Math.abs(y)==2 && Math.abs(x)==1) return true;
        else return false;
    }
}