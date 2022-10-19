package org.sever;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfCharacters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to see repeated characters");
        String s = scan.nextLine();
        findRepeated(s);
        scan.close();


    }

    private static void findRepeated(String s) {

        String arr[] = s.split("");

        Map<String, Integer> numberOfChars = new HashMap<>();

        for (String w : arr) {
            if (numberOfChars.containsKey(w)) {
                numberOfChars.put(w, numberOfChars.get(w) + 1);
            } else {
                numberOfChars.put(w, 1);
            }
        }
        System.out.println(numberOfChars);
    }
}