package com.programs.common;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Sireesha on 11/2/17.
 */
public class TestExchangeSort {

    ExchangeSort exchangeSort = new ExchangeSort();

    @Test
    public void testExchangeArraySort() {

        int[] inputArray = {9,4,1,7,2,8,2,6,0,1,32,12,44,11};
        int[] outputArray = exchangeSort.exchangeArraySort(inputArray);
        int[] expectedArray = {0,1,1,2,2,4,6,7,8,9,11,12,32,44};
        assertArrayEquals(expectedArray,outputArray);
    }

    @Test
    public void testEmptyArray() {

        int[] inputArray = {};
        int[] outputArray = exchangeSort.exchangeArraySort(inputArray);
        assertEquals(0,outputArray.length);

    }

    @Test
    public void testNullArray() {

        int[] inputArray = null;
        int[] outputArray = exchangeSort.exchangeArraySort(inputArray);
        assertEquals(0,outputArray.length);

    }

    @Test
    public void testInputOutputSameArray() {

        int[] inputArray = {1,2,3,4,5,6,7};
        int[] outputArray = exchangeSort.exchangeArraySort(inputArray);
        assertArrayEquals(inputArray,outputArray);

    }

    @Test
    public void testNegativePositiveArray() {

        int[] inputArray = {9,4,-1,7,-2,8,2};
        int[] outputArray = exchangeSort.exchangeArraySort(inputArray);
        int[] expectedArray = {-2,-1,2,4,7,8,9};
        assertArrayEquals(expectedArray,outputArray);

    }

    @Test
    public void test2() {

        int[] inputArray = {9, 4};
        int[] outputArray = exchangeSort.exchangeArraySort(inputArray);
        int[] expectedArray = {4, 9};
        assertArrayEquals(expectedArray,outputArray);

    }

    @Test
    public void test1() {

        int[] inputArray = {4};
        int[] outputArray = exchangeSort.exchangeArraySort(inputArray);
        int[] expectedArray = {4};
        assertArrayEquals(expectedArray,outputArray);

    }

    @Test
    public void test3() {

        int[] inputArray = {9, 9};
        int[] outputArray = exchangeSort.exchangeArraySort(inputArray);
        int[] expectedArray = {9, 9};
        assertArrayEquals(expectedArray,outputArray);

    }

    @Test
    public void test5() {

        int[] inputArray = {9, 4, 10};
        int[] outputArray = exchangeSort.exchangeArraySort(inputArray);
        int[] expectedArray = {4, 9, 10};
        assertArrayEquals(expectedArray,outputArray);

    }

    @Test
    public void test6() {

        int[] inputArray = {9, 4, 10, 1};
        int[] outputArray = exchangeSort.exchangeArraySort(inputArray);
        int[] expectedArray = {1, 4, 9, 10};
        assertArrayEquals(expectedArray,outputArray);

    }
}
