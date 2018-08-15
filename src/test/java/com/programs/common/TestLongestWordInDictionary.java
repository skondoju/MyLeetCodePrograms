package com.programs.common;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sireesha on 11/17/17.
 */
public class TestLongestWordInDictionary {

    LongestWordInDictionary longestWordInDictionary ;

   @Test
    public void testLongestWord() {

        longestWordInDictionary = new LongestWordInDictionary();
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String longestWord = longestWordInDictionary.longestWord(words);
        System.out.println("Longest Word "+longestWord);

    }
}
