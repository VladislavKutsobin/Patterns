package net.proselyte.basepatterns.structural.adaptor;

public class AdapterWorkerToSecretary extends Secretary implements Worker {
    @Override
    public void read() {
        readEmail();
    }

    @Override
    public void write() {
        writeMessage();
    }

    @Override
    public void call() {
        answerOnCalls();
    }
}
