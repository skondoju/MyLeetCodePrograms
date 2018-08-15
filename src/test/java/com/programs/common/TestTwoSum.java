package com.programs.common;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sireesha on 11/10/17.
 */
public class TestTwoSum {

    TwoSum twoSum;

    @Test
    public void testTwoSumAllPositiveVals() {

        twoSum = new TwoSum();
        int[] inputArray = {2, 11, 15, 7};
        int target = 9;
        int[] expectedArray = {0,3};
        int[] resultArray = twoSum.twoSumVal(inputArray,target);
        Assert.assertArrayEquals(expectedArray,resultArray);

    }

    @Test
    public void testTwoSumAllNegativeVals() {

        twoSum = new TwoSum();
        int[] inputArray = {-2, -11, -15, -7};
        int target = -9;
        int[] expectedArray = {0,3};
        int[] resultArray = twoSum.twoSumVal(inputArray,target);
        Assert.assertArrayEquals(expectedArray,resultArray);

    }

    @Test
    public void testTwoSum() {

        twoSum = new TwoSum();
        int[] inputArray = {2, 7, 15, 7};
        int target = 9;
        int[] expectedArray = {0,3};
        int[] resultArray = twoSum.twoSumVal(inputArray,target);
        Assert.assertArrayEquals(expectedArray,resultArray);

    }

    @Test
    public void testTwoSumEmptyArray() {

        twoSum = new TwoSum();
        int[] inputArray = {};
        int target = 0;
        int[] expectedArray = {0};
        int[] resultArray = twoSum.twoSumVal(inputArray,target);
        System.out.println(resultArray.length);
        Assert.assertArrayEquals(expectedArray,resultArray);

    }
}
