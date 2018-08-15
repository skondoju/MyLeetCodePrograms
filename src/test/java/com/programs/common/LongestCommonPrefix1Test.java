package com.programs.common;


import org.junit.Test;

public class LongestCommonPrefix1Test {

    @Test
    public void testLongsetCommonPrefix() {
        LomngestCommonPrefix1 lomngestCommonPrefix1 = new LomngestCommonPrefix1();
        String longestCommonPrefix = lomngestCommonPrefix1.getLongestCommonPrefix(new String[]{"siri", "sireeesha", "si", "swathi", "pratap"});
        System.out.println(longestCommonPrefix);
    }

}
