package com.jdp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leon
 */
public class Email {
    private List<Observer> observers = new ArrayList<>();

    private String title;

    public void send(String title) {
        this.title = title;
        notifyObserver();
    }

    public void addObserver(Observer emailObserver) {
        observers.add(emailObserver);
    }

    public void removeObserver(Observer emailObserver) {
        observers.remove(emailObserver);
    }

    public void notifyObserver() {
        observers.forEach(o -> o.update(title));
    }
}
