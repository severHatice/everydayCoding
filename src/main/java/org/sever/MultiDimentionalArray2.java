package org.sever;

public class MultiDimentionalArray2 {
    // Bir multidimensional orray deki en buyuk ve en kucuk elemanin toglovini veren kodu yaziniz
    public static void main(String[] args) {
        int [][] arr={{2,5,7,5},{2,4,9},{15,4}};
        int maxElement=arr[0][0];
        int minElement=arr[0][0];
        for (int []w:arr) {
            for (int k:w){
                maxElement=Math.max(k,maxElement);
                minElement=Math.min(k,minElement);
            }
        }
        System.out.println(maxElement+minElement);
    }
}
