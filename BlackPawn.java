import javax.swing.JButton;

public class BlackPawn extends Black implements Piece
{
    private boolean start=true;
    public BlackPawn()
    {
        super("Chess_pdt60.png",0);
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
        else if (Math.abs(x)==1 && Math.abs(y)==1) 
        {
            start=false;
            if (dest.getIcon()!=null) return dest.getIcon() instanceof Black; //can move diagonally one square up if an opponent's piece is there
        }
        return false;
    }
        //can move up 1 space
        //can move up 2 spaces if at start position- NOT IMPLEMENTED YET
        //can move diagonally one square up if an opponent's piece is there- NOT IMPLEMENTED YET
}