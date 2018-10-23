package net.proselyte.basepatterns.creational.Builder;

public class TruckCarCreator extends CarCreator {
    @Override
    void createName() {
        car.setName("IVECO");
    }

    @Override
    void createCarBody() {
        car.setCarBody(CarBody.TRUCK);
    }

    @Override
    void createPrice() {
        car.setPrice(20000);
    }
}
