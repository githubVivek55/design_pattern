package com.javaeight.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrderFn {
    public static void main(String[] args) {
        BiFunction<Float, Float, Float> devide = (x, y) -> x / y;
        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> safeDevide =
                (dev) -> (x, y) -> {
                    if (y == 0) {
                        return 0f;
                    }
                    return dev.apply(x, y);
                };
        System.out.println(safeDevide.apply(devide).apply(10f,0f));
    }
}
