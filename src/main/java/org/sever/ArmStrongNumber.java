package org.sever;

import java.util.Scanner;

public class ArmStrongNumber {
    /*
 	A number is called an Armstrong number if it equals to the sum of the cube of its every digit.
    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
    You need to write a program to check if the given number is Armstrong number or not.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();//153
        armStrongNum(number);
    }

    private static void armStrongNum(int number) {
        int cubeOfDigits=0;
        int digit=0;
        int originalNum=number;

        do {

            digit=number%10;
            number=number/10;
            cubeOfDigits=cubeOfDigits+(digit*digit*digit);



        }while(number>0);

        if(cubeOfDigits==originalNum) {
            System.out.println(originalNum+"  is a armstrong number");
        }else {
            System.out.println(originalNum+"  is not a armstrong number");
        }
    }
}
