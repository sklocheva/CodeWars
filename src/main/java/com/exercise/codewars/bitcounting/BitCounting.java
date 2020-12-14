package com.exercise.codewars.bitcounting;

/**
 * @author Sophia Klocheva
 * on 04/12/2020
 */
public class BitCounting
{
    public static int countBits(int n)
    {
        int bitCount = 0;
        while (n > 0)
        {
            if (n % 2 == 1)
            {
                bitCount++;
            }
            n = n / 2;
        }
        return bitCount;
    }

    public static int countBits2(int n)
    {
        return Integer.bitCount(n);
    }
}
