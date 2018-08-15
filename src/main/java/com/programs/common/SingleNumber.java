package com.programs.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Sireesha on 1/31/18.
 */
public class SingleNumber {

    public int singleNumberMethod(int[] nums) {

        Map<Integer,Integer> map1 = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {

            if(!map1.containsKey(nums[i]))
            {

                map1.put(nums[i],1);

            } else {

                int val = map1.get(nums[i]);
                map1.put(nums[i],++val);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> ite = map1.entrySet().iterator();
       int result = 0;

        while(ite.hasNext()) {

            Map.Entry<Integer,Integer> entry = ite.next();

            if(entry.getValue() == 1) {

                result = entry.getKey();

            }
        }
return result;
    }
}
