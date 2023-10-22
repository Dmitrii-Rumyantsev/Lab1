package ru.mirea.lab6Abstact.TaskOne;

public class TableWare extends Dish{
    private int sizeW,sizeL;
    TableWare(String type, String material,int sizeW,int sizeL){
        super(type, material);
        this.sizeW = sizeW;
        this.sizeL = sizeL;
    }

    public int getSizeL() {
        return sizeL;
    }

    public int getSizeW() {
        return sizeW;
    }

    @Override
    public String toString(){
        return "TableWare: type = " + super.getType() + ", material = " + super.getMaterial() + ", sizeL = " + getSizeL() + ", sizeW = " + getSizeW();
    }
}