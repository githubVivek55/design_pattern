package com.designPattern.momento;

public class Calculator {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(12);
        System.out.println(adder.getResult());
        adder.save();
        adder.add(12);
        System.out.println(adder.getResult());
        adder.undo();
        System.out.println(adder.getResult());
    }
}
