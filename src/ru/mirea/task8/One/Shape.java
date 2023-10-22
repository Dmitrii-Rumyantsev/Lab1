package ru.mirea.task8.One;

import java.awt.*;

public abstract class Shape {
    private int r,g,b;
    private int rows,cols;
    public void paint(Graphics g) {};
    public Shape(){}
    public Shape(int r, int g, int b, int rows, int cols) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.rows = rows;
        this.cols = cols;
    }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
    public int getG() {
        return g;
    }
    public void setG(int g) {
        this.g = g;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getRows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }
    public int getCols() {
        return cols;
    }
    public void setCols(int cols) {
        this.cols = cols;
    }
}
