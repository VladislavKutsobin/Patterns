package net.proselyte.basepatterns.creational.Builder;

public class PassengerCarCreator extends CarCreator {
    @Override
    void createName() {
        car.setName("TOYOTA");
    }

    @Override
    void createCarBody() {
        car.setCarBody(CarBody.PASSENGERCAR);
    }

    @Override
    void createPrice() {
        car.setPrice(15000);
    }
}
