package net.proselyte.basepatterns.creational.factory;

public class Dentist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Dentist treats teeth...");
    }
}
