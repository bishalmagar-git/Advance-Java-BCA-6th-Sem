//Program to input 2 numbers in textfields find the sum when the button is clicked.

package javafx;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventsHandle {

    static JTextField t1, t2, t3;

    public static void main(String[] args) {
        JFrame f = new JFrame("TextField Example");

        // Creating text fields
        t1 = new JTextField();  // Removed placeholder text
        t1.setBounds(150, 50, 200, 30);
        t2 = new JTextField();
        t2.setBounds(150, 100, 200, 30);
        t3 = new JTextField();
        t3.setBounds(150, 200, 200, 30);
        t3.setEditable(false);  // Make t3 read-only

        f.add(t1);
        f.add(t2);
        f.add(t3);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        JLabel l1, l2;
        l1 = new JLabel("First Number:");
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel("Second Number:");
        l2.setBounds(50, 100, 100, 30);

        f.add(l1);
        f.add(l2);

        // Button
        JButton b = new JButton("ADD");
        b.setBounds(50, 200, 95, 30);

        // Event Handling (With Validation)
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Convert input to integers
                    int num1 = Integer.parseInt(t1.getText().trim());
                    int num2 = Integer.parseInt(t2.getText().trim());

                    // Compute sum
                    int sum = num1 + num2;

                    // Display result in t3
                    t3.setText(Integer.toString(sum));
                } catch (NumberFormatException ex) {
                    // Show error message if input is invalid
                    JOptionPane.showMessageDialog(f, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
                    t3.setText(""); // Clear result field
                }
            }
        });

        f.add(b);

        // Frame settings
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
