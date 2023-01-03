package com.designPattern.command;

public class OrderHandler {

    Command command;

    public OrderHandler(Command command){
        this.command=command;
    }

    public void invoke() {
        command.execute();
    }
}
