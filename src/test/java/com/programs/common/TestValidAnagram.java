package com.programs.common;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sireesha on 11/10/17.
 */
public class TestValidAnagram {

    ValidAnagram validAnagram;

    @Test
    public void isAnagramTest() {

        validAnagram = new ValidAnagram();

        String s = "anagram";
        String t = "najaram";

       boolean isValidAnagram = validAnagram.isAnagram(s,t);
        junit.framework.Assert.assertFalse("Not Valid Anagram", isValidAnagram);
    }

    @Test
    public void isAnagramTest2() {

        validAnagram = new ValidAnagram();

        String s = "anagram";
        String t = "nagaram";

        boolean isValidAnagram = validAnagram.isAnagram(s,t);
        junit.framework.Assert.assertTrue("Given Inputs are Valid Anagram", isValidAnagram);
    }

    @Test
    public void isAnagramTestWithDiffLenths() {

        validAnagram = new ValidAnagram();

        String s = "cat";
        String t = "pats";

        boolean isValidAnagram = validAnagram.isAnagram(s,t);
        junit.framework.Assert.assertFalse("Not Valid Anagram", isValidAnagram);
    }

    @Test(expected = NullPointerException.class)
    public void isAnagramTestWithNullInputs() {

        validAnagram = new ValidAnagram();

        String s = null;
        String t = null;

        boolean isValidAnagram = validAnagram.isAnagram(s,t);
    }

    @Test
    public void isAnagramTestWithOneEmptyStringInputs() {

        validAnagram = new ValidAnagram();

        String s = "";
        String t = "sire";

        boolean isValidAnagram = validAnagram.isAnagram(s,t);
        junit.framework.Assert.assertFalse("Not Valid Anagram", isValidAnagram);

    }

    @Test
    public void isAnagramTestWithCaseSensitiveStringInputs() {

        validAnagram = new ValidAnagram();

        String s = "Sire";
        String t = "ESRI";

        boolean isValidAnagram = validAnagram.isAnagram(s,t);
        junit.framework.Assert.assertTrue(" Valid Anagram", isValidAnagram);

    }

    @Test
    public void isAnagramTestWithSpecialCharsInputs() {

        validAnagram = new ValidAnagram();

        String s = "Sire@";
        String t = "E@SRI";

        boolean isValidAnagram = validAnagram.isAnagram(s,t);
        junit.framework.Assert.assertTrue(" Valid Anagram", isValidAnagram);

    }
}
