package ru.mirea.task14;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList<Integer> list = new BoundedWaitList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        UnfairWaitList<Integer> ls = new UnfairWaitList<>();
        ls.add(13);
        ls.add(321);
        ls.add(321312321);
        System.out.println(ls);
    }
}
