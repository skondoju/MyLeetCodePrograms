package com.programs.common;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Sireesha on 1/19/18.
 */
public class ValidParentheses {


    public boolean isValid(String s) {

        Stack<Character> myStack = new Stack();

        boolean isValid = false;

        int count = 0;

        if (s != null && s.length() > 0) {

            if (s.length() % 2 == 0) {

                for (int i = 0; i < s.length(); i++) {

                    isValid = false;

                    char c = s.charAt(i);

                    if (!myStack.empty()) {

                        char prevChar = myStack.peek();

                        if ((prevChar == '(' && c == ')') || (prevChar == '{' && c == '}') || (prevChar == '[' && c == ']')) {

                            myStack.pop();
                            isValid = true;
                            count++;

                        } else {

                            myStack.push(c);
                        }

                    } else {

                        if(c == ')' || c == '}' || c == ']') {

                            break;

                        } else {

                            myStack.push(c);
                        }
                    }
                }

            } else {

                isValid = false;

            }

            if (count!=0 && (count == s.length() / 2)) {
                isValid = true;
            }

        }

        return isValid;
    }


}
