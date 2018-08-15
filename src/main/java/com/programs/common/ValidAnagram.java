package com.programs.common;

/**
 * Created by Sireesha on 11/10/17.
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        boolean isAnagram = false;

        char[] sChar = s.toLowerCase().toCharArray();        //Convert to array of chars
        char[] tChar = t.toLowerCase().toCharArray();        //Convert to array of chars

        java.util.Arrays.sort(sChar);          //Sort
        java.util.Arrays.sort(tChar);          //Sort

        String sSorted = new String(sChar);  //Convert back to String
        String tSorted = new String(tChar);  //Convert back to String


        if (sSorted.equals(tSorted)) {

            isAnagram = true;

        } else {

            isAnagram = false;
        }

        System.out.println("isAnagram "+isAnagram);
        return isAnagram;
    }
}
