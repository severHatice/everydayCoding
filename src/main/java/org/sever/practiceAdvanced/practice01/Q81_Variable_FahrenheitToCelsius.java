package org.sever.practiceAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q81_Variable_FahrenheitToCelsius{
        // Fahrenheit değeri, celsius değere geviren kod yazınız.
// formit:c (f-32)+5/9
        public static void main(String[] args) {
                Scanner scan=new Scanner(System.in);
                System.out.println("Fahrenheit değeri giriniz");
                double f=scan.nextDouble();
                double c=(f-32)*5/9;
                System.out.println(c);
                NumberFormat n=new DecimalFormat(".##") ;

                String s= n.format(c);
                System.out.println(s);



        }

        }