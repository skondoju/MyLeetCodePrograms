package com.programs.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sireesha on 1/25/18.
 */
public class LeetCombinationSum {

    public void combinationSum(int[] candidates, int target) {

        List<List<Integer>> resultList = new ArrayList<List<Integer>>();

        List<Integer> list1;

        int i = 0;
        int j = 0;
        int diff = 0;
        int sum = 0;
        int mainDiff = 0;

        Arrays.sort(candidates);

        while(i < candidates.length) {

            list1 = new ArrayList<Integer>();

            while(j < candidates.length) { //2, 3, 6, 7

                sum = sum + candidates[j];
                diff = target - sum;
               // mainDiff = target - diff;

                System.out.println("Sum "+sum);
                System.out.println("Diff "+diff);

                if(diff == 0) {

                    list1.add(candidates[j]);
                    resultList.add(list1);
                    j++;

                } else if(diff > 0) {


                }
            }

        }




        System.out.println("ResultList " + resultList);
    }


}



