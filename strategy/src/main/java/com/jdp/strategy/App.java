package com.jdp.strategy;

/**
 * @author Leon
 */
public class App {
    public static void main(String[] args) {
        // 使用盒子包装
        Fruit fruit = new Fruit(new BoxStrategy());
        fruit.pack();

        // 使用袋子包装
        fruit.setPackStrategy(new BagStrategy());
        fruit.pack();
    }
}
