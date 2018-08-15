package com.programs.common;

import java.util.*;

/**
 * Created by Sireesha on 11/17/17.
 */
public class LongestWordInDictionary {

    public String longestWord(String[] words) {

        HashMap<Character,HashMap<String,Integer>> map1 = new LinkedHashMap<Character,HashMap<String,Integer>>();
        HashMap<String,Integer> aMap;

        for(int i = 0; i < words.length; i++) {

            if(!map1.containsKey(words[i].charAt(0))) {

                aMap = new LinkedHashMap<String, Integer>();

                if(!aMap.containsKey(words[i])) {

                    aMap.put(words[i],words[i].length());

                } else {

                    aMap.put(words[i],words[i].length());
                }

                map1.put(words[i].charAt(0),aMap);

            } else {

                aMap = map1.get(words[i].charAt(0));
                if(!aMap.containsKey(words[i])) {

                    aMap.put(words[i],words[i].length());

                } else {

                    aMap.put(words[i],words[i].length());
                }

                map1.put(words[i].charAt(0),aMap);
            }
        }
        System.out.println(map1);

        Iterator ite = map1.entrySet().iterator();

       // while (ite.hasNext()) {
            Map.Entry pair = (Map.Entry)ite.next();
         //   System.out.println(pair.getValue());
        Map<String,Integer> resultMap = (HashMap<String,Integer>)pair.getValue();
       // System.out.println(resultMap);

        Iterator ite1 = resultMap.entrySet().iterator();

        while (ite1.hasNext()) {

            Map.Entry childPair = (Map.Entry)ite1.next();
              System.out.println(childPair.getValue());
            String lastEntry = (String)childPair.getKey();
            int lastEntryValue = (Integer)childPair.getValue();


        }

        String longestWord = null;





        //return resultList.get(resultList.size()-1);
        return longestWord;

    }

}
