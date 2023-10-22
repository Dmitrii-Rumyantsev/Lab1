package ru.mirea.lab13.task1;

import java.io.FileReader;
import java.io.IOException;

public class ReadOutput {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("/Users/dima/IdeaProjects/Lab1/src/ru/mirea/lab13/task1/task.txt");
            int i;
            while ((i = file.read())!= -1){
                if((char)(i) == '\n' ){
                    System.out.println("");
                }
                else {
                    System.out.print((char) (i));
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
