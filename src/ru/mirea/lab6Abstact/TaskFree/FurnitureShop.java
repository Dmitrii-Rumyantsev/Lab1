package ru.mirea.lab6Abstact.TaskFree;
// Кровать Дерево 100 2
// Шкаф Дерево 130 2 31
import java.util.Scanner;

public class FurnitureShop {
    Scanner scanner = new Scanner(System.in);
    private Furniture[] furnitures;
    //add, buy, print
    public void Array(int count){
        furnitures = new Furniture[count];
        for(int i = 0; i < count; i++){
            System.out.println("Выберите мебель, которую хотите добавить\n1 - Стол\n2 - Кровать\n3 - Шкаф");
            int x = scanner.nextInt();
            switch (x){
                case 1:
                    Furniture f = new Table(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    furnitures[i] = f;
                    break;
                case 2:
                    Furniture fs = new Bad(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt());
                    furnitures[i] = fs;
                    break;
                case 3:
                    Furniture fl = new Wardrobe(scanner.next(), scanner.next(), scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
                    furnitures[i] = fl;
                    break;
                default:
                    System.out.println("Вы ввели не правильное значение");
                    i--;
                    break;
            }
        }
    }
    public void addNew(Furniture furniture){
        Furniture[] tmp = new Furniture[furnitures.length + 1];
        System.arraycopy(furnitures,0, tmp, 0 ,furnitures.length);
        tmp[furnitures.length] = furniture;
        furnitures = tmp;
    }
    public Furniture[] getFurnitures() {
        return furnitures;
    }

    public void getInfo(){
        for(Object obj : furnitures){
            System.out.println(obj.toString());
        }
    }
}
