package com.programs.common.WomenHackPrep;

import java.util.Arrays;

/**
 * Created by Sireesha on 5/2/18.
 */
public class SearchInsertPos {

    public static void main(String args[]) {

        SearchInsertPos searchInsertPos = new SearchInsertPos();

        int[] input = {1,3,5};
        int target = 4;

        int outPut = searchInsertPos.searchInsert(input,target);
        System.out.println(outPut);

    }

    public int searchInsert(int[] nums, int target) {

        //int insertPos =  Arrays.binarySearch(nums,target);
        int pos = -1;

        if (nums.length > 1) {

            int left = 0;
            int right = nums.length - 1;
            System.out.println("right "+right);
            int midVal = 0;

            if (target <= nums[left]) {
                return 0;
            }

            if (target > nums[right]) {
                return right + 1;
            }
            if (target == nums[right]) {
                return right ;
            }

            while (left < right) {

                midVal = (left + right) / 2;
                System.out.println("midVal "+midVal);

                if (nums[midVal] < target) {

                    if (midVal == 0) {
                        pos = 1;
                        break;
                    }
                    left = midVal;

                } else if (nums[midVal] > target) {

                    if (midVal == 1) {
                        pos = 1;
                        break;
                    }
                    right = midVal;

                } else if (nums[midVal] == target) {

                    pos = midVal;
                    break;
                }
            }

        }
        else {
            if (target <= nums[0]) {
                pos = 0;
                return 0;
            }
            else if (target > nums[0]) {
                pos = nums.length ;
            }
        }
        return pos;
    }
}
