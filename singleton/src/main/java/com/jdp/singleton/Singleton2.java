package com.jdp.singleton;

/**
 * @author Leon
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            return new Singleton2();
        }
        return instance;
    }
}
