package ru.mirea.lab13.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFalse {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            FileWriter file = new FileWriter("/Users/dima/IdeaProjects/Lab1/src/ru/mirea/lab13/task2/task.txt",false);
            String str;
            str = scanner.nextLine();
            while (!str.isEmpty()){
                file.write(str);
                file.append('\n');
                str = scanner.nextLine();
            }
            file.append('\n');
            file.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
