package net.proselyte.basepatterns.creational.factory;

public class Traumatologist implements Doctor{
    @Override
    public void treat() {
        System.out.println("Traumatologist treats injuries");
    }
}
