package ru.mirea.task13;

import java.util.Stack;
public class StackType{
    public void Game(int[] array, int[] arr) {
        Stack<Integer> firstPlayer = addInList(array), secondPlayer = addInList(arr);
        int count = 0;
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            count++;
            if(Math.abs(firstPlayer.get(0) - secondPlayer.get(0)) == 9){
                if(firstPlayer.get(0) == 0){

                    firstPlayer.remove(0);
                    firstPlayer.push(9);
                    firstPlayer.push(0);
                }
                else{
                    firstPlayer.remove(0);
                    secondPlayer.remove(0);
                    secondPlayer.push(9);
                    secondPlayer.push(0);
                }
            }
            else if( firstPlayer.get(0) > secondPlayer.get(0)){
                firstPlayer.push(secondPlayer.get(0));
                firstPlayer.push(firstPlayer.get(0));
                firstPlayer.remove(0);
                secondPlayer.remove(0);

            }
            else{
                secondPlayer.push(firstPlayer.get(0));
                secondPlayer.push(secondPlayer.get(0));
                secondPlayer.remove(0);
                firstPlayer.remove(0);
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
    public Stack<Integer> addInList(int[] array){
        Stack<Integer> stack = new Stack<>();
        for(Integer i : array){
            if(i >= 0){
                stack.add(i);
            }
        }
        return stack;
    }

}
