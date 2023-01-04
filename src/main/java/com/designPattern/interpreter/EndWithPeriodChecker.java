package com.designPattern.interpreter;

public class EndWithPeriodChecker implements Interpreter {
    @Override
    public String interpret(String context) {
        return HelperMethods.endsWithPeriod(context);
    }
}
