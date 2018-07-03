package com.programs.common;

/**
 * Created by Sireesha on 11/10/17.
 */
public class Fibonacci {

    public static void main(String args[]) {

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.generateFibonacci(10);

    }

    public int[] generateFibonacci(int n) {

        int[] fibonacciOutput = new int[n];

        fibonacciOutput[0] = 0;
        fibonacciOutput[1] = 1;

        for(int i = 2; i < n; i++) {

            fibonacciOutput[i] = fibonacciOutput[i-1] + fibonacciOutput[i-2];
        }
        for(int i = 0; i < n; i++) {

            System.out.print(fibonacciOutput[i] + "  ");
        }

        return fibonacciOutput;
    }
}
