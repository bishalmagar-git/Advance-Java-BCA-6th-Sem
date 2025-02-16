package javafx;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField implements ActionListener {
    JTextField t1,t2,t3;
    JButton b1,b2;
    TextField(){
        JFrame f= new JFrame();

        //TextFields
        t1 = new JTextField();
        t1.setBounds(50,50,150,20);
        t2 = new JTextField();
        t2.setBounds(50,100,150,20);
        t3 = new JTextField();
        t3.setBounds(50,150,150,20);
        t3.setEditable(false);

        //Buttons
        b1 = new JButton("ADD");
        b1.setBounds(50,200,80,50);
        b2 = new JButton("Sub");
        b2.setBounds(150,200,80,50);
        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(t1);f.add(t2);f.add(t3);f.add(b1);f.add(b2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String s1 = t1.getText();
        String s2 = t2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if(e.getSource()==b1){
            c=a+b;
        } else if (e.getSource()==b2) {
            c=a-b;
        }
        String result = Integer.toString(c);
        t3.setText(result);
    }

    public static void main(String[] args) {
        new TextField();
    }
}
