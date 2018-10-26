package net.proselyte.basepatterns.structural.flyweight;

public class Driver implements Worker {
    @Override
    public void doJob() {
        System.out.println("Driver drives a bus.");
    }
}
