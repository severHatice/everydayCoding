package org.sever;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicateElementsOfList {

    public static void main(String[] args) {
        /*
         * Create a list by getting the list elements from user
         * if there is duplicated elements remove them from the list
         */

        Scanner scan=new Scanner(System.in);

        List<Integer> list=new ArrayList<>();
        int num=0;
        while(scan.hasNextInt())
        {
            num=scan.nextInt();
            if(!list.contains(num))
            {
                list.add(num);

            }

        }

        System.out.println(list);

    }

}

