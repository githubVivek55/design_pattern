package com.designPattern.decorator;

public enum Size {
    TALL, GRANDE, VENTI;

    public String getSize() {
        return this.name().toLowerCase();
    }
}
