package com.designPattern.decorator;

public abstract class Beverage {
    String description = "Unknown Beverage";
    Size size = null;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}