package com.exercise.codewars.snailsort;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

/**
 * @author Sophia Klocheva
 * on 04/12/2020
 */
public class SnailTest
{

    @Test
    public void SnailTest1()
    {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] array2
                = {{1, 2, 3, 9},
                {4, 5, 6, 4},
                {7, 8, 9, 1},
                {1, 2, 3, 4}};
        int[] r2 = {1, 2, 3, 9, 4, 1, 4, 3, 2, 1, 7, 4, 5, 6, 9, 8};
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        test(array2, r2);
    }

    public String int2dToString(int[][] a)
    {
        return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
    }

    public void test(int[][] array, int[] result)
    {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        System.out.println(text);
        Assert.assertArrayEquals(result, Snail.snail(array));
    }
}