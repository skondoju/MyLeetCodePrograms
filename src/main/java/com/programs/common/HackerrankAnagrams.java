package com.programs.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Sireesha on 1/22/18.
 */
public class HackerrankAnagrams {

    public static void main(String args[]) {

        HackerrankAnagrams hackerrankAnagrams = new HackerrankAnagrams();

        String input1 = "aaabbb";
        String input2 = "bbaaa";

       boolean isAnagram =  hackerrankAnagrams.isAnagram(input1, input2);

        System.out.println("IsAnagram "+isAnagram);
    }

    public boolean isAnagram(String input1, String input2) {

        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();

        boolean isAnagram = false;

        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();


        for (int i = 0; i < input1.length(); i++) {

            if (!map1.containsKey(input1.charAt(i))) {

                map1.put(input1.charAt(i), 1);

            } else {

                int val = map1.get(input1.charAt(i));
                map1.put(input1.charAt(i), val + 1);

            }


        }

        for (int i = 0; i < input2.length(); i++) {

            if (!map2.containsKey(input2.charAt(i))) {

                map2.put(input2.charAt(i), 1);

            } else {

                int val = map2.get(input2.charAt(i));
                map2.put(input2.charAt(i), val + 1);

            }


        }

        for (Character ch1 : map1.keySet()) {

            if (!(map1.get(ch1) == map2.get(ch1))) {

                // return false;
                isAnagram = false;
                break;

            } else {

                isAnagram = true;
            }



        }

        for (Character ch2 : map2.keySet()) {

            if (!(map2.get(ch2) == map1.get(ch2))) {

                isAnagram = false;

            } else {

                isAnagram = true;
            }

        }

        return isAnagram;
    }
}