package org.sever;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaRemoveGreater100 {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,400,12,45,200,100,45,5,200));


        removeLambda(list);
//		ListIterator<Integer>it=list.listIterator();
//
//
//		while(it.hasNext())
//		{
//			if(it.next()>100)
//				it.remove();
//		}
//
//		System.out.println(list);
    }

    private static void removeLambda(ArrayList<Integer> list) {

        List<Integer> result=list.stream().filter(t->t<100).collect(Collectors.toList());
        List<Integer>sortedResult=result.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
        System.out.println(sortedResult);
    }

}

