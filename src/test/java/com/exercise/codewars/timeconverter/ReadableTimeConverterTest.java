package com.exercise.codewars.timeconverter;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Sophia Klocheva
 * on 14/12/2020
 */
public class ReadableTimeConverterTest
{
    @Test
    public void Tests()
    {
        assertEquals("makeReadable(0)", "00:00:00", ReadableTimeConverter.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", ReadableTimeConverter.makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", ReadableTimeConverter.makeReadable(60));
        assertEquals("makeReadable(86399)", "23:59:59", ReadableTimeConverter.makeReadable(86399));
        assertEquals("makeReadable(359999)", "99:59:59", ReadableTimeConverter.makeReadable(359999));
    }
}