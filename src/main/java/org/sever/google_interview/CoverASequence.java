package org.sever.google_interview;

public class CoverASequence{
    /*Given an infinite grid, initial cell position (x, y) and a sequence of other cell position which needs to be
    covered in the given order. The task is to find the minimum number of steps needed to travel to all those cells.
Note: Movement can be done in any of the eight possible directions from a given cell i.e from cell (x, y)
you can move to any of the following eight positions:
(x-1, y+1), (x-1, y), (x-1, y-1), (x, y-1), (x+1, y-1), (x+1, y), (x+1, y+1), (x, y+1) is possible.

Examples:

Input: points[] = [(0, 0), (1, 1), (1, 2)]
Output: 2
Move from (0, 0) to (1, 1) in 1 step(diagonal) and
then from (1, 1) to (1, 2) in 1 step (rightwards)

Input: points[] = [{4, 6}, {1, 2}, {4, 5}, {10, 12}]
Output: 14
Move from (4, 6) -> (3, 5) -> (2, 4) -> (1, 3) ->
(1, 2) -> (2, 3) -> (3, 4) ->
(4, 5) -> (5, 6) -> (6, 7) ->
(7, 8) -> (8, 9) -> (9, 10) -> (10, 11) -> (10, 12)*/

    int x, y;
    CoverASequence(int a, int b) {
        x = a;
        y = b;
    }
}

class GFG
{
    // function to give minimum  // steps to move from point
    static int shortestPath(CoverASequence p1, CoverASequence p2) {
        // dx is total horizontal // distance to be covered
        int dx = Math.abs(p1.x - p2.x);

        // dy is total vertical // distance to be covered
        int dy = Math.abs(p1.y - p2.y);

        // required answer is // maximum of these two
        return Math.max(dx, dy);
    }

    // Function to return   // the minimum steps
    static int coverPoints(CoverASequence sequence[], int size) {
        int stepCount = 0;

        // finding steps for  // each consecutive // point in the sequence
        for (int i = 0; i < size - 1; i++) {
            stepCount += shortestPath(sequence[i],
                    sequence[i + 1]);
        }
        return stepCount;
    }
    // Driver code
    public static void main(String args[]) {
        // arr stores sequence of points  // that are to be visited
        CoverASequence arr[] = new CoverASequence[4];
        arr[0] = new CoverASequence(4, 6);
        arr[1] = new CoverASequence(1, 2);
        arr[2] = new CoverASequence(4, 5);
        arr[3] = new CoverASequence(10, 12);

        int n = arr.length;
        System.out.print(coverPoints(arr, n));
    }
}

