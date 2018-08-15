package com.programs.common;

import java.util.ArrayList;

/**
 * Created by Sireesha on 1/19/18.
 */
public class Palindrome {

    public static void main(String args[]) {

        Palindrome palindrome = new Palindrome();
        String input = "eedede";
        boolean isPalindrome = palindrome.validPalindrome(input);

        System.out.println("IsPalindrome "+isPalindrome);

    }

    public boolean validPalindrome(String s) {


        boolean isPalindrome = true;

        int len = s.length();
        int count = 0;

        System.out.println(s.length()/2);
        for(int i = 0; i < s.length()/2; i++) {

            if(s.charAt(i) != s.charAt((len-1)-i)) {

                count = count +1;

            }
        }

        System.out.println("count "+count);

        if(s.length() % 2 == 0) {

            if (count > 1) {

                isPalindrome = false;

            }
        }
        else {

            if(count > 0) {

                isPalindrome = false;
            }
        }

return isPalindrome;

    }
}
