package com.programs.common;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sireesha on 11/3/17.
 */
public class TestSqrt {

    Sqrt sqrt = new Sqrt();

    @Test
    public void testMySqrt() {

        double resultSqrtVal = sqrt.mySqrt(1);
        assertEquals(5.83,resultSqrtVal,0.0);
    }

    @Test
    public void testMySqrt1() {

        double resultSqrtVal = sqrt.mySqrt1(2);
        assertEquals(1.41,resultSqrtVal,0.0);
    }

    @Test
    public void testMySqrtWithZeroInput() {

        double resultSqrtVal = sqrt.mySqrt(0);
        assertEquals(0.00,resultSqrtVal,0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMySqrtWithNegativeInput() {

        double resultSqrtVal = sqrt.mySqrt(-25);
    }

    @Test(expected = NumberFormatException.class)
    public void testMySqrtWithEmptyInput() {

        double resultSqrtVal = sqrt.mySqrt(Double.parseDouble(""));
    }
}
