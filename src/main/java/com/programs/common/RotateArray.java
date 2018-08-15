package com.programs.common;

/**
 * Created by Sireesha on 2/11/18.
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {

        int temp = 0;

        int noOfRotations = 0;

        k = k % nums.length;
        System.out.println("len "+nums.length);
        while (noOfRotations < k) {

            int i = 0;
            int j = i + 1;
            while (j < nums.length) {


                if (j >= nums.length) {

                    j = j % nums.length;

                }

                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;


              //  System.out.println(nums[i] + " ");
                j++;

            }
            noOfRotations++;

        }

        for (int m = 0; m < nums.length; m++) {

            System.out.print(nums[m] + " ");
        }
    }
}
