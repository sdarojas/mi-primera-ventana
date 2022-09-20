package org.iesfm.ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComboBoxWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(20,20,500,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("ComboBox Example");

        JPanel mainPanel = new JPanel();
        f.add(mainPanel);

        JLabel text = new JLabel("Programming lenguaje selected: ");
        mainPanel.add(text);

        JComboBox<String> combo = new JComboBox<>();
        combo.addItemListener(actionEvent -> {
            String selectedLanguaje = combo.getItemAt(combo.getSelectedIndex());
            text.setText("Programming lenguaje selected: "+selectedLanguaje);

        });
        combo.addItem("C");
        combo.addItem("C++");
        combo.addItem("C#");
        combo.addItem("Java");
        combo.addItem("PHP");

        mainPanel.add(combo);



        JButton showBt = new JButton("Show");
        /*
        showBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String selectedLanguaje = combo.getItemAt(combo.getSelectedIndex());
                text.setText("Programming lenguaje selected: "+selectedLanguaje);

            }
        });

         */


        mainPanel.add(showBt);






        f.revalidate();
        f.repaint();
    }
}
