package com.company;

import javax.swing.*;
import java.awt.*;

public class ButtonBox extends JButton {
    public ButtonBox(String tekst){
        this.setSize(120,100);
        this.setText(tekst);
        this.setForeground(Color.white);
        this.setBackground(Color.red);

    }
}
