package com.programs.common;


import junit.framework.Assert;
import org.junit.Test;
/**
 * Created by Sireesha on 1/19/18.
 */
public class TestValidParentheses {

    ValidParentheses validParentheses;

    @Test
    public void testIsValid() {

        validParentheses = new ValidParentheses();

        String input = "{([})]";
        boolean result = validParentheses.isValid(input);

        Assert.assertEquals(false,result);
    }

    @Test
    public void testIsValidWithEmptyInputString() {

        validParentheses = new ValidParentheses();

        String input = "";
        boolean result = validParentheses.isValid(input);

        Assert.assertEquals(false,result);
    }

    @Test
    public void testIsValidWithNullInput() {

        validParentheses = new ValidParentheses();

        String input = null;
        boolean result = validParentheses.isValid(input);

        Assert.assertEquals(false,result);
    }

    @Test
    public void testIsValid1() {

        validParentheses = new ValidParentheses();

        String input = "({{[({})]}})";
        boolean result = validParentheses.isValid(input);

        Assert.assertEquals(true,result);
    }
    @Test
    public void testIsValid2() {

        validParentheses = new ValidParentheses();

        String input = "((";
        boolean result = validParentheses.isValid(input);

        Assert.assertEquals(false,result);
    }
    @Test
    public void testIsValid3() {

        validParentheses = new ValidParentheses();

        String input = "(()(";
        boolean result = validParentheses.isValid(input);

        Assert.assertEquals(false,result);
    }
    @Test
    public void testIsValid4() {

        validParentheses = new ValidParentheses();

        String input = "([]";
        boolean result = validParentheses.isValid(input);

        Assert.assertEquals(false,result);
    }

    @Test
    public void testIsValid5() {

        validParentheses = new ValidParentheses();

        String input = "[";
        boolean result = validParentheses.isValid(input);

        Assert.assertEquals(false,result);
    }

    @Test
    public void testIsValid6() {

        validParentheses = new ValidParentheses();

        String input = "}}(]}}){)(])](}{{}[]";
        boolean result = validParentheses.isValid(input);

        Assert.assertEquals(false,result);
    }
}
