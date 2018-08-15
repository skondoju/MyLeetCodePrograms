package com.programs.common;

import junit.framework.Assert;
import org.junit.Test;
/**
 * Created by Sireesha on 2/12/18.
 */
public class TestLastWordLength {


    LastWordLength lastWordLength = new LastWordLength();

    @Test
    public void TestlengthOfLastWord() {

        String input = "Hello World";
       int len = lastWordLength.lengthOfLastWord(input);

        Assert.assertEquals(5,len);



    }

    @Test
    public void TestlengthOfLastWordEmptyStringInput() {

        String input = " ";
        lastWordLength.lengthOfLastWord(input);

    }
}
