package ru.mirea.task22.Task2;

public class Client {
    public Chair chair;
    public void sit(){
        System.out.println("Клиент сел на стул");
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
