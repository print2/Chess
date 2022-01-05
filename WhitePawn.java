import javax.swing.JButton;

public class WhitePawn extends White implements Piece
{
    private boolean start=true;

    public WhitePawn()
    {
        super("Chess_plt60.png",0);
    }
    public boolean move(int x, int y, JButton dest)
    {
        if (x==0&&Math.abs(y)==1) 
        {
            start=false;
            return true;//can move up 1 space
        }
        else if (x==0 && Math.abs(y)==2 && start) 
        {
            start=false;
            return true;//can move up 2 spaces if at start position
        }
        else if (x==1 && y==1) 
        {
            start=false;
            if (dest.getIcon()!=null) return dest.getIcon() instanceof Black;//can move diagonally one square up if an opponent's piece is there
        }
        return false;
    }
}