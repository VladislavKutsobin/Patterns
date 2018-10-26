package net.proselyte.basepatterns.structural.composite;

public class Electricain implements Worker {
    @Override
    public void build() {
        System.out.println("An electrician works...");
    }
}
