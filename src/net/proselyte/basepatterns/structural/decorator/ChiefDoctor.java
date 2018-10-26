package net.proselyte.basepatterns.structural.decorator;

public class ChiefDoctor extends DoctorDecorator {
    public ChiefDoctor(Doctor doctor) {
        super(doctor);
    }

    public String sendReports() {
        return ", sends reports with patients conditions";
    }

    @Override
    public String treat() {
        return super.treat() + sendReports();
    }
}
