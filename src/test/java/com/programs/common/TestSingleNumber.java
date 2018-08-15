package com.programs.common;


import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Sireesha on 1/31/18.
 */
public class TestSingleNumber {

    SingleNumber singleNumber = new SingleNumber();

    @Test
    public void testSingleNumberMethod() {

        int [] nums = {1,2,3,3,2,1,5};

       int result = singleNumber.singleNumberMethod(nums);

        junit.framework.Assert.assertEquals(5,result);
    }

    @Test
    public void testSingleNumberMethod1() {

        int [] nums = {};

        int result = singleNumber.singleNumberMethod(nums);

       // junit.framework.Assert.assertEquals(5,result);
    }
}
