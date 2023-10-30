package ru.mirea.task22;

public class Complex {
    private int real, image;
    Complex(){

    }
    Complex(int real, int image){
        this.real = real;
        this.image =image;
    }
    @Override
    public String toString(){
        return "real = " + real + ", image = " + image;
    }
}
