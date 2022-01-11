package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainWindow extends JFrame implements MouseListener {
    private HomePage homePage = new HomePage();
    private TestPanel testPanel = new TestPanel();
    private SearchPage searchPage = new SearchPage();
    private OrderPage orderpage = new OrderPage();
    private FinancePage financePage = new FinancePage();
    private RecordsPage recordsPage = new RecordsPage();
    private ProductsPage productsPage = new ProductsPage();
    private LoginPage loginPage = new LoginPage();

    private JPanel contPanel;
    private CardLayout cl;

    private ImageIcon windowIcon;

    public MainWindow() throws HeadlessException {
        this.setTitle("WhatShoesOn?");
        this.setSize(1100, 880);
        setResizable(false);
        windowIcon = new ImageIcon("image\\R.png");
        this.setIconImage(windowIcon.getImage());

        this.setVisible(true);






        contPanel = new JPanel();
        cl = new CardLayout();
        contPanel.setLayout(cl);

        contPanel.add(testPanel, "0");
        contPanel.add(homePage, "1");
        contPanel.add(searchPage, "2");
        contPanel.add(orderpage, "3");
        contPanel.add(recordsPage, "4");
        contPanel.add(productsPage, "5");
        contPanel.add(financePage, "6");
        contPanel.add(loginPage, "7");



        homePage.getLogo().addMouseListener(this);
        homePage.getOrderButton().addMouseListener(this);
        homePage.getProductsButton().addMouseListener(this);
        homePage.getRecordButton().addMouseListener(this);
        homePage.getFinanceButton().addMouseListener(this);
        homePage.getSearchButton().addMouseListener(this);
        homePage.getUserButton().addMouseListener(this);

        orderpage.getLogo().addMouseListener(this );
        financePage.getLogo().addMouseListener(this);
        recordsPage.getLogo().addMouseListener(this);
        productsPage.getLogo().addMouseListener(this );
        loginPage.getLogo().addMouseListener(this);



        searchPage.getLogo().addMouseListener(this );


        cl.show(contPanel, "1");
        this.add(contPanel);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == homePage.getOrderButton()) {
            cl.show(contPanel, "3");
        }

        else if (e.getSource() == homePage.getSearchButton()) {
            cl.show(contPanel, "2");
        }

        else if (e.getSource() == homePage.getProductsButton()) {
            cl.show(contPanel, "5");
        }

        else if (e.getSource() == homePage.getFinanceButton()) {
            cl.show(contPanel, "6");
        }

        else if (e.getSource() == homePage.getRecordButton()) {
            cl.show(contPanel, "4");
        }
        else if (e.getSource() == homePage.getUserButton()) {
            cl.show(contPanel, "7");
        }

        if (e.getSource() == orderpage.getLogo()) {
            cl.show(contPanel, "1");
        }

        if (e.getSource() == searchPage.getLogo()) {
            cl.show(contPanel, "1");
        }

        if (e.getSource() == recordsPage.getLogo()) {
            cl.show(contPanel, "1");
        }
        if (e.getSource() == productsPage.getLogo()) {
            cl.show(contPanel, "1");
        }
        if (e.getSource() == financePage.getLogo()) {
            cl.show(contPanel, "1");
        }
        if (e.getSource() == loginPage.getLogo()) {
            cl.show(contPanel, "1");
        }

        }


        @Override
        public void mousePressed (MouseEvent e){

        }

        @Override
        public void mouseReleased (MouseEvent e){

        }

        @Override
        public void mouseEntered (MouseEvent e){

        }

        @Override
        public void mouseExited (MouseEvent e){

        }
    }
