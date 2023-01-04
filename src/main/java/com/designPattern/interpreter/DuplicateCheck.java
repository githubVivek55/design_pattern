package com.designPattern.interpreter;

public class DuplicateCheck implements Interpreter {

    private final EndWithPeriodChecker endWithPeriodChecker=new EndWithPeriodChecker();
    @Override
    public String interpret(String context) {
        String noRepeatedWord = HelperMethods.noRepeatedWord(context);
        return endWithPeriodChecker.interpret(noRepeatedWord);
    }
}
