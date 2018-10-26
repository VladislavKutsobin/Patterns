package net.proselyte.basepatterns.structural.facade;

public class Driver {
    public void driveTrolleybus(CirculateTracker circulateTracker) {
        if(circulateTracker.isOnRoute()) {
            System.out.println("Driver drives the trolleybus.");
        }else {
            System.out.println("Driver drinks a cup of tea.");
        }
    }
}
