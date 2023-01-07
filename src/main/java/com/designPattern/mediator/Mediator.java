package com.designPattern.mediator;

public class Mediator {
    private Plane plane;
    private PlaneInFlight planeInFlight;
    private PlaneOnGround planeOnGround;
    private Runway runway;

    public Mediator(){
        plane = new Plane(1);
        planeInFlight = new PlaneInFlight();
        planeOnGround = new PlaneOnGround();
        runway = new Runway();
    }
    public void takeOff(){
        if(!planeInFlight.getIsInTheAir(plane) && runway.isAvailable()){
            System.out.println("Plane "+plane.getId()+" is taking off...");
            planeOnGround.removePlane(plane);
            planeInFlight.addPlaneInFlight(plane);
            runway.setAvailable(false);
        }
    }
}
