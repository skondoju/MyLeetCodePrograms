package com.programs.common;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by Sireesha on 12/1/17.
 */
public class TestJudgeCircle {

    JudgeRouteCircle judgeRouteCircle;

    @Test
    public void testJudgeCircle() {

        judgeRouteCircle = new JudgeRouteCircle();

        String moves = "UDLR";
        boolean isCircle = judgeRouteCircle.judgeCircle(moves);
        System.out.println("isCircle "+isCircle);
        Assert.assertEquals(true,isCircle);

    }

    @Test
    public void testJudgeCircle1() {

        judgeRouteCircle = new JudgeRouteCircle();

        String moves = "UDLRRL";
        boolean isCircle = judgeRouteCircle.judgeCircle(moves);
        System.out.println("isCircle "+isCircle);
        Assert.assertEquals(true,isCircle);

    }

    @Test
    public void testJudgeCircle2() {

        judgeRouteCircle = new JudgeRouteCircle();

        String moves = "LL";
        boolean isCircle = judgeRouteCircle.judgeCircle(moves);
        System.out.println("isCircle "+isCircle);
        Assert.assertEquals(true,isCircle);

    }

}
