package ru.mirea.task19.task4;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = newArrayList(new Integer[]{0,1,2});
        ArrayList<Character> key = newArrayList(new Character[]{'a','b','c'});
        HashSet<String> hashSet = newHashSet(new String[]{"apple","book","door"});
        HashMap<Character,Integer> hashMap = newHashMap(key,arrayList);
        System.out.println(arrayList);
        System.out.println(key);
        System.out.println(hashSet);
        System.out.println(hashMap);

    }

    public static <T> ArrayList<T> newArrayList(T[] elements) {
        ArrayList<T> list = new ArrayList<>(Arrays.stream(elements).collect(Collectors.toList()));
        return list;
    }

    public static <T> HashSet<T> newHashSet(T[] elements) {
        HashSet<T> set = new HashSet<>(Arrays.stream(elements).collect(Collectors.toSet()));
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException();
        }
        HashMap<K, V> kvHashMap = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            kvHashMap.put(keys.get(i), values.get(i));
        }
        return kvHashMap;
    }

}
