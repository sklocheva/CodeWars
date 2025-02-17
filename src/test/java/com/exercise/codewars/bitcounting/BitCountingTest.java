package com.exercise.codewars.bitcounting;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Sophia Klocheva
 * on 04/12/2020
 */
public class BitCountingTest
{
    @Test
    public void testGame()
    {
        assertEquals(5, BitCounting.countBits(1234));
        assertEquals(1, BitCounting.countBits(4));
        assertEquals(3, BitCounting.countBits(7));
        assertEquals(2, BitCounting.countBits(9));
        assertEquals(2, BitCounting.countBits(10));
    }
}