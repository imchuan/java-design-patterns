package com.jdp.observer;

/**
 * @author Leon
 */
public class App {
    public static void main(String[] args) {
        Email email = new Email();

        Observer dogObserver = new Observer1();
        Observer monkeyObserver = new Observer2();

        email.addObserver(dogObserver);
        email.addObserver(monkeyObserver);

        email.send("First email");
        email.send("Second email");
    }
}
