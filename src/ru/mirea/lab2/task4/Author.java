package ru.mirea.lab2.task4;

public class Author {
    private String name, email;
    private char gender;
    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        if(this.gender == 'F' || this.gender == 'M') {
            this.gender = gender;
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
}
