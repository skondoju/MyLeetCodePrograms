package com.programs.common.WomenHackPrep;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sireesha on 4/30/18.
 */
public class RemoveDupSortedArray {

    public void removeDuplicates(int[] arr) {

        Set<Integer> inputSet = new HashSet<Integer>();

        for(int i = 0; i < arr.length; i++) {

            inputSet.add(arr[i]);
        }

        System.out.println(inputSet);
    }
}
