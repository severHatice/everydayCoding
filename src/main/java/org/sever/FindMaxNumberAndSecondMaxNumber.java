package org.sever;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindMaxNumberAndSecondMaxNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter 3 numbers");
//        Integer in[]=scan.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(scan.nextInt());

        }
//        while(scan.hasNextInt()){
//            list.add(scan.nextInt());
//        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list.get(list.size()-1)+" and " + list.get(list.size()-2));
    }
}
