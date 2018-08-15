package com.programs.common;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Sireesha on 2/12/18.
 */
public class TestLongestCommonPrefix1 {

    LongestCommonPrefix1 longestCommonPrefix1 = new LongestCommonPrefix1();

    @Test
    public void testLongestCommonPrefixString() {

        String[] input = {"siri", "sireeesha", "si", "swathi", "pratap"};

        longestCommonPrefix1.longestCommonPrefixString(input);
    }
}
