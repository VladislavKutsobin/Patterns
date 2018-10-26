package net.proselyte.basepatterns.structural.composite;

public class Plumber implements Worker {
    @Override
    public void build() {
        System.out.println("Plumber works...");
    }
}
