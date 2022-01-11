package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class RecordsPage extends JLayeredPane {
    public LogoButton logo;

    private MenuButton modifyButton, addButton, removeButton;

    public RecordsPage() {
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

        panelUp.add(new PageTag("   PAGE| Records"), BorderLayout.WEST);

        //Modyfikacja Produktów Tabeli
        panelRight.setLayout(new GridLayout(3,1));
        addButton= new MenuButton("Change Workspace");


        addButton.setHorizontalAlignment(JLabel.CENTER);

        panelRight.add(new JLabel());
        panelRight.add(new JLabel());
        panelRight.add(addButton);



        // Tabela
        panelCenter.setLayout(new GridLayout(1, 1));
        String text;
        text= "-------------------------- Employee Records -------------------------\n\n\n" +
                "LOGGED AS: <ID> <SURNAME>\n\n" +
                ">> PERSONAL DATA\n\n" +
                "Surname: -\n\n\n" +

                ">> CONDITIONS OF EMPLOYMENT\n\n" +
                "ID: -\n\n" +
                "Position: -\n\n"+
                "Employment Day: -\n\n" +
                "Salary: -\n\n\n" +

                ">> WORKSPACE\n\n" +
                "Current Workspace: -\n\n";


        JTextPane financePane = new JTextPane();
        financePane.setBackground(new Color(26,26,26));
        financePane.setFont(new Font("Verdana", Font.PLAIN, 18));
        financePane.setText(text);
        financePane.setForeground(Color.WHITE);
        panelCenter.add(financePane);




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