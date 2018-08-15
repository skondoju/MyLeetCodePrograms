package com.programs.common;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Sireesha on 1/10/18.
 */
public class TestFirstOccurenceIndex {

    FirstOccurenceIndex firstOccurenceIndex ;

    @Test
    public void testStringFirstOccurenceIndex() {

        String inputString  = "hello";
        String subString = "ll";

        firstOccurenceIndex = new FirstOccurenceIndex();

        int outputIndex = firstOccurenceIndex.getStringFirstOccurenceIndex(inputString,subString);

        System.out.println(outputIndex);


        Assert.assertEquals(2,outputIndex);

    }

    @Test
    public void testStringFirstOccurenceIndex1() {

        String inputString  = "aaaaa";
        String subString = "bba";

        firstOccurenceIndex = new FirstOccurenceIndex();

        int outputIndex = firstOccurenceIndex.getStringFirstOccurenceIndex(inputString,subString);

        System.out.println(outputIndex);


        Assert.assertEquals(-1,outputIndex);

    }

    @Test
    public void testStringFirstOccurenceIndexEmptySubString() {

        String inputString  = "aaaaa";
        String subString = " ";

        firstOccurenceIndex = new FirstOccurenceIndex();

        int outputIndex = firstOccurenceIndex.getStringFirstOccurenceIndex(inputString,subString);

        System.out.println(outputIndex);


        Assert.assertEquals(-1,outputIndex);

    }


}
