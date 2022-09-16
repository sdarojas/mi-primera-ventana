package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class dosPaneles {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(20,20,300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Titulo");

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);
        panel1.setBounds(100,5,100,100);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.CYAN);
        panel2.setBounds(100,105,500,500);

        JPanel panel3 = new JPanel();
        panel3.setBounds(100,200,50,50);
        panel3.setBackground(Color.LIGHT_GRAY);
        f.add(panel1);
        panel1.add(panel2);
        panel1.add(panel3);


        f.repaint();
        f.revalidate();
    }
}
