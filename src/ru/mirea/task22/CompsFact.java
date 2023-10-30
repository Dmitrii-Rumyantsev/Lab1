package ru.mirea.task22;

public class CompsFact {
    public static Complex getComplex(CompexAbstractFactory factory){
        return factory.createComplex();
    }
    public static Complex GetComplex(CompexAbstractFactory factory,int a, int b){
        return factory.CreateComplex(a,b);
    }
}
