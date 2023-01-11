package com.javaeight.function;

import java.util.function.Function;

public class Closure {
    public static void main(String[] args) {
        NoArgumentFunction<Function<String, String>> clousure = ()->{
            String greet = "Hello";
            return (name)->greet+" "+name;
        };
        Function<String,String> call1 = clousure.apply();
        System.out.println(call1.apply("vivek"));
    }
}
