package org.sever;

public class stringX {
    /*Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"*/
    public static void main(String[] args) {
        String str="xlkrfmxxxfgx";
        System.out.println(stringX1(str));
    }

    public static String stringX1(String str) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<str.length(); i++) {

            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result.append(str.charAt(i)); // Could use str.charAt(i) here
            }
        }
        return result.toString();
    }
}
