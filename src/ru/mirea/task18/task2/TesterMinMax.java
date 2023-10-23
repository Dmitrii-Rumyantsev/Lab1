package ru.mirea.task18.task2;

import java.lang.reflect.Array;

public class TesterMinMax {
    public static void main(String[] args) {
        MinMax<Integer> minMaxInteger = new MinMax<>(new Integer[]{1,2,3,4,5});
        System.out.println("Max = " + minMaxInteger.getMax());
        System.out.println("Min = " + minMaxInteger.getMin());
        MinMax<Character> minMaxChar = new MinMax<>(new Character[]{'a','c','b','d'});
        System.out.println("Max = " + minMaxChar.getMax());
        System.out.println("Min = " + minMaxChar.getMin());
        MinMax<String> minMaxString = new MinMax<>(new String[]{"aplha","beta","door"});
        System.out.println("Max = " + minMaxString.getMax());
        System.out.println("Min = " + minMaxString.getMin());
    }
}
