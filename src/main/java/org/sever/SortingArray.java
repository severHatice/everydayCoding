package org.sever;

import java.util.Arrays;
import java.util.List;

public class SortingArray {

    public static <T> void main(String args[]) {
        // Create an Array
       Integer array[] = { 3, 7, 7,4,6,2,50,3 };

//         Print the Array
        System.out.println("Array: " + Arrays.toString(array));
        // convert the Array to List
        List<T> list = (List<T>) convertArrayToList(array);
//         Print the List
        System.out.println("List: " + list);
        sortList(list);
        int arr2[]={1,2,3,2,1};
        sortArr(arr2);
    }
    private static void sortArr(int[] arr) {

        int temp=0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]<arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static <T> void sortList(List<T> list) {
        list.stream().sorted().forEach(t->System.out.print(t+" "));
    }


    // Generic function to convert an Array to List
    public static <T> List<T> convertArrayToList(T array[])
    {

        // Create the List by passing the Array
        // as parameter in the constructor
        List<T> list = Arrays.asList(array);

        // Return the converted List
        return list;
    }
}
