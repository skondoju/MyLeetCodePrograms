package com.programs.common;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sireesha on 1/31/18.
 */
public class FindTheDiff {

    public char findTheDiffInGivenString(String s, String t) {

        Map<Character,Integer> sMap = new HashMap<Character, Integer>();
        Map<Character,Integer> tMap = new HashMap<Character, Integer>();

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for(int i = 0; i < sChar.length; i++) {

            if(!sMap.containsKey(sChar[i])) {

                sMap.put(sChar[i],1);

            } else {

                int val = sMap.get(sChar[i]);
                sMap.put(sChar[i],++val);

            }
        }

        for(int j = 0; j < tChar.length; j++) {

            if(!tMap.containsKey(tChar[j])) {

                tMap.put(tChar[j], 1);

            } else {

                int val = tMap.get(tChar[j]);
                tMap.put(tChar[j], ++val);

            }
        }

        System.out.println(tMap);
        System.out.println(sMap);

        tMap.entrySet().removeAll(sMap.entrySet());
        char result = (char) 0;

        for(int k = 0; k < tChar.length; k++) {

            if(tMap.containsKey(tChar[k])) {

                 result =  tChar[k];
            }
        }

        return result;

    }
}
