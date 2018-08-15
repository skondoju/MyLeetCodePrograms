package com.programs.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sireesha on 2/6/18.
 */
public class SelfDivide {

    public static void main(String args[]) {

        SelfDivide selfDivide = new SelfDivide();

        int left = 1;
        int right = 22;

   List<Integer> resultList = selfDivide.selfDividingNumbers(left, right);
        System.out.println(resultList);
    }

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> aList = new ArrayList<Integer>();

        for(int i = left; i <= right; i++ ) {

            int val = i;
            boolean selfDivider = true;

             while(val > 0) {

                 int remainder = val % 10;
               //  System.out.println("remainder "+remainder);

                 val = val / 10;
               //  System.out.println("quotient "+val);

                 if((remainder != 0) && (i % remainder == 0)){


                 } else {

                     selfDivider = false;
                     break;

                 }

             }

            if(selfDivider) {

                aList.add(i);

            }
        }

        return aList;
    }

}
