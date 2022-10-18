package org.sever;

import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String [] strs={"yasasi","yasaniz","yasik"};
        System.out.println(longestCommonPrefix1(strs));
    }
    public static String longestCommonPrefix1(String[] a) {
        int size = a.length;
        if (size == 0)
            return "";

        if (size == 1)
            return a[0];
        System.out.println("test " +a[0]);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));//[yasaniz, yasasi, yasik]

        int end = Math.min(a[0].length(), a[size-1].length());//5
        System.out.println("end"+end);
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
            i++;

        String pre = a[0].substring(0, i);
        return pre;
    }
}
