package com.jdp.template;

/**
 * @author Leon
 */
public class Duck implements Comparable<Duck> {
    private int weight;
    private String name;

    public Duck(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Duck o) {
        if (this.weight < o.getWeight()) {
            return -1;
        } else if (this.weight == o.getWeight()) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "weight=" + weight + ",name=" + name;
    }
}
