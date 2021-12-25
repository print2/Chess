import javax.swing.*;
import java.awt.*;

public class Board
{
    Picture BlackPawn=new Picture("Chess_pdt60.png",0);
    Picture BlackBishop=new Picture("Chess_bdt60.png",0);
    Picture BlackRook=new Picture("Chess_rdt60.png",0);
    Picture BlackKnight=new Picture("Chess_ndt60.png",0);
    Picture BlackKing=new Picture("Chess_kdt60.png",0);
    Picture BlackQueen=new Picture("Chess_qdt60.png",0);
    Picture WhitePawn=new Picture("Chess_plt60.png",0);
    Picture WhiteBishop=new Picture("Chess_blt60.png",0);
    Picture WhiteRook=new Picture("Chess_rlt60.png",0);
    Picture WhiteKnight=new Picture("Chess_nlt60.png",0);
    Picture WhiteKing=new Picture("Chess_klt60.png",0);
    Picture WhiteQueen=new Picture("Chess_qlt60.png",0);
    JButton squares[]=new JButton[64];
    JFrame frame=new JFrame();
    private JPanel p = new JPanel(new GridLayout(8,8));
    
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
        for (JButton b: squares) p.add(b);
        frame.setContentPane(p);
        frame.setVisible(true);
    }    
}