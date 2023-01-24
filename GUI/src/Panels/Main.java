package Panels;
import JFrameAlternative.MyWindow;

import javax.swing.*;
import java.awt.*;

public class Main {
    /* Panels are simply rectangular shapes than can be placed ona window. */
    /* NOTE: here we used the panels as rectangles and then wrote labes on top of them
             BUT we can use panels like windows and add componen to them such as labels
             components have a default layout called "Flow Layout"*/

    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:\\Users\\Christian Lee Lunaba\\IdeaProjects\\Second\\GUI\\src\\Labels\\Icon.png");

        // creates label objects
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        // adjusts label texts
        label1.setText("Do Laundry");
        label2.setText("Wash Dishes");
        label3.setText("Cook Food");
        // adds icon to the labels
        label1.setIcon(icon);
        label2.setIcon(icon);
        label3.setIcon(icon);
        // sets the font, font style and font size of the texts
        label1.setFont(new Font("Times New Roman", Font.ITALIC,  10));
        label2.setFont(new Font("Times New Roman", Font.ITALIC,  10));
        label3.setFont(new Font("Times New Roman", Font.ITALIC,  10));
        // sets background
        label1.setBackground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        label3.setBackground(Color.WHITE);
        label1.setOpaque(true);
        label2.setOpaque(true);
        label3.setOpaque(true);
        // sets the x,y position and width height of the label
        label1.setBounds(250 - 150/2, 500/6 - 100/2, 150, 100);
        label2.setBounds(250 - 150/2,  1500/6 - 100/2, 150, 100);
        label3.setBounds(250 - 150/2, 2500/6 - 100/2, 150, 100);

        // creates panel objects
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        // sets the background color of the panels
        panel1.setBackground(new Color(101, 61, 61));
        panel2.setBackground(new Color(101, 76,61));
        panel3.setBackground(new Color(101, 90,61));
        // sets the bounds of the panels
        panel1.setBounds(0, 0, 500,  500/3);
        panel2.setBounds(0, 500/3, 500,  500/3);
        panel3.setBounds(0, 1000/3, 500,  500/3);
        // creates a window
        MyWindow win = new MyWindow(500, 550, false, null, "Panels");
        // adds the components to the window
        win.add(label1);
        win.add(label2);
        win.add(label3); // THOSE WHO ADDED LAST ARE WILL BE PLACED BELOW THOSE WHO WAS ADDED FIRST. WORKS LIKE STACKS
        win.add(panel1);
        win.add(panel2);
        win.add(panel3);
    }
}
