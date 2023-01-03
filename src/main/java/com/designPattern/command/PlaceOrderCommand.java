package com.designPattern.command;

public class PlaceOrderCommand implements Command{
    Jacket jacket;
    public PlaceOrderCommand(Jacket jacket){
        this.jacket=jacket;
    }
    @Override
    public void execute() {
        jacket.placeOrder();
    }
}
