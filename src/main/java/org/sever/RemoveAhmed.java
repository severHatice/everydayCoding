package org.sever;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {

    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>(Arrays.asList("Ahmed", "Semra","ziya","ahmed"));
        ArrayList<String>newList=new ArrayList<>();
        for(String w: names)
        {
            if(!w.contains("Ahmed"))
            {
                newList.add(w);

            }
        }

        System.out.println(newList);

    }

}

