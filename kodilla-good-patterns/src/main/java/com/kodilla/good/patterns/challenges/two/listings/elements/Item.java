package com.kodilla.good.patterns.challenges.two.listings.elements;

public class Item {

    private double value;
    private String name;
    private String description;

    public Item(double value, String name, String description) {

        this.value = value;
        this.name = name;
        this.description = description;
    }

    public void show(){
        String output = "";
        System.out.println("Name: " + this.name);
        System.out.println("Description: " + this.description);
        System.out.println("Value: " + this.value);
    }


    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
