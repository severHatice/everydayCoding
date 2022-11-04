package org.sever;

import java.util.Scanner;

public class ReverseString2 {

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        System.out.println("Enter a  sentence");
        String s=scan.nextLine();

        String reverseString="";

        for(int i=s.length()-1; i>=0; i--)
        {
            reverseString=reverseString+s.charAt(i);
        }

        System.out.println(reverseString);

    }

}

