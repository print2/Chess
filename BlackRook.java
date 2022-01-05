import javax.swing.JButton;

public class BlackRook extends Black implements Piece
{
    public BlackRook()
    {
        super("Chess_rdt60.png",0);
    }
    public boolean move(int x, int y, JButton dest)
    {
        if (x==0^y==0)return true;
        else return false;
    }
}