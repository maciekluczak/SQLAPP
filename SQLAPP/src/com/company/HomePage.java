package com.company;

import javax.swing.*;
import java.awt.*;

public class HomePage extends JLayeredPane {
    public LogoButton logo;
    public MenuButton orderButton, recordButton, financeButton, productsButton;
    public SearchButton searchButton;
    public UserButton userButton;

    public HomePage() {
        JPanel panelUp = new JPanel();
        JPanel panelRight = new JPanel();
        JPanel panelLeft = new JPanel();
        JPanel panelDown = new JPanel();
        JPanel panelCenter = new JPanel();
        JPanel panelBackground = new JPanel();

        panelUp.setBackground(new Color(168,218,220));
        panelDown.setBackground(Color.green);
        panelLeft.setBackground(Color.blue);
        panelRight.setBackground(Color.blue);
        panelCenter.setBackground(Color.orange);


        panelUp.setOpaque(false);
        panelRight.setOpaque(false);
        panelLeft.setOpaque(false);
        panelDown.setOpaque(false);
        panelCenter.setOpaque(false);
        panelBackground.setOpaque(false);



        panelUp.setPreferredSize(new Dimension(100,150));
        panelRight.setPreferredSize(new Dimension(400,100));
        panelLeft.setPreferredSize(new Dimension(100,700));
        panelDown.setPreferredSize(new Dimension(250,200));
        panelCenter.setPreferredSize(new Dimension(200,200));
        panelBackground.setSize(1100,880);

        panelBackground.setLayout(new BorderLayout());

        panelUp.setLayout(new BorderLayout());
        logo= new LogoButton(450, 90);
        panelUp.add(logo,  BorderLayout.EAST);
        logo.setHorizontalAlignment(JLabel.CENTER);
        logo.setVerticalAlignment(JLabel.CENTER);



        //RIGHTPANEL: ustawienia pola wyboru prawego panelu

        panelRight.setLayout((new BorderLayout()));

        searchButton = new SearchButton(50,50);
        searchButton.setHorizontalAlignment(JLabel.CENTER);
        panelRight.add(searchButton, BorderLayout.NORTH);


        userButton = new UserButton(50, 50);
        userButton.setHorizontalAlignment(JLabel.CENTER);
        panelRight.add(userButton,BorderLayout.SOUTH);

        panelCenter.setLayout(new GridLayout(2,2, 10 ,0));

        orderButton = new MenuButton("Make Order");
        recordButton = new MenuButton("Records");
        financeButton = new MenuButton("Finance");
        productsButton = new MenuButton("Products");

        panelCenter.add(orderButton);
        panelCenter.add(productsButton);
        panelCenter.add(recordButton);
        panelCenter.add(financeButton);



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

    public MenuButton getOrderButton() {
        return orderButton;
    }

    public MenuButton getRecordButton() {
        return recordButton;
    }

    public MenuButton getFinanceButton() {
        return financeButton;
    }

    public MenuButton getProductsButton() {
        return productsButton;
    }

    public SearchButton getSearchButton() {
        return searchButton;
    }

    public UserButton getUserButton() {
        return userButton;
    }

}
