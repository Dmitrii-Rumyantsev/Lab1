package ru.mirea.task13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueType{
    public void Game(int[] array, int[] arr) {
        Queue<Integer> firstPlayer = addInList(array), secondPlayer = addInList(arr);
        int count = 0;
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            count++;
            int first = firstPlayer.remove();
            int second = secondPlayer.remove();
            if(Math.abs(first - second) == 9){
                if(first == 0){
                    firstPlayer.add(second);
                    firstPlayer.add(first);
                }
                else{
                    secondPlayer.add(first);
                    secondPlayer.add(second);
                }
            }
            else if( first > second){
                firstPlayer.add(second);
                firstPlayer.add(first);
            }
            else{
                secondPlayer.add(first);
                secondPlayer.add(second);
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
    }
    public Queue<Integer> addInList(int[] array){
        Queue<Integer> queue = new LinkedList<>();
        for (Integer i : array){
            if(i >= 0){
                queue.add(i);
            }
        }
        return queue;
    }
}
