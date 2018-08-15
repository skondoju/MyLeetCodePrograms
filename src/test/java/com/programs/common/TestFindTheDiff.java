package com.programs.common;


import org.junit.Assert;
import org.junit.Test;

public class TestFindTheDiff {

   FindTheDiff findTheDiff = new FindTheDiff();

    @Test
    public void testTheDiffInGivenString() {

        String input1 = "abcd";
        String input2 = "abcde";


        char result = findTheDiff.findTheDiffInGivenString(input1,input2);
        junit.framework.Assert.assertEquals('e',result);

    }

    @Test
    public void testTheDiffInGivenString1() {

        String input1 = "abcd";
        String input2 = "fcdba";


        char result = findTheDiff.findTheDiffInGivenString(input1,input2);
        junit.framework.Assert.assertEquals('f',result);

    }

    @Test
    public void testTheDiffInGivenString2() {

        String input1 = "abcd";
        String input2 = "bcad";


        char result = findTheDiff.findTheDiffInGivenString(input1,input2);
       // junit.framework.Assert.assertEquals('',result);

    }

    @Test
    public void testTheDiffInSameString() {

        String input1 = "a";
        String input2 = "aa";


        char result = findTheDiff.findTheDiffInGivenString(input1,input2);
         junit.framework.Assert.assertEquals('a',result);

    }
}
