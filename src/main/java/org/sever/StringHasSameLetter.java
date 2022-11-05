package org.sever;

import java.util.Arrays;
import java.util.Scanner;

public class StringHasSameLetter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki String giriniz");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        same(str1, str2);

    }

    public static void same(String str1, String str2) {

        String[] arr1= str1.split("");
        String[] arr2=str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String newStr="";
        String newStr2="";

        for(String each:arr1) {
            newStr=newStr+each;

        }
        for(String each:arr2)
        {
            newStr2=newStr2+each;

        }
        if(newStr.equals(newStr2))
        {
            System.out.println("strings are same");
        }
        else
        {
            System.out.println("strings are not the same");
        }
    }

}
