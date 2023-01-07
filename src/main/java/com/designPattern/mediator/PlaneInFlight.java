package com.designPattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class PlaneInFlight {
    List<Plane> planes;
    public PlaneInFlight(){
        planes = new ArrayList<>();
    }
    public void addPlaneInFlight(Plane plane){
        this.planes.add(plane);
    }
    public void removePlane(Plane p){
        this.planes=this.planes.stream().filter(plane -> plane.getId()!=p.getId()).toList();
    }
    public boolean getIsInTheAir(Plane plane){
        return planes.contains(plane);
    }
}
