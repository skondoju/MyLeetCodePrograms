package com.programs.common;

import java.util.*;

/**
 * Created by Sireesha on 3/14/18.
 */
public class CodeTest1 {

    public static void main(String args[]) {


        CodeTest1 codeTest1 = new CodeTest1();

        int[] arr1 = {1, 3, 6, 4, 1, 2};
        codeTest1.solution(arr1);

    }

    public void solution(int[] A) {


        Arrays.sort(A);
       // System.out.println(A[5]);
//        Integer[] result = new Integer[A.length];
//        for (int i = 0; i < A.length; i++)
//            result[i] = A[i];
//
//        Set<Integer> mySet = new HashSet<Integer>();
//        Collections.addAll(mySet, result);

        for(int i = A[0]; i < A.length; i++) {

           // System.out.println(i);
            System.out.println(A[i]);

           // if()
        }

    }
}
