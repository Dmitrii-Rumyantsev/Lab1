package ru.mirea.lab6Abstact.TaskTwo;

public class YorkshireTerrier extends Dog{
    private String breed;
    YorkshireTerrier(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    @Override
    public String toString(){
        return "Small dog: breed = " + getBreed() + ", name = " + super.getName() + ", age = " + super.getAge();
    }
}
