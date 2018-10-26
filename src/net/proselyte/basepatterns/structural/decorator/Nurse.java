package net.proselyte.basepatterns.structural.decorator;

public class Nurse implements Doctor {
    @Override
    public String treat() {
        return "Helps in the hospital...";
    }
}
