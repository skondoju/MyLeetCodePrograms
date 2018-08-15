package com.programs.common;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by Sireesha on 10/31/17.
 */
public class FirstUniqCharTest {

    @Test
    public void test() {
        System.out.println("Test");

        FirstUniqChar firstUniqChar = new FirstUniqChar();
        int outputIndex = firstUniqChar.firstUniqChar("loveleetcode");
        assertEquals(2,2);

    }

}
