package com.jdp.observer;

/**
 * @author Leon
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
