import javax.swing.JButton;

public class WhiteRook extends White implements Piece
{
    public WhiteRook()
    {
        super("Chess_rlt60.png",0);
    }
    public boolean move(int x, int y, JButton dest)
    {
        if (x==0^y==0)return true;
        else return false;
    }
}