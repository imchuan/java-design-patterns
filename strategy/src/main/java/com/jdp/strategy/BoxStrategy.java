package com.jdp.strategy;

/**
 * @author Leon
 */
public class BoxStrategy implements PackStrategy {
    @Override
    public void execute() {
        System.out.println("使用盒子包装");
    }
}
