package org.sever;

public class NestedLoop {
    /*Array veya Collection vorso for-each-loop kullanmak ilk tercihiniz olsun
Array veyo Collection vor and "index" kullanmak zorundosiniz o zawon "for-each-loop" colismoz,
 "For-loop" veyo "while-loop" veya "do-while-loop" kullanwolisiniz*/

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{3,4,5}};
        int sum=0;

        for (int [] w:arr) {
           for(int i:w){
               sum+=i;
               if(sum<8){
                   System.out.println(sum);
               }
           }
        }
        System.out.println(sum);
    }
}
