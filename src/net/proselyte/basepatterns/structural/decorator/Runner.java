package net.proselyte.basepatterns.structural.decorator;

public class Runner {
    public static void main(String[] args) {
        Doctor doctor = new ChiefDoctor(new Therapist(new Nurse()));

        System.out.println(doctor.treat());
    }
}
