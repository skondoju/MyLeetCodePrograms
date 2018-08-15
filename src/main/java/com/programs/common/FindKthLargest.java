package com.programs.common;

import java.util.Arrays;

/**
 * Created by Sireesha on 1/11/18.
 */
public class FindKthLargest {

    public int findKthLargestNumInArray(int[] inputArray,int m) {

        if (inputArray != null && inputArray.length > 0) {

            for (int i = 1; i < inputArray.length; i++) {

                for (int j = 0; j < inputArray.length - i; j++) {

                    int k = j + 1;

                    if (inputArray[j] < inputArray[k]) {

                        int temp = inputArray[k];
                        inputArray[k] = inputArray[j];
                        inputArray[j] = temp;
                    }
                }
            }
           // Arrays.sort(inputArray);

        }
        if(m > 0 && m <= inputArray.length) {

            return inputArray[m - 1];

        } else {

            return -1;

        }


    }
}
