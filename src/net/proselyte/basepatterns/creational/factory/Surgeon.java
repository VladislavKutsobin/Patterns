package net.proselyte.basepatterns.creational.factory;

public class Surgeon implements Doctor {
    @Override
    public void treat() {
        System.out.println("Surgeon does surgery...");
    }
}
