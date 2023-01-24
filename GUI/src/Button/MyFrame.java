package Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;

    public MyFrame(int width, int height, boolean resizable, LayoutManager layout, String title) { // constructor overloading, done in case layout is specified
        button = new JButton();
        button.setBounds(100,100,100,100);
        button.addActionListener(this);

        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setResizable(resizable);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(69, 69, 69));
        this.setLayout(layout);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("I got clicked");
        }
    }
}
