package com.programs.common;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sireesha on 1/30/18.
 */
public class TestMoveZeros {

    MoveZeros moveZeros = new MoveZeros();

    @Test
    public void testMoveZeroesToLast() {

        int [] inputArray = {0,1,0,3,12};

        moveZeros.moveZerosToLast(inputArray);

    }

    @Test
    public void testMoveZeroesToLast1() {

        int [] inputArray = {0, 0, 0, 0, 0};

        moveZeros.moveZerosToLast(inputArray);

    }

    @Test
    public void testMoveZeroesToLast2() {

        int [] inputArray = {0, 0, 0, 0, 10};

        moveZeros.moveZerosToLast(inputArray);

    }

    @Test
    public void testMoveZeroesToLast3() {

        int [] inputArray = {};

        moveZeros.moveZerosToLast(inputArray);

    }

    @Test
    public void testMoveZeroesToLast4() {

        int [] inputArray = {0, -1, 0, -3, 12};

        moveZeros.moveZerosToLast(inputArray);

    }

    @Test
    public void testMoveZeroesToLast5() {

        int [] inputArray = {0, -1, 0, -3, -12};

        moveZeros.moveZerosToLast(inputArray);

    }

    @Test
    public void testMoveZeroesToLast6() {

        int [] inputArray = {4,2,4,0,0,3,0,5,1,0};

        moveZeros.moveZerosToLast(inputArray);

    }

}
