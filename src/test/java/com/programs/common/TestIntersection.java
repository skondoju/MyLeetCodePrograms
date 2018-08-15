package com.programs.common;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sireesha on 11/14/17.
 */
public class TestIntersection {


    Intersection intersection;

    @Test
    public void testArrayIntersection() {

        intersection = new Intersection();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] expectedArray = {2,2};
        int[] resultArray = intersection.arrayIntersection(nums1,nums2);
        Assert.assertArrayEquals(expectedArray,resultArray);
    }

    @Test
    public void testArrayfirstArraySizeLessthanSecond() {

        intersection = new Intersection();
        int[] nums1 = {4,7,9,7,6,7};
        int[] nums2 = {5,0,0,6,1,6,2,2,4};
        int[] expectedArray = {4,6};
        int[] resultArray = intersection.arrayIntersection(nums1,nums2);
        for(int i =0; i < resultArray.length;i++) {
            System.out.println(resultArray[i]);
        }
        Assert.assertArrayEquals(expectedArray,resultArray);
    }

    @Test
    public void testIntersectionWithEmptyFirstArray() {

        intersection = new Intersection();
        int[] nums1 = {};
        int[] nums2 = {2,2,1,3,2};
        int[] expectedArray = {};
        int[] resultArray = intersection.arrayIntersection(nums1,nums2);
        Assert.assertArrayEquals(expectedArray,resultArray);
    }

    @Test
    public void testIntersectionWithEqualSizes() {

        intersection = new Intersection();
        int[] nums1 = {1,2,3,3,1};
        int[] nums2 = {2,2,1,3,2};
        int[] expectedArray = {1,2,3};
        int[] resultArray = intersection.arrayIntersection(nums1,nums2);
        Assert.assertArrayEquals(expectedArray,resultArray);
    }

    @Test
    public void testIntersectionWithNullInput() {

        intersection = new Intersection();
        int[] nums1 = null;
        int[] nums2 = {2,2,1,3,2};
        int[] expectedArray = {};
        int[] resultArray = intersection.arrayIntersection(nums1,nums2);
        Assert.assertArrayEquals(expectedArray,resultArray);
    }
}
