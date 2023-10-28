package ru.mirea.task16;

import java.util.Scanner;

public class Except3 {
    private String details;

    public Except3(String details) {
        this.details = details;
    }

    public String getDetails(String details) {
        if(details == null){
            throw new NullPointerException("Исключение внутри метода");
        }
        return details;
    }

    public static void main(String[] args) {
        Except3 except3 = new Except3(null);
        if (except3.getDetails(null) == null) {
            throw new NullPointerException("Строка не может быть пустая");
        }
        except3.printDetails(null);
    }
    public  void printDetails(String key){
        try {
            String message = getDetails(key);
            System.out.println(message);
        }catch (Exception e){
            throw e;
        }
    }
    public void getKey(){
        Scanner scanner = new Scanner(System.in);
        try {
            int key = scanner.nextInt();
        }catch (NumberFormatException e){
            System.out.println("Введено не число");
            getKey();
        }
    }
}
