package ru.mirea.task19.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStringOrInt<E> {
    private List<E> list = new ArrayList<>();
    public ListStringOrInt(E[] array){
        list.addAll(Arrays.asList(array));
    }

    public List<E> getList() {
        return list;
    }
}
