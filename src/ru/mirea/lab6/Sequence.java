package ru.mirea.lab6;

public class Sequence {
    public static int reccursion(long n, int count){
        if(n % 100 == 0){
            return reccursion(n / 100, 0);
        }
        if(n <= 1){
            return ++count;
        }
        if(n % 10 == 1) {
            return reccursion(n / 10, ++count);
        }
        return reccursion(n / 10, count);
    }

    public static void main(String[] args) {
        System.out.println("Number: 1101113001");
        System.out.println(reccursion(1101113001,0));
    }
}
 