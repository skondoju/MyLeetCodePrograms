package com.programs.common;

import java.text.DecimalFormat;

import static java.lang.Math.round;

/**
 * Created by Sireesha on 10/31/17.
 */
public class Sqrt {

    public double mySqrt(double inputValue) {

        double minVal = 0.0;
        double maxVal = 0.0;
        boolean isSqrt = false;
        double avg = 0.0;
        DecimalFormat f = new DecimalFormat("##.00");

        if (inputValue > 0.0) {

            maxVal = inputValue;

                while (!isSqrt) {

                avg = (minVal + maxVal) / 2;

                if (Math.round(Math.pow(avg, 2)*100.0)/100.0 > inputValue) {

                    maxVal = avg;

                } else if (Math.round(Math.pow(avg, 2)*100.0)/100.0 < inputValue) {

                    minVal = avg;
                } else {

                    isSqrt = true;
                }
                System.out.println(Math.round(Math.pow(avg, 2)*100.0)/100.0 + " input=" + inputValue);
            }
        } else if (inputValue < 0.0) {

            throw new IllegalArgumentException();
        }

        System.out.println(Double.parseDouble(f.format(avg)));
        return Double.parseDouble(f.format(avg));
    }


    public double mySqrt1(double inputValue) {

        if (inputValue <= 0) {
            throw new IllegalArgumentException("Invalid input. Input must be greater than zero.");
        }

        double minVal = 0.0;
        double maxVal = inputValue;
        double avg = 0.0;

        DecimalFormat f = new DecimalFormat("##.00");

        while (true) {

            avg = (minVal + maxVal) / 2.0;

            if (Math.round(Math.pow(avg, 2)*100.0)/100.0 > inputValue) {

                maxVal = avg;

            } else if (Math.round(Math.pow(avg, 2)*100.0)/100.0 < inputValue) {

                minVal = avg;

            } else {

                return Double.parseDouble(f.format(avg));
            }
            System.out.println(Math.round(Math.pow(avg, 2)));
        }

    }

}
