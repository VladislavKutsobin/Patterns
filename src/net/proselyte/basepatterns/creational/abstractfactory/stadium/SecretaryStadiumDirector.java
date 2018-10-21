package net.proselyte.basepatterns.creational.abstractfactory.stadium;

import net.proselyte.basepatterns.creational.abstractfactory.CallWorker;

public class SecretaryStadiumDirector implements CallWorker {
    @Override
    public void answerCall() {
        System.out.println("Helps stadium director with his work...");
    }
}
