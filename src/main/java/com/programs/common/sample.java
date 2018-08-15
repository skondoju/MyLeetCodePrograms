package com.programs.common;

/**
 * Created by Sireesha on 11/4/17.
 */
public class sample {

    public static void main(String args[]) {

//        String s = "siri";
//        //String t = new String("siri");
//        String t = "siri";
//
//        if(s == t) {
//
//            System.out.println("Same");
//        }
        int a = 5;
        int b = 10;
        a = a ^ b;

        b = a ^ b;

        a = a ^ b;

        System.out.println("a = "+ a + " b = "+ b);
    }
}
