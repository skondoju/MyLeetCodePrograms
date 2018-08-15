package com.programs.common.WomenHackPrep;

import java.util.Arrays;

/**
 * Created by Sireesha on 5/1/18.
 */
public class BinarySearch {

    public int bSearch(int[] arr1,int n) {

        Arrays.sort(arr1);
        int left = 0;
        int right = arr1.length;
        int position = -1;


        int midVal = (left + (right -1))/2;
        System.out.println(arr1.length);


        System.out.println(midVal);
        while(left <= right) {
            System.out.println("in while loop");
            System.out.println("right "+right);
            System.out.println("left "+left);

            if(n > arr1[midVal]) {

                left = midVal;

            } else if(n < arr1[midVal]) {

                right = midVal;

            } else if(n == arr1[midVal]) {
                position = midVal;
                break;
            } else {
                position = -1;
                break;
            }
            midVal = (left + (right -1))/2;        }

System.out.println("Pos "+position);
return position;

        }
    }

