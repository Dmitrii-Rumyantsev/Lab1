package ru.mirea.task19.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Catlg {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\dima3\\IdeaProjects\\Lab1";
        ArrayList<File> fileList = listFiles(directoryPath);

        System.out.println("Первые 5 элементов в каталоге:");
        for (int i = 0; i < Math.min(5, fileList.size()); i++) {
            System.out.println(fileList.get(i));
        }
    }

    public static ArrayList<File> listFiles(String directoryPath) {
        ArrayList<File> fileList = new ArrayList<>();
        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    fileList.add(file);
                }
            } else {
                System.out.println("Не удалось получить содержимое каталога.");
            }
        } else {
            System.out.println("Указанный путь не является каталогом или не существует.");
        }

        return fileList;
    }

}