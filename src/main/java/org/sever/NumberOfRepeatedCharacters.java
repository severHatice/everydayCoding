package org.sever;

import java.util.*;

public class NumberOfRepeatedCharacters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to see repeated characters");
        String s = scan.nextLine();
        findRepeated(s);
        scan.close();

    }

    private static void findRepeated(String s) {


        String arr[]=s.split(" ");
        List<String> words= new ArrayList<String>();

        for(String w:arr)
        {
            words.add(w.replaceAll("[^a-zA-Z]",""));
        }

        Map<String, Integer> wordsCount= new HashMap();

        for(String w:words)
        {
            if(wordsCount.containsKey(w))
            {
                wordsCount.put(w, wordsCount.get(w)+1);
            }
            else {
                wordsCount.put(w, 1);
            }
        }


        System.out.println(wordsCount);


    }

}
