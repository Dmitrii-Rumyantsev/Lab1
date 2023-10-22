package ru.mirea.lab6Abstact.TaskFree;

public class Wardrobe extends Furniture{
    private int numberSections, countBoxes;
    Wardrobe(String type,String material, int price, int numberSections, int countBoxes){
        super(type,material,price);
        this.numberSections = numberSections;
        this.countBoxes = countBoxes;
    }
    public int getNumberSections() {
        return numberSections;
    }
    public int getCountBoxes() {
        return countBoxes;
    }
    @Override
    public String toString(){
        return "Type = " + super.getType() + ", material = " + super.getMaterial() + ", price = " + super.getPrice() + ", numberSections = " + getNumberSections() + ", countBoxes = " + getCountBoxes();
    }
}
