package com.programs.common;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Sireesha on 11/15/17.
 */
public class TestRepeatedSubStringPattern {

   RepeatedSubStringPattern repeatedSubStringPattern ;

    @Test
    public void testGetRepeatedSubStringPattern() {

        repeatedSubStringPattern = new RepeatedSubStringPattern();
        String input = "abab";
        boolean result = repeatedSubStringPattern.getRepeatedSubStringPattern(input);
        junit.framework.Assert.assertEquals(true,result);

    }

    @Test
    public void testGetRepeatedSubStringPattern1() {

        repeatedSubStringPattern = new RepeatedSubStringPattern();
        String input = "abcabcabcabcabcabc";
        boolean result = repeatedSubStringPattern.getRepeatedSubStringPattern(input);
        junit.framework.Assert.assertEquals(true,result);

    }

    @Test
    public void testGetRepeatedSubStringPattern2() {

        repeatedSubStringPattern = new RepeatedSubStringPattern();
        String input = "abcdeabcde";
        boolean result = repeatedSubStringPattern.getRepeatedSubStringPattern(input);
        junit.framework.Assert.assertEquals(true,result);

    }

    @Test
    public void testGetRepeatedSubStringPattern3() {

        repeatedSubStringPattern = new RepeatedSubStringPattern();
        String input = "abaabaa";
        boolean result = repeatedSubStringPattern.getRepeatedSubStringPattern(input);
        junit.framework.Assert.assertEquals(true,result);

    }

    @Test
    public void testGetRepeatedSubStringPatternWithStringLen2() {

        repeatedSubStringPattern = new RepeatedSubStringPattern();
        String input = "aa";
        boolean result = repeatedSubStringPattern.getRepeatedSubStringPattern(input);
        junit.framework.Assert.assertEquals(true,result);

    }

    @Test
    public void testGetRepeatedSubStringPatternWithStringLen2ReturnsFalse() {

        repeatedSubStringPattern = new RepeatedSubStringPattern();
        String input = "ab";
        boolean result = repeatedSubStringPattern.getRepeatedSubStringPattern(input);
        junit.framework.Assert.assertEquals(true,result);

    }
}
