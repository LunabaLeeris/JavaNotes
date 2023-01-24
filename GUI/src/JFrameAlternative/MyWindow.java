package JFrameAlternative;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyWindow extends JFrame{
    public MyWindow(int width, int height, boolean resizable, String title) {
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setResizable(resizable);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(69, 69, 69));
    }

    public MyWindow(int width, int height, boolean resizable, LayoutManager layout, String title) { // constructor overloading, done in case layout is specified
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setResizable(resizable);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(69, 69, 69));
        this.setLayout(layout);
    }
}

