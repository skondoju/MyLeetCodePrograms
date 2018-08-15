package com.programs.common;


/**
 * Created by Sireesha on 11/13/17.
 */
public class RemoveDuplicates {

    public static void main(String args[]) {


        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {1,1,2,2,3,3};
        int newSize  = removeDuplicates.removeDuplicatesInArray(nums);
        System.out.println("New Array Length = "+newSize);

    }

    public int removeDuplicatesInArray(int[] nums) {

 //        int newArraySize = nums.length;
//
//
//            for (int i = 0; i < nums.length-1; i++) {
//
//                if (nums[i] == nums[i + 1]) {
//
//                    newArraySize--;
//
//
//                }
        int j=0;

        if (nums.length==0) return 0;
        for (int i=0; i<nums.length; i++)
            if (nums[i]!=nums[j]) nums[++j]=nums[i];

        return ++j;
    }



       // return newArraySize;

}
