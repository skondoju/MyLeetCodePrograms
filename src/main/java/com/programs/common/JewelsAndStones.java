package com.programs.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sireesha on 2/2/18.
 */
public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {


        Map<Character,Integer> sMap = new HashMap<Character, Integer>();

        for(int i = 0; i < S.length(); i++) {

            if(!sMap.containsKey(S.charAt(i))) {

                sMap.put(S.charAt(i),1);

            } else {

                int val = sMap.get(S.charAt(i));
                sMap.put(S.charAt(i),++val);

            }
        }

        int count = 0;

        for(int j = 0; j < J.length(); j++) {

            if(sMap.containsKey(J.charAt(j))) {

                count = count + sMap.get(J.charAt(j));
            }
        }
        return count;
    }
}
