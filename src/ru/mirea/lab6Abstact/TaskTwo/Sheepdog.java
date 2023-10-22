package ru.mirea.lab6Abstact.TaskTwo;

public class Sheepdog extends Dog{
    public String breed;
    Sheepdog(String name,int age, String breed){
        super(name,age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString(){
        return "Big dog: bredd = " + getBreed() + ", name = " + super.getName() + ", age = " + super.getAge();
    }
}
