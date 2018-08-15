package com.programs.common;

import java.util.Arrays;

/**
 * Created by Sireesha on 2/12/18.
 */
public class LongestCommonPrefix1 {

    public void longestCommonPrefixString(String[] strs) {


        for(int i = 0; i < strs.length; i++) {

           // System.out.println(strs[i].substring(0,));

             // System.out.println(strs[i]);
            for(int j = i+1; j < strs.length; j++) {

                if (strs[i].length() > strs[j].length()) { //"siri", "sireeesha", "si", "swathi", "pratap"

                    String temp = strs[j];
                    strs[j] = strs[i];
                    strs[i] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.length; i++) {

            // System.out.println(strs[i].substring(0,));
           // for(int j = 0; j < strs.length; j++) {

                char[] charArr = strs[i].toCharArray();
             for(int j = 0; j < charArr.length; j++) {
                System.out.println(strs[i].indexOf(charArr[j]));

                // if(strs[i].i)
            }
        }

    }
}
