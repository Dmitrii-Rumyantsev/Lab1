package ru.mirea.lab7.task1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] GPA1 = new Student[3];
        Student[] GPA2 = new Student[3];
        int x = 1;
        while (x != 0) {
            System.out.println("Выберите сортировку\n1 - Сортировка вставками\n2 - Быстрая сортировка Хоара\n3 - Сортировка слиянием(сортирует после вставки и быстрой)\n0 - Выход из цикла");
            x = scanner.nextInt();
            switch (x) {
                case 1 -> {
                    System.out.println("Введите фамилию и сумму баллов");
                    for (int i = 0; i < GPA1.length; i++) {
                        String family = scanner.next();
                        int gpa;
                        if(scanner.hasNextInt()) {
                            gpa = scanner.nextInt();
                            GPA1[i] = new Student(family, gpa);
                        }
                        else {
                            System.out.println("Введены неверные данные" + --i);
                        }
                    }
                    sort(GPA1);
                }
                case 2 -> {
                    System.out.println("Введите фамилию и сумму баллов");
                    for (int i = 0; i < GPA2.length; i++) {
                        String family = scanner.next();
                        int gpa;
                        if(scanner.hasNextInt()) {
                            gpa = scanner.nextInt();
                            GPA2[i] = new Student(family, gpa);
                        }
                        else {
                            System.out.println("Введены неверные данные" + --i);
                        }
                    }
                    quickSortXoara(GPA2, 0, GPA2.length - 1);
                    for (Object student : GPA2){
                        System.out.println(student.toString());
                    }
                }
                case 3 -> {
                    mergeSort(GPA1, GPA2);
                }
            }
        }
    }
    public static void sort( Student[] GPA1){
        for (int i = 0; i <GPA1.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < GPA1.length; j++){
                if(GPA1[j].compareTo(GPA1[i]) < 0){
                    min = j;
                }
            }
            Student t = GPA1[i];
            GPA1[i] = GPA1[min];
            GPA1[min] = t;
        }
        for (Object student : GPA1){
            System.out.println(student.toString());
        }
    }
    public static void quickSortXoara(Student[] GPA2, int start, int end){
        if(start >= end){
            return;
        }
        int pl = procedur(GPA2,start,end);
        quickSortXoara(GPA2, start, --pl);
        quickSortXoara(GPA2, ++pl, end);
    }
    public static int procedur(Student[] GPA2, int start, int end){
        Student r = GPA2[end];
        int l = start;

        for (int i = start; i < end;i++){
            int res = GPA2[i].compareTo(r);
            if(res <= 0){
                Student t = GPA2[i];
                GPA2[i] = GPA2[l];
                GPA2[l] = t;
                l++;
            }
        }
        Student t = GPA2[end];
        GPA2[end] = GPA2[l];
        GPA2[l] = t;
        return l;
    }

    public static void mergeSort(Student[] GPA1, Student[] GPA2) {
        int length1 = GPA1.length;
        int length2 = GPA2.length;
        Student[] GPA3 = new Student[length1 + length2];
        int index1 = 0, index2 = 0, index3 = 0;

        while (index1 < length1 && index2 < length2) {
            if (GPA1[index1].compareTo(GPA2[index2]) <= 0) {
                GPA3[index3++] = GPA1[index1++];
            } else {
                GPA3[index3++] = GPA2[index2++];
            }
        }

        while (index1 < length1) {
            GPA3[index3++] = GPA1[index1++];
        }

        while (index2 < length2) {
            GPA3[index3++] = GPA2[index2++];
        }

        for (Student student : GPA3) {
            System.out.println(student.toString());
        }
    }
}
