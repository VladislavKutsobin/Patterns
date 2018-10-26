package net.proselyte.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BuildTeam {
    private List<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void removeWorker(Worker worker) {
        workers.remove(worker);
    }

    public void makeRepairWorks() {
        System.out.println("Team is working now...");
        for(Worker worker : workers) {
            worker.build();
        }
    }
}
