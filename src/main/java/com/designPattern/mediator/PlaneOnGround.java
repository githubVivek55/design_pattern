package com.designPattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class PlaneOnGround {
    List<Plane> planes;
    public PlaneOnGround(){
        planes = new ArrayList<>();
    }
    public void addPlaneOnGround(Plane plane){
        this.planes.add(plane);
    }
    public void removePlane(Plane p){
        this.planes=this.planes.stream().filter(plane -> plane.getId()!=p.getId()).toList();
    }
}
