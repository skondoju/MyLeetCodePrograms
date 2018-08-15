package com.programs.common;


public class LomngestCommonPrefix1 {

    public String getLongestCommonPrefix(String[] inputs) {
        if (inputs == null || inputs.length <= 0) {
            throw new IllegalArgumentException("Invalid input. Array cannot be empty");
        }


        String longestCommonPrefix = inputs[0];
        for (int i = 1; i < inputs.length; i++) {

            int minLength = Math.min(longestCommonPrefix.length(), inputs[i].length());
            while (true) {
                longestCommonPrefix = longestCommonPrefix.substring(0, minLength);
                if (longestCommonPrefix.equals(inputs[i].substring(0, minLength))) {
                    break;
                }
                minLength--;
            }
        }

        return longestCommonPrefix;

    }

}
