package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagWindow3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(10,10,550,300);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        f.add(mainPanel);

        mainPanel.add(new JLabel("Full Name"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.NORTHEAST,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        1,
                        0,
                        3,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JLabel("Street"),
                new GridBagConstraints(
                        1,
                        1,
                        1,
                        1,
                        2,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JLabel("City"),
                new GridBagConstraints(
                        2,
                        1,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JLabel("Zip Code"),
                new GridBagConstraints(
                        3,
                        1,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JLabel("Adress"),
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.NORTHEAST,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );

        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        2,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        2,
                        2,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        3,
                        2,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JLabel("Phone"),
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.NORTHEAST,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        1,
                        3,
                        1,
                        1,
                        2,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JLabel("Age"),
                new GridBagConstraints(
                        2,
                        3,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        3,
                        3,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JLabel("Description"),
                new GridBagConstraints(
                        0,
                        4,
                        1,
                        1,
                        1,
                        8,
                        GridBagConstraints.NORTHEAST,
                        GridBagConstraints.NONE,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JTextArea(),
                new GridBagConstraints(
                        1,
                        4,
                        3,
                        1,
                        1,
                        8,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        mainPanel.add(new JButton("Submit"),
                new GridBagConstraints(
                        2,
                        5,
                        2,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(5,5,5,5),
                        0,
                        0
                )
        );
        f.repaint();
        f.revalidate();

    }
}
