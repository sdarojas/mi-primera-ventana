package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadioButtonsWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setBounds(20,20,300,400);
        f.setTitle("My RadioButtons window");
        JPanel mainPanel = new JPanel();
        f.add(mainPanel);
        JRadioButton windows = new JRadioButton("Windows");
        windows.setActionCommand("Windows");
        JRadioButton linux = new JRadioButton("Linux");
        linux.setActionCommand("Linux");
        JRadioButton mac = new JRadioButton("Macintosh");
        mac.setActionCommand("Macintosh");
        JRadioButton android = new JRadioButton("Android");
        android.setActionCommand("Android");
        ButtonGroup group = new ButtonGroup();
        group.add(windows);
        group.add(linux);
        group.add(mac);
        group.add(android);

        mainPanel.add(windows);
        mainPanel.add(linux);
        mainPanel.add(mac);
        mainPanel.add(android);

        JLabel fotologo = new JLabel();
        fotologo.setSize(20,20);
        fotologo.setIcon(new ImageIcon("Linux.jpg")); //Linux.jpg
        mainPanel.add(fotologo);

        JButton okButton = new JButton("ok");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String selected = group.getSelection().getActionCommand();

                JOptionPane.showMessageDialog(f,"Ha seleccionado "+ selected);

                fotologo.setIcon(new ImageIcon(selected+".jpg"));
            }
        });
        mainPanel.add(okButton);

        f.revalidate();
        f.repaint();

    }
}
