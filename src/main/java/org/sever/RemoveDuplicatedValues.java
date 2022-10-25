package org.sever;

public class RemoveDuplicatedValues {

    public static void main(String[] args) {

        String str="aasssddddffff";
        removeDup(str);

    }

    public static void removeDup(String str) {

        String newStr="";

        for(int i=0; i<str.length(); i++)
        {
            if(!newStr.contains(""+str.charAt(i)))
            {
                newStr=newStr+str.charAt(i);
            }
        }

        System.out.println(newStr);
    }

}
