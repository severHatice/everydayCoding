package org.sever;

import java.util.Arrays;

public class PermutationString {

    public static void main(String[] args) {

        String str1="car";
        String str2="rac";
        isPermutation(str1, str2);

    }

    public static void isPermutation(String str1, String str2) {
        String[] arr1=str1.toLowerCase().split("");
        Arrays.sort(arr1);
        String[]arr2=str2.toLowerCase().split("");
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)) {
            System.out.println("permutation string");
        } else {
            System.out.println("not permutation string");
        }
    }
}

