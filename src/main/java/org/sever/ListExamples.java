package org.sever;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    //salary isi 1000 den az ise %20 fazla ise %10 zam yapiniz
    public static void main(String[] args) {
        List<Double> salary = new ArrayList<>();
        salary.add(1200.00);
        salary.add(9000.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(26583.88);
        System.out.println(salary);
        for (Double w : salary){
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);
            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
    }
System.out.println(salary);

    }

}
