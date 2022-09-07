package org.sever;

public class altPairs {
    /*Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"*/

    public static void main(String[] args) {
String str="kitten";
        System.out.println(altPairs1(str));
    }

    public static String altPairs1(String str){
        String result="";
        for (int i = 0; i <str.length() ; i=i+4) {
           int len=i+2;
           if (len>str.length()){
               len=str.length();
           }
           result+=str.substring(i,len);
        }return result;
    }
}
