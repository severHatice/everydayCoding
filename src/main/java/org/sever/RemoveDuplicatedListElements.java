package org.sever;

import java.util.*;

public class RemoveDuplicatedListElements {
    /*Create a list by getting the list elements from user
	 	If there is duplicated elements remove them from the list */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list elements, to stop entrance press '*'");

        String str = "";
        List<String> list = new ArrayList<String>();

        while(!str.equals("*")) {
            str=scan.next();
            if(!str.equals("*")) {
                list.add(str);
            }
        }
        System.out.println(list);
        Set<String> listSet= new HashSet<>(list);
        System.out.println(listSet);
        scan.close();
    }
}
