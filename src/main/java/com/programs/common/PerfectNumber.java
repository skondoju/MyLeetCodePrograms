package com.programs.common;

/**
 * Created by Sireesha on 2/7/18.
 */
public class PerfectNumber {

    public boolean checkPerfectNumber(int num) {

        long startTime = System.nanoTime();
        int sum = 0;
        boolean perfectNumber = false;

        for(int i = 1; i < num/2; i++) {//100,000,000
                                         //99,999,997
            if(num % i == 0) {

                sum = sum + i;

            }
        }

        System.out.println("Sum "+sum);
        if(sum == num) {

            perfectNumber = true;
        }
long endTime = System.nanoTime();
        long diff = endTime - startTime;
        System.out.println("diff  "+diff);
return perfectNumber;
    }
}
