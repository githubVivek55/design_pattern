package com.designPattern.command;

public class ReturnOrderCommand implements Command{
    Jacket jacket;
    public ReturnOrderCommand(Jacket jacket){
        this.jacket=jacket;
    }

    @Override
    public void execute() {
        jacket.placeOrder();
    }
}
