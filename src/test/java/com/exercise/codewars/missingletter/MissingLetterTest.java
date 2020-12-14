package com.exercise.codewars.missingletter;

import org.junit.Test;

import static com.exercise.codewars.missingletter.MissingLetter.findMissingLetter;
import static org.junit.Assert.assertEquals;

/**
 * @author Sophia Klocheva
 * on 04/12/2020
 */
public class MissingLetterTest
{

    @Test
    public void exampleTests()
    {
        assertEquals('e', findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
        assertEquals('P', findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
    }
}