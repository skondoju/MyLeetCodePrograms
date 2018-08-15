package com.programs.common;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Sireesha on 11/16/17.
 */
public class TestSubArraySum {


    SubArraySum subArraySum ;

    @Test
    public void testSubArraySumCount() {

        subArraySum = new SubArraySum();
        int[] inputArray = {1,2,3,4,2,3,1};
        int target = 6;
       int subArrayCount =  subArraySum.subArraySumCount(inputArray,target);
        junit.framework.Assert.assertEquals(3,subArrayCount);
    }

    @Test
    public void testSubArraySumCountCase1() {

        subArraySum = new SubArraySum();
        int[] inputArray = {1,1,1};
        int target = 2;
        int subArrayCount =  subArraySum.subArraySumCount(inputArray,target);
        junit.framework.Assert.assertEquals(2,subArrayCount);

    }

    @Test
    public void testSubArraySumCountCase2() {

        subArraySum = new SubArraySum();
        int[] inputArray = {1};
        int target = 0;
        int subArrayCount =  subArraySum.subArraySumCount(inputArray,target);
        junit.framework.Assert.assertEquals(1,subArrayCount);

    }

    @Test
    public void testSubArraySumCountCase3() {

        subArraySum = new SubArraySum();
        int[] inputArray = {0,6};
        int target = 6;
        int subArrayCount =  subArraySum.subArraySumCount(inputArray,target);
        junit.framework.Assert.assertEquals(1,subArrayCount);

    }

    @Test
    public void testSubArraySumCountCase4NegativeNums() {

        subArraySum = new SubArraySum();
        int[] inputArray = {1,2,-3,4,2,-3,-1,-1};
        int target = 6;
        int subArrayCount =  subArraySum.subArraySumCount(inputArray,target);
        junit.framework.Assert.assertEquals(1,subArrayCount);

    }

    @Test
    public void testSubArraySumCountCase5() {

        subArraySum = new SubArraySum();
        int[] inputArray = {-1,-1,1};
        int target = 2;
        int subArrayCount =  subArraySum.subArraySumCount(inputArray,target);
        junit.framework.Assert.assertEquals(1,subArrayCount);

    }
}
