package JFrame;
import javax.swing.JFrame;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JFrame is just a class that enables the creation of a window in creating a gui

        JFrame win = new JFrame(); // creates an object of the class jframe
        win.setTitle("Employment salary"); // changest the caption of the window
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(420, 420); // adjusts the dimensions
        win.setResizable(false); // prevents user to resize the window
        win.setVisible(true); // makes the Jframe visible

        /* -> ImageIcon -identifier- = new ImageIcon(-absolute path- or -pathname-) will allow you to create
           an image object.
           -> Use the win.setIcon(ImageIcon image.getImage()) to change the icon of the window */

        win.getContentPane().setBackground(new Color(69,69,69));

        /* -> This will change the background color of our window. First get the content of the window
        Through getContentPane() then change that content using setBackgroundColor(new Color(-takes an rgb or hex-)) */


    }
}
