package org.iesfm.ventana;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MyTitledBorderWndow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Titled border window");
        f.setVisible(true);
        f.setBounds(20,20,500,300);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();
        f.add(mainpanel);

        JPanel titledPanel = new JPanel();
        titledPanel.setBorder(BorderFactory.
                createTitledBorder(
                        BorderFactory.createLineBorder(Color.gray,10,true),
                        "Search"));
        mainpanel.add(titledPanel);
        JRadioButton name = new JRadioButton("By name");
        JRadioButton id = new JRadioButton("By ID");

        ButtonGroup group = new ButtonGroup();
        group.add(name);
        group.add(id);

        titledPanel.add(name);
        titledPanel.add(id);


        f.revalidate();
        f.repaint();
    }
}
