package org.sever;

public class StringBuilderExamples {
   /* 4) Imutable Class' larde var olan deser degistirilemez. Siz var olan bir degeri degistirmek istediginizde TechProducation
    i)Menory'de yeni bir variable yeni degerle olusturulur
    ii)Eski variable'in pointer'i yeni variable'a dondurulur
    iii)Eger bir variable'i hicbir pointer gostermiyorsa o variable "Garbage Collector" tararfindan silinir
            "Mutable class" larda var olan deger degistirilebilir. 011inol deger korunmaz.
5) "String Closs" Lorin "immutable yopisi "security" icin nentidic.
    Ayni degere sahip birden fazla string oldugundo, Jovo bir tang container plusturur ve ayni deger sabie String'lerin bu container's
    kullanmasini temin eder. Bu mexeory'i korumak için iyidic ancak container daki degeri bir variable isin degistirdiginizde tun variable larin
    etkilenesi tehlikesi vardir. Bu tehlikeden kurtulmak için Jovo String'leri "inutable(degisnez) |*/

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("yasasin");
        sb.append(" bir kez daha");
        sb.setCharAt(3,' ');
        sb.delete(4,7);
        sb.deleteCharAt(11);
        sb.reverse();//****************
        System.out.println(sb);

        String yeni=sb.toString();//stringe donusuyor
        System.out.println();
        StringBuilder sbb=new StringBuilder(yeni);
        System.out.println(sbb);
        sbb.insert(9,"gelen");
        System.out.println(sbb);

        String str="yasasin";
        str=str.concat(" bir kez daha");//assign must be
        System.out.println(str);
        String s="";
char c;
        for (int i =0; i <=str.length()-1; i++) {
c=str.charAt(i);
s=c+s;

        }
        System.out.println(s);

    }
}
