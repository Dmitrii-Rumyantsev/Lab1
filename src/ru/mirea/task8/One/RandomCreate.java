package ru.mirea.task8.One;

import java.util.Random;

public class RandomCreate implements RandomClass{
    RandomClass[] rand;
    Random s = new Random();
    public RandomCreate(RandomClass[] rand){
        this.rand = rand;
    }
    @Override
    public Shape create() {
        int id = s.nextInt(rand.length);
        return rand[id].create();
    }
}
