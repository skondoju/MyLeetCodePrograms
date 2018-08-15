package com.programs.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sireesha on 10/31/17.
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {


        Map<Character,Integer> inputMap = new HashMap<Character, Integer>();
        for(int i=0; i < s.length(); i++) {

            if(inputMap.containsKey(s.charAt(i))) {
                inputMap.put(s.charAt(i),inputMap.get(s.charAt(i))+1);
            }
            else {
                inputMap.put(s.charAt(i),1);
            }
        }

        int outputIndex = -1;

        for(int i = 0; i < s.length(); i++) {

            if (inputMap.get(s.charAt(i)) == 1) {
                outputIndex = i;
                //return outputIndex;
                break;
            }
        }

        System.out.print("OutputIndex "+outputIndex);
        return outputIndex;
    }

}
