package org.sever;

public class Palindrome {

    public static void main(String[] args) {
        String str="radarr";
        isPalindrome(str);
    }

    private static void isPalindrome(String str) {
   int length=str.length();

        for (int i = 0; i <length ; i++) {
            if(str.charAt(i)!=str.charAt(length-i-1)){
                System.out.println("It is not Palindrome");
            }
        } System.out.println("It is Palindrome");

    }

}
