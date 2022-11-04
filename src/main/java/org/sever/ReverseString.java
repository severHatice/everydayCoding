package org.sever;

import java.util.Scanner;

public class ReverseString {

    //Write a Java Program to reverse a string



    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a String");
        String str=scan.nextLine();

        StringBuilder strB= new StringBuilder();
        strB.append(str);

        StringBuffer strBf=new StringBuffer();
        strBf.append(str);
        System.out.println(strBf.reverse());

        System.out.println(strB.reverse());

        String reverseStr="";
        //2.way
        for(int i=str.length()-1; i>=0; i--)
        {
            reverseStr=reverseStr+str.charAt(i);
        }


        System.out.println(reverseStr);

    }

}
