package ru.mirea.task19;

import java.util.Arrays;

public class TestList {
    public static void main(String[] args) {

        ListStringOrInt<Integer> intList = new ListStringOrInt<>(new Integer[]{0,1,2,3,4,5});
        System.out.println(intList.getList());
        ListStringOrInt<String> strList = new ListStringOrInt<>(new String[]{"азбука","еда","арбуз","день","ночь"});
        System.out.println(strList.getList());
    }
}
