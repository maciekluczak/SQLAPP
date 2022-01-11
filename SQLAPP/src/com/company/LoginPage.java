package com.company;

import com.company.BackgroundPanel;
import com.company.LogoButton;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class LoginPage extends JLayeredPane {
    public LogoButton logo;
    public JTextField loginField;
    public JTextField passwordField;
    public MenuButton logButton;

    public LoginPage() {
        JPanel panelUp = new JPanel();
        JPanel panelRight = new JPanel();
        JPanel panelLeft = new JPanel();
        JPanel panelDown = new JPanel();
        JPanel panelCenter = new JPanel();
        JPanel panelBackground = new JPanel();

        panelUp.setBackground(Color.cyan);
        panelDown.setBackground(Color.green);
        panelLeft.setBackground(Color.blue);
        panelRight.setBackground(Color.blue);
        panelCenter.setBackground(Color.orange);


        panelUp.setOpaque(false );
        panelRight.setOpaque(false);
        panelLeft.setOpaque(false);
        panelDown.setOpaque(false);
        panelCenter.setOpaque(false);
        panelBackground.setOpaque(false);



        panelUp.setPreferredSize(new Dimension(100,150));
        panelRight.setPreferredSize(new Dimension(400,100));
        panelLeft.setPreferredSize(new Dimension(200,700));
        panelDown.setPreferredSize(new Dimension(250,120));
        panelCenter.setPreferredSize(new Dimension(200,200));
        panelBackground.setSize(1100,880);

        panelBackground.setLayout(new BorderLayout());

        panelUp.setLayout(new BorderLayout());
        logo= new LogoButton(450, 90);
        panelUp.add(logo,  BorderLayout.EAST);
        logo.setHorizontalAlignment(JLabel.CENTER);
        logo.setVerticalAlignment(JLabel.CENTER);

        panelUp.add(new PageTag("   PAGE| Login"), BorderLayout.WEST);

        panelCenter.setLayout(new GridLayout(6,1));

        JPanel displayField = new JPanel();


        loginField = new JTextField();
        loginField.setForeground(Color.WHITE);
        loginField.setHorizontalAlignment(SwingConstants.CENTER);
        loginField.setPreferredSize( new Dimension( 330, 36 ) );
        loginField.setFont(new Font("Verdana", Font.PLAIN, 18));
        loginField.setBackground(new Color(26,26,26));
        loginField.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        JLabel loginLabel = new JLabel();
        loginLabel.setForeground(Color.WHITE);
        loginLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        loginLabel.setOpaque(true);
        loginLabel.setBackground(new Color(26,26,26));
        loginLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        loginLabel.setPreferredSize(new Dimension(100, 36));
        loginLabel.setText("Login");
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        loginLabel.setVerticalAlignment(SwingConstants.CENTER);

        passwordField = new JTextField();
        passwordField.setForeground(Color.WHITE);
        passwordField.setHorizontalAlignment(SwingConstants.CENTER);
        passwordField.setPreferredSize( new Dimension( 330, 36 ) );
        passwordField.setFont(new Font("Verdana", Font.PLAIN, 18));
        passwordField.setBackground(new Color(26,26,26));
        passwordField.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        JLabel passwordLabel = new JLabel();
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        passwordLabel.setOpaque(true);
        passwordLabel.setBackground(new Color(26,26,26));
        passwordLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        passwordLabel.setPreferredSize(new Dimension(100, 36));
        passwordLabel.setText("Password");
        passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        passwordLabel.setVerticalAlignment(SwingConstants.CENTER);


        displayField.add(loginLabel);
        displayField.add(loginField);
        displayField.add(passwordLabel);
        displayField.add(passwordField);
        displayField.setOpaque(false);

        logButton = new MenuButton("Log In");
        logButton.setHorizontalAlignment(JLabel.CENTER);


        panelCenter.add(new JLabel());
        panelCenter.add(displayField);
        panelCenter.add(new JLabel());
        panelCenter.add(logButton);
        panelCenter.add(new JLabel());
        panelCenter.add(new JLabel());




        panelBackground.add(panelUp, BorderLayout.NORTH);
        panelBackground.add(panelCenter, BorderLayout.CENTER);
        panelBackground.add(panelRight, BorderLayout.EAST);
        panelBackground.add(panelLeft, BorderLayout.WEST);
        panelBackground.add(panelDown, BorderLayout.SOUTH);

        BackgroundPanel backgroundImage = new BackgroundPanel();
        this.add(backgroundImage, JLayeredPane.DEFAULT_LAYER);
        this.add(panelBackground, JLayeredPane.DRAG_LAYER);
        this.setVisible(true);

    }

    public LogoButton getLogo() {
        return logo;
    }
}
