package com.programs.common;

/**
 * Created by Sireesha on 1/22/18.
 */
public class HackerrankFibonacci {

    public static void main(String args[]) {

        //HackerrankFibonacci hackerrankFibonacci = new HackerrankFibonacci();

        int a = 1;
        int b = 1;
       // int sum = 0;
int c = 0;
        System.out.println(a);
        System.out.println(b);

        for(int i = 0; i < 10; i++) {

           //int  sum  = sum + c;
             c = a + b;
            a = b;
            b = c;


            System.out.println(c);

        }
    }
}
