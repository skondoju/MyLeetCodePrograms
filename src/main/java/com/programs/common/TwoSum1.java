package com.programs.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sireesha on 11/11/17.
 */
public class TwoSum1 {

    public static void main(String args[]) {

        TwoSum1 twoSum1 = new TwoSum1();
        int[] inputArray = {2,4,11,7};
        int target = 18;
        int[] result = twoSum1.twoSumVal(inputArray,target);

        for(int i=0; i< result.length; i++) {

            System.out.print(result[i]+" ");
        }
    }

    public int[] twoSumVal(int[] input , int target) {

        Map<Integer,Integer> inputMap = new HashMap<Integer, Integer>();
        int[] resultArray = new int[2];

        for(int i=0; i<input.length; i++) {

            if(inputMap.containsKey(input[i])) {


            } else {

                inputMap.put(input[i],i);
            }
        }

        for(int i=0; i<input.length; i++) {

            int diff = target - input[i];

            if(inputMap.containsKey(diff)) {

                resultArray[1] = i;
                resultArray[0] = inputMap.get(diff);

            }
        }

        return resultArray;

    }
}
