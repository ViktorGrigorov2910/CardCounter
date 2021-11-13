package GAMETRY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JButton button2;
    JButton button3;
    JLabel label;
    JLabel label2;
    int count = 0;
    MyFrame() {
// HIGH CARDS -1
        button = new JButton("-1");
        button.setBounds(30, 60, 50, 90);
        button.setFocusable(false);
        button.addActionListener(this);
// LOW CARDS +1
        button2 = new JButton("+1");
        button2.setBounds(30, 200, 50, 90);
        button2.setFocusable(false);
        button2.addActionListener(this);
// DISPLAY THE CURRENT COUNT
        label = new JLabel((String.valueOf(count)));
        label.setBounds(200, 80, 180, 200);
// CHECKS THE TRUE COUNT
        button3 = new JButton("CHECK FOR REAL COUNT");
        button3.setBounds(350, 50, 200, 80);
        button3.setFocusable(false);
        button3.addActionListener(this);
//DISPLAY TRUE COUNT
        label2 = new JLabel("Real count : ");
        label2.setBounds(400, 150, 200, 80);

//FRAME SETUP (BASIC SETUP WITH ADDED BUTTONS)
        //to add background



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setTitle("BJ Counter");
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
        this.add(button2);
        this.add(button3);
        this.add(label);
        this.add(label2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
// +1
            count++;
            label.setText(String.valueOf(count));
        }
        if (e.getSource() == button2) {
// -1
            count--;
            label.setText(String.valueOf(count));
        }
        if (e.getSource() == button3) {
// GET TRUE COUNT
            Scanner scan = new Scanner(System.in);
            double decksRemaining = Double.parseDouble(JOptionPane.showInputDialog(null, "Number of decks remaining : "));
//DISPLAY THE TRUE COUNT
            double trueCount = count / decksRemaining;
            DecimalFormat format = new DecimalFormat("#.##");
            format.format(trueCount);
            label2.setText("Real count : " + trueCount);
        }
    }

    }


