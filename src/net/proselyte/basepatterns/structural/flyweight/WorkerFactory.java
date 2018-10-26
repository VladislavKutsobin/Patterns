package net.proselyte.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WorkerFactory {
    private static final Map<String, Worker> workers = new HashMap<>();

    public Worker getWorkerBySpecialty(String specialty) {
        Worker worker = workers.get(specialty);

        if(worker == null) {
            switch (specialty) {
                case "Driver":
                    System.out.println("Wiring driver...");
                    worker = new Driver();
                    break;
                case "Teacher":
                    System.out.println("Wiring teacher...");
                    worker = new Teacher();
                    break;
            }
            workers.put(specialty, worker);
        }
        return worker;
    }
}
