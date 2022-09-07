package org.sever;

public class day01 {
    /*Your friend advised you to see a new performance in the most popular theater in the city.
     He knows a lot about art and his advice is usually good, but not this time: the performance
     turned out to be awfully dull. It's so bad you want to sneak out, which is quite simple,
     especially since the exit is located right behind your row to the left.
      All you need to do is climb over your seat and make your way to the exit.

The main problem is your shyness: you're afraid that you'll end up blocking the view
 (even if only for a couple of seconds) of all the people who sit behind you and in your column or
 the columns to your left. To gain some courage, you decide to calculate the number of such people and
 see if you can possibly make it to the exit without disturbing too many people.

Given the total number of rows and columns in the theater (nRows and nCols, respectively),
 and the row and column you're sitting in, return the number of people who sit strictly behind
 you and in your column or to the left, assuming all seats are occupied.

Example
For nCols = 16, nRows = 11, col = 5, and row = 3, the output should be
solution(nCols, nRows, col, row) = 96.

An integer, the number of theater's columns.
1 ≤ nCols ≤ 1000.
1 ≤ nRows ≤ 1000 */

    public static void main(String[] args) {
        System.out.println(seatsInTheater(16,11,5,3));
    }

    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        // Calculate area/total seats in theater
        int totalSeats = nCols * nRows;

  /* Calculate cols and rows behind my seat
     Add one to col because my people behind me in my col are  counted
  */
        int newColNumber = nCols - col + 1;
        int newRowNumber = nRows - row;

        // Calculate area of seats behind me
        int peopleBehindMe = newColNumber * newRowNumber;

        return peopleBehindMe;
    }

}
