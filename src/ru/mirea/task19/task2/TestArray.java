package ru.mirea.task19.task2;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        Array<String> strArray = new Array<>(new String[]{"Меня","Зовут", "Дмитрий"});
        Array<Long> longArray = new Array<>(new Long[]{100000L,2132321321L,312312312L});
        Array<Integer> intArray = new Array<>(new Integer[]{1,2,3,4,5,6,7,8,9,0});
        System.out.println(Arrays.stream(strArray.getArrays()).toList());
        System.out.println(Arrays.stream(longArray.getArrays()).toList());
        System.out.println(Arrays.stream(intArray.getArrays()).toList());

    }
}
