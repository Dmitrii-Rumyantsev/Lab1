package ru.mirea.lab6;

public class ZeroOne {
    public static int reccursion(int a, int b){
        if(a > b + 1 ){
            return 0;
        }
        if (a == 0 || b == 0){
            return 1;
        }
        return reccursion(a,b - 1) + reccursion(a - 1, b - 1);
    }

    public static void main(String[] args) {
        System.out.println("a = 10, b = 10");
        System.out.println(reccursion(10,10));
    }
}
