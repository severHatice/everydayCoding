package org.sever;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    /*
		  Ask user to enter 2 Strings.
		  If the characters and the numbers of characters of the Strings are same then print "Anagram" on the console.
		  Otherwise, print "Not Anagram" on the console.
		  Ignore cases.
		  For example; "Mary" and "army" and "RAMY" are Anagrams.
		*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 characters, please");
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        isAnagram(str,str2);
    }

    private static void isAnagram(String str, String str2) {
        String s[]=str.toLowerCase().split("");
        Arrays.sort(s);
        String s2[]=str2.toLowerCase().split("");
        Arrays.sort(s2);

        if(Arrays.equals(s,s2) && s.length!=0){
            System.out.println(str + " and " + str2 + " is anagramdir");
        }else {
            System.out.println(str + " and " + str2 + " is anagram degildir");
        }

    }
}
