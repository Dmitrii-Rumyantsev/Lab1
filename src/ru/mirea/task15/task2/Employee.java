package ru.mirea.task15.task2;

public class Employee {
    private String FIO;
    private int money, yearWork;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getYearWork() {
        return yearWork;
    }

    public void setYearWork(int yearWork) {
        this.yearWork = yearWork;
    }
}
