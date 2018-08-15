package com.programs.common.WomenHackPrep;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Created by Sireesha on 4/30/18.
 */
public class TestIsPalindrome {

    IsPalindrome isPalindrome = new IsPalindrome();

    @Test
    public void testIsPalindromeString() {

        String input = "civic";

       boolean palindrome =  isPalindrome.checkPalindrome(input);
        Assert.assertEquals(true,palindrome);
    }
}
