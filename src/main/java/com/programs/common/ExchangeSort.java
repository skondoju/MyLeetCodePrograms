package com.programs.common;

/**
 * Created by Sireesha on 11/2/17.
 */
public class ExchangeSort {

    public int[] exchangeArraySort(int[] inputArray) {

        if (inputArray != null && inputArray.length > 0) {

            for (int i = 1; i < inputArray.length; i++) {

                for (int j = 0; j < inputArray.length - i; j++) {

                    int k = j + 1;

                    if (inputArray[j] > inputArray[k]) {

                        int temp = inputArray[k];
                        inputArray[k] = inputArray[j];
                        inputArray[j] = temp;
                    }
                }
            }

            for (int i = 0; i < inputArray.length; i++) {
                System.out.println(inputArray[i]);

            }
        }
        return inputArray;
    }

}
