package com.designPattern.decorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        if (size == Size.TALL) {
            return 0.10 + beverage.cost();
        } else if (size == Size.GRANDE) {
            return 0.15 + beverage.cost();
        } else if (size == Size.VENTI) {
            return 0.20 + beverage.cost();
        }
        return 0.10 + beverage.cost(); // Default case, if size is not set
    }

}
