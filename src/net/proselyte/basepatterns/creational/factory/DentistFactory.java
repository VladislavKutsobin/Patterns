package net.proselyte.basepatterns.creational.factory;

public class DentistFactory implements DoctorFactory {
    @Override
    public Doctor createDoctor() {
        return new Dentist();
    }
}
