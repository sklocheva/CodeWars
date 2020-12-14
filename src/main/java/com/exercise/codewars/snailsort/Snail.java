package com.exercise.codewars.snailsort;

/**
 * @author Sophia Klocheva
 * on 04/12/2020
 * Given an n x n array, return the array elements
 * arranged from outermost elements to the middle element, traveling clockwise.
 */
public class Snail
{
    public static int[] snail(int[][] array)
    {
        int rowL = array.length;
        int colL = array[0].length;
        int[] result = new int[rowL * colL];
        int col = -1;
        int row = 0;
        int minR = 0;
        int minC = 0;
        int resultN = -1;
        while (colL != 1 && rowL != 1)
        {
            System.out.println("colL = " + colL);
            System.out.println("rowL = " + rowL);
            //->
            while (true)
            {
                if (col == colL - 1)
                {
                    break;
                }
                col++;
                System.out.println("-> col" + col + " row = " + row);
                resultN++;
                result[resultN] = array[row][col];
                System.out.println("->" + result[resultN]);
            }
            //down
            while (row != rowL - 1)
            {
                System.out.println("row = " + row + " rowL= " + rowL);
                row++;
                resultN++;
                result[resultN] = array[row][col];
                System.out.println("down" + result[resultN]);
            }
            //<-
            while (true)
            {
                if (minC == col)
                {
                    break;
                }
                col--;
                resultN++;
                result[resultN] = array[row][col];
                System.out.println("<-" + result[resultN]);
            }

            rowL = rowL - 1;
            colL = colL - 1;
            minC++;
            minR++;
            //up
            while (true)
            {
                if (minR >= row)
                {
                    break;
                }
                row--;
                resultN++;
                result[resultN] = array[row][col];
                System.out.println("up" + result[resultN]);
            }
        }
        return result;
    }
}
