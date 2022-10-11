package org.sever;

public class FindUniqueCharactersFromString {
    public static void main(String[] args) {
        String str="alievegel";
        uniqueChars(str);
    }

    private static void uniqueChars(String str) {
      char c;
      String uniqueChars="";
        for (int i = 0; i < str.length(); i++) {
         c=str.charAt(i);
           if(str.indexOf(c)==str.lastIndexOf(c)){
               uniqueChars+=c;
           }



        } System.out.println(uniqueChars);
    }
}
