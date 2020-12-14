package com.exercise.codewars.tvremote;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Sophia Klocheva
 * on 04/12/2020
 */
public class DinglemouseTest
{
    @Test
    public void example()
    {
        assertEquals(36, Dinglemouse.tvRemote("codewars"));
    }

    @Test
    public void misc()
    {
        assertEquals(16, Dinglemouse.tvRemote("does"));
        assertEquals(23, Dinglemouse.tvRemote("your"));
        assertEquals(33, Dinglemouse.tvRemote("solution"));
        assertEquals(20, Dinglemouse.tvRemote("work"));
        assertEquals(12, Dinglemouse.tvRemote("for"));
        assertEquals(27, Dinglemouse.tvRemote("these"));
        assertEquals(25, Dinglemouse.tvRemote("words"));
    }

}