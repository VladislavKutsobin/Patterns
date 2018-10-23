package net.proselyte.basepatterns.creational.Builder;

public abstract class CarCreator {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void createName();
    abstract void createCarBody();
    abstract void createPrice();

    Car getCar() {
        return car;
    }
}
