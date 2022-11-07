package org.sever;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroesToEnd {

    public static void main(String[] args) {
		/*
	 	Ebay Interview Question
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
	 */


        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the length");
        int l= scan.nextInt();

        int arr[]= new int[l];
        System.out.println("Enter the elements");
        for(int i=0; i<l; i++)
        {
            arr[i]=scan.nextInt();
        }
        int idx=0;

        int brr[]=new int[l];
        for(int i=0; i<l; i++)
        {
            if(arr[i]!=0)
            {
                brr[idx]=arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
    }

}
