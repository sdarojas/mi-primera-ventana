package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFlowLayoutWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Titled border window");
        f.setVisible(true);
        f.setBounds(20,20,550,300);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.add(mainpanel);

        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("Button3");
        JButton button4 = new JButton("Long-Named Button 4");
        JButton button5 = new JButton("5");

        JRadioButton rbLeft = new JRadioButton("Left to right");
        rbLeft.setActionCommand("LEFT");
        rbLeft.setSelected(true);
        JRadioButton rbRight = new JRadioButton("Right to left");
        rbRight.setActionCommand("RIGHT");

        ButtonGroup group = new ButtonGroup();
        group.add(rbLeft);
        group.add(rbRight);
        JButton buttonApply = new JButton("Apply orietation");

        mainpanel.add(button1);
        mainpanel.add(button2);
        mainpanel.add(button3);
        mainpanel.add(button4);
        mainpanel.add(button5);
        mainpanel.add(rbLeft);
        mainpanel.add(rbRight);
        mainpanel.add(rbRight);
        mainpanel.add(buttonApply);


        buttonApply.addActionListener(e -> {
            String selected = group.getSelection().getActionCommand();
            FlowLayout layoutManager = (FlowLayout) mainpanel.getLayout();
            if (selected.equals("RIGHT")) {
                layoutManager.setAlignment(FlowLayout.RIGHT);
            }
            else if (selected.equals("LEFT")){
                layoutManager.setAlignment(FlowLayout.LEFT);
            }
            mainpanel.repaint();
            mainpanel.revalidate();

        });

        f.repaint();
        f.revalidate();
    }
}
