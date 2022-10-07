package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MyJlistWidow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(10,10,350,500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setTitle("CoDejaVu : JList");

        JPanel mainPanel = new JPanel(new BorderLayout());
        f.add(mainPanel);



        JLabel borderLabel = new JLabel("JList");
        borderLabel.setBorder(BorderFactory
                .createTitledBorder(
                        BorderFactory.createLoweredBevelBorder()));
        JPanel borderPanel = new JPanel(new FlowLayout());
        borderPanel.add(borderLabel);
        mainPanel.add(borderPanel,BorderLayout.NORTH);

        JLabel checkLabel = new JLabel("Se agregóun nuevo elemento");
        mainPanel.add(checkLabel,BorderLayout.SOUTH);

        JPanel centerPanel = new JPanel(new BorderLayout());
        mainPanel.add(centerPanel,BorderLayout.CENTER);

        JPanel insertPanel = new JPanel(new FlowLayout());
        centerPanel.add(insertPanel,BorderLayout.NORTH);

        JTextField insertText = new JTextField("Pepito Pérez");
        insertPanel.add(insertText);
        JButton insertbt = new JButton("Agregar");

        insertPanel.add(insertbt);

        JScrollPane scrollPane = new JScrollPane();
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>();
        list.setModel(model);

        model.addElement("Cristian David");
        model.addElement("Ana Milano");
        model.addElement("Miguel Angel");
        model.addElement("Co Dejavu");
        model.addElement("Co Dejavu");
        model.addElement("Co Dejavu");
        model.addElement("Co Dejavu");

        scrollPane.add(list);
        centerPanel.add(scrollPane,BorderLayout.CENTER);
        centerPanel.add(list,BorderLayout.CENTER);

        JPanel removePanel = new JPanel(new FlowLayout());
        centerPanel.add(removePanel,BorderLayout.SOUTH);
        JButton removeItembt = new JButton("Eliminar");
        JButton removeListbt = new JButton("Borrar lista");
        removePanel.add(removeItembt);
        removePanel.add(removeListbt);






        f.repaint();
        f.revalidate();
    }
}
