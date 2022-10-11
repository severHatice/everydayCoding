package org.sever;

public class FormatPhoneNumber {
    public static void main(String[] args) {
        String input = "1234567890";
        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        System.out.println(number);
        //second way
        String str="12563222";
        solution(str);
    }

    private static void solution(String s) {
        s=s.replace("-", "").replace(" ", "");
        int bi=0;
        int ei=3;
        String result="";

        int slength=s.length();

        if(s.length() % 3 > 1 || s.length() % 3 == 0){
            for(int i=0, j = 0; i < s.length(); i++){
                result += s.charAt(i);
                j++;
                if( j == 3){
                    result += "-";
                    j = 0;
                }
            }}}
}
