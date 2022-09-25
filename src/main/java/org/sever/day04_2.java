package org.sever;

public class day04_2 {
    //How to swap two numbers without using a third variable?
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
      a=a+b;
      b=a-b;
      a=a-b;

        System.out.println("a is "+a +" and"+ " b is "+b);

    }




}
