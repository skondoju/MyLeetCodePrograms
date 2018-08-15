package com.programs.common;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Sireesha on 2/2/18.
 */
public class TestHammingDistance {

    HammingDistance hammingDistance = new HammingDistance();

    @Test
    public void testHammingDistanceBtwIntegers() {

        int input1 = 1;
        int input2 = 5;

        hammingDistance.hammingDistanceBtwIntegers(input1,input2);
    }

}
