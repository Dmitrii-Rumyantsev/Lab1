package ru.mirea.lab13.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteInput {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter file = new FileWriter("/Users/dima/IdeaProjects/Lab1/src/ru/mirea/lab13/task.txt");
            Scanner scanner = new Scanner(System.in);
            String  str;
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
