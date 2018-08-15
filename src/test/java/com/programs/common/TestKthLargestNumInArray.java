package com.programs.common;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Sireesha on 1/12/18.
 */
public class TestKthLargestNumInArray {

    FindKthLargest findKthLargest ;

    @Test
    public void testFindKthLargestNumInArray() {

        findKthLargest = new FindKthLargest();
        int [] nums = {3,2,1,5,6,4};
        int k = 2;

        int kthLargestNuminArr = findKthLargest.findKthLargestNumInArray(nums,k);
        Assert.assertEquals(5,kthLargestNuminArr);



    }

    @Test
    public void testFindKthLargestNumInArray1() {

        findKthLargest = new FindKthLargest();
        int [] nums = {3,2,1,5,6,4};
        int k = 1;

        int kthLargestNuminArr = findKthLargest.findKthLargestNumInArray(nums,k);
        Assert.assertEquals(6,kthLargestNuminArr);



    }

    @Test
    public void testFindKthLargestNumInArray2() {

        findKthLargest = new FindKthLargest();
        int [] nums = {3,2,1,5,6,4};
        int k = 0;

        int kthLargestNuminArr = findKthLargest.findKthLargestNumInArray(nums,k);
        Assert.assertEquals(6,kthLargestNuminArr);



    }
}
