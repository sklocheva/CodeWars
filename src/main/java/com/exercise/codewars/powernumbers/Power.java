package com.exercise.codewars.powernumbers;

/**
 * @author Sophia Klocheva
 * on 06/12/2020
 * unfinished
 */
public class Power
{
    public static void main(String args[])
    {
        System.out.println(checkRecursive2(20, 2, 1, 0));
    }

    public static boolean isPower(int x, int y)
    {
        // The only power of 1 is 1 itself
        if (x == 1)
            return (y == 1);

        // Repeatedly compute power of x
        int pow = 1;
        while (pow < y)
            pow = pow * x;

        // Check if power of x becomes y
        return (pow == y);
    }

    static int power(int num, int n)
    {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return power(num, n / 2) * power(num, n / 2);
        else
            return num * power(num, n / 2) * power(num, n / 2);
    }

    static int checkRecursive2(int x, int n, int curr_num, int curr_sum)
    {
        // Initialize number of ways to express
        // x as n-th powers of different natural
        // numbers
        int results = 0;

        // Calling power of 'i' raised to 'n'
        int p = power(curr_num, n);
        while (p + curr_sum < x)
        {
            // Recursively check all greater values of i
//            results += checkRecursive(x, n, curr_num + 1,
//                    p + curr_sum);
            curr_num++;
            curr_sum = curr_num + p;
            p = power(curr_num, n);
        }

        // If sum of powers is equal to x
        // then increase the value of result.
        if (p + curr_sum == x)
            results++;

        // Return the final result
        return results;
    }

    static int checkRecursive(int x, int n, int curr_num, int curr_sum)
    {
        // Initialize number of ways to express
        // x as n-th powers of different natural
        // numbers
        int results = 0;

        // Calling power of 'i' raised to 'n'
        int p = power(curr_num, n);
        while (p + curr_sum < x)
        {
            // Recursively check all greater values of i
            results += checkRecursive(x, n, curr_num + 1,
                    p + curr_sum);
            curr_num++;
            p = power(curr_num, n);
        }

        // If sum of powers is equal to x
        // then increase the value of result.
        if (p + curr_sum == x)
            results++;

        // Return the final result
        return results;
    }

}
