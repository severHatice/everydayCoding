package org.sever;

public class stringYak {
    /*Suppose the string "yak" is unlucky. Given a string, return a version where all the
    "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"*/
    public static void main(String[] args) {
String str="yatayak";
str=str.concat("t");
        System.out.println(str);
       // System.out.println(stringYak1(str));
    }
//    public static String stringYak1(String str) {
//        if(str.contains("yak")){
//            return str;
//        }
//
//    }

}
