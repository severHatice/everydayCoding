package org.sever;

import java.util.Scanner;

public class PrimeNumber {
    /*Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only.
     In other words, prime numbers can't be divided by other numbers than itself or 1.
      For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers. Note: 0 and 1 are not prime numbers.*/

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();

        primeCalculator(num);
    }
    public static void primeCalculator(int num) {
        int flag=0;
        for(int i=2; i<num; i++) {
            if(num%i==0) {
                flag=1;
            }
        }
        if(flag==1) {
            System.out.println(num+" is not a prime number");
        }else {
            System.out.println(num+" is a prime number");
        }
    }
}
