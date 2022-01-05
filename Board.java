import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.awt.event.*;

public class Board implements ActionListener
{
    JButton squares[]=new JButton[64];
    JFrame frame=new JFrame();
    private JPanel p = new JPanel(new GridLayout(8,8));
    private boolean waiting=false;
    private JButton origin;
    private JButton destination;
    
    public Board()
    {
        frame.setSize(1600,800);
        squares[0]=new JButton(new BlackRook());
        squares[1]=new JButton(new BlackKnight());
        squares[2]=new JButton(new BlackBishop());
        squares[3]=new JButton(new BlackQueen());
        squares[4]=new JButton(new BlackKing());
        squares[5]=new JButton(new BlackBishop());
        squares[6]=new JButton(new BlackKnight());
        squares[7]=new JButton(new BlackRook());
        for (int i=8; i<16; i++) squares[i]=new JButton(new BlackPawn());
        for (int i=16; i<48; i++) squares[i]=new JButton();
        for (int i=48; i<56; i++) squares[i]=new JButton(new WhitePawn());
        squares[56]=new JButton(new WhiteRook());
        squares[57]=new JButton(new WhiteKnight());
        squares[58]=new JButton(new WhiteBishop());
        squares[59]=new JButton(new WhiteQueen());
        squares[60]=new JButton(new WhiteKing());
        squares[61]=new JButton(new WhiteBishop());
        squares[62]=new JButton(new WhiteKnight());
        squares[63]=new JButton(new WhiteRook());
        for (JButton b: squares) 
        {
            b.addActionListener(this);
            p.add(b);
        }
        frame.setContentPane(p);
        frame.setVisible(true);
    }    
    public void actionPerformed(ActionEvent e)
    {
        if (waiting==true)
        {
            destination=(JButton)e.getSource();
            if (origin.getIcon()!=null)
            {
                int start=Arrays.asList(squares).indexOf(origin);
                int end=Arrays.asList(squares).indexOf(destination);
                int x=(end%8)-(start%8);
                int y=(end/8)-(start/8);
                if (checkDest() && ((Piece)origin.getIcon()).move(x,y,destination) && checkRoute(x,y,start,end))
                {
                    destination.setIcon(origin.getIcon());
                    origin.setIcon(null);
                }
            }
            waiting=false;
        }
        else
        {
            origin=(JButton)e.getSource();
            waiting=true;
        }

    }

    public boolean checkRoute(int x, int y, int start, int end)
    {
        boolean travelled=false;//true if piece travels over a square to get to its destination
        for (int i=Math.min(start,end); i<Math.max(start,end); i+=Math.abs((end-start)/Math.max(Math.abs(y),Math.abs(x)))) 
        {
            travelled=true;
            if (squares[i].getIcon()!=null) return false;
        }
        if (travelled)return true;
        else return false;
    }

    public boolean checkDest()
    {
        //checks if piece is allowed to be in that square (if a piece of the same colour occupies the square, it can't be replaced)
        if ((origin.getIcon() instanceof White && destination.getIcon() instanceof White)||(origin.getIcon() instanceof Black && destination.getIcon() instanceof Black)) return false;
        else return true;
    }

}