package net.proselyte.basepatterns.creational.Builder;

public class BuildeRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setCreator(new TruckCarCreator());
        Car car = director.buildCar();

        System.out.println(car);
    }
}
