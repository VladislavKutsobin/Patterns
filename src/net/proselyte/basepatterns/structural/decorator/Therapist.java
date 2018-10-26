package net.proselyte.basepatterns.structural.decorator;

public class Therapist extends DoctorDecorator {

    public Therapist(Doctor doctor) {
        super(doctor);
    }

    public String makeTreatment() {
        return ", prescribes treatment";
    }

    @Override
    public String treat() {
        return super.treat() + makeTreatment();
    }
}
