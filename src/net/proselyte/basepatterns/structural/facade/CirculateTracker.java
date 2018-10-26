package net.proselyte.basepatterns.structural.facade;

public class CirculateTracker {
    private boolean active;

    public boolean isOnRoute() {
        return active;
    }

    public void startCirculation() {
        System.out.println("Trolleybus is active.");
        active = true;
    }

    public void finishCirculation() {
        System.out.println("Trolleybus is free.");
        active = false;
    }
}
