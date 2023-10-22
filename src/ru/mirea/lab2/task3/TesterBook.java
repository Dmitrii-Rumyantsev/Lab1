package ru.mirea.lab2.task3;

import java.util.Scanner;

public class TesterBook {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        Book book1 = new Book(870,"Война и мир. Том 1","Толстой Л.Н.");
        Book book2 = new Book("Капитанская дочка", "Пушкин А.С.");book2.setPage(320);
        Book book3 = new Book("Преступление и наказание");book3.setPage(608); book3.setAuthor("Достоевский Ф.М.");
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        for (Book book : books){
            System.out.println(book.toString());
        }
    }
}
