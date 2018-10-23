package net.proselyte.basepatterns.creational.Builder;

public class Car {
    private String name;
    private CarBody carBody;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carBody=" + carBody +
                ", price=" + price +
                '}';
    }
}
