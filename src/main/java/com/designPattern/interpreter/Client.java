package com.designPattern.interpreter;

public class Client {
    public static void main(String[] args) {
        String context = "this this is a sentence";
        DuplicateCheck duplicateCheck = new DuplicateCheck();
        context = duplicateCheck.interpret(context);
        System.out.println(context);
    }
}
