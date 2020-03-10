package com.exercise.codewars.howmanynumbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class HowManyNumbersTest {

    @Test
    public void findAll() {
        System.out.println(HowManyNumbers.findAll(10, 3));
        System.out.println("------------------------");
        System.out.println(HowManyNumbers.findAll(27, 3));
        System.out.println(HowManyNumbers.findAll(84, 4));
    }
}