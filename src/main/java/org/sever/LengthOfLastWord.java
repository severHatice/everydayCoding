package org.sever;

import java.util.Scanner;

public class LengthOfLastWord {

    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);

        System.out.println("Enter a  sentence");
        String s=scan.nextLine();

        String[]arr=s.split(" ");

        int index=arr.length;
        System.out.println(index);

        System.out.println(arr[index-1].length());

    }

}

