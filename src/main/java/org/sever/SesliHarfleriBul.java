package org.sever;

import java.util.Arrays;
import java.util.Locale;

public class SesliHarfleriBul {
    // Example 1: Bir string'deki sesli harflerin sayisini bulan kodu yaziniz.
// a e i o....
    public static void main(String[] args) {
        String str="bu dUnya gelir gecer";
        str=str.toLowerCase();
        String [] arr=str.split("");
        int counter=0;
        for (String w:arr) {
            switch (w){
                case "a":
                case "e":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);
        int [][]ar=new int[2][3];//2 eleman var diyorsak index ine 1 demeli
        ar[1][0]=4;
        ar[1][1]=3;
        // Multidimensional Array console'a casil yazdirilic?
        System.out.println(Arrays.deepToString(ar));//**************************************
// Multidimensional Array'lerde Array elemanlardan biri nosil yozdirilir
        System.out.println(Arrays.toString(ar[1]));
        // Multidimensional Array'lerde ic Arroy'lerdeki elemanlar nasil yazdirilir?
        System.out.println(ar[1][1]);
    }
}
