package ru.mirea.task22;

public class ConcreteFactory implements CompexAbstractFactory{
    private int real,image;
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real,image);
    }
}