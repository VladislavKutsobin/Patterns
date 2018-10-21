package net.proselyte.basepatterns.creational.abstractfactory;

public interface TeamFactory {
    Director getDirector();
    CallWorker getCallWorker();
    Architect getArchitect();
    Accountant getAccountant();
}
