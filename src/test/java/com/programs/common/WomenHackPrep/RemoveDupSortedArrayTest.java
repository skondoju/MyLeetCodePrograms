package com.programs.common.WomenHackPrep;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Created by Sireesha on 4/30/18.
 */
public class RemoveDupSortedArrayTest {

    RemoveDupSortedArray removeDupSortedArray = new RemoveDupSortedArray();

    @Test
    public void testRemoveDuplicates() {

        int[] inputArr = {1,1,1,1,1,1,1,1,1};

        removeDupSortedArray.removeDuplicates(inputArr);
    }
}
