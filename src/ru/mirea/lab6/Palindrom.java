package ru.mirea.lab6;

public class Palindrom {
    public static String recursion(String poli){
        if(poli.length() <= 1){
            return "YES";
        }
        if(poli.charAt(0) != poli.charAt(poli.length() -1 )){
            return "NO";
        }
        return recursion(poli.substring(1,poli.length()-1));
    }
    public static void main(String[] args) {
        System.out.println("Word: los");
        System.out.println(recursion("los"));
    }
}
