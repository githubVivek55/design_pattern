package com.javaeight.function;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<Integer,Function<Integer,Integer>> exp = (x)->(y)->x*y;
        System.out.println(exp.apply(4).apply(5));
    }
}
