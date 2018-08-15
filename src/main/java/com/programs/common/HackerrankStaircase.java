package com.programs.common;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Sireesha on 1/22/18.
 */
public class HackerrankStaircase {

    public static void main(String args[]) {

//        int n = 6;
//        int k = 2*n-2;
//
//            for(int i = 0; i < n; i++) {
//
//                for (int j = 0; j < k; j++) {
//
//
//                   System.out.print(" ");
//                }
//
//                k= k-2;
//
//                for(int j = 0; j <=i; j++){
//
//                    System.out.print(" *");
//                }
//                System.out.println("");
//
//            }
        for(int i=0;i<5;i++) {
            for(int j=0;j<5-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }


    }}
