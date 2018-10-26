package net.proselyte.basepatterns.structural.composite;

public class Builder implements Worker {
    @Override
    public void build() {
        System.out.println("Builder builds...");
    }
}
