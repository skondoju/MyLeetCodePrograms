package com.programs.common.WomenHackPrep;

/**
 * Created by Sireesha on 5/1/18.
 */
public class ReverseWordsInString {

    public static void main(String args[]) {

        String input = "My Name is Sireesha";

        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();

        reverseWordsInString.reverseWords(input);
    }

    public void reverseWords(String input) {

        String[] inputStrArr = input.split(" ");
        System.out.println(inputStrArr.length);
        String result = "";

        for(int i = inputStrArr.length-1; i >= 0; i--) {
            System.out.println(inputStrArr[i]);
             result = result.concat(inputStrArr[i]).concat(" ");
        }

        System.out.println(result);

    }
}
