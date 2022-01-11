package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuButton extends JLabel implements MouseListener {
    private ImageIcon image;
    private ImageIcon imageLabelAnimated;


    public MenuButton(String tekst){


        this.setText(tekst);
        this.setHorizontalTextPosition(CENTER);
        this.setVerticalAlignment(CENTER);
        this.setSize(120,120);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Verdana", Font.PLAIN, 18));



        image = new ImageIcon("image\\button_0.png");
        imageLabelAnimated = new ImageIcon("image\\button_1.png");


        this.setIcon(image);
        this.setOpaque(false);

        this.addMouseListener(this );


    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {


    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setIcon(imageLabelAnimated);




    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setIcon(image);




    }

}
