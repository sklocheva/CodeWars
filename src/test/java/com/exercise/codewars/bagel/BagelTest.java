package com.exercise.codewars.bagel;

import com.exercise.codewars.bagels.Bagel;
import com.exercise.codewars.bagels.BagelSolver;
import org.junit.Test;

public class BagelTest {

    @Test
    public void testBagel() {
        Bagel bagel = BagelSolver.getBagel();
        System.out.printf("'bagel.getValue() == 4' is %b\r\n", bagel.getValue() == 4);
        System.out.printf("'java.lang.Boolean.TRUE' is %b", java.lang.Boolean.TRUE);
        org.junit.Assert.assertEquals(
                bagel.getValue() == 4,
                java.lang.Boolean.TRUE
        );
    }

}