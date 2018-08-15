package com.programs.common;

/**
 * Created by Sireesha on 2/6/18.
 */
public class Cipher {


        public static String encode(String input, int numberOfRotations) {

            StringBuilder output = new StringBuilder();
            numberOfRotations = numberOfRotations % 26;

            for (int i = 0; i < input.length(); i++) {

                char currentChar = input.charAt(i);

                if (currentChar >= 'a' && currentChar <= 'z') {
                    output.append(rotateRight(currentChar, 'z', 'a', numberOfRotations));
                } else if (currentChar >= 'A' && currentChar <= 'Z') {
                    output.append(rotateRight(currentChar, 'Z', 'A', numberOfRotations));
                } else {
                    output.append(currentChar);
                }
            }

            return output.toString();// r, w, w, x, F, j, t, n,  , a, d, u, n, b
        }

        public static String decode(String input, int numberOfRotations) {

            StringBuilder output = new StringBuilder();
            numberOfRotations = numberOfRotations % 26;

            for (int i = 0; i < input.length(); i++) {

                char currentChar = input.charAt(i);

                if (currentChar >= 'a' && currentChar <= 'z') {
                    output.append(rotateLeft(currentChar, 'z', 'a', numberOfRotations));
                } else if (currentChar >= 'A' && currentChar <= 'Z') {
                    output.append(rotateLeft(currentChar, 'Z', 'A', numberOfRotations));
                } else {
                    output.append(currentChar);
                }
            }

            return output.toString();
        }


        private static char rotateRight(char currentChar, char maxChar, char minChar, int numberOfRotations) {
            if (currentChar + numberOfRotations > maxChar) {
                return (char) (minChar + (numberOfRotations - (maxChar - currentChar + 1)));
            } else {
                return (char) (currentChar + numberOfRotations);
            }
        }

        private static char rotateLeft(char currentChar, char maxChar, char minChar, int numberOfRotations) {
            if (currentChar - numberOfRotations < minChar) {
                return (char) (maxChar - (numberOfRotations - (currentChar - minChar + 1)));
            } else {
                return (char) (currentChar - numberOfRotations);
            }
        }

        public static void main(String[] args) {
            System.out.println("innoWake rules :" + Cipher.encode("innoWake rules", 9));
            System.out.println("HELLO :" + Cipher.encode("HELLO", 5));
            System.out.println("hello :" + Cipher.encode("hello", 5));
            System.out.println("MJQQT :" + Cipher.decode("MJQQT", 5));
            System.out.println("MJQQT :" + Cipher.decode("MJQQT", 5));
            System.out.println("BTWQI :" + Cipher.decode("BTWQI", 5));
            System.out.println("WORLD :" + Cipher.encode("WORLD", 5));

        }
    }

