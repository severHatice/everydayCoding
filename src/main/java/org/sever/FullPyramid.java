package org.sever;

import java.util.Scanner;

public class FullPyramid {

    public static void main(String[] args) {
		/*
		 Ask user to enter the number of lines of a pyramide.
		  Type a program to create the pyramide.
		  For example if the number of lines is 5, the pyramide will be like;           *
																				      * * *
																				    * * * * *
																				  * * * * * * *
																				* * * * * * * * *
		 */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the lines of a pyramide");
        int numOfRows=scan.nextInt();

        for(int i=1; i<=numOfRows; i++) {

            for(int space = 1; space<=numOfRows-i; space++) {
                System.out.print("  ");
            }

            for(int k=0; k<2*i-1; k++) {
                System.out.print("* ");
            }

            System.out.println();

        }


        for(int i=1; i<=numOfRows; i++) {

            for(int space=1; space<=numOfRows-i; space++)
            {
                System.out.print(" ");
            }

            for(int k=1; k<=2*i-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
