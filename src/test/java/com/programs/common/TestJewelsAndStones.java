package com.programs.common;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Sireesha on 2/2/18.
 */
public class TestJewelsAndStones {

   JewelsAndStones jewelsAndStones = new JewelsAndStones();

    @Test
    public void numJewelsInStonesTest() {

        String input1 = "aA";
        String input2 = "aAAbbbb";

        int result = jewelsAndStones.numJewelsInStones(input1,input2);

        junit.framework.Assert.assertEquals(3,result);
    }

    @Test
    public void numJewelsInStonesTest1() {

        String input1 = "z";
        String input2 = "ZZ";

        int result = jewelsAndStones.numJewelsInStones(input1,input2);

        junit.framework.Assert.assertEquals(0,result);
    }

    @Test
    public void numJewelsInStonesTest2() {

        String input1 = "z";
        String input2 = "aZz";

        int result = jewelsAndStones.numJewelsInStones(input1,input2);

        junit.framework.Assert.assertEquals(0,result);
    }

}
