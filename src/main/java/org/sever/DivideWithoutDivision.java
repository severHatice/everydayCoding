package org.sever;

public class DivideWithoutDivision {
    public static void main(String[] args) {

        int n1=25;
        int n2=3;
        division(n1,n2);

    }

    private static void division(int n1, int n2) {

        int count=0;
        while(n1>=n2)
        {
            n1=n1-n2;
            count++;
        }

        System.out.println(count+" ewmainder is " +n1);

    }
}
