package org.sever;

public class UniqueCharactersOrNot {

    public static void main(String[] args) {
        String str="werty";
        uniqueCharacter(str);

    }

    public static void uniqueCharacter(String str) {

        int flag=0;

        for(int i=0; i<str.length(); i++)
        {
            char c= str.charAt(i);

            if(str.indexOf(c)==str.lastIndexOf(c))
            {
                continue;
            }else
            {
                flag=1;
            }
        }

        if(flag==0)
        {
            System.out.println(str+" has all unique characters");
        }else
        {
            System.out.println(str+" has duplicated characters");
        }

    }

}

