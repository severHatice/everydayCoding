package org.sever;

import java.util.Arrays;

public class BinarySearch {
// binarySearch()Method: Bu method'u kullnarak bir elemanin Array'de olup olmadigini anlariz.
// binarySearch()Method'unu kullanmadan once mutlaka "Arroys.sort()" kullanilaglidir.
// binarySearch()Method'u aradiginiz eleson Array'de varsa o elamin indexini return eder.
  //  binarySearch()Method'u aradiginiz elevan Accou'de yoksa " o" seklinde bir negatif sayi alirsiniz.
    // Bu soyidoki"" sgretinin onlari bu eleron Acroy'de yok greektic,"o" nin anlar olsaydi kacinci sicada olurdu demektic.
    public static void main(String[] args) {
        int [] arr={21,22,13,56};
        //sort yapmadan
        int num2=13;
        int index2=Arrays.binarySearch(arr,num2);
        System.out.println(index2);
        //sort yaparak
        Arrays.sort(arr);//lazim yoksa yanlis sonuc verme ihtimali var
        int num=13;
        int index=Arrays.binarySearch(arr,num);
        System.out.println(index);

    }
}
