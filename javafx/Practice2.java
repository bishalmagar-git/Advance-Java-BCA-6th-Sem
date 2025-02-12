package javafx;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Practice2 {
        public static void main(String args[])
        {
            JFrame f= new JFrame("TextField Example");
            JTextField t1,t2;
            t1=new JTextField("Text 1 Placehold.");
            t1.setBounds(150,50, 200,30);
            t2=new JTextField("Text 2 Placehold");
            t2.setBounds(150,100, 200,30);
            f.add(t1); f.add(t2);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//JLabel
            JLabel l1,l2;
            l1=new JLabel("First Label.");
            l1.setBounds(50,50, 100,30);
            l2=new JLabel("Second Label.");
            l2.setBounds(50,100, 100,30);
            f.add(l1); f.add(l2);
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);
//JButton
            JButton b=new JButton("Click Here");
            b.setBounds(150,200,95,30);
            f.add(b);
//            t1.addKeyListener(new KeyAdapter(){
//                @Override
//                public void keyTyped(KeyEvent e){
//                    t1.setText(""+ t1);
//                }
//            });

        }
}
