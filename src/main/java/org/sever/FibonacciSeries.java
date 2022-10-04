package org.sever;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        //Fibonacci series

        int n1=0;
        int n2=1;
        int n3=0;
        System.out.println("enter how many fobo you want");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        System.out.print(n1+","+n2+",");

        for(int i=1; i<=n; i++) {


            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+",");
        }

    }

}

