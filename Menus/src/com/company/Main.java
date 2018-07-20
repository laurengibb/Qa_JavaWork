package com.company;

import javax.swing.*;
import java.awt.event.*;

public class Main {
    JFrame F = new JFrame("Hello");
    JMenuBar Bar = new JMenuBar();
    JMenu menu1 = new JMenu("Operations1");
    JMenu menu2 = new JMenu("Operations2");
    JMenuItem M1 = new JMenuItem("Additions");
    JMenuItem M2 = new JMenuItem("Subtraction");
    JMenuItem M3 = new JMenuItem("Multiply");
    JMenuItem M4 = new JMenuItem("Divide");
    JLabel l1=new JLabel("Input 1:");
    JLabel l2=new JLabel("Input 2:");
    JLabel l3=new JLabel("Result:");
    JTextField t1 = new JTextField("");
    JTextField t2 = new JTextField("");
    JTextField t3 = new JTextField("");

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        menu1.add(M1);
        menu1.add(M2);
        menu2.add(M3);
        menu2.add(M4);

        Bar.add(menu1);
        Bar.add(menu2);

        F.setJMenuBar(Bar);

        M1.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent tt){
                        F.add(l3);
                        F.add(t3);
                        int result;
                        result = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
                        t3.setText(Integer.toString(result));

                    }
                });
        M2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent tt){
                        F.add(t3);
                        F.add(l3);
                        int result;
                        result = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
                        t3.setText(Integer.toString(result));

                    }
                });
        M3.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent tt){
                        F.add(t3);
                        F.add(l3);
                        int result;
                        result = Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
                        t3.setText(Integer.toString(result));
                    }
                });
        M4.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent tt){
                        F.add(t3);
                        F.add(l3);
                        int result;
                        result = Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText());
                        t3.setText(Integer.toString(result));
                    }
                });

        l1.setBounds(70,100, 100,30);
        l2.setBounds(70,150, 100,30);
        l3.setBounds(70,200, 100,30);
        t1.setBounds(120,100, 200,30);
        t2.setBounds(120,150, 200,30);
        t3.setBounds(120,200, 200,30);

        F.add(t1);
        F.add(t2);
        F.add(l1);
        F.add(l2);

        F.setSize(400, 400);
        F.setLayout(null);
        F.setVisible(true);
    }
}

