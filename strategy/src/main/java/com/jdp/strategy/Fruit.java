package com.jdp.strategy;

/**
 * 有一堆苹果，选择使用袋子装或者盒子装，取决与客户，我们只要把包装算法封装起来，即可
 *
 * @author Leon
 */
public class Fruit {
    private PackStrategy packStrategy;

    public Fruit(PackStrategy packStrategy) {
        this.packStrategy = packStrategy;
    }

    public void setPackStrategy(PackStrategy packStrategy) {
        this.packStrategy = packStrategy;
    }

    public void pack() {
        packStrategy.execute();
    }
}
