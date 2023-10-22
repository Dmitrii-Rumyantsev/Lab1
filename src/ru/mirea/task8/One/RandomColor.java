package ru.mirea.task8.One;

import javax.swing.*;
import java.awt.*;

public class RandomColor extends JFrame {
    private RandomCreate rd;
    private ShapePanel[] panels = new ShapePanel[20];
    public RandomColor() {
        rd = new RandomCreate(new RandomClass[]{
                new Circle(),
                new Square(),
                new Rectangle()
        });
        setLayout(new GridLayout(5, 5));
        for (int i = 0; i < panels.length; i++) {
            Shape shape = rd.create();
            panels[i] = new ShapePanel(shape);
            add(panels[i],BorderLayout.CENTER);
        }
        setSize(1000, 1000);
    }
    private class ShapePanel extends JPanel {
        private Shape shape;
        public ShapePanel(Shape shape) {
            this.shape = shape;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            shape.paint(g2d);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RandomColor frame = new RandomColor();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
