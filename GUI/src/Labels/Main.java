package Labels;

import JFrameAlternative.MyWindow;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main{
    /* KEY POINTS: LABELS are mini windows inside a window that can take a text and an icon for that text
       -> just like kivy, LABELS positionings are dependent on the layout of the frame
       -> by defualt a frame is layouted like an anchor layout(border layout in this case)
          we can specify the positioning on a border layout through setHorizontalTextPosition() and setVerticalTextPosition()
          works just like anchorx and anchory and takes CENTER, LEFT, RIGHT for horizontal and CENTER, BOTTOM, TOP for vertical
       -> if we want to be free is positioning our label, we can use the relative layout of swing which is done by making the frame
          layout null -> frame.setLayout(null)
       -> If Layout is null or relative layout, we must specify the bounds of our label, through:
          labelobj.setBounds(x, y, width, height). NOTE THAT: width and height will not affect the font size of the text. It will just
          modify the rectangular area of the label, because like what I said, label is like a mini screen with width and height

     */
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("C:\\Users\\Christian Lee Lunaba\\IdeaProjects\\Second\\GUI\\src\\Labels\\Icon.png");
        Border border = BorderFactory.createLineBorder(new Color(220, 195, 18), 10); // creates a border obj

        JLabel label = new JLabel();
        label.setText("I'm heree");

        // FIRST METHOD: using JLabel
        label.setHorizontalTextPosition(JLabel.CENTER); // will take CENTER,LEFT and RIGHT. position is relative to the ImageIcon
        label.setVerticalTextPosition(JLabel.BOTTOM);  // will take CENTER, BOTTOM and TOP. position is relative to the ImageIcon
        label.setForeground(new Color(245, 206, 206)); // changes the font color of our label
        label.setFont(new Font("Times New Roman", Font.ITALIC,  20)); // sets the font style of a label using a Font object as a parameter
        // Font format -> Font("Font name", Font.style, font size)
        label.setIconTextGap(0); // this will set the gap between the label and its icon.Positive will make them farther, negative will do otherwise
        label.setBackground(Color.BLACK); /* This will set the background color of our label obj, but note that we must first make the label
        opaque so that the background can be seen */
        label.setOpaque(true); // set opacity through here....
        /* NOTE: If you do this, the whole screen will be colored black. this is because if the size of the label is not specified, it will take the
        size of the whole screen by default. */
        label.setBorder(border); // sets the border of a component, this time it's our label. Method setBorder format -> setBorder(Border border)

        label.setVerticalAlignment(JLabel.CENTER); // changes the vertical position of the label, works like anchor layout in kivy python
        label.setHorizontalAlignment(JLabel.CENTER); // changes the horizontal position this time
        /* NOTE: IF YOU CHANGED THE POSITIONING OF THE LABEL, THE ICON'S POSITION WILL ALSO ADJUST*/

        label.setBounds(100, 100, 250,250);

        MyWindow win = new MyWindow(500,500, false, null, "Employment Salary");
        win.add(label); // If no format is specified, swing will add the label by default on the left, middle part of the screen
        label.setIcon(image); // adds an icon to the left of a label
    }
}
