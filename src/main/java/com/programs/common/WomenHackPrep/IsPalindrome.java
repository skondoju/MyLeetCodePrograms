package com.programs.common.WomenHackPrep;

/**
 * Created by Sireesha on 4/30/18.
 */
public class IsPalindrome {

    public boolean checkPalindrome(String input) {

        System.out.println(input);
        boolean isPalindrome = true;
        if(input != "" && input.length() > 0) {
            int midVal = input.length() / 2;
            System.out.println(midVal+" "+input.length());

            for (int i = 0; i < midVal; i++) {

                    if (input.charAt(i) != (input.charAt(input.length() - 1 - i))) {

                        isPalindrome = false;
                    }
            }
        } else {
            isPalindrome = false;
        }
 return isPalindrome;
    }
}
