package com.jdp.observer;

/**
 * @author Leon
 */
public class Observer2 implements Observer {
    public void update(String message) {
        System.out.println("Observer2: " + message);
    }
}
