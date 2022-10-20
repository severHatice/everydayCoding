package org.sever;

import java.util.Arrays;

public class PermMissing {

    public static void main(String[] args) {
	/*An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)],
	which means that exactly one element is missing.
Your goal is to find that missing element.
Write a function: class Solution { public int solution(int[] A); }
that, given an array A, returns the value of the missing element.

For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [0..100,000];
the elements of A are all distinct; each element of array A is an integer within the range [1..(N + 1)].*/

        //first way-easy
        int [] arr={2,1,4,5};

        int missing=0;
        Arrays.sort(arr);
        int increase=arr[arr[0]];
        for (int w:arr) {

            if(w==(increase)){

            }else{
                increase++;
                missing=increase;
                System.out.println(missing);
                break;
            }
        }
       //second way
        int arr1[]= {2,1,3,5};
        int sum=0;
        int arrSum=0;
        for(int i=0; i<arr1.length+1; i++) {
            sum=sum+(i+1);
        }
        for(int i=0;i<arr1.length; i++) {
            arrSum=arrSum+arr1[i];
        }
        System.out.println(sum);
        System.out.println(sum-arrSum);



    }



}
