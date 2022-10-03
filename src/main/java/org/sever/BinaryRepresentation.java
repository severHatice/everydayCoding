package org.sever;

public class BinaryRepresentation {
    //	23. return the number of '1's in the binary representation of n for
//	any integer n, where n > 0
//	Example: for n=6 the binary representation is '110' and the
//	number of '1's in that
//	 representation is 2
    public static void main(String[] args) {
        int n=6;
  binaryRepresent(n);
    }

    private static void binaryRepresent(int n) {
        String str="";
        while(n>0) {
            if (n % 2 == 0) {
                str = str + "0";
            } else {
                str += "1";
            }
            n = n / 2;
        }
        System.out.println(str);
    }

}
