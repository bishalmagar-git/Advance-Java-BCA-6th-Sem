package javafx;
import javax.swing.*;

public class MyWindow {
    public static void main(String[] args) {
        JFrame f= new JFrame();
        f.setTitle("myWindow");
        f.setSize(640,480);
//Container c= f.getContentPane();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("label");
        f.add(label);
        f.setVisible(true);

    }

}
