package org.sever;

public class day4 {
    //reverse string
    public static void main(String[] args) {
        String str="123";
        System.out.println(reverseString(str));
        System.out.println(reverseWithStringBuilder(str));
    }

    private static String reverseWithStringBuilder(String str) {
        StringBuilder sb=new StringBuilder(str);
        str= String.valueOf(sb.reverse());
        return str;
    }

    private static String reverseString(String str) {
        char ch=' ';
        String reversed="";
        for ( int i = str.length()-1; i >=0; i--) {
           ch=str.charAt(i);
reversed+=ch;

        }
        return reversed;
    }

}
