package ru.mirea.lab7.task1;

public class Student implements  Comparable <Student>{
    private String family;
    private int GPA;
    Student(String family, int GPA){
        this.family = family;
        this.GPA = GPA;
    }
    @Override
    public int compareTo(Student o) {
        int res = this.GPA - o.GPA;
        if(res == 0){
            res = this.family.compareTo(o.family);
        }
        return res;
    }

    @Override
    public String toString() {
        return "family= " + family +", GPU= " + GPA;
    }
}
