package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class CalculatorWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(20,20,500,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Calculadora");

        JPanel mainPanel = new JPanel();
        BorderLayout borderLayout = new BorderLayout(10,10);
        mainPanel.setLayout(borderLayout);
        f.add(mainPanel);

        JPanel northPanel = new JPanel();
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        northPanel.setLayout(flowLayout);
        mainPanel.add(northPanel,BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(5,4);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);
        centerPanel.setLayout(gridLayout);
        mainPanel.add(centerPanel,BorderLayout.CENTER);

        JTextField result = new JTextField(20);
        result.setBackground(Color.WHITE);
        result.setSize(100,5);
        northPanel.add(result);

        JButton btRtc = new JButton("Rtc");
        JButton btCe = new JButton("CE");
        JButton btCl = new JButton("CL");
        JButton btPlusMinus = new JButton("+/-");
        JButton bt7 = new JButton("7");
        JButton bt8 = new JButton("8");
        JButton bt9 = new JButton("9");
        JButton btDiv = new JButton("/");
        JButton bt4 = new JButton("4");
        JButton bt5 = new JButton("5");
        JButton bt6 = new JButton("6");
        JButton btx = new JButton("x");
        JButton bt1 = new JButton("1");
        JButton bt2 = new JButton("2");
        JButton bt3 = new JButton("3");
        JButton btMinus = new JButton("-");
        JButton bt0 = new JButton("0");
        JButton btPoint = new JButton(".");
        JButton btEqual = new JButton("=");
        JButton btPlus = new JButton("+");

        centerPanel.add(btRtc);
        centerPanel.add(btCe);
        centerPanel.add(btCl);
        centerPanel.add(btPlusMinus);
        centerPanel.add(bt7);
        centerPanel.add(bt8);
        centerPanel.add(bt9);
        centerPanel.add(btDiv);
        centerPanel.add(bt4);
        centerPanel.add(bt5);
        centerPanel.add(bt6);
        centerPanel.add(btx);
        centerPanel.add(bt1);
        centerPanel.add(bt2);
        centerPanel.add(bt3);
        centerPanel.add(btMinus);
        centerPanel.add(bt0);
        centerPanel.add(btPoint);
        centerPanel.add(btEqual);
        centerPanel.add(btPlus);


        f.repaint();
        f.revalidate();
    }
}
