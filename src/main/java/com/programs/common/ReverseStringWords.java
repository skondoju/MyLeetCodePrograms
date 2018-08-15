package com.programs.common;

/**
 * Created by Sireesha on 1/10/18.
 */
public class ReverseStringWords {

    public static void main(String args[]) {

        ReverseStringWords reverseStringWords = new ReverseStringWords();

        String input = "Let's take LeetCode contest";

        String result = reverseStringWords.reverseEachWordsInString(input);
        System.out.println(result);
    }

    public String reverseEachWordsInString(String s) {


        String[] inputArray = s.split(" ");
        StringBuffer temp = new StringBuffer() ;
        String result = null;

        for(int i = 0; i < inputArray.length; i++) {

            temp.append(new StringBuffer(inputArray[i]).reverse().toString());

            if(i < inputArray.length-1) {

                temp.append(" ");

            }

            result = temp.toString();

        }

        return result;
    }
}
