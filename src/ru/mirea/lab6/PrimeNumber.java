package ru.mirea.lab6;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        reccursion();
    }

    public static void reccursion(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 0){
            return;
        }
        if(n % 2 != 0){
            System.out.println(n);
        }
        reccursion();
    }
}
