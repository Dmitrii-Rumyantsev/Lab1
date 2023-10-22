package ru.mirea.lab7.task1;

public class SortingStudentsByGPA implements Comparable<SortingStudentsByGPA>{
    protected String family;
    protected int MatAnaliz, Java,Philosophia, CiAOD;

    public SortingStudentsByGPA(String family, int matAnaliz, int java, int philosophia, int ciAOD) {
        this.family = family;
        this.MatAnaliz = matAnaliz;
        this.Java = java;
        this.Philosophia = philosophia;
        this.CiAOD = ciAOD;
    }

    public int getGPA(){
        return this.Philosophia + this.MatAnaliz + this.Java + this.CiAOD;
    }
    @Override
    public int compareTo(SortingStudentsByGPA o){
        int res = this.getGPA() - o.getGPA();
        if(res == 0){
            res = this.family.compareTo(o.family);
        }
        return res;
    }

    @Override
    public String toString() {
        return "SortingStudentsByGPA{" + "family='" + family + '\'' + "GPA=" + getGPA() + '}';
    }
}
