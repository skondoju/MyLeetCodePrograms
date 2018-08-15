package com.programs.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sireesha on 1/19/18.
 */
public class Sample1 {


    public static void main(String args[]) {

        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("banana");
        list.add("kiwi");
        list.add("orange");
        list.add("pineapple");
        list.add("berry");

        System.out.println(list.size());

        list.remove(2);
        System.out.println(list.size());
        System.out.println(list.get(2));


    }
}
