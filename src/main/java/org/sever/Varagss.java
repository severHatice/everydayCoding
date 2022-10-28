package org.sever;

public class Varagss {
    public static void main(String[] args) {
        add("ge",1,2,3,4,5,6);
    }
    public static void add(String c,int... a){//varargs in arkasinda array calisir array icin for loop
        int sum=0;
        for (int w:a) {
            sum=sum+w;
        }
        c="yas";

        System.out.println(sum+" "+c);
    }
}
