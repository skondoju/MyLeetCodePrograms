package com.programs.common;

/**
 * Created by Sireesha on 10/31/17.
 */
public class ReverseInteger {

    public int reverseInt(int x) {

        int resultVal = 0;
        String inputVal = x+"";
        System.out.println(resultVal);
        return resultVal;

    }
    public static void main(String args[]) {

        ReverseInteger reverseInteger = new ReverseInteger();
        reverseInteger.reverseInt(321);
    }
}
