package org.sever;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        // write your code in Java SE 8
        String br="";
        int N=135;
        while(N>0) {
            br=br+N%2;
            N=N/2;
        }
        System.out.println(br);
        String brr[]= br.split("");
        System.out.println(Arrays.toString(brr));

    }

}
