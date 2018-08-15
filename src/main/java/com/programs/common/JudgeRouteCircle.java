package com.programs.common;

/**
 * Created by Sireesha on 12/1/17.
 */
public class JudgeRouteCircle {

    public boolean judgeCircle(String moves) {

        boolean isCircle = false;
        int upDownCount = 0;
        int leftRightCount = 0;

        if(moves != null && moves.length() != 0) {

            char[] movesChar = moves.toCharArray();

            for(int i = 0; i < movesChar.length; i++) {

                if(movesChar[i] == 'U') {

                    upDownCount++;
                }

                if(movesChar[i] == 'D') {

                    upDownCount--;
                }

                if(movesChar[i] == 'R') {

                    leftRightCount++;
                }

                if(movesChar[i] == 'L') {

                    leftRightCount--;
                }
            }

            System.out.println("updownCount "+upDownCount);
            System.out.println("leftRightCount "+leftRightCount);

            if(upDownCount == 0 && leftRightCount == 0) {

                isCircle = true;

            }

        }



        return isCircle;

    }
}