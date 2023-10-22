package ru.mirea.task13;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DequeueType {
    public static int Game(int[] array, int[] arr) {
        Deque<Integer> firstPlayer = new LinkedList<>(), secondPlayer = new LinkedList<>();
        addDeque(firstPlayer, array);
        addDeque(secondPlayer, arr);
        int count = 0;
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {
            count++;
            if (Math.abs(firstPlayer.getFirst() - secondPlayer.getFirst()) == 9) {
                if (firstPlayer.getFirst() == 0) {
                    firstPlayer.addLast(secondPlayer.getFirst());
                    firstPlayer.addLast(firstPlayer.getFirst());
                    firstPlayer.removeLast();
                    secondPlayer.removeLast();
                } else {
                    secondPlayer.add(firstPlayer.getFirst());
                    secondPlayer.add(secondPlayer.getFirst());
                    firstPlayer.removeLast();
                    secondPlayer.removeLast();
                }
            } else if (firstPlayer.getFirst() > secondPlayer.getFirst()) {
                firstPlayer.add(secondPlayer.getFirst());
                firstPlayer.add(firstPlayer.getFirst());
                firstPlayer.removeLast();
                secondPlayer.removeLast();
            } else {
                secondPlayer.add(firstPlayer.getFirst());
                secondPlayer.add(secondPlayer.getFirst());
                firstPlayer.removeLast();
                secondPlayer.removeLast();
            }
        }
        if(count >= 106){
            System.out.println("botva");
            return -1;
        }
        if(firstPlayer.isEmpty()){
            System.out.println("second " + count);
        }
        else{
            System.out.println("first " + count);
        }
        return 0;
    }

    public static Deque<Integer> addDeque(Deque<Integer> deque, int[] array) {
        for (Integer i : array) {
            if (i >= 0) {
                deque.addLast(i );
            }
        }
        return deque;
    }
}
