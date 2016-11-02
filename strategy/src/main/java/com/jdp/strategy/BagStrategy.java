package com.jdp.strategy;

/**
 * @author Leon
 */
public class BagStrategy implements PackStrategy {
    @Override
    public void execute() {
        System.out.println("使用袋子包装");
    }
}
