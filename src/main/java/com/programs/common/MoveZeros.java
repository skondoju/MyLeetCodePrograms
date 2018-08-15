package com.programs.common;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Sireesha on 1/30/18.
 */
public class MoveZeros {

    public void moveZerosToLast(int[] inputArray) {

        int count = 0;

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] == 0) {

                count++;

            }

        }

        if (count > 0 && count < inputArray.length) {

            int temp = 0;
            int p = 1;
            int j = 0;

            while ((j < inputArray.length) && (p < inputArray.length)) {

                if (inputArray[j] == 0 && inputArray[p] != 0) {

                    temp = inputArray[j];
                    inputArray[j] = inputArray[p];
                    inputArray[p] = temp;
                    j++;
                    p++;

                }  else if ( (inputArray[j] != 0 && inputArray[p] != 0) || (inputArray[j] != 0 && inputArray[p] == 0)) {

                    j++;
                    p++;

                }
                else {

                    p++;
                }

            }
        }

    }

}

