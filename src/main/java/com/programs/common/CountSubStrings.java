package com.programs.common;

/**
 * Created by Sireesha on 11/1/17.
 */
public class CountSubStrings {

    public int subStringCount(String input, String word) {

        int i = 0;
        int subStringCount = 0;
// Use String.index() for this problem
        if (input != null && word != null && (input.length() > word.length()) ) {
            while (i < input.length()) {


                if (input.charAt(i) == word.charAt(0)) {

                    String inputSubString = input.substring(i, i + word.length());

                    if (inputSubString.equals(word)) {

                        subStringCount++;
                        i = i + word.length();
                       // i++;

                    }
                } else {

                    i++;
                }
            }
        }
        System.out.println("subStringCount " + subStringCount);
        return subStringCount;
    }
}

