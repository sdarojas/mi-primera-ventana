package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayoutWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(20,20,500,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("BorderLayout");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        BorderLayout layoutManager = (BorderLayout) mainPanel.getLayout();
        layoutManager.setHgap(20);
        layoutManager.setVgap(20);
        f.add(mainPanel);

        JButton btNorth = new JButton("Hide North Border");
        JButton btSouth = new JButton("Hide South Border");
        JButton btWest = new JButton("Hide West Border");
        JButton btEast = new JButton("Hide East Border");
        JButton btCenter = new JButton("Hide Center Border");
        mainPanel.add(btNorth,BorderLayout.NORTH);
        mainPanel.add(btSouth,BorderLayout.SOUTH);
        mainPanel.add(btWest,BorderLayout.WEST);
        mainPanel.add(btEast,BorderLayout.EAST);
        mainPanel.add(btCenter,BorderLayout.CENTER);

        f.revalidate();
        f.repaint();

    }
}
