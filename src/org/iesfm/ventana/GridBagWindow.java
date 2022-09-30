package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setBounds(10, 10, 350, 400);

        JPanel mainpanel = new JPanel(new GridBagLayout());
        f.add(mainpanel);

        JButton bt1 = new JButton("Button 1");
        mainpanel.add(bt1,
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0
                )
        );
        JButton bt2 = new JButton("Button 2");
        mainpanel.add(bt2,
                new GridBagConstraints(
                        1,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0
                )
        );
        JButton bt3 = new JButton("Button 3");
        mainpanel.add(bt3,
                new GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0
                )
        );
        JButton bt4 = new JButton("Long Named Button 4");
        mainpanel.add(bt4,
                new GridBagConstraints(
                        0,
                        1,
                        3,
                        1,
                        1,
                        4,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0
                )
        );
        JButton bt5 = new JButton("Button 5");
        mainpanel.add(bt5,
                new GridBagConstraints(
                        1,
                        2,
                        2,
                        1,
                        1,
                        1,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0
                )
        );
        f.repaint();
        f.revalidate();
    }
}
