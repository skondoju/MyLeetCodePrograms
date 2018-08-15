package com.programs.common;

import java.util.ArrayList;

/**
 * Created by Sireesha on 11/16/17.
 */
public class SubArraySum {


    public int subArraySumCount(int[] nums, int k) {

        ArrayList<ArrayList<Integer>> subArrayLists = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> aList;

        System.out.println(nums.length);
        for (int i = 0; i < nums.length; i++) {

            aList = new ArrayList<Integer>();

            int sum = nums[i];

            if (nums[i] <= k) {

                aList.add(nums[i]);

            }
            for (int j = i + 1; j < nums.length; j++) {     // {1,2,-3,4,2,-3,-1,-2}  6

                sum = sum + nums[j];

                if (sum == k) {
                    aList.add(nums[j]);
                    break;

                }
                if (sum < k) {

                    aList.add(nums[j]);

                } else if (sum > k) {

                    if (nums[i] == k)
                        aList.add(nums[i]);
                    if (nums[j] == k)
                        aList.add(nums[j]);

                }

            }

            int total = 0;

            System.out.println("alist "+aList.size());
            for (int p = 0; p < aList.size(); p++) {

                total = total + aList.get(p);
            }

            if (total == k)
                subArrayLists.add(aList);
        }
        System.out.println(subArrayLists);

        return subArrayLists.size();
    }
}
