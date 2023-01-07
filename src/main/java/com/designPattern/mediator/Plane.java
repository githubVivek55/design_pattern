package com.designPattern.mediator;

import java.util.Objects;

public class Plane {
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return id == plane.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private boolean isInTheAir;

    public Plane(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}
