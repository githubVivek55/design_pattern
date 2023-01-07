package com.designPattern.mediator;

public class Runway {
    private boolean isAvailable=true;


    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable(){
        return isAvailable;
    }
}
