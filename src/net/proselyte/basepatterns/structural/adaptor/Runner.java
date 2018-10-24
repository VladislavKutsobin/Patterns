package net.proselyte.basepatterns.structural.adaptor;

public class Runner {
    public static void main(String[] args) {
        Worker worker = new AdapterWorkerToSecretary();

        worker.read();
        worker.write();
        worker.call();
    }
}
