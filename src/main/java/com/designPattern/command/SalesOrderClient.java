package com.designPattern.command;

public class SalesOrderClient {
    private static final Jacket jacket = new Jacket();

    public static void main(String[] args) {
        OrderHandler placeOrderHandler = new OrderHandler(new PlaceOrderCommand(jacket));
        OrderHandler returnOrderHandler = new OrderHandler(new ReturnOrderCommand(jacket));
        placeOrderHandler.invoke();
        returnOrderHandler.invoke();
    }
}
