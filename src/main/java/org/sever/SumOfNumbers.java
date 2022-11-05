package org.sever;

public class SumOfNumbers {

    public static void main(String[] args) {
		/* From a given array find all pairs whose sum is a given number
		  {4, 6, 5, -10, 8, 5, 20} ==> 10
		    For example;	4+6=10, 5+5=10, -10+20=10 */

        findPairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

        System.out.println("===========");

        findPairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

    }

    private static void findPairs(int[] is, int num) {

        for(int i=0; i<is.length; i++)
        {
            for(int j=i+1; j<is.length; j++)
            {
                if(is[i]+is[j]==num)
                {
                    System.out.println(is[i]+ " + "  +is[j]+ "="+ num);
                }
            }
        }

    }

}
