package com.programs.common;

/**
 * Created by Sireesha on 11/9/17.
 */
public class TwoSum {


    public int[] twoSumVal(int[] nums, int target) {

        int[] outputArray = new int[2];

        for(int i=0; i<nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    outputArray[0] = i;
                    outputArray[1] = j;
                    break;
                }
            }
        }
        return outputArray;

    }
}

