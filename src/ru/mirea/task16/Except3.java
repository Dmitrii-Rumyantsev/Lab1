package ru.mirea.task16;

public class Except3 {
    private String details;

    public Except3(String details) {
        this.details = details;
    }

    public String getDetails() {
        if(details == null){
            throw new NullPointerException("Исключение внутри метода");
        }
        return details;
    }

    public static void main(String[] args) {
        Except3 except3 = new Except3(null);
        if (except3.getDetails() == null){
            throw new NullPointerException("Строка не может быть пустая");
        }
    }
}
