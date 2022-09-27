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

        f.add(mainPanel);

        JPanel northPanel = new JPanel();
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        northPanel.setLayout(flowLayout);
        mainPanel.add(northPanel,BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        centerPanel.setLayout(borderLayout);
        mainPanel.add(centerPanel,BorderLayout.CENTER);

        JPanel tecladoPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(4,4);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);
        tecladoPanel.setLayout(gridLayout);
        centerPanel.add(tecladoPanel,BorderLayout.CENTER);

        JPanel tSPanel = new JPanel();
        GridLayout gridL = new GridLayout(1,2);
        gridL.setHgap(10);
        gridL.setVgap(10);
        tSPanel.setLayout(gridL);
        centerPanel.add(tSPanel,BorderLayout.SOUTH);

        TextField result = new TextField(20);
        result.setBackground(Color.WHITE);
        northPanel.add(result);

        JButton bt7 = new JButton("7");
        JButton bt8 = new JButton("8");
        JButton bt9 = new JButton("9");
        JButton btDel = new JButton("DEL");
        JButton bt4 = new JButton("4");
        JButton bt5 = new JButton("5");
        JButton bt6 = new JButton("6");
        JButton btPlus = new JButton("+");
        JButton btPlu1 = new JButton("1");
        JButton btPlu2 = new JButton("2");
        JButton btPlu3 = new JButton("3");
        JButton btPluMinus = new JButton("-");
        JButton btPoint = new JButton(".");
        JButton bt0 = new JButton("0");
        JButton btDiv = new JButton("/");
        JButton btMul = new JButton("*");

        

        f.revalidate();
        f.repaint();
    }
}
