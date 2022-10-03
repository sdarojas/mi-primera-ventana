package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutWindow3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(10,10,550,300);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        f.add(mainPanel);
        mainPanel.add(new JButton("One"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(1,1,1,1),
                        0,
                        0

                ));
        mainPanel.add(new JButton("Two"),
                new GridBagConstraints(
                        1,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(1,1,1,1),
                        0,
                        0

                ));
        mainPanel.add(new JButton("Three"),
                new GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(1,1,1,1),
                        0,
                        0

                ));
        mainPanel.add(new JButton("Four"),
                new GridBagConstraints(
                        0,
                        1,
                        2,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(1,1,1,1),
                        0,
                        0

                ));
        mainPanel.add(new JButton("Five"),
                new GridBagConstraints(
                        2,
                        1,
                        1,
                        2,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(1,1,1,1),
                        0,
                        0

                ));
        mainPanel.add(new JButton("Six"),
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(1,1,1,1),
                        0,
                        0

                ));
        mainPanel.add(new JButton("Seven"),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(1,1,1,1),
                        0,
                        0

                ));
        f.repaint();
        f.revalidate();
    }
}
