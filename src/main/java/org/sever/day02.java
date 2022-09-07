package org.sever;

public class day02 {
    /* Given a divisor and a bound, find the largest integer N such that:

N is divisible by divisor.
N is less than or equal to bound.
N is greater than 0.
It is guaranteed that such a number exists.

Example

For divisor = 3 and bound = 10, the output should be
solution(divisor, bound) = 9.

The largest integer divisible by 3 and not larger than 10 is 9.  */
    public static int divise(int divisor,int bound){
        int rest=bound%divisor;
       int divised= bound-rest;
        return divised;
    }

    public static void main(String[] args) {
        System.out.println(divise(3,10));
    }
}
