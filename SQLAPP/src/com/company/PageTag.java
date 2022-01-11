package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PageTag extends JLabel  {
    private ImageIcon image;



    public PageTag(String text){


        this.setText(text);
        this.setHorizontalTextPosition(CENTER);
        this.setVerticalAlignment(CENTER);
        //this.setSize(120,120);
        this.setForeground(new Color(215,215,215));
        this.setFont(new Font("Verdana", Font.PLAIN, 15));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);



        //image = new ImageIcon("image\\button_0.png");



        this.setIcon(image);
        this.setOpaque(false);



    }


}
