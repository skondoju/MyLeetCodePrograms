package com.programs.common.WomenHackPrep;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Sireesha on 5/1/18.
 */
public class TestBinarySearch {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void testBSearch() {

        int[] inputArray = {2,1};
        int searchElement = 3;
        int position = binarySearch.bSearch(inputArray,searchElement);
        Assert.assertEquals(0,position);
    }

}
