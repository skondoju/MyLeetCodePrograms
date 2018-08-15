package com.programs.common;

/**
 * Created by Sireesha on 1/22/18.
 */
public class HackerrankStringTokens {

    public static void main(String args[]) {

        String input = "He is a very very good boy, isn't he?";
        HackerrankStringTokens hackerrankStringTokens = new HackerrankStringTokens();

        hackerrankStringTokens.useStringTokens(input);

    }

    public void useStringTokens(String s) {

        String[] parts = s.split("[\\s,'\\?]" );

        System.out.println(parts.length);
        for(String str : parts) {
            System.out.println(str);
        }

    }
}
