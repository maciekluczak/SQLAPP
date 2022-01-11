package com.company;

import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {
    final Image img;

    public BackgroundPanel(){
        img = new ImageIcon("image\\shoes22.jpg").getImage();
        this.setSize(1100,880);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }


    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(img, 0, 0, null);
    }
}