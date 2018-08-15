package com.programs.common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sireesha on 11/2/17.
 */
public class CountSubStringsTest {

    CountSubStrings countSubStrings = new CountSubStrings();

    @Test
    public void testSubStringCount() {

        int subStringCount = countSubStrings.subStringCount("aaaaaa", "aa");
        assertEquals(5,subStringCount);
    }

    @Test
    public void testEmptyString() {

        int subStringCount = countSubStrings.subStringCount("aarunrunawayrunbrun", " ");
        assertEquals(0,subStringCount);

    }

    @Test
    public void testNull() {

        int subStringCount = countSubStrings.subStringCount("aarunrunawayrunbrun", null);
        assertEquals(0,subStringCount);

    }

    @Test
    public void testNullInput() {

        int subStringCount = countSubStrings.subStringCount(null, "run");
        assertEquals(0,subStringCount);

    }

    @Test
    public void testEmptyInput() {

        int subStringCount = countSubStrings.subStringCount(" ", "run");
        assertEquals(0,subStringCount);

    }

    @Test
    public void testInputLessThanSubString() {

        int subStringCount = countSubStrings.subStringCount("ru", "run");
        assertEquals(0,subStringCount);

    }


}
