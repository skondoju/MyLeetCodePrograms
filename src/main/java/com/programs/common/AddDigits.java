package com.programs.common;

/**
 * Created by Sireesha on 2/13/18.
 */
public class AddDigits {

    public static void main(String args[]) {


        AddDigits addDigits = new AddDigits();
        int input = 38;

          addDigits.addDigits1(input);
    }

    public int addDigits1(int num) {

        int sum = 0;

        while(num > 0) {

            System.out.println(num);
            int rem = num % 10;
            sum = sum + rem;
            System.out.println("sum "+sum);

            num = num / 10;
            if((num == 0) && (sum >= 10)) {
                num = sum;
                sum = 0;
            }
            System.out.println("num "+num);


        }

        return sum;
    }
}
