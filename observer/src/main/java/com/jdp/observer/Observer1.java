package com.jdp.observer;

/**
 * @author Leon
 */
public class Observer1 implements Observer {
    public void update(String message) {
        System.out.println("Observer1: " + message);
    }
}
