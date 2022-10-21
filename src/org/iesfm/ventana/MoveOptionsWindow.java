package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveOptionsWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setBounds(10,10,350,300);

        JPanel mainpanel = new JPanel(new GridBagLayout());
        f.add(mainpanel);

        DefaultListModel<String> leftModel = new DefaultListModel<>();
        JList<String> leftList = new JList<>();
        leftList.setModel(leftModel);

        leftModel.addElement("strSubjectName");
        leftModel.addElement("strStandardName");
        leftModel.addElement("strReferenceBook");

        mainpanel.add(leftList,new GridBagConstraints(
                0,
                0,
                1,
                2,
                3,
                1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(5,5,5,5),
                0,
                0
        ));

        JButton toRightBt = new JButton(">>");

        mainpanel.add(toRightBt,new GridBagConstraints(
                1,
                0,
                1,
                1,
                1,
                1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5),
                0,
                0
        ));

        JButton  toLeftBt = new JButton("<<");

        mainpanel.add(toLeftBt,new GridBagConstraints(
                1,
                1,
                1,
                1,
                1,
                1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5),
                0,
                0
        ));
        JList<String> rightList = new JList<>();
        DefaultListModel<String> rightModel = new DefaultListModel<>();
        rightList.setModel(rightModel);

        mainpanel.add(rightList,new GridBagConstraints(
                2,
                0,
                1,
                2,
                3,
                1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(5,5,5,5),
                0,
                0
        ));
        JButton addAllBt = new JButton("Add All");
        mainpanel.add(addAllBt,new GridBagConstraints(
                0,
                2,
                1,
                1,
                1,
                1,
                GridBagConstraints.HORIZONTAL,
                GridBagConstraints.WEST,
                new Insets(5,5,5,5),
                0,
                0
        ));
        JButton resetAllBt = new JButton("Reset All");
        mainpanel.add(resetAllBt,new GridBagConstraints(
                2,
                2,
                1,
                1,
                1,
                1,
                GridBagConstraints.HORIZONTAL,
                GridBagConstraints.WEST,
                new Insets(5,5,5,5),
                0,
                0
        ));


        toRightBt.addActionListener(e -> {
            String name = leftList.getSelectedValue();
            int selected = leftList.getSelectedIndex();
            if (name.isBlank()){
                System.out.println("Error, ningún elemento seleccionado");
            }else {
            rightModel.addElement(name);
            leftModel.removeElementAt(selected);
            }
        });

        toLeftBt.addActionListener(e -> {
            String name = rightList.getSelectedValue();
            int selected = rightList.getSelectedIndex();
            if (name.isBlank()){
                System.out.println("Error,  ningún elemento seleccionado");
            }else {
                leftModel.addElement(name);
                rightModel.removeElementAt(selected);
            }
        });




        f.revalidate();
        f.repaint();
    }
}
