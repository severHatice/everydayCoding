package org.sever;

import java.util.ArrayList;

public class IncreaseEveryElementExcept7 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(10);
        list.add(7);
        list.add(9);
        System.out.println(list);

        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
            if(list.get(i)==7)
            {
                continue;
            }
            else
            {
                list.set(list.indexOf(list.get(i)),list.get(i)+3);
            }

        }

        System.out.println(list);



    }

}

