package net.proselyte.basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        WorkerFactory workerFactory = new WorkerFactory();
        List<Worker> workers = new ArrayList<>();

        workers.add(workerFactory.getWorkerBySpecialty("Teacher"));
        workers.add(workerFactory.getWorkerBySpecialty("Teacher"));
        workers.add(workerFactory.getWorkerBySpecialty("Teacher"));
        workers.add(workerFactory.getWorkerBySpecialty("Driver"));
        workers.add(workerFactory.getWorkerBySpecialty("Driver"));
        workers.add(workerFactory.getWorkerBySpecialty("Driver"));

        for(Worker worker : workers) {
            worker.doJob();
        }
    }
}
