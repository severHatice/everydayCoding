package org.sever;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a STRING");
        String str=scan.nextLine();

        isPalindrome(str);
        isPalindrome2(str);


    }

    public static void isPalindrome(String str) {


        StringBuilder strB=new StringBuilder();

        strB.append(str);
        if(str.contentEquals(strB.reverse())) {
            System.out.println(str+ " is a palindrome");
        }
        else
        {
            System.out.println(str+ " is not a palindrome");
        }



    }

    public static void isPalindrome2(String str) {

        String reverseStr="";

        for(int i=str.length()-1; i>=0; i--)
        {
            reverseStr=reverseStr+str.charAt(i);
        }


        if(str.equals(reverseStr)) {
            System.out.println(str+ " is a palindrome");
        }
        else
        {
            System.out.println(str+ " is not a palindrome");
        }



    }

}

