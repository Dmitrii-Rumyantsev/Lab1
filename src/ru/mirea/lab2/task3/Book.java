package ru.mirea.lab2.task3;

public class Book {
    private int page;
    private String nameBook, author;
    Book(int page,String nameBook, String author){
        this.page = page;
        this.nameBook = nameBook;
        this.author = author;
    }
    Book(String nameBook, String author){
        this.page = 0;
        this.nameBook = nameBook;
        this.author = author;
    }
    Book(String nameBook){
        this.page = 0;
        this.nameBook = nameBook;
        this.author = "";
    }
    Book(){
        this.page = 0;
        this.nameBook = "";
        this.author = "";
    }
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString(){
        return "Автор книги: " + getAuthor() + ", название произведения " + getNameBook() + ", количество страниц " + getPage();
    }
}
