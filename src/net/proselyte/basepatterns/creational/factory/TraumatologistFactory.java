package net.proselyte.basepatterns.creational.factory;

public class TraumatologistFactory implements DoctorFactory {
    @Override
    public Doctor createDoctor() {
        return new Traumatologist();
    }
}
