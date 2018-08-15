package com.programs.common;

/**
 * Created by Sireesha on 11/15/17.
 */
public class RepeatedSubStringPattern {


    public boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean getRepeatedSubStringPattern(String s) {

        int len = s.length();

        boolean isRepeatedSubStringPattern = false;

        if (!isPrime(len)) {

            int i = 2;

            while (i < len) {

                if (len % i == 0) {

                    int loopCount = len / i;

                    int count = 1;

                    for (int j = 0; j < loopCount-1; j++) {

                        //indexOf

                        int k = i+i*j;


                        if (s.substring(0, i).equals(s.substring(k, k + i))) {

                            count++;
                        }

                    }

                    if (count == loopCount) {

                        isRepeatedSubStringPattern = true;

                    }
                }
                i++;
            }
        } else {

            int count = 1;

             if(len == 1) {

                 isRepeatedSubStringPattern = false;

             } else if (len > 1) {

                 for (int i = 0; i < len - 1; i++) {

                     if (s.charAt(i) == s.charAt(i + 1)) {

                         count++;
                     }
                 }
                 if(count == len) {

                     isRepeatedSubStringPattern = true;

                 } else
                     isRepeatedSubStringPattern = false;
             }

        }

        return isRepeatedSubStringPattern;
    }
}