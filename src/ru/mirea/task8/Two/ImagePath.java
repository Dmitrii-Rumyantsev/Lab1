package ru.mirea.task8.Two;

import javax.swing.*;

public class ImagePath extends JFrame {
    public static void main(String[] args) {
        String path = args[0];
        JFrame panel = new JFrame();
        ImageIcon image = new ImageIcon(path);
        JLabel imageLabel = new JLabel(image);
        panel.add(imageLabel);
        panel.setSize(500,500);
        panel.setVisible(true);
    }
}
