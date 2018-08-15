package com.programs.common;

import com.sun.deploy.util.StringUtils;

import java.util.*;

/**
 * Created by Sireesha on 11/7/17.
 */
public class LongestCommonPrefix {

    public static void main(String args[]) {

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] givenStrings = {"siri", "sire", "si", "sireesha"};
        // String resultLongestCommonPrefix = longestCommonPrefix.getLongestCommonPrefix(givenStrings);
        longestCommonPrefix.getLongestCommonPrefix(givenStrings);

    }

    public void getLongestCommonPrefix(String[] inputStrings) {

        StringBuilder longestCommonPrefix = new StringBuilder();
        // System.out.println(longestCommonPrefix);


                if (inputStrings[0].length() < inputStrings[1].length()) {

                    for (int i = 0; i < inputStrings[0].length(); i++) {

                        if (inputStrings[0].charAt(i) == inputStrings[1].charAt(i)) {

                            longestCommonPrefix.append(inputStrings[0].charAt(i));
                        }

                    }
                    System.out.println(longestCommonPrefix);

                } else if (inputStrings[0].length() > inputStrings[1].length()) {


                    for (int i = 0; i < inputStrings[1].length(); i++) {

                        if (inputStrings[0].charAt(i) == inputStrings[1].charAt(i)) {

                            longestCommonPrefix.append(inputStrings[0].charAt(i));
                        }

                    }
                    System.out.println(longestCommonPrefix);
                } else {

                    for (int i = 0; i < inputStrings[1].length(); i++) {

                        if (inputStrings[0].charAt(i) == inputStrings[1].charAt(i)) {

                            longestCommonPrefix.append(inputStrings[0].charAt(i));
                        }

                    }
                    System.out.println(longestCommonPrefix);
                }


            for(int k=2; k < inputStrings.length; k++) {

                StringBuilder finalLongestCommonPrefix = new StringBuilder();
                System.out.println("finalLongestCommonPrefix "+finalLongestCommonPrefix);

                finalLongestCommonPrefix = longestCommonPrefix;
                System.out.println("finalLongestCommonPrefix "+finalLongestCommonPrefix);

                if (finalLongestCommonPrefix.length() < inputStrings[k].length()) {

                    if (inputStrings[k].substring(0, finalLongestCommonPrefix.length()).equals(finalLongestCommonPrefix.toString())) {

                        return;
                    } else {

                        for (int j = 0; j < finalLongestCommonPrefix.length(); j++) {

                            if (finalLongestCommonPrefix.charAt(j) == inputStrings[k].charAt(j)) {

                                finalLongestCommonPrefix.append(inputStrings[k].charAt(j));
                            }

                        }
                    }

                } else if (finalLongestCommonPrefix.length() > inputStrings[k].length()) {

                    for (int j = 0; j < inputStrings[k].length(); j++) {

                        if (finalLongestCommonPrefix.charAt(j) == inputStrings[k].charAt(j)) {

                            finalLongestCommonPrefix.append(inputStrings[k].charAt(j));
                        }

                    }
                } else {

                    for (int j = 0; j < inputStrings[k].length(); j++) {

                        if (finalLongestCommonPrefix.charAt(j) == inputStrings[k].charAt(j)) {

                            finalLongestCommonPrefix.append(inputStrings[k].charAt(j));
                        }

                    }
                }
            }



    }
}
