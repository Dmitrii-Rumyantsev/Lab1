package ru.mirea.task22.INpdf;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory)
    {
        return factory.createComputer();
    }
}