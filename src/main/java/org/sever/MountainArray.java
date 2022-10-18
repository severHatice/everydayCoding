package org.sever;

public class MountainArray {
    /* * 15 Minutes Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to
     * the maximum value, decreasing constantly after the maximum value
     * Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to
     * the maximum value, decreasing and increasing after the maximum value
     * Create a method to check if it is Mountain Array or not. Use as possible as
     * Functional Programming */
    public static void main(String[] args) {
        int []arr={1,2,3,4,3,6,1};
        int flag1=0;
        int flag2=0;
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i+1]<arr[i]){
                flag1=1;
            }
        }
        System.out.println(flag1);
        for (int i = arr.length/2; i < arr.length-1; i++) {
            if(arr[i+1]>arr[i]){
                flag2=1;
            }
        }
        System.out.println(flag2);
        if(flag1==0 && flag2==0){
            System.out.println("maintain array");
        }else{
            System.out.println("not mountain array");
        }

    }
}
