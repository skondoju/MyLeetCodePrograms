package com.programs.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Sireesha on 1/23/18.
 */
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();


        System.out.println("Input  "+ s1);
        Map<Character,Integer> map1 = new HashMap<Character, Integer>();

        char[] arr1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        boolean isPanagram = false;

        for(int i = 0; i < arr1.length; i++) {

            map1.put(arr1[i],0);

        }

        if(s1 != null && s1.length() > 0) {

            s1 = s1.toLowerCase();

            for(int i = 0; i < s1.length(); i++) {

                if(!map1.containsKey(s1.charAt(i))) {

                    map1.put(s1.charAt(i),1);

                } else {

                    int val = map1.get(s1.charAt(i));
                    map1.put(s1.charAt(i),val+1);
                }
            }
        }

        for(Character ch1 : map1.keySet()) {

            if(map1.get(ch1) > 0) {

                isPanagram = true;

            } else {

                isPanagram = false;
                break;

            }
        }

        if(isPanagram) {

            System.out.println("pangram");

        } else {

            System.out.println("not pangram");

        }

    }
}
