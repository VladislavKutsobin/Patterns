package net.proselyte.basepatterns.structural.decorator;

public class DoctorDecorator implements Doctor {
    Doctor doctor;

    public DoctorDecorator(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String treat() {
        return doctor.treat();
    }
}
