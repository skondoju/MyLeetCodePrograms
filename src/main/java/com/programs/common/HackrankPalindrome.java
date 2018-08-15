package com.programs.common;

/**
 * Created by Sireesha on 1/22/18.
 */
public class HackrankPalindrome {

    public static void main(String args[]) {

        HackrankPalindrome hackrankPalindrome = new HackrankPalindrome();

        String input = "ababa";

        hackrankPalindrome.isPalindrome(input);

    }

    public void isPalindrome(String input) {

        StringBuilder sb = new StringBuilder(input);

        String reverseInput = sb.reverse().toString();

        if(input.equals(reverseInput)) {

            System.out.println("is Palindrome");

        } else {

            System.out.println("Not Palindrome");
        }


    }

}
