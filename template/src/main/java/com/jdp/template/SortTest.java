package com.jdp.template;

import java.util.Arrays;

/**
 * @author Leon
 */
public class SortTest {
    public static void main(String[] args) {
        Duck[] duck = new Duck[]{
                new Duck(1, "a"),
                new Duck(4, "b"),
                new Duck(2, "c"),
                new Duck(7, "d"),
        };

        for (Duck duck1 : duck) {
            System.out.println(duck1);
        }

        Arrays.sort(duck);

        for (Duck duck1 : duck) {
            System.out.println(duck1);
        }
    }
}
