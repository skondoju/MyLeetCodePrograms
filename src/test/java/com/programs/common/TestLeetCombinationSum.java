package com.programs.common;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Sireesha on 1/25/18.
 */
public class TestLeetCombinationSum {


    LeetCombinationSum leetCombinationSum = new LeetCombinationSum();

    @Test
    public void testCombinationSum() {

        int[] inputArr = {2, 3, 6, 7};
        int target = 7;
        leetCombinationSum.combinationSum(inputArr,target);

    }

}
