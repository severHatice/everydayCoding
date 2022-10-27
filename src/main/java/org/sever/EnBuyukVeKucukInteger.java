package org.sever;

import java.util.Arrays;

public class EnBuyukVeKucukInteger {
    // Example 1: Size verilen pozitif ve ogegatif sauvilac icecen bir integer accou'deki
    // "en buyuk negotif"ve "en kucuk pozitif" elemani bulunuz.
    public static void main(String[] args) {
        int [] arr={2,-1,33,-6};
        Arrays.sort(arr);//-6,-1,2,33
       int maxNegative=arr[0];
       int minPozitive = arr[arr.length-1];
        for (int w:arr) {
            if(w<0){
                maxNegative=Math.max(maxNegative,w);
            }else{
                minPozitive=Math.min(minPozitive,w);

            }
        }
        System.out.println(maxNegative);
        System.out.println(minPozitive);

    }
}
