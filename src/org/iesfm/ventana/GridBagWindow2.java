package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagWindow2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10,10,550,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setTitle("Ejemplo 2 GridBagLayout");

        JPanel mainPanel = new JPanel(new GridBagLayout());
        f.add(mainPanel);

        mainPanel.add(new JTextArea("Area texto"),
                new GridBagConstraints(
                        0,
                        0,
                        2,
                        2,
                        3,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(5,5,5,5),
                        0,
                        0

                ));
        mainPanel.add(new JButton("Button 1"),
                new GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0

                ));
        mainPanel.add(new JButton("Button 2"),
                new GridBagConstraints(
                        2,
                        1,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0

                ));
        mainPanel.add(new JButton("Button 3"),
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1,
                        0.25,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0

                ));
        mainPanel.add(new JTextField("Campo texto"),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        4,
                        0.25,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0

                ));
        mainPanel.add(new JButton("Button 4"),
                new GridBagConstraints(
                        2,
                        2,
                        1,
                        1,
                        1,
                        0.25,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5,5,5,5),
                        0,
                        0

                ));

        f.revalidate();
        f.repaint();

    }
}
