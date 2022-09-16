package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 300,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel= new JPanel();
        mainPanel.setBackground(Color.lightGray);
        //JLabel label= new JLabel("Hola mundo");
        //label.setForeground(Color.white);
        //mainPanel.add(label);

        f.setContentPane(mainPanel);
        JLabel nameLabel= new JLabel("Usuario:");
        JButton acceptB = new JButton("Aceptar");
        JTextField nameTf = new JTextField(16);
        mainPanel.add(nameLabel);
        mainPanel.add(nameTf);
        mainPanel.add(acceptB);
        f.repaint();
        f.revalidate();

    }
}
