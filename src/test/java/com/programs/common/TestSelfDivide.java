package com.programs.common;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sireesha on 2/7/18.
 */
public class TestSelfDivide {


    SelfDivide selfDivide = new SelfDivide();

    @Test
    public void TestSelfDividingNumbers() {

        int left = 1;
        int right = 22;
        List<Integer> resultList = selfDivide.selfDividingNumbers(left, right);

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
        junit.framework.Assert.assertSame(expected, resultList);

    }
}
