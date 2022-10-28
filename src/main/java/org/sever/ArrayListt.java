package org.sever;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListt {
    public static void main(String[] args) {
        List <String > list=  new ArrayList<String>();
        list.add("ali");
        list.add("eve");
        list.add("gel");
//        System.out.println(list);
        List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for (int w:list2) {
            if(w==3){
                break;
            }
            list2.set(list2.indexOf(w),w+2);
        }
//        System.out.println(list2);
        List<Integer> list3=new ArrayList<>(Arrays.asList(1,3,2,4,5));
        Collections.sort(list3);
        System.out.println(list3);
        for(Integer w:list3){
            list3.set(list3.indexOf(w),w*2);
            if(w==3){
                break;
            }
        }
        System.out.println(list3);


    }


}
