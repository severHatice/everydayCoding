package org.sever;

import java.util.Scanner;

public class CharacterCount {
    /*	Ebay Interview Questions
Get a String and a character from user
Count the number of characters between the first occurrence and the last occurrence of the given character in the String
Do not count the space characters
If the character which user selected is displayed just once in the String return -1
If the character which user selected does not exist in the String return -1
For example; "Java is easy" - 'a' ==> 5
          "Java is easy" - 'w' ==> -1
          "Java is easy" - 'e' ==> -1
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String please");
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        characterCount(str,ch);

    }

    private static void characterCount(String str, char ch) {
        int count=0;
        int firstIndex=str.indexOf(ch);
        int lastIndex=str.lastIndexOf(ch);
        if(firstIndex==lastIndex)
        {
            System.out.println(-1);
        }
        else
        {
            for(int i=firstIndex+1; i<lastIndex; i++)
            {
                if(str.charAt(i)!=' ')
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
