package org.sever;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.sever.day01.seatsInTheater;

class day01Test {


    @Test
    void main() {

    }

    @Test
    void seatsInTheater1() {
        int a=16;
        int b=11;
        int c=5;
        int d=3;
        int totalSeats =a*b;
        int newColNumber = a - c + 1;
        int newRowNumber = b - d;

        // Calculate area of seats behind me
        int peopleBehindMe = newColNumber * newRowNumber;


        assertEquals(peopleBehindMe,seatsInTheater(a,b,c,d));
    }

//    private int seatsInTheater(int nCols, int nRows, int col, int row) {
//        int totalSeats = nCols * nRows;
//
//  /* Calculate cols and rows behind my seat
//     Add one to col because my people behind me in my col are  counted
//  */
//        int newColNumber = nCols - col + 1;
//        int newRowNumber = nRows - row;
//
//        // Calculate area of seats behind me
//        int peopleBehindMe = newColNumber * newRowNumber;
//
//        return peopleBehindMe;
//    }

}