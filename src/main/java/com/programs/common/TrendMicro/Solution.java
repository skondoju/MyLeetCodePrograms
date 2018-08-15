package com.programs.common.TrendMicro;

import java.util.Arrays;

/**
 * Created by Sireesha on 3/15/18.
 */
public class Solution {

    public static void main(String args[]) {

        int[] arr1 = {1,5,3,3,7};
        Solution sol = new Solution();
        sol.sol(arr1);
    }

    public void sol(int[] A) {

        int swapCount = 0;
        for(int k = 0; k < A.length; k++) {
            for (int i =0; i < A.length-1; i++) {

                //  if((A[i] != A[i+1])) {

                int j = i + 1;

                    if(j < A.length -1 && (A[j] != A[j+1])) {

                        System.out.println("IN if loop");
                    if (A[i] < A[i + 1]) {

                        int temp = A[i];
                        A[i ] = A[i+1];
                        A[i+1] = temp;
                        swapCount++;
                    }
                      }
            }
        }
        System.out.println("swapCount  "+swapCount);

        System.out.println(Arrays.toString(A));

    }

}
