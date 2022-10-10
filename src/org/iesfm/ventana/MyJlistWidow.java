package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJlistWidow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(10,10,350,300);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setTitle("CoDejaVu : JList");

        JPanel mainPanel = new JPanel(new BorderLayout());
        f.add(mainPanel);



        JLabel borderLabel = new JLabel("JList");
        borderLabel.setPreferredSize(new Dimension(150,50));
        borderLabel.setFont(new Font("Calibri",Font.PLAIN,20));
        borderLabel.setHorizontalAlignment(SwingConstants.CENTER);
        borderLabel.setBorder(BorderFactory
                .createTitledBorder(
                        BorderFactory.createLoweredBevelBorder()));
        JPanel borderPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        borderPanel.add(borderLabel);
        mainPanel.add(borderPanel,BorderLayout.NORTH);

        JLabel checkLabel = new JLabel("Se agregóun nuevo elemento");
        mainPanel.add(checkLabel,BorderLayout.SOUTH);

        JPanel centerPanel = new JPanel(new BorderLayout());
        mainPanel.add(centerPanel,BorderLayout.CENTER);

        JPanel insertPanel = new JPanel(new FlowLayout());
        centerPanel.add(insertPanel,BorderLayout.NORTH);

        JTextField insertText = new JTextField(15);
        insertPanel.add(insertText);
        JButton insertbt = new JButton("Agregar");


        insertPanel.add(insertbt);

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>();
        list.setModel(model);

        model.addElement("Cristian David");
        model.addElement("Ana Milano");
        model.addElement("Miguel Angel");
        model.addElement("Juan Jaenada");
        model.addElement("Javier Hernandez");
        model.addElement("Co Dejavu");
        model.addElement("Dejavu Co");

        centerPanel.add(new JScrollPane(list),BorderLayout.CENTER);


        JPanel removePanel = new JPanel(new FlowLayout());
        centerPanel.add(removePanel,BorderLayout.SOUTH);
        JButton removeItembt = new JButton("Eliminar");
        JButton removeListbt = new JButton("Borrar lista");

        insertbt.addActionListener(e -> {
            String person = insertText.getText();
            if (person.isBlank()){
                JOptionPane.showMessageDialog(f,"Debe introducir un nombre de persona");
            }else {
                model.addElement(person);
                insertText.setText("");
            }
        });

        removeListbt.addActionListener(e -> {
            model.clear();
        });

        removeItembt.addActionListener(e -> {
            int selected = list.getSelectedIndex();
            model.removeElementAt(selected);

        });




        removePanel.add(removeItembt);
        removePanel.add(removeListbt);






        f.repaint();
        f.revalidate();
    }
}
