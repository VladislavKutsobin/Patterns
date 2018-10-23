package net.proselyte.basepatterns.creational.Builder;

public class Director {
    CarCreator creator;

    public void setCreator(CarCreator creator) {
        this.creator = creator;
    }

    Car buildCar() {
        creator.createCar();
        creator.createName();
        creator.createCarBody();
        creator.createPrice();

        Car car = creator.getCar();
        return car;
    }
}
