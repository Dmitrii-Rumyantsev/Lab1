package ru.mirea.lab2.task1;

public class Dog {
    private int age;
    private String name;
    public Dog(){
        this.name = "";
        this.age = 0;
    }
    public Dog(String name){
        this.name = name;
        age = 0;
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void ageToHuman(){
        System.out.println("Возраст в человеческих годах " + age * 7);
    }
    public String toString(){
        return "Имя "+ this.name + ", возраст " + this.age;
    }
}
