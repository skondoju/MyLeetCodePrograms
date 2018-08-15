package com.programs.common.WomenHackPrep;

/**
 * Created by Sireesha on 5/2/18.
 */
public class StringReverse {

    public static void main(String args[]) {

        StringReverse stringReverse = new StringReverse();

        String input = " ";
        String output = stringReverse.reverseString(input);
        System.out.println("Reversed STring "+output);

    }

    public String reverseString(String s) {

        StringBuilder sb = new StringBuilder();

        if(s != null && s.length() > 0) {
           char[] inputCharArr = s.toCharArray();

           for (int i = inputCharArr.length - 1; i >= 0; i--) {

               sb.append(inputCharArr[i]);
           }
       }
        return sb.toString();

    }
}
