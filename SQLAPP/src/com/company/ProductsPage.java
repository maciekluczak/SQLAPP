package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ProductsPage extends JLayeredPane {
    public LogoButton logo;
    public Integer numOfOrders= 50;
    private JPanel scrollPanel = new JPanel();
    private DefaultTableModel model;
    private JTable orderTable;
    private MenuButton modifyButton, addButton, removeButton;

    public ProductsPage() {
        JPanel panelUp = new JPanel();
        JPanel panelRight = new JPanel();
        JPanel panelLeft = new JPanel();
        JPanel panelDown = new JPanel();
        JPanel panelCenter = new JPanel();
        JPanel panelBackground = new JPanel();

        panelUp.setBackground(Color.green);
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
        panelDown.setPreferredSize(new Dimension(250,120));
        panelCenter.setPreferredSize(new Dimension(200,200));
        panelBackground.setSize(1100,880);

        panelBackground.setLayout(new BorderLayout());

        panelUp.setLayout(new BorderLayout());
        logo= new LogoButton(450, 90);
        panelUp.add(logo,  BorderLayout.EAST);
        logo.setHorizontalAlignment(JLabel.CENTER);
        logo.setVerticalAlignment(JLabel.CENTER);

        panelUp.add(new PageTag("   PAGE| Products"), BorderLayout.WEST);

        //Modyfikacja Produktów Tabeli
        panelRight.setLayout(new GridLayout(3,1));
        addButton= new MenuButton("Add");
        removeButton= new MenuButton("Remove");
        modifyButton= new MenuButton("Modify");

        addButton.setHorizontalAlignment(JLabel.CENTER);
        removeButton.setHorizontalAlignment(JLabel.CENTER);
        modifyButton.setHorizontalAlignment(JLabel.CENTER);

        panelRight.add(addButton);
        panelRight.add(removeButton);
        panelRight.add(modifyButton);


        // Tabela
        panelCenter.setLayout(new BorderLayout());
        model = new DefaultTableModel();
        orderTable = new JTable(model);
        orderTable.setRowHeight(40);
        orderTable.setForeground(Color.WHITE);
        orderTable.setBackground(new Color(26,26,26));
        orderTable.setFont(new Font("Verdana", Font.PLAIN, 18));
        orderTable.setDefaultEditor(Object.class, null);
        orderTable.setOpaque(true);

        model.addColumn("1");
        model.addColumn("2");
        model.addColumn("3");
        model.addColumn("4");
        model.addColumn("5");
        model.addColumn("6");

        model.addRow(new Object[]{"ID","Designer", "Model", "Size", "Cost", "Quantity" });



        JScrollPane scrollFrame = new JScrollPane(scrollPanel);
        scrollFrame.setOpaque(false);
        scrollFrame.getViewport().setOpaque(false);


        scrollPanel.setAutoscrolls(true);
        scrollPanel.setPreferredSize(new Dimension( 600, 40*numOfOrders));
        scrollPanel.setOpaque(false);
        scrollPanel.setBackground(Color.BLUE);
        scrollPanel.setLayout(new GridLayout(1,1,10,10));

        SwingUtilities.updateComponentTreeUI(scrollFrame);
        scrollPanel.add(orderTable);
        panelCenter.add(scrollFrame);



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