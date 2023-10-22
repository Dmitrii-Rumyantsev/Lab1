package ru.mirea.lab6Abstact.TaskFree;

public class Table extends Furniture {
    int countHuman, sizeL, sizeW;
    Table(String type, String material,int price, int sizeL, int sizeW){
        super(type,material,price);
        this.sizeL = sizeL;
        this.sizeW = sizeW;
    }
    public int getCountHuman() {
        return countHuman;
    }
    public int getSizeL() {
        return sizeL;
    }
    public int getSizeW() {
        return sizeW;
    }
    @Override
    public String toString(){
        return "Type = " + super.getType() + ", material = " + super.getMaterial() + ", price = " + super.getPrice() + ", sizeL = " + getSizeL() + ", sizeW = " + getSizeW() + ", countHuman = " + getCountHuman();
    }
}
