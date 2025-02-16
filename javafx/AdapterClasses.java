package javafx;
import java.awt.*;
import java.awt.event.*;


    // class which inherits the MouseMotionAdapter class
    public class AdapterClasses extends MouseMotionAdapter {

        // object of Frame class
        Frame f;

        // class constructor
        AdapterClasses() {

        // creating the frame with the title
            f = new Frame("Mouse Motion Adapter");

        // adding MouseMotionListener to the Frame
            f.addMouseMotionListener(this);

        // setting the size, layout and visibility of the frame
            f.setSize(300, 300);
            f.setLayout(null);
            f.setVisible(true);
        }
        public static void main ( String[] args ) {
            new AdapterClasses();
        }
        // overriding the mouseDragged() method
        public void mouseDragged ( MouseEvent e ) {

        // creating the Graphics object and fetching them from the Frame object using getGraphics() method
            Graphics g = f.getGraphics();

        // setting the color of graphics object
            g.setColor(Color.ORANGE);

// setting the shape of graphics object
            g.fillOval(e.getX(), e.getY(), 20, 20);
        }

}
