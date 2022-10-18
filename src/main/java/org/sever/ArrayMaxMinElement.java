package org.sever;

import java.sql.Array;
import java.util.Scanner;

public class ArrayMaxMinElement {
     /*
 	Create a function that takes an array and returns the difference between the
 	biggest and the smallest numbers. Ask user to enter array elements.
      */
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int arr[]=new int[3];
         for (int i = 0; i <arr.length ; i++) {
             System.out.println("please, enter an array elements");
             arr[i]=sc.nextInt();//3,5,7
         }
         int max=Integer.MIN_VALUE;//-2147483648
         int min=Integer.MAX_VALUE; //2147483647
         for(int i=0; i<arr.length; i++) {

             if(max<arr[i]){  //3,5,7 //-2147483648
                 max=arr[i];  //7
             }
             if(min>arr[i]) {   //3 5 7 //2147483647
                 min=arr[i];   //7
             }
         }
         System.out.println(max-min);
     }
}
