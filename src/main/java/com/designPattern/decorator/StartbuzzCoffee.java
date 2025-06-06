package com.designPattern.decorator;

public class StartbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        beverage.setSize(Size.GRANDE);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage.setSize(Size.TALL);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
