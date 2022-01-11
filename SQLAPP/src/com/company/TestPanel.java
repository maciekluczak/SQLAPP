package com.company;

import javax.swing.*;
import java.awt.*;

public class TestPanel extends JPanel {
    LogoButton testLabel = new LogoButton(400,120);
    public TestPanel() {

        this.add(testLabel);
        this.setBackground(Color.cyan);
    }
}
