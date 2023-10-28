package ru.mirea.task17;

import java.util.Scanner;

public class OnlineBuy extends Exception{
    private String FIO;
    private long INN;
    OnlineBuy(String errorMessage, Throwable err, String FIO){
        super(errorMessage,err);
        this.FIO = FIO;
    }

    public long getINN() throws IllegalStateException {
        try (Scanner scanner = new Scanner(System.in)){
            String input = scanner.next();
            if (input.matches("\\d{12}")) {
                return Long.parseLong(input);
            } else {
                throw new IllegalStateException("Введено не 12 цифр");
            }
        }catch (NumberFormatException e){
            System.out.println("Введено не число");
        }
        return INN;
    }

}
