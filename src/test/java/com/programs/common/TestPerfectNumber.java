package com.programs.common;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Sireesha on 2/7/18.
 */
public class TestPerfectNumber {

    PerfectNumber perfectNumber = new PerfectNumber();

    @Test
    public void testCheckPerfectNumber() {

        int input = 28;

       boolean perfectNum =  perfectNumber.checkPerfectNumber(input);

        Assert.assertEquals(true,perfectNum);

    }

    @Test
    public void testCheckPerfectNumber1() {

        int input = 99999993;

        boolean perfectNum =  perfectNumber.checkPerfectNumber(input);

        Assert.assertEquals(false,perfectNum);

    }
}
