package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Milan_Real {
    private int milanScore = 0;
    private int madridScore = 0;
    private String lastScorer = "N/A";
    private String winner = "DRAW";
    private JLabel result;
    private JLabel lastScore;
    private JLabel win;
    private JLabel milanLogo;
    private JLabel madridLogo;
    public Milan_Real() {
        JFrame frame = new JFrame("МАТЧ! Реал Мадрид - Милан");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 600);
        JPanel mainPanel =  new JPanel();
        mainPanel.setLayout(new GridLayout(3,1));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        result = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        lastScore = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        win = new JLabel("Winner: DRAW", SwingConstants.CENTER);
        JLabel space = new JLabel("      ");
        JLabel space2 = new JLabel("      ");
        panel1.add(result);
        panel1.add(space);
        panel1.add(lastScore);
        panel1.add(space2);
        panel1.add(win);
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        ImageIcon milan = new ImageIcon("/Users/dima/IdeaProjects/Lab1/src/ru/mirea/lab5/milan.jpeg");
        milanLogo = new JLabel(milan);
        ImageIcon madrid = new ImageIcon("/Users/dima/IdeaProjects/Lab1/src/ru/mirea/lab5/Real.jpeg");
        madridLogo = new JLabel(madrid);
        panel2.add(madridLogo);
        panel2.add(milanLogo);
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        panel3.add(madridButton);
        panel3.add(milanButton);
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels("AC Milan");
            }
        });
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels("Real Madrid");
            }
        });

        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private void updateLabels(String scorer) {
        result.setText("Result: " + madridScore + " X " + milanScore);
        lastScore.setText("Last Scorer: " + scorer);
        if (milanScore > madridScore) {
            winner = "AC Milan";
        } else if (madridScore > milanScore) {
            winner = "Real Madrid";
        } else {
            winner = "DRAW";
        }
        win.setText("Winner: " + winner);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Milan_Real();
            }
        });
    }
}
