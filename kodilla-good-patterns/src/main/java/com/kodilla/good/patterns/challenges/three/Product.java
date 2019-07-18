package com.kodilla.good.patterns.challenges.three;

public class Product {

    private double value;
    private String name;
    private String description;

    public Product(double value, String name, String description) {

        this.value = value;
        this.name = name;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "value=" + value +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}

