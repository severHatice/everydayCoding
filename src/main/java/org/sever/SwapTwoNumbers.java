package org.sever;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {

////Write a Java Program to swap two numbers

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter to numbers to swap");
        double n1=scan.nextDouble();
        double n2=scan.nextDouble();

        System.out.println("Before swapping n1= "+ n1 +"n2= "+n2);

        double swap=0;

        swap=n1;
        n1=n2;
        n2=swap;

        System.out.println("After swapping n1= "+ n1 +"n2= "+n2);

        //Second way

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After swapping n1= "+ n1 +"n2= "+n2);

    }

}
