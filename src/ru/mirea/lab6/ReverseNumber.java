package ru.mirea.lab6;

public class ReverseNumber {
    public static int reccursion(int n, int count){
        if(n == 0){
            return count;
        }
        return reccursion(n / 10, count * 10 + n % 10);
    }

    public static void main(String[] args) {
        System.out.println("n = 123");
        System.out.println(reccursion(123,0));
    }
}
