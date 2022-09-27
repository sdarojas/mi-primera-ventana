package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBorderLayoutWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(20,20,500,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("BorderLayout");

        JPanel mainPanel = new JPanel();
        BorderLayout layoutManager = new BorderLayout(10,10);
        mainPanel.setLayout(layoutManager);
        //layoutManager.setHgap(10);
        //layoutManager.setVgap(10);
        f.add(mainPanel);

        JButton btNorth = new JButton("Hide North Border");
        btNorth.addActionListener(e -> btNorth.setVisible(false));

        JButton btSouth = new JButton("Hide South Border");
        btSouth.addActionListener(e -> btSouth.setVisible(false));

        JButton btWest = new JButton("Hide West Border");
        btWest.addActionListener(e -> btWest.setVisible(false));

        JButton btEast = new JButton("Hide East Border");
        btEast.addActionListener(e -> btEast.setVisible(false));

        JButton btCenter = new JButton("Hide Center Border");
        btCenter.addActionListener(e -> btCenter.setVisible(false));

        mainPanel.add(btNorth,BorderLayout.NORTH);
        mainPanel.add(btSouth,BorderLayout.SOUTH);
        mainPanel.add(btWest,BorderLayout.WEST);
        mainPanel.add(btEast,BorderLayout.EAST);
        mainPanel.add(btCenter,BorderLayout.CENTER);

        f.revalidate();
        f.repaint();

    }
}
