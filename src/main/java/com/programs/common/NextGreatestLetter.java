package com.programs.common;

/**
 * Created by Sireesha on 3/4/18.
 */
public class NextGreatestLetter {

    public static void main(String args[]) {

        NextGreatestLetter nextGreatestLetter = new NextGreatestLetter();

        char[] letters = {'e', 'e', 'e','n','n'};
        char target = 'e';

       char result =  nextGreatestLetter.nextGreatLetter(letters,target);

        System.out.println("Result "+result);
    }

    public char nextGreatLetter(char[] letters, char target) {


        char   res = '\0';

        for(int i = 0; i < letters.length; i++) {

            if(target > letters[i]) {

                if(i == (letters.length - 1)) {

                    res = letters[0];
                    break;

                }
            } else if(letters[i] > target) {

                res = letters[i];
                   break;

            } else if((letters[i] == target)) {

                if(i == (letters.length - 1)) {

                    res = letters[0];
                    break;

                }
            }
        }
        return res;
    }
}
