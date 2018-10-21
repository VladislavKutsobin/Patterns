package net.proselyte.basepatterns.creational.factory;

public class SurgeonFactory implements DoctorFactory {
    @Override
    public Doctor createDoctor() {
        return new Surgeon();
    }
}
