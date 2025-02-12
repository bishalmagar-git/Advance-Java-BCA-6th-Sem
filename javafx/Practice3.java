package javafx;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Practice3 {


        public static void main(String[] args) {
            JFrame f = new JFrame("My Window");
            f.setSize(640, 480);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLayout(new FlowLayout());

            JLabel label = new JLabel("Type something...");
            JTextField textField = new JTextField(20);

            // Add KeyListener to remove label text when user starts typing
            textField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    label.setText(""); // Clear the label when the user starts typing
                }
            });

            f.add(label);
            f.add(textField);
            f.setVisible(true);
        }

}
