package ru.mirea.lab3.task_one;

public class Author {
    private String name, email;
    private char gender;
    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        char male = gender;
        if(male == 'M' || male == 'F') {
            this.gender = male;
        }
        else {
            this.gender = 'U';
        }
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return getName() + " " +
                getGender() +
                " at " +
                getEmail();
    }
}
