package ru.mirea.task13;

import java.util.LinkedList;
import java.util.Scanner;

public class DoubleListType {
    public static void Game(int[] array, int[] arr){
        LinkedList<Integer> firstPlayer = addLinkList(array), secondPlayer = addLinkList(arr);
        int count = 0;
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {
            count++;
            if (Math.abs(firstPlayer.getLast() - secondPlayer.getLast()) == 9) {
                if (firstPlayer.getLast() == 0) {
                    firstPlayer.addFirst(secondPlayer.getLast());
                    firstPlayer.addFirst(firstPlayer.getLast());
                    firstPlayer.remove(0);
                    secondPlayer.remove(0);
                } else {
                    secondPlayer.addFirst(firstPlayer.getLast());
                    secondPlayer.addFirst(secondPlayer.getLast());
                    firstPlayer.remove(0);
                    secondPlayer.remove(0);
                }
            } else if (firstPlayer.getLast() > secondPlayer.getLast()) {
                firstPlayer.addFirst(secondPlayer.getLast());
                firstPlayer.addFirst(firstPlayer.getLast());
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else {
                secondPlayer.add(firstPlayer.getLast());
                secondPlayer.add(secondPlayer.getLast());
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }
        }
        if(count >= 106){
            System.out.println("botva");
            return;
        }
        if(firstPlayer.isEmpty()){
            System.out.println("second " + count);
        }
        else{
            System.out.println("first " + count);
        }
        return;
    }

    public static LinkedList<Integer> addLinkList( int[] array){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(Integer i : array){
            if(i >= 0){
                linkedList.addFirst(i);
            }
        }
        return linkedList;
    }
}
