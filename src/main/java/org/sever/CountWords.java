package org.sever;

import java.util.*;

public class CountWords {
    /*
	  Count the words in a String one by one
	  String is "Ali came to school and Ayse came to school"
	  Ali=1, came=2, to=2, school=2, and=1, Ayse=1
	 */
    public static void main(String[] args) {
        String str="Ali came to school and Ayse came to school";

        String words[]=str.split(" ");
        List<String> wordsList= new ArrayList();

        for(String w:words) {
            wordsList.add(w.replaceAll("[^a-zA-Z]", ""));
        }

        System.out.println(wordsList);

        Map<String, Integer> numOfWords=new HashMap<>();

        for(String w:wordsList)
        {
            if(numOfWords.containsKey(w))
            {
                numOfWords.put(w,numOfWords.get(w)+1);

            }
            else
            {
                numOfWords.put(w, 1);
            }
        }


        System.out.println(numOfWords);



    }

}
