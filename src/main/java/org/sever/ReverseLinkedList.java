package org.sever;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    public static void main(String[] args) {

        List<Integer> myList= new LinkedList<>();
        myList.add(4);
        myList.add(5);
        myList.add(14);
        myList.add(53);
        myList.add(41);
        myList.add(15);

        System.out.println(reverseList(myList));

    }

    public static List<Integer> reverseList(List<Integer> myList) {

        List<Integer>reverseList= new LinkedList<>();

        for(int i=myList.size()-1; i>=0; i--)
        {
            reverseList.add(myList.get(i));
        }

        return reverseList;


    }




}
