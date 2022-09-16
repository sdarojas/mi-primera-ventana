package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class dosPaneles {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(20,20,500,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Titulo");

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);
        panel1.setLayout(null);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.CYAN);
        panel2.setBounds(0,0,100,100);

        JPanel panel3 = new JPanel();
        panel3.setBounds(200,0,100,100);
        panel3.setBackground(Color.LIGHT_GRAY);

        f.add(panel1);
        panel1.add(panel2);
        panel1.add(panel3);


        f.repaint();
        f.revalidate();
    }
}
