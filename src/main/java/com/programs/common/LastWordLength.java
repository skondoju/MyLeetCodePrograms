package com.programs.common;

/**
 * Created by Sireesha on 2/12/18.
 */
public class LastWordLength {

    public int lengthOfLastWord(String s) {

        System.out.println("Input " + s);

        int lastWordLength = 0;

        System.out.print(s.isEmpty());
        String[] s1 = s.split(" ");

        System.out.print(s1.length);

        if (s1.length > 0) {
            lastWordLength = s1[s1.length - 1].length();

            System.out.println(" " + lastWordLength);

        }
        return lastWordLength;

    }
}
