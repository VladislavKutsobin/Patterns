package net.proselyte.basepatterns.creational.factory;

public class AppRunner {
    public static void main(String[] args) {
        DoctorFactory doctorFactory = createDoctorBySpecialty("Dentist");
        Doctor doctor = doctorFactory.createDoctor();

        doctor.treat();
    }

    static DoctorFactory createDoctorBySpecialty(String specialty) {
        if(specialty.equalsIgnoreCase("Dentist")) {
            return new DentistFactory();
        }else if(specialty.equalsIgnoreCase("Surgeon")) {
            return new SurgeonFactory();
        }else if(specialty.equalsIgnoreCase("Traumatologist")){
            return new TraumatologistFactory();
        }else {
            throw new RuntimeException(specialty + " is unknown doctor specialty...");
        }
    }
}
