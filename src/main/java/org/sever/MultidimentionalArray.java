package org.sever;

import java.util.Arrays;

public class MultidimentionalArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{3,2,1}};
        int arrr[][]=new int[3][];
int sum=0;
        for (int []w:arr) {
          sum+=w.length;
        }
        System.out.println(sum);
        int arr2[]=new int[sum];
int index=0;
        for (int w[]:arr) {
            for (int z:w) {
                arr2[index]=z;
                index++;
            }


        }
        System.out.println(Arrays.toString(arr2));
    }
}
