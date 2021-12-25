import javax.swing.*;
import java.awt.*;
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
            //if (((Piece)destination.getIcon()).move(getXChange(origin,destination),getYChange(origin,destination))
            destination.setIcon(origin.getIcon());
            origin.setIcon(null);
            waiting=false;
        }
        else
        {
            origin=(JButton)e.getSource();
            waiting=true;
        }

    }
}