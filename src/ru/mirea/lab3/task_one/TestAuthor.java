package ru.mirea.lab3.task_one;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 =  new Author("Dima","dima.rumyantsev@edu.mirea.ru",'M');
        Author author2 = new Author("Anna", "anna.zimina@mail.ru", 'F');
        Author author3 = new Author("Sergei","serega.2000.sergeevich@uandex.com", 'T');
        author1.setEmail("dima33773@gmail.com");
        System.out.println(author1.toString());
        System.out.println(author2.toString());
        System.out.println(author3.toString());
    }
}
