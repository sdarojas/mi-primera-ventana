package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Calculator2Window {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10,10,550,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        BorderLayout border = new BorderLayout(10,10);
        mainPanel.setLayout(border);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        f.add(mainPanel);

        JPanel northPanel = new JPanel();
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        northPanel.setLayout(flowLayout);
        mainPanel.add(northPanel,BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setVgap(10);
        borderLayout.setHgap(10);
        centerPanel.setLayout(borderLayout);
        centerPanel.setBackground(Color.gray);
        centerPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        mainPanel.add(centerPanel,BorderLayout.CENTER);

        JPanel tecladoPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(4,4);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);
        tecladoPanel.setLayout(gridLayout);
        tecladoPanel.setOpaque(false);
        centerPanel.add(tecladoPanel,BorderLayout.CENTER);

        JPanel tSPanel = new JPanel();
        tSPanel.setPreferredSize(new Dimension(0,50));
        GridLayout gridL = new GridLayout(1,2);
        gridL.setHgap(10);
        gridL.setVgap(10);
        tSPanel.setLayout(gridL);
        tSPanel.setOpaque(false);
        centerPanel.add(tSPanel,BorderLayout.SOUTH);

        JTextField result = new JTextField("0",30);
        result.setHorizontalAlignment(JTextField.RIGHT);
        result.setBackground(Color.WHITE);
        northPanel.add(result);

        JButton bt7 = new JButton("7");
        JButton bt8 = new JButton("8");
        JButton bt9 = new JButton("9");
        JButton btDel = new JButton("DEL");
        btDel.setBackground(Color.GREEN);
        JButton bt4 = new JButton("4");
        JButton bt5 = new JButton("5");
        JButton bt6 = new JButton("6");
        JButton btPlus = new JButton("+");
        JButton bt1 = new JButton("1");
        JButton bt2 = new JButton("2");
        JButton bt3 = new JButton("3");
        JButton btMinus = new JButton("-");
        JButton btPoint = new JButton(".");
        JButton bt0 = new JButton("0");
        JButton btDiv = new JButton("/");
        JButton btMul = new JButton("*");

        JButton reset = new JButton("RESET");
        reset.setBackground(Color.GREEN);
        JButton igual = new JButton("=");
        igual.setBackground(Color.ORANGE);

        tecladoPanel.add(bt7);
        tecladoPanel.add(bt8);
        tecladoPanel.add(bt9);
        tecladoPanel.add(btDel);
        tecladoPanel.add(bt4);
        tecladoPanel.add(bt5);
        tecladoPanel.add(bt6);
        tecladoPanel.add(btPlus);
        tecladoPanel.add(bt1);
        tecladoPanel.add(bt2);
        tecladoPanel.add(bt3);
        tecladoPanel.add(btMinus);
        tecladoPanel.add(btPoint);
        tecladoPanel.add(bt0);
        tecladoPanel.add(btDiv);
        tecladoPanel.add(btMul);

        tSPanel.add(reset);
        tSPanel.add(igual);

        f.revalidate();
        f.repaint();
    }
}
